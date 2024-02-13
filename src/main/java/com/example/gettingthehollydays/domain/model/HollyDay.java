package com.example.gettingthehollydays.domain.model;

import java.util.List;
import java.util.Objects;

public class HollyDay {

    private String nombre;
    private String comentarios;
    private String fecha;
    private String irrenunciable;
    private String tipo;
    private List<Law> leyes;


    public static HollyDayBuilder builder() {
        return new HollyDay.HollyDayBuilder();
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

    public List<Law> getLeyes() {
        return leyes;
    }

    public void setLeyes(List<Law> leyes) {
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
        HollyDay that = (HollyDay) o;
        return Objects.equals(nombre, that.nombre)
            && Objects.equals(comentarios, that.comentarios)
            && Objects.equals(fecha, that.fecha)
            && Objects.equals(irrenunciable, that.irrenunciable)
            && Objects.equals(tipo, that.tipo)
            && Objects.equals(leyes, that.leyes);
    }

    public static final class HollyDayBuilder {
        private String nombre;
        private String comentarios;
        private String fecha;
        private String irrenunciable;
        private String tipo;
        private List<Law> leyes;

        HollyDayBuilder() {
        }

        public HollyDay.HollyDayBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public HollyDay.HollyDayBuilder comentarios(String comentarios) {
            this.comentarios = comentarios;
            return this;
        }

        public HollyDay.HollyDayBuilder fecha(String fecha) {
            this.fecha = fecha;
            return this;
        }

        public HollyDay.HollyDayBuilder irrenunciable(String irrenunciable) {
            this.irrenunciable = irrenunciable;
            return this;
        }

        public HollyDay.HollyDayBuilder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public HollyDay.HollyDayBuilder leyes(List<Law> leyes) {
            this.leyes = leyes;
            return this;
        }

        public HollyDay build() {
            HollyDay HollyDay = new HollyDay();
            HollyDay.setNombre(nombre);
            HollyDay.setComentarios(comentarios);
            HollyDay.setFecha(fecha);
            HollyDay.setIrrenunciable(irrenunciable);
            HollyDay.setTipo(tipo);
            HollyDay.setLeyes(leyes);

            return HollyDay;
        }

    }

}
