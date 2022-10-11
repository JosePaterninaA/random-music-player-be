package com.player.randommusicplayerbe.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.player.randommusicplayerbe.models.genius.Child;
import com.player.randommusicplayerbe.models.genius.GeniusResponse;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMapperConfig {
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jsonCustomizer() {
        return builder -> builder.postConfigurer(objectMapper -> {
            objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true).coercionConfigFor(Child.class)
                    .setCoercion(CoercionInputShape.EmptyString, CoercionAction.AsNull);
        });
    }
}