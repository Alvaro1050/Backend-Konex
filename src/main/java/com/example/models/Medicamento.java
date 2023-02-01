package com.example.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "medicamento")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String laboratorio;

    private String fecha_fabricacion;
    private String fecha_vencimiento;

    private Long cantidad;
    private Long valor_unitario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getFecha_fabricacion() {
        return fecha_fabricacion;
    }

    public void setFecha_fabricacion(String fecha_fabricacion) {
        this.fecha_fabricacion = fecha_fabricacion;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Long getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Long valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
}
