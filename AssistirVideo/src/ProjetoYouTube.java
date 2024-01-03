public class ProjetoYouTube {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];

        v[0] = new Video("Aula 01 Poo  ", null, 0, 0, false);
        v[1] = new Video("Aula 12 PHP", null, 0, 0, false);
        v[2] = new Video("Aula 10 HTML", null, 0, 0, false);
        
        
        System.out.println(v[0].toString());
        System.out.println("========================");
        System.out.println(v[1].toString());
        System.out.println("========================");
        System.out.println(v[2].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("jubileu", 22, "m", 0, null, 0);
        g[1] = new Gafanhoto("Creuza", 12, "M", 0, null, 0);

        Visualizacao vis = new Visualizacao(g[0], v[2]);

        System.out.println(vis.toString());
       
       
        /*System.out.println("_____________________________");
        System.out.println(g[0].toString());
        System.out.println("_____________________________");
        System.out.println(g[1].toString());
        System.out.println("_____________________________");*/


        

    }
}
