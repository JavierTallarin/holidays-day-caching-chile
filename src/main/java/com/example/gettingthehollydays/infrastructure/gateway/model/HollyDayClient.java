package com.example.gettingthehollydays.infrastructure.gateway.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class HollyDayClient implements Serializable {

    private String nombre;
    private String comentarios;
    private String fecha;
    private String irrenunciable;
    private String tipo;
    private List<LawClient> leyes;

    public HollyDayClient() {
    }

    public static HollyDayClientBuilder builder() {
        return new HollyDayClient.HollyDayClientBuilder();
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

    public List<LawClient> getLeyes() {
        return leyes;
    }

    public void setLeyes(List<LawClient> leyes) {
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
        HollyDayClient that = (HollyDayClient) o;
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
        private List<LawClient> leyes;

        HollyDayClientBuilder() {
        }

        public HollyDayClient.HollyDayClientBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public HollyDayClient.HollyDayClientBuilder comentarios(String comentarios) {
            this.comentarios = comentarios;
            return this;
        }

        public HollyDayClient.HollyDayClientBuilder fecha(String fecha) {
            this.fecha = fecha;
            return this;
        }

        public HollyDayClient.HollyDayClientBuilder irrenunciable(String irrenunciable) {
            this.irrenunciable = irrenunciable;
            return this;
        }

        public HollyDayClient.HollyDayClientBuilder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public HollyDayClient.HollyDayClientBuilder leyes(List<LawClient> leyes) {
            this.leyes = leyes;
            return this;
        }

        public HollyDayClient build() {
            HollyDayClient hollyDayClient = new HollyDayClient();
            hollyDayClient.setNombre(nombre);
            hollyDayClient.setComentarios(comentarios);
            hollyDayClient.setFecha(fecha);
            hollyDayClient.setIrrenunciable(irrenunciable);
            hollyDayClient.setTipo(tipo);
            hollyDayClient.setLeyes(leyes);

            return hollyDayClient;
        }

    }

}
