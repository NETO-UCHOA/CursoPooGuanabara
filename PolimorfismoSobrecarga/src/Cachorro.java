public class Cachorro extends Lobo {

    

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
        //TODO Auto-generated constructor stub
    }

    
    @Override
    public void emitirSon(){
        System.out.println("Au Au Au");
    }
    public void reagir(String frase){
        if (frase.equals("toma comida")|| frase.equals("Vamos passear")){
            System.out.println("Abana rabo");
        }else{ System.out.println("rosna");}
    }
    public void reagir(int hora, int min){
        if(hora<12){System.out.println("abana rabo");}
        else if (hora>=18){System.out.println("iguinorar");}
        else{System.out.println("Abanar e latir");}
    }
    public void reagir(boolean dono){
        if(dono){System.out.println("abanar");}else{System.out.println("latir");}
    }
    public void reagir(int idade, float peso){
     if (idade<5) {
        if (peso<10) {System.out.println("abanar");            
        } else {System.out.println("latir");          
        } 
     } else {if (peso>10) {
        System.out.println("rosna");
     } else {System.out.println("ignora");
        
     }
        
     }   
    }
    
    
}
