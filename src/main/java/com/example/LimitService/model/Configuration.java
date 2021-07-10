package com.example.LimitService.model;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
@ConfigurationProperties("limit-service")
public class Configuration {
    private  int max;
    private  int min;



}
