package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadBoletas = 0, tribuna = 0, abonado = 0;
        LocalDate fecha;
        float compraGrupo = 0, compraDia = 0, compraIva = 0, valorBoletas = 0;

        do {
            System.out.print("¿Eres abonado? 1=SI, 2=NO: ");
            abonado = sc.nextInt();
        } while (abonado != 1 && abonado != 2);
        if (abonado == 1) {
            do {
                System.out.print("¿Cuál es la tribuna a la que aspira siendo abonado? 1=Norte, 2=Sur, 3=Oriental, 4=Occidental: ");
                tribuna = sc.nextInt();
            } while (tribuna < 1 || tribuna > 4);
            switch (tribuna) {
                case 1, 2:
                    do {
                        System.out.print("¿Cuántas boletas va a comprar para popular(norte/sur) siendo abonado? (Máximo 1): ");
                        cantidadBoletas = sc.nextInt();
                    } while (cantidadBoletas != 1);
                    fecha = Venta.fechaCompra();
                    GrupoUno venta1 = new GrupoUno("Sebastían", "11111", 20, "carlosmamon@gmail.com", 5315467, cantidadBoletas, fecha);
                    venta1.setDescuentoDia(venta1.validarDescuentoDia(fecha));
                    venta1.ventaCompleta();
                    compraGrupo = venta1.getCompraGrupo();
                    compraDia = venta1.getCompraDia();
                    compraIva = venta1.getCompraIva();
                    break;
                case 3:
                    do {
                        System.out.print("¿Cuántas boletas va a comprar para oriental siendo abonado? (Máximo 2): ");
                        cantidadBoletas = sc.nextInt();
                    } while (cantidadBoletas != 1 && cantidadBoletas != 2);
                    fecha = Venta.fechaCompra();
                    GrupoDos venta2 = new GrupoDos("Sebastían", "11111", 20, "carlosmamon@gmail.com", 5315467, cantidadBoletas, fecha);
                    venta2.setDescuentoDia(venta2.validarDescuentoDia(fecha));
                    venta2.ventaCompleta();
                    compraGrupo = venta2.getCompraGrupo();
                    compraDia = venta2.getCompraDia();
                    compraIva = venta2.getCompraIva();
                    break;
                case 4:
                    do {
                        System.out.print("¿Cuántas boletas va a comprar para occidental siendo abonado? (Máximo 3): ");
                        cantidadBoletas = sc.nextInt();
                    } while (cantidadBoletas != 1 && cantidadBoletas != 2 && cantidadBoletas != 3);
                    fecha = Venta.fechaCompra();
                    GrupoTres venta3 = new GrupoTres("Sebastían", "11111", 20, "carlosmamon@gmail.com", 5315467, cantidadBoletas, fecha);
                    venta3.setDescuentoDia(venta3.validarDescuentoDia(fecha));
                    venta3.ventaCompleta();
                    compraGrupo = venta3.getCompraGrupo();
                    compraDia = venta3.getCompraDia();
                    compraIva = venta3.getCompraIva();
                    break;
            }
        } else {
            cantidadBoletas = GrupoCuatro.cantidadBoletas();
            valorBoletas = GrupoCuatro.valorBoletas(cantidadBoletas);
            fecha = Venta.fechaCompra();
            GrupoCuatro venta = new GrupoCuatro("Sebastían", "11111", 20, "carlosmamon@gmail.com", 5315467, fecha, valorBoletas);
            venta.setDescuentoDia(venta.validarDescuentoDia(fecha));
            venta.ventaCompleta();
            compraGrupo = venta.getCompraGrupo();
            compraDia = venta.getCompraDia();
            compraIva = venta.getCompraIva();
        }

        System.out.println("Su compra con el valor del descuento grupo es : $" + compraGrupo);
        System.out.println("Su compra con el valor del descuento día es : $" + compraDia);
        System.out.println("Su compra con el valor del sumatoria iva es : $" + compraIva);
    }
}