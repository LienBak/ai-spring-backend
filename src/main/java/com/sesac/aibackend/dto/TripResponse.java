package com.sesac.aibackend.dto;

import com.sesac.aibackend.domain.Trip;

public record TripResponse(Long userId, String userName, String departure, String destination) {

    public static TripResponse from(Trip trip) {
        return new TripResponse(trip.getUserId(), trip.getUserName(), trip.getDeparture(), trip.getDestination());
    }
}
