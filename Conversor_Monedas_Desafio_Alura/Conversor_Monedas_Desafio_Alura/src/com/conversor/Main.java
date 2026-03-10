package com.conversor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultarAPI api = new ConsultarAPI();
        ArrayList<String> historial = new ArrayList<>();

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("\n--- Conversor de Monedas ---");
            System.out.println("===============================================");
            System.out.println("1. USD a CLP");
            System.out.println("2. USD a ARS");
            System.out.println("3. ARS a USD");
            System.out.println("4. BRL a USD");
            System.out.println("5. USD a EUR");
            System.out.println("6. EUR a USD");
            System.out.println("7. Salir");
            System.out.println("8. Historial de conversiones");
            System.out.println("===============================================\n");
            System.out.print("Ingrese una opción: \n");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese el monto a convertir: ");
                double monto = scanner.nextDouble();

                String monedaBase = "";
                String monedaDestino = "";

                switch (opcion) {
                    case 1 -> { monedaBase = "USD"; monedaDestino = "CLP"; }
                    case 2 -> { monedaBase = "USD"; monedaDestino = "ARS"; }
                    case 3 -> { monedaBase = "ARS"; monedaDestino = "USD"; }
                    case 4 -> { monedaBase = "BRL"; monedaDestino = "USD"; }
                    case 5 -> { monedaBase = "USD"; monedaDestino = "EUR"; }
                    case 6 -> { monedaBase = "EUR"; monedaDestino = "USD"; }
                }

                Conversor resultado = api.obtenerTasa(monedaBase, monedaDestino);
                if (resultado != null) {
                    // Calculamos el valor final
                    resultado.setResult(String.valueOf(monto * resultado.getConversion_rate()));
                    System.out.println(resultado.mostrarResultado(monto) + "\n");


                    String registro = resultado.mostrarResultado(monto);
                    historial.add(registro);
                }
            } else if (opcion == 8) {
                System.out.println("===============================================");
                System.out.println("********** Historial de Conversiones ********** \n");
                System.out.println("Realizaste las siguientes conversiones: \n");
                for (String r: historial) {
                    System.out.println(r);
                    System.out.println("===============================================");
                }
            } else if (opcion != 7) {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
        }

        System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
    }
}

