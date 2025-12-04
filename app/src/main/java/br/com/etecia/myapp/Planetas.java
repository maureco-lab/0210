package br.com.etecia.myapp;

public class Planetas {
    private String titulo, subtitulo;
    private int imgPlaneta;

    //Construtor vazio
    public Planetas() {
    }
    // getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public int getImgPlaneta() {
        return imgPlaneta;
    }

    public void setImgPlaneta(int imgPlaneta) {
        this.imgPlaneta = imgPlaneta;
    }
}
