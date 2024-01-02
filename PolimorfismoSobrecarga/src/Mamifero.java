public class Mamifero extends Animal {

protected String corPelo;


@Override
public void emitirSon(){
    System.out.println("som de mamifero");
}


public Mamifero(float peso, int idade, int membros, String corPelo) {
    super(peso, idade, membros);
    this.corPelo = corPelo;
}


public String getCorPelo() {
    return corPelo;
}


public void setCorPelo(String corPelo) {
    this.corPelo = corPelo;
}


    
}
