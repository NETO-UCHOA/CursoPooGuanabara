public class ProjetoHeranca {
    public static void main(String[] args) throws Exception {
        
        Visitante v1 = new Visitante("juvenal", 22, "M");
        System.out.println(v1.toString());
        System.out.println("===============================");
        

        Aluno a1 = new Aluno("claudio", 15, "m", 1111, "informática");
        System.out.println(a1.toString());
        a1.dadosDoAluno();
        a1.pagarMensalidade();
        System.out.println("===========================================");
        Bolsista b1 = new Bolsista("jubileu", 10, "m", 1234, "programação", 12);
        b1.pagarMensalidade();



    }
}
