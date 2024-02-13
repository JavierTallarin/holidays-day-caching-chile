package com.example.gettingthehollydays.infrastructure.configuration;

import com.example.gettingthehollydays.domain.ports.input.GetHollyDaysChile;
import com.example.gettingthehollydays.domain.ports.output.GetHollyDaysChileGateway;
import com.example.gettingthehollydays.domain.usecase.GetHollyDaysChileUseCase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

  @Bean
  public GetHollyDaysChile getHollyDaysChileUseCase(GetHollyDaysChileGateway getHollyDaysChileGateway) {
    return new GetHollyDaysChileUseCase(getHollyDaysChileGateway);
  }

}
