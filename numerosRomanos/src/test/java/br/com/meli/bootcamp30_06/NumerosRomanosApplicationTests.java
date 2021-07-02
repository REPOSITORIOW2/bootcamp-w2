package br.com.meli.bootcamp30_06;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
class NumerosRomanosApplicationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    void contextLoads() throws Exception {
        mockMvc.perform(get("/api/numeros/converter/{numero}", 100)
                .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(jsonPath("Numero_convertido").value("C"));
    }
    @Test
    void contextLoads2() throws Exception {
        mockMvc.perform(get("/api/numeros/converter/{numero}", 1997)
                .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(jsonPath("Numero_convertido").value("MCMXCVII"));
    }
    @Test
    void contextLoads3() throws Exception {
        mockMvc.perform(get("/api/numeros/converter/{numero}", 1997.0)
                .contentType(MediaType.APPLICATION_JSON)).andExpect(status().is(400));
    }
}
