package com.udea.lab2;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class DataController {

    @GetMapping("/")
    public String healthCheck() {
        return "API is running!";
    }

    @GetMapping("/version")
    public String version() {
        return "Version is 1.0";
    }

    @GetMapping("/nations")
    public JsonNode getRandomNations() {
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US"));
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
        var faker = new Faker(new Locale("en-US"));
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
    public JsonNode getRandomnAviation(){
        var objectMapper = new ObjectMapper();
        var faker = new Faker(new Locale("en-US"));
        var aviations = objectMapper.createArrayNode();
        for(var i=0;i<20;i++){
            var aviation = faker.aviation();
            aviations.add(objectMapper.createObjectNode()
                    .put("Aircraft",aviation.aircraft())
                    .put("Airport", aviation.airport())
                    .put("METAR", aviation.METAR())

            );
        }
        return aviations;
    }
}
