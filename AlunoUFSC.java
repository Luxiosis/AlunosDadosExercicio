public class AlunoUFSC extends Pessoa {
    public AlunoUFSC(){
        //Construtor Vazio -> Permite criação de um objeto oco
    } 

    //OVERLOADING: Quando duas métodos de mesmo nome exercem funções diferentes.

    public AlunoUFSC(String nome, String matricula, double prova1, double prova2) {
        super.setNomeAluno(nome);
        super.setMatricula(matricula);
        super.setProva1(prova1);
        super.setProva2(prova2);
        //Construtor Cheio -> Permite a instanciação de objetos com entrada de valores ao mesmo tempo da criação
    }
    
    @Override
    public String toString() {
        return "AlunoUFSC{" +
                "prova1=" + super.getProva1() +
                ", prova2=" + super.getProva2() +
                ", prova3=" + super.getProva3() +
                '}';
    }
}
