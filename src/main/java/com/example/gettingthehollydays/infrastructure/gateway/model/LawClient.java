package com.example.gettingthehollydays.infrastructure.gateway.model;

import java.util.Objects;

public class LawClient {

  private String nombre;
  private String url;


  public static LawClientBuilder builder() {
    return new LawClient.LawClientBuilder();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LawClient lawClient = (LawClient) o;
    return Objects.equals(nombre, lawClient.nombre)
        && Objects.equals(url, lawClient.url);
  }


  public static final class LawClientBuilder {
    private String nombre;
    private String url;

    LawClientBuilder() {
    }

    public LawClient.LawClientBuilder nombre(String nombre) {
      this.nombre = nombre;
      return this;
    }

    public LawClient.LawClientBuilder url(String url) {
      this.url = url;
      return this;
    }

    public LawClient build() {
      LawClient lawClient = new LawClient();
      lawClient.setNombre(nombre);
      lawClient.setUrl(url);

      return lawClient;
    }

  }

}
