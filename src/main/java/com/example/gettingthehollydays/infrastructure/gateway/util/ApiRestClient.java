package com.example.gettingthehollydays.infrastructure.gateway.util;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;

public interface ApiRestClient {
  <K> ResponseEntity<K> getForEntity(String url, ParameterizedTypeReference<K> responseType);
}
