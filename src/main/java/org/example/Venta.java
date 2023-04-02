package org.example;

import java.time.LocalDate;
import java.util.Scanner;

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
    private float compraGrupo;
    private float compraDia;
    private float compraIva;

    public Venta() {
    }

    public Venta(String nombre, String cedula, int edad, String correo, int celular, float descuentoGrupo, float valorBoleta, float descuentoDia, float iva, int cantidadBoletas, LocalDate fechaCompra, float compraGrupo, float compraDia, float compraIva) {
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
        this.compraGrupo = compraGrupo;
        this.compraDia = compraDia;
        this.compraIva = compraIva;
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

    public float getCompraGrupo() {
        return compraGrupo;
    }

    public void setCompraGrupo(float compraGrupo) {
        this.compraGrupo = compraGrupo;
    }

    public float getCompraDia() {
        return compraDia;
    }

    public void setCompraDia(float compraDia) {
        this.compraDia = compraDia;
    }

    public float getCompraIva() {
        return compraIva;
    }

    public void setCompraIva(float compraIva) {
        this.compraIva = compraIva;
    }

    public abstract void ventaCompleta();

    public static LocalDate fechaCompra() {
        Scanner sc = new  Scanner(System.in);
        int diaCompra;
        LocalDate fechaCompra = LocalDate.now();
        do {
            System.out.print("¿Cuál es la fecha de compra? 1=Martes 21 de Marzo, 2=Miércoles 22 de Marzo, 3=Jueves 23 de Marzo, 4=>Viernes 24 de Marzo: ");
            diaCompra = sc.nextInt();
        } while (diaCompra < 1 || diaCompra > 4);
        switch (diaCompra) {
            case 1:
                fechaCompra = LocalDate.of(2022, 3, 21);
                break;
            case 2:
                fechaCompra = LocalDate.of(2022, 3, 22);
                break;
            case 3:
                fechaCompra = LocalDate.of(2022, 3, 23);
                break;
            case 4:
                fechaCompra = LocalDate.of(2022, 3, 24);
                break;
        }
        return fechaCompra;
    }

    public float validarDescuentoDia(LocalDate fechaCompra) {
        if (fechaCompra.equals(LocalDate.of(2022, 3, 21))) {
            return 0.05f;
        } else if (fechaCompra.equals(LocalDate.of(2022, 3, 22))) {
            return 0.02f;
        } else if (fechaCompra.equals(LocalDate.of(2022, 3, 23))) {
            return 0.015f;
        } else {
            return 0.01f;
        }
    }
}
