package org.example;

import java.time.LocalDate;

public class GrupoDos extends Venta{

    public GrupoDos() {
        this.setDescuentoGrupo(0.25f);
        this.setValorBoleta(80000f);
    }

    public GrupoDos(String nombre, String cedula, int edad, String correo, int celular, int cantidadBoletas, LocalDate fechaCompra) {
        super(nombre, cedula, edad, correo, celular, cantidadBoletas, fechaCompra);
        this.setDescuentoGrupo(0.25f);
        this.setValorBoleta(80000f);
    }

    @Override
    public float valorCompraDescuentoGrupo() {
        return ((this.getCantidadBoletas() * this.getValorBoleta()) - ((this.getCantidadBoletas() * this.getValorBoleta()) * this.getDescuentoGrupo()));
    }

    @Override
    public float valorCompraDescuentoDia() {
        return (valorCompraDescuentoGrupo() - ((this.getCantidadBoletas() * this.getValorBoleta()) * this.getDescuentoDia()));
    }

    @Override
    public float valorCompraConIva() {
        return (valorCompraDescuentoDia() + ((this.getCantidadBoletas() * this.getValorBoleta()) * this.getIva()));
    }

    @Override
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