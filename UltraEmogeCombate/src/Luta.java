import java.util.Random;

import javax.sound.midi.Soundbank;


public class Luta {
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    // metodo publico
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCateogria().equals(l2.getCateogria()) 
            && l1 != l2 ){
                this.aprovado = true;
                this.desafiante = l1;
                this.desafiado = l2;
                } else {
                    this.aprovado = false;
                    this.desafiante = null;
                    this.desafiado = null;

                }

        }
    
    public void lutar(){
        if (this.aprovado) {
            System.out.println("### Desafiante ###");
            this.desafiante.apresentar();
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();

            //modo Aleatório para decidir a luta
            Random aleatorio = new Random();// 0,1 ou 2
            int vencedor = aleatorio.nextInt(3);
            System.out.println("===== RESULTADO =====");
            switch (vencedor) {
                case 0: //empate
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1://desafiado vence
                    System.out.println("O vencedor foi: "+ this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2://desaviante vence
                    System.out.println("O vencedor foi: "+ this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break; 
                            
            }
        System.out.println("============================");
            

        } else {
            System.out.println(" A luta não foi aprovada");
        }
    }
    
    
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovado() {
        return aprovado;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    

}

