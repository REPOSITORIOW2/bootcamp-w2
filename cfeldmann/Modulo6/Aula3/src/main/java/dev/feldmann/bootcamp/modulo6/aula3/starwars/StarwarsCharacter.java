package dev.feldmann.bootcamp.modulo6.aula3.starwars;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StarwarsCharacter {

    private String name;
    private String height;
    private String mass;
    private String hairColor;
    private String skinColor;
    @JsonProperty("homeworld")
    private String homeWorld;
    private String species;

}
