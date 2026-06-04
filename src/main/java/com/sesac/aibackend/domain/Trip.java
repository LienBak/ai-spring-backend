package com.sesac.aibackend.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trip {

    private Long userId;
    private String userName;
    private String departure;
    private String destination;
}
