package br.com.fiap.abctechapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;

@RestController
@RequestMapping("/")

public class HealthCheckController {

    @GetMapping("version")
    public ResponseEntity<String> status() throws IOException {

        Properties properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream( "application.yaml");
        properties.load(inputStream);

        return ResponseEntity.ok( properties.getProperty("build.name") + " - " + properties.getProperty("build.version"));

    }
}
