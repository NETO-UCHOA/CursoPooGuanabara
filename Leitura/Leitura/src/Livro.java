public class Livro implements Publicacao {
    //atributos de livro
    private String titulo;
    private String autor;
    private int totalDePaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //atributos
    

    public Livro(String titulo, String autor, int totalDePaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalDePaginas = totalDePaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }


    public String detalhes () {
        return "Livro titulo: " + titulo +
        ",\n autor: " + autor +
        ",\n totalDePaginas: " + totalDePaginas +
        ",\n pagAtual: "+ pagAtual +
        ",\n aberto: " + aberto + ",\n leitor: " + leitor.getNome();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    @Override
    public void abrir() {
        this.aberto = true;
        
    }


    @Override
    public void fechar() {
     this.aberto = false;
       
    }


    @Override
    public void folhear(int p) {
       if (p > totalDePaginas) {
        System.out.println(" Não ha essa pagina");        
       }else {this.pagAtual = p;}
       
    }


    @Override
    public void avacarPag() {
        this.pagAtual ++;
                
    }


    @Override
    public void voltarPag() {
        this.pagAtual --;
        
    }

    

}
