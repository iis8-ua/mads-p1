package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class ParService {
    public String esPar(int numero) {
        if (numero % 2 == 0) {
            return "El número " + numero + " es par";
        } else {
            return "El número " + numero + " es impar";
        }
    }
}