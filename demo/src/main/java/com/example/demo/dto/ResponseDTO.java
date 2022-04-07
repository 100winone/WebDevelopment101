package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDTO<T> {
    // 다른모델의 DTO도 ResponseDTO를 이용해 리턴할 수 있도록 자바 Generic 이용
    private String error;
    private List<T> data;
}
