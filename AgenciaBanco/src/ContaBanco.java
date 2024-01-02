public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Metodos personalizados.

    
    /**
     * @param t
     */
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t =="cc") {
            this.setSaldo(50);            
        } else if (t =="cp"){
           this.setSaldo(150); 
        }
        System.out.println("Conta aberta, saldo inicial R$50,00");
    }
    public void fecharConta(){
        if (this.getSaldo()>0) {
            System.out.println("Conta não pode ser fechada com saldo");    
        } else if (this.getSaldo()<0) {
            System.out.println("Conta não pode ser fechada com  saldo negativo");
        }
    }
    /**
     * @param v
     */
    public void depositar(float v){
      if (this.getStatus()) {
             this.setSaldo(this.getSaldo() + v);
        System.out.println("Deposito realizadona conta de "+ getDono());        
      }  else {System.out.println("Conta Inválida ou fechada");}
      
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo()>= v) {
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado");
            }  else {
                System.out.println("saldo insuficiente");
            }
        } else {System.out.println("Conta invalida ou fechada");}
    }
    public void pagarMensalidade(){
        int v = 0;
        if (this.getTipo() == "cc") {
          v = 12;  
        }else if(this.getTipo() == "cp") {
            v =20;
        }
        if (this.getStatus()) {
           this.setSaldo(this.getSaldo()-v); 
           System.out.println("Mensalidadde paga por"+this.dono);
        } else {
            System.out.println("conta invalida ou fechada");
        }
    }
    // metodos especiais
        //metodo costrutor
    public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }
    public void estadoAtual(){
        System.out.println("____________________________________");
        System.out.println("Conta: "+ this.getNumConta() );
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Status: "+ this.getStatus());
    }
    
    public void abrirConta( int n){
        this.numConta=n;
    }
    public void getabrirConta(){

    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
  

}
