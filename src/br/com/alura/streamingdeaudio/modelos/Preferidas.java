package br.com.alura.streamingdeaudio.modelos;

public class Preferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado um grande sucesso.");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo.");
        }
    }
}
