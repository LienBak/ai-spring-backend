package com.sesac.aibackend.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder        // 객체를 만들어주는?
public class Item {

    private Long id;
    private String name;
    private int price;
}