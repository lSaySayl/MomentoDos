package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class GrupoCuatro extends Venta{

    public GrupoCuatro() {
    }

    public GrupoCuatro(String nombre, String cedula, int edad, String correo, int celular, LocalDate fechaCompra, float valorBoleta) {
        super(nombre, cedula, edad, correo, celular, fechaCompra, valorBoleta);
    }

    @Override
    public void ventaCompleta() {
        this.setCompraGrupo(this.getValorBoleta());
        this.setCompraDia(this.getCompraGrupo() - (this.getValorBoleta()) * this.getDescuentoDia());
        this.setCompraIva(this.getCompraDia() + (this.getValorBoleta()) * this.getIva());
    }

    public static int cantidadBoletas() {
        Scanner sc = new Scanner(System.in);
        int cantidadBoletas;
        do {
            System.out.print("¿Cuántas boletas va a comprar sin ser abonado? (Máximo 5): ");
            cantidadBoletas = sc.nextInt();
        } while (cantidadBoletas < 1 || cantidadBoletas > 5);
        return cantidadBoletas;
    }

    public static float valorBoletas(int cantidadBoletas) {
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
