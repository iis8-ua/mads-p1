package demoapp;

import demoapp.service.ParService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ParServiceTest {

    @Autowired
    ParService parService;

    @Test
    public void contexLoads() throws Exception {
        assertThat(parService).isNotNull();
    }

    @Test
    public void servicePar() throws Exception {
        assertThat(parService.esPar(4)).isEqualTo("El número 4 es par");
    }

    @Test
    public void serviceImpar() throws Exception {
        assertThat(parService.esPar(3)).isEqualTo("El número 3 es impar");
    }
}