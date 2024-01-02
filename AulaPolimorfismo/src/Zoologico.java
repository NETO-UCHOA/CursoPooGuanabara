public class Zoologico {
    public static void main(String[] args) throws Exception {
       
       Mamifero boi = new Mamifero(500, 5, 4, "malhado");
       Reptil cobra = new Reptil(3, 4, 0);
       Peixe carpa = new Peixe(1, 2, 0, "dourada");
       Aves galinha = new Aves(3, 1, 2, "branca");

       boi.locomover();
       cobra.locomover();
       carpa.locomover();
       galinha.locomover();

       



    }
}
