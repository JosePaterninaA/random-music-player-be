package com.player.randommusicplayerbe.services.deserializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.player.randommusicplayerbe.exceptions.GeniusApiException;
import com.player.randommusicplayerbe.models.SongDetails;
import org.springframework.stereotype.Component;

@Component
public class GeniusDeserializer {
    public SongDetails getSongDetailsFromJSONResponse(String json) throws GeniusApiException {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode artistNode = objectMapper.readTree(json).get("response").get("song").get("artist_names");
            JsonNode titleNode = objectMapper.readTree(json).get("response").get("song").get("full_title");

            return SongDetails.builder().artist(artistNode.asText()).title(titleNode.asText()).build();


        }catch (NullPointerException | JsonProcessingException e){
            throw new GeniusApiException(e.getMessage(), e);
        }
    }

}
