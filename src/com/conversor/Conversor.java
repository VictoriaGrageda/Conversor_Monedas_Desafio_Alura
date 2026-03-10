package com.conversor;

public class Conversor {
    private String base_code;
    private String target_code;
    private double conversion_rate;
    private String result;

    public Conversor(){
    }

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public String getResult() {
        return result;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private String obtenerSimbolo(String codigoMoneda) {
        return switch (codigoMoneda){
            case "USD" -> "$"; //Dolar estadounidense
            case "CLP" -> "$"; //Peso Chileno
            case "ARS" -> "$"; //Peso Argentino
            case "EUR" -> "€"; //Euro
            case "BRL" -> "R$"; //Real Brasilenio
            default -> codigoMoneda;
        };
    }

    public String mostrarResultado(double monto) {
        String simboloOrigen = obtenerSimbolo(base_code);
        String simboloDestino = obtenerSimbolo(target_code);
        return simboloOrigen + monto + " " + base_code + " equivalen a " +
               simboloDestino + String.format("%.2f", monto * conversion_rate) + " " + target_code +
                "\nTasa de conversion: " + String.format("%.2f", conversion_rate);
    }


    @Override
    public String toString() {
        return "Conversor{" +
                "Moneda origen ='" + base_code + '\'' +
                ", Moneda destino ='" + target_code + '\'' +
                ", Tasa conversión =" + conversion_rate +
                ", Resultado ='" + result + '\'' +
                '}';
    }
}
