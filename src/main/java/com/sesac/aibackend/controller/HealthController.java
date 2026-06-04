package com.sesac.aibackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController // bean으로 등록해주는 역할
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {return Map.of("status", "ok");}
}