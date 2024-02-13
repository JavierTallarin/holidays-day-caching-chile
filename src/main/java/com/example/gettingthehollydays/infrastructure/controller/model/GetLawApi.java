package com.example.gettingthehollydays.infrastructure.controller.model;

import java.util.Objects;

public class GetLawApi {

  private String nombre;
  private String url;


  public static GetLawApiBuilder builder() {
    return new GetLawApi.GetLawApiBuilder();
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
    GetLawApi getLawApi = (GetLawApi) o;
    return Objects.equals(nombre, getLawApi.nombre)
        && Objects.equals(url, getLawApi.url);
  }


  public static final class GetLawApiBuilder {
    private String nombre;
    private String url;

    GetLawApiBuilder() {
    }

    public GetLawApi.GetLawApiBuilder nombre(String nombre) {
      this.nombre = nombre;
      return this;
    }

    public GetLawApi.GetLawApiBuilder url(String url) {
      this.url = url;
      return this;
    }

    public GetLawApi build() {
      GetLawApi getLawApi = new GetLawApi();
      getLawApi.setNombre(nombre);
      getLawApi.setUrl(url);

      return getLawApi;
    }

  }

}
