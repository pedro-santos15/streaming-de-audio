package br.com.alura.streamingdeaudio.main;

import br.com.alura.streamingdeaudio.modelos.Musica;
import br.com.alura.streamingdeaudio.modelos.Podcast;
import br.com.alura.streamingdeaudio.modelos.Preferidas;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.setTitulo("PRIDE.");
        musica1.setArtista("Kendrick Lamar");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curtir();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Flow Podcast");
        podcast1.setHost("Igor");
        podcast1.setConvidado("Davy Jones");

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curtir();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(podcast1);
        preferidas.inclui(musica1);

    }
}