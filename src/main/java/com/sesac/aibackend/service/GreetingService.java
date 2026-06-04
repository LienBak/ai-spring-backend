package com.sesac.aibackend.service;

import com.sesac.aibackend.util.MessageFormatter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor  // 필수 항목(객체)은 생성자로 만들어라. -- 의존성 주입 중 생성자 주입하는 방법
public class GreetingService {

    private final MessageFormatter formatter;
    public String hello(String name) {
        return formatter.format(name);
    }
}