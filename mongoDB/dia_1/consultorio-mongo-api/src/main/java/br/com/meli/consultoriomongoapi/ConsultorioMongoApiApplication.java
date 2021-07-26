package br.com.meli.consultoriomongoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ConsultorioMongoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsultorioMongoApiApplication.class, args);
    }

}
