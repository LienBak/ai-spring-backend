package com.sesac.aibackend.dto;

import com.sesac.aibackend.domain.Item;
import com.sesac.aibackend.domain.Trip;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record TripRequest(
        @NotBlank String name,
        @NotBlank String destination
        ) {
    public Trip toEntity() {
        return Trip.builder().name(name).destination(destination).build();
    }
}