public class carro {
    public static void main(String[] args) {
        FabricaCarro c1 = new FabricaCarro("uno", "FIAT", 2012, 10);
       

        //metodo
        c1.acelerar(10);
        System.out.println("A velocidade é: "+ c1.velocidade+"KM/h");

        c1.freiar(30);
        System.out.println(c1.velocidade);
        c1.buzinar();

        FabricaCarro c2 = new FabricaCarro("gol", "wv", 2005, 5);

        c2.acelerar(10);
        System.out.println("A velocidade é: "+ c2.velocidade+"KM/h");

        c2.freiar(30);
        System.out.println(c2.velocidade);
        c1.buzinar();


    }
}
