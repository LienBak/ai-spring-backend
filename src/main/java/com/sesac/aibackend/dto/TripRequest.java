package com.sesac.aibackend.dto;

import com.sesac.aibackend.domain.Item;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record TripRequest(
        @NotBlank String name,
        @NotBlank String destination
        ) {
    public Item toEntity() {
        return Item.builder().name(name).destination(destination).build();
    }
}