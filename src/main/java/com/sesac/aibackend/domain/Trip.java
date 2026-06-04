package com.sesac.aibackend.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Trip {

    private Long id;
    private String name;
    private String title;
    private String departure;
    private String destination;
}
