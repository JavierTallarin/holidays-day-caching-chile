package com.example.gettingthehollydays.infrastructure.controller.model;

import java.util.List;
import java.util.Objects;

public class GetHollyDayApi {

    private String nombre;
    private String comentarios;
    private String fecha;
    private String irrenunciable;
    private String tipo;
    private List<GetLawApi> leyes;


    public static HollyDayClientBuilder builder() {
        return new GetHollyDayApi.HollyDayClientBuilder();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIrrenunciable() {
        return irrenunciable;
    }

    public void setIrrenunciable(String irrenunciable) {
        this.irrenunciable = irrenunciable;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<GetLawApi> getLeyes() {
        return leyes;
    }

    public void setLeyes(List<GetLawApi> leyes) {
        this.leyes = leyes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetHollyDayApi that = (GetHollyDayApi) o;
        return Objects.equals(nombre, that.nombre)
            && Objects.equals(comentarios, that.comentarios)
            && Objects.equals(fecha, that.fecha)
            && Objects.equals(irrenunciable, that.irrenunciable)
            && Objects.equals(tipo, that.tipo)
            && Objects.equals(leyes, that.leyes);
    }

    public static final class HollyDayClientBuilder {
        private String nombre;
        private String comentarios;
        private String fecha;
        private String irrenunciable;
        private String tipo;
        private List<GetLawApi> leyes;

        HollyDayClientBuilder() {
        }

        public GetHollyDayApi.HollyDayClientBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public GetHollyDayApi.HollyDayClientBuilder comentarios(String comentarios) {
            this.comentarios = comentarios;
            return this;
        }

        public GetHollyDayApi.HollyDayClientBuilder fecha(String fecha) {
            this.fecha = fecha;
            return this;
        }

        public GetHollyDayApi.HollyDayClientBuilder irrenunciable(String irrenunciable) {
            this.irrenunciable = irrenunciable;
            return this;
        }

        public GetHollyDayApi.HollyDayClientBuilder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public GetHollyDayApi.HollyDayClientBuilder leyes(List<GetLawApi> leyes) {
            this.leyes = leyes;
            return this;
        }

        public GetHollyDayApi build() {
            GetHollyDayApi getHollyDayApi = new GetHollyDayApi();
            getHollyDayApi.setNombre(nombre);
            getHollyDayApi.setComentarios(comentarios);
            getHollyDayApi.setFecha(fecha);
            getHollyDayApi.setIrrenunciable(irrenunciable);
            getHollyDayApi.setTipo(tipo);
            getHollyDayApi.setLeyes(leyes);

            return getHollyDayApi;
        }

    }

}
