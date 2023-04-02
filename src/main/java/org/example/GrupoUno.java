package org.example;

import java.time.LocalDate;

public class GrupoUno extends Venta{

    public GrupoUno() {
        this.setDescuentoGrupo(0.35f);
        this.setValorBoleta(40000f);
    }

    public GrupoUno(String nombre, String cedula, int edad, String correo, int celular, int cantidadBoletas, LocalDate fechaCompra) {
        super(nombre, cedula, edad, correo, celular, cantidadBoletas, fechaCompra);
        this.setDescuentoGrupo(0.35f);
        this.setValorBoleta(40000f);
    }

    @Override
    public void ventaCompleta() {
        this.setCompraGrupo((this.getCantidadBoletas() * this.getValorBoleta()) - ((this.getCantidadBoletas() * this.getValorBoleta()) * this.getDescuentoGrupo()));
        this.setCompraDia(this.getCompraGrupo() - ((this.getCantidadBoletas() * this.getValorBoleta()) * this.getDescuentoDia()));
        this.setCompraIva(this.getCompraDia() + ((this.getCantidadBoletas() * this.getValorBoleta()) * this.getIva()));
    }
}
