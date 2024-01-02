
public class lutadores {
public static void main(String[] args) {

    Lutador l[]= new Lutador[6];

    l[0] = new Lutador("pretty Boy", "frança", 31, 1.75f, 68.9f, 11, 2, 1);
    l[0].status();
    
    l[1] = new Lutador("Puch Screap", "brasil", 29, 1.68f, 57.8f, 14, 2, 3);
    l[1].status();

    l[2] = new Lutador("Sapshadow ", "EUA", 35, 1.65f, 81.6f, 13, 0, 2);
    l[2].status();

    l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.8f, 13, 0, 2);
    l[3].status();
    
    l[4] = new Lutador("UfoCobol", "ABrasil", 37, 1.7f, 119.3f, 5, 4, 3);
    l[4].status();

    l[5] = new Lutador("NerDaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
    l[5].status();

    Luta uec01 = new Luta();
    uec01.marcarLuta(l[0], l[1]);
    uec01.lutar();
    l[0].status();
    l[1].status();
}

}
