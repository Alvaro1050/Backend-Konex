package com.example.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha_hora;
    private Long medicamento_id;
    private Long cantidad;
    private Long valor_total;
    private Long valor_unitario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public Long getMedicamento_id() {
        return medicamento_id;
    }

    public void setMedicamento_id(Long medicamento_id) {
        this.medicamento_id = medicamento_id;
    }

    public Long getValor_total() {
        return valor_total;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public void setValor_total(Long valor_total) {
        this.valor_total = valor_total;
    }

    public Long getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Long valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
}
