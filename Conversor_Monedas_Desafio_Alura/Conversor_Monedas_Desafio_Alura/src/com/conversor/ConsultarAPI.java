package com.conversor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class ConsultarAPI {

    private static final String API_KEY = "dee91923b00262a5b5ba7b0a";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public Conversor obtenerTasa(String monedaBase, String monedaDestino) {
        URI url = URI.create(BASE_URL + API_KEY + "/pair/" + monedaBase + "/" + monedaDestino);

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(respuesta.body(), Conversor.class);
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al consultar la API: " + e.getMessage());
            return null;
        }
    }
}