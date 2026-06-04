package com.sesac.aibackend.dto;

import com.sesac.aibackend.domain.Trip;

public record TripResponse(Long id, String name, String destination) {

    public static TripResponse from(Trip trip) {
        return new TripResponse(trip.getId(), trip.getName(), trip.getDestination());
    }
}
