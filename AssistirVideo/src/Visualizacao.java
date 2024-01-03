public class Visualizacao {
    private Gafanhoto espectados;
    private Video Filme;
    public Visualizacao(Gafanhoto espectados, Video filme) {
        this.espectados = espectados;
        Filme = filme;
    }
    public Gafanhoto getEspectados() {
        return espectados;
    }
    public void setEspectados(Gafanhoto espectados) {
        this.espectados = espectados;
    }
    public Video getFilme() {
        return Filme;
    }
    public void setFilme(Video filme) {
        Filme = filme;
    }
    @Override
    public String toString() {
        return "Visualizacao [espectados=" + espectados + ", Filme=" + Filme + "]";
    } 

    
}
