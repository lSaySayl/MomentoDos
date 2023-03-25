package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadBoletas = 0, tribuna = 0;
        LocalDate fecha;
        float compraGrupo = 0, compraDia = 0, compraIva = 0, valorBoletas = 0;

        System.out.print("¿Eres abonado? 1=SI, 2=NO: ");
        int abonado = sc.nextInt();
        if (abonado == 1) {
            System.out.print("¿Cuál es la tribuna a la que aspira siendo abonado? 1=Norte, 2=Sur, 3=Oriental, 4=Occidental: ");
            tribuna = sc.nextInt();
            switch (tribuna) {
                case 1, 2:
                    do {
                        System.out.print("¿Cuántas boletas va a comprar para popular(norte/sur) siendo abonado? (Máximo 1): ");
                        cantidadBoletas = sc.nextInt();
                    } while (cantidadBoletas != 1);
                    fecha = fechaCompra();
                    GrupoUno venta1 = new GrupoUno("Sebastían", "11111", 20, "carlosmamon@gmail.com", 5315467, cantidadBoletas, fecha);
                    venta1.setDescuentoDia(venta1.validarDescuentoDia(fecha));
                    compraGrupo = venta1.valorCompraDescuentoGrupo();
                    compraDia = venta1.valorCompraDescuentoDia();
                    compraIva = venta1.valorCompraConIva();
                    break;
                case 3:
                    do {
                        System.out.print("¿Cuántas boletas va a comprar para oriental siendo abonado? (Máximo 2): ");
                        cantidadBoletas = sc.nextInt();
                    } while (cantidadBoletas != 1 && cantidadBoletas != 2);
                    fecha = fechaCompra();
                    GrupoDos venta2 = new GrupoDos("Sebastían", "11111", 20, "carlosmamon@gmail.com", 5315467, cantidadBoletas, fecha);
                    venta2.setDescuentoDia(venta2.validarDescuentoDia(fecha));
                    compraGrupo = venta2.valorCompraDescuentoGrupo();
                    compraDia = venta2.valorCompraDescuentoDia();
                    compraIva = venta2.valorCompraConIva();
                    break;
                case 4:
                    do {
                        System.out.print("¿Cuántas boletas va a comprar para occidental siendo abonado? (Máximo 3): ");
                        cantidadBoletas = sc.nextInt();
                    } while (cantidadBoletas != 1 && cantidadBoletas != 2 && cantidadBoletas != 3);
                    fecha = fechaCompra();
                    GrupoTres venta3 = new GrupoTres("Sebastían", "11111", 20, "carlosmamon@gmail.com", 5315467, cantidadBoletas, fecha);
                    venta3.setDescuentoDia(venta3.validarDescuentoDia(fecha));
                    compraGrupo = venta3.valorCompraDescuentoGrupo();
                    compraDia = venta3.valorCompraDescuentoDia();
                    compraIva = venta3.valorCompraConIva();
                    break;
            }
        } else {
            cantidadBoletas = cantidadBoletas();
            valorBoletas = valorBoletas(cantidadBoletas);
            fecha = fechaCompra();
            GrupoCuatro venta = new GrupoCuatro("Sebastían", "11111", 20, "carlosmamon@gmail.com", 5315467, fecha, valorBoletas);
            venta.setDescuentoDia(venta.validarDescuentoDia(fecha));
            compraGrupo = venta.valorCompraDescuentoGrupo();
            compraDia = venta.valorCompraDescuentoDia();
            compraIva = venta.valorCompraConIva();
        }

        System.out.println("Su compra con el valor del descuento grupo es : $" + compraGrupo);

        System.out.println("Su compra con el valor del descuento día es : $" + compraDia);

        System.out.println("Su compra con el valor del sumatoria iva es : $" + compraIva);
    }

    private static LocalDate fechaCompra() {
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

    private static int cantidadBoletas() {
        Scanner sc = new Scanner(System.in);
        int cantidadBoletas;
        do {
            System.out.print("¿Cuántas boletas va a comprar sin ser abonado? (Máximo 5): ");
            cantidadBoletas = sc.nextInt();
        } while (cantidadBoletas < 1 || cantidadBoletas > 5);
        return cantidadBoletas;
    }

    private static float valorBoletas(int cantidadBoletas) {
        Scanner sc = new Scanner(System.in);
        int tribuna;
        float valorTotal = 0;
        for (int i = 0; i < cantidadBoletas; i++) {
            do {
                System.out.print("¿Cuál es la tribuna a la que aspira sin ser abonado para su boleta N°" + (i + 1) + "? 1=Norte, 2=Sur, 3=Oriental, 4=Occidental: ");
                tribuna = sc.nextInt();
                switch (tribuna) {
                    case 1, 2:
                        valorTotal += 40000f;
                        break;
                    case 3:
                        valorTotal += 80000f;
                        break;
                    case 4:
                        valorTotal += 150000f;
                        break;
                }
            } while (tribuna < 1 || tribuna > 4);
        }
        return valorTotal;
    }
}