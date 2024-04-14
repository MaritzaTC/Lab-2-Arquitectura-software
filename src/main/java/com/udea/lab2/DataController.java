package com.udea.lab2;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class DataController {
    private static final Locale EN_US = new Locale("en-US");
    @GetMapping("/")
    public String healthCheck() {
        return "API is running!";
    }

    @GetMapping("/version")
    public String version() {
        return "Version is 1.0.6";
    }

    @GetMapping("/nations")
    public JsonNode getRandomNations() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(EN_US);
        var nations = objectMapper.createArrayNode();
        for (var i = 0; i < 10; i++) {
            var nation = faker.nation();
            nations.add(objectMapper.createObjectNode()
                    .put("Nationality", nation.nationality())
                    .put("CapitalCity", nation.capitalCity())
                    .put("Flag", nation.flag())
                    .put("Language", nation.language()));
        }
        return nations;
    }
    @GetMapping("/currencies")
    public JsonNode getRandomCurrencies() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(EN_US);
        var currencies = objectMapper.createArrayNode();
        for (var i = 0; i < 20; i++) {
            var currency = faker.currency();
            currencies.add(objectMapper.createObjectNode()
                    .put("Name", currency.name())
                    .put("Code", currency.code()));

        }
        return currencies;
    }

    @GetMapping("/aviation")
    public JsonNode getRandomAviation(){
        var objectMapper = new ObjectMapper();
        var faker = new Faker(EN_US);
        var aviations = objectMapper.createArrayNode();
        for(var i=0;i<20;i++){
            var aviation = faker.aviation();
            aviations.add(objectMapper.createObjectNode()
                    .put("aircraft",aviation.aircraft())
                    .put("airport", aviation.airport())
                    .put("METAR", aviation.METAR())

            );
        }
        return aviations;
    }
}
