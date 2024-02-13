package com.example.gettingthehollydays.infrastructure.gateway.util.impl;

import com.example.gettingthehollydays.infrastructure.gateway.util.ApiRestClient;
import reactor.core.publisher.Mono;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WebClientRest implements ApiRestClient {

  private final WebClient webClient;

  public WebClientRest(WebClient webClient) {
    this.webClient = webClient;
  }

  @Override
  public <K> ResponseEntity<K> getForEntity(String url, ParameterizedTypeReference<K> responseType) {

    Mono<ResponseEntity<K>> responseEntityMono = webClient.get()
        .uri(url)
        .retrieve()
        .toEntity(responseType);

    return responseEntityMono.block();
  }

}
