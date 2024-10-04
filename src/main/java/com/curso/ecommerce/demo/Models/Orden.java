package com.curso.ecommerce.demo.Models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.logging.Logger;

@Entity
public class Orden {
    
    @Id
    Long id;
    
    String numero;
    
    LocalDate fechaCreacion,fechaRecibida;
    
    double total;

    public Orden() {
    }

    public Orden(Long id, String numero, LocalDate fechaCreacion, LocalDate fechaRecibida, double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaRecibida() {
        return fechaRecibida;
    }

    public void setFechaRecibida(LocalDate fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orden{" + "id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida=" + fechaRecibida + ", total=" + total + '}';
    }
        
    
}
