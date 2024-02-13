package com.example.gettingthehollydays.domain.model;

import java.util.Objects;

public class Law {

  private String nombre;
  private String url;


  public static LawBuilder builder() {
    return new Law.LawBuilder();
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
    Law law = (Law) o;
    return Objects.equals(nombre, law.nombre)
        && Objects.equals(url, law.url);
  }


  public static final class LawBuilder {
    private String nombre;
    private String url;

    LawBuilder() {
    }

    public Law.LawBuilder nombre(String nombre) {
      this.nombre = nombre;
      return this;
    }

    public Law.LawBuilder url(String url) {
      this.url = url;
      return this;
    }

    public Law build() {
      Law law = new Law();
      law.setNombre(nombre);
      law.setUrl(url);

      return law;
    }

  }

}
