package br.com.meli.codigo_morse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    Morse morseConverter = new Morse();

    @GetMapping("/morse/{codigo}")
    public String primeiraEndpoint(@PathVariable String codigo) {
        String textoConvertido = morseConverter.normal(codigo);
        return "O texto convertido é:" +textoConvertido;
    }
}
