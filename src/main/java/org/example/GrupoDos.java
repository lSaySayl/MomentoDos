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
    public void ventaCompleta() {
        this.setCompraGrupo((this.getCantidadBoletas() * this.getValorBoleta()) - ((this.getCantidadBoletas() * this.getValorBoleta()) * this.getDescuentoGrupo()));
        this.setCompraDia(this.getCompraGrupo() - ((this.getCantidadBoletas() * this.getValorBoleta()) * this.getDescuentoDia()));
        this.setCompraIva(this.getCompraDia() + ((this.getCantidadBoletas() * this.getValorBoleta()) * this.getIva()));
    }
}
