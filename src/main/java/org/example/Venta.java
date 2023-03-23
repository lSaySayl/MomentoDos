package org.example;

import java.time.LocalDate;

public  abstract class Venta {

    private String nombre;
    private String cedula;
    private int edad;
    private String correo;
    private int celular;
    private float descuentoGrupo;
    private float valorBoleta;
    private float descuentoDia;
    private float iva = 0.19f;
    private int cantidadBoletas;
    private LocalDate fechaCompra;

    public Venta() {
    }

    public Venta(String nombre, String cedula, int edad, String correo, int celular, float descuentoGrupo, float valorBoleta, float descuentoDia, float iva, int cantidadBoletas, LocalDate fechaCompra) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.correo = correo;
        this.celular = celular;
        this.descuentoGrupo = descuentoGrupo;
        this.valorBoleta = valorBoleta;
        this.descuentoDia = descuentoDia;
        this.iva = iva;
        this.cantidadBoletas = cantidadBoletas;
        this.fechaCompra = fechaCompra;
    }

    public Venta(String nombre, String cedula, int edad, String correo, int celular, int cantidadBoletas, LocalDate fechaCompra) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.correo = correo;
        this.celular = celular;
        this.cantidadBoletas = cantidadBoletas;
        this.fechaCompra = fechaCompra;
    }

    public Venta(String nombre, String cedula, int edad, String correo, int celular, LocalDate fechaCompra, float valorBoleta) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.correo = correo;
        this.celular = celular;
        this.fechaCompra = fechaCompra;
        this.valorBoleta = valorBoleta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public float getDescuentoGrupo() {
        return descuentoGrupo;
    }

    public void setDescuentoGrupo(float descuentoGrupo) {
        this.descuentoGrupo = descuentoGrupo;
    }

    public float getValorBoleta() {
        return valorBoleta;
    }

    public void setValorBoleta(float valorBoleta) {
        this.valorBoleta = valorBoleta;
    }

    public float getDescuentoDia() {
        return descuentoDia;
    }

    public void setDescuentoDia(float descuentoDia) {
        this.descuentoDia = descuentoDia;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public int getCantidadBoletas() {
        return cantidadBoletas;
    }

    public void setCantidadBoletas(int cantidadBoletas) {
        this.cantidadBoletas = cantidadBoletas;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public abstract float valorCompraDescuentoGrupo();

    public abstract float valorCompraDescuentoDia();

    public abstract float valorCompraConIva();

    public abstract float validarDescuentoDia(LocalDate fechaCompra);
}
