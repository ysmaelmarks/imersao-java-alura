package com.example;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;


//conecta a api do imdb
//pode ser utilizado o VAR para "inferir ao tipo" da variavel, não era para o java ser extremamente tipado?

public class App {
    public static void main(String[] args) throws Exception {

        //String url = "https://imdb-api.com/en/API/Top250Movies/k_t8yk1w79";
        String url = "https://alura-imdb-api.herokuapp.com/movies";

        HttpClient client = HttpClient.newHttpClient();

        URI endereco = URI.create(url);

        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        String body = response.body();


        for (Filme filme : jsonParser.parse(body)) {
            Double nota = Double.parseDouble(filme.getAvaliacao());
            System.out.println(filme.getTitulo());
            System.out.println(filme.getImagem());
            System.out.println(filme.getAvaliacao());
            for (double i = 0.5; i <= nota; i++) {
                System.out.print("\u2606");
            }
            System.out.println("\n");
        }
        //usar biblioteca jackson para converter json para objeto
        //var jsonParser = new JsonParser();
        //List<Map<String, String>> listaDeFilmes = jsonParser.parse(body);

}
}
