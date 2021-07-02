package dev.feldmann.bootcamp.common.jsonRepository;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class JsonRepository<T extends Identifiable> {


    private File file;
    private ObjectMapper mapper;

    private JsonStorage cache = null;

    public JsonRepository(ObjectMapper mapper, String filePath) {
        this.file = new File(filePath);
        this.mapper = mapper;
    }


    private JsonStorage getCache() throws IOException {
        if (cache == null) {
            this.cache = loadFromFile();
        }
        return cache;
    }


    public List<T> all() throws IOException {
        return new ArrayList<>(this.getCache().getEntities().values());
    }


    public Optional<T> findById(Long id) throws IOException {
        var cache = getCache();
        if (cache.getEntities().containsKey(id)) {
            return Optional.of(cache.getEntities().get(id));
        }
        return Optional.empty();
    }

    public void delete(T entity) throws IOException {
        if(entity.getId()!=null){
            getCache().getEntities().remove(entity.getId());
        }
    }

    public void save(T entity) throws IOException {
        if (entity.getId() == null) {
            entity.setId(getCache().getNewId());

        }
        getCache().getEntities().put(entity.getId(), entity);
        this.saveIntoFile(this.getCache());
    }



    private JsonStorage loadFromFile() throws IOException {
        if (!this.file.exists()) {
            return new JsonStorage(1L, new HashMap<>());
        }
        return mapper.readValue(file, JsonStorage.class);
    }

    private void saveIntoFile(JsonStorage storage) throws IOException {
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        this.mapper.writeValue(file, storage);
    }


    @Getter
    private class JsonStorage {
        private Long lastId = 1L;
        private Map<Long, T> entities;

        public JsonStorage(Long lastId, Map<Long, T> entities) {
            this.lastId = lastId;
            this.entities = entities;
        }


        public Long getNewId() {
            return lastId++;
        }
    }


}



