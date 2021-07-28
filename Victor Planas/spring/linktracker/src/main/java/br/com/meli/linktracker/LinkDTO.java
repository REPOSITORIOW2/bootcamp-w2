package br.com.meli.linktracker;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.Pattern;

public class LinkDTO {
    @Pattern(regexp = "^(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/|https:\\/\\/)?[a-z0-9]+([\\-\\.]{1}[a-z0-9]+)*\\.[a-z]{2,5}(:[0-9]{1,5})?(\\/.*)?$")
    private String url;
    @JsonIgnore
    private int numeroRedirecionamento;

    public LinkDTO() {
    }

    public LinkDTO(String url) {
        this.url = url;
        this.numeroRedirecionamento = 0;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "{" +
                "'url':'" + url +
                "'}";
    }

    public int usaRedirecionamento(){
        return this.numeroRedirecionamento += 1;
    }

    public int getNumeroRedirecionamento(){
        return this.numeroRedirecionamento;
    }
}
