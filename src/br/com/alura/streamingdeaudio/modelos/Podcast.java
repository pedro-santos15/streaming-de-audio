package br.com.alura.streamingdeaudio.modelos;

public class Podcast extends Audio{
    private String convidado;
    private String host;
    private String descricao;

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() >= 500){
            return 10;
        } else{
            return 8;
        }


    }
}
