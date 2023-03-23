package org.example;

import java.time.LocalDate;

public class GrupoCuatro extends Venta{

    public GrupoCuatro() {
    }

    public GrupoCuatro(String nombre, String cedula, int edad, String correo, int celular, LocalDate fechaCompra, float valorBoleta) {
        super(nombre, cedula, edad, correo, celular, fechaCompra, valorBoleta);
    }

    @Override
    public float valorCompraDescuentoGrupo() {
        return (this.getValorBoleta());
    }

    @Override
    public float valorCompraDescuentoDia() {
        return (valorCompraDescuentoGrupo() - (this.getValorBoleta() * this.getDescuentoDia()));
    }

    @Override
    public float valorCompraConIva() {
        return (valorCompraDescuentoDia() + (this.getValorBoleta() * this.getIva()));
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
