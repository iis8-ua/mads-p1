package demoapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ParMockMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void parFormShouldReturnForm() throws Exception {
        this.mockMvc.perform(get("/parform"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Número")));
    }

    @Test
    public void postParShouldReturnPar() throws Exception {
        this.mockMvc.perform(post("/parform")
                .param("numero", "4"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("El número 4 es par")));
    }

    @Test
    public void postImparShouldReturnImpar() throws Exception {
        this.mockMvc.perform(post("/parform")
                .param("numero", "3"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("El número 3 es impar")));
    }
}