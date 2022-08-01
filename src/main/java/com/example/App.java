package com.example;

import java.io.InputStream;
import java.net.URL;


//conecta a api do imdb
//pode ser utilizado o VAR para "inferir ao tipo" da variavel, não era para o java ser extremamente tipado?

public class App {
    public static void main(String[] args) throws Exception {

        //String url = "https://imdb-api.com/en/API/Top250Movies/k_t8yk1w79";
        String url = "https://alura-imdb-api.herokuapp.com/movies";

        Client client = new Client();
        String json = client.search(url);

        for (Filme filme : jsonParser.parse(json)) {
            
            //pega a imagem e titulo do filme para criar um arquivo de imagem com seu titulo como nome
            String urlfilme = filme.getImagem();
            String tt = filme.getTitulo();
            String tittle = tt + ".png";
            InputStream inputStream = new URL(urlfilme).openStream();
            StickerFactory create = new StickerFactory();
            //cria o sticker apartir da imagem e titulo do filme
            create.create(inputStream, tittle);

            //printa no console os dados do filme, juntamente com a sua nota como estrelas em unicode
            Double nota = Double.parseDouble(filme.getAvaliacao());
            System.out.println(filme.getTitulo());
            System.out.println(filme.getImagem());
            System.out.println(filme.getAvaliacao());
            for (double i = 0.5; i <= nota; i++) {
                System.out.print("\u2606");
            }
            System.out.println("\n");
        }
    }
}
