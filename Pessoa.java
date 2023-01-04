import java.util.Scanner;

public abstract class Pessoa {              //Pessoa é uma classe ABSTRATA, pois ela nunca é pessoalmente chamada, só
    private String nomeAluno;               //Só seus atributos
    private String matricula;
    private double prova1;
    private double prova2;
    private double prova3;
    
    public Pessoa(){

    }
    public Pessoa(String nomeAluno, String matricula) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
    }
    
    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getProva1() {
        return prova1;
    }
    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }
    public double getProva2() {
        return prova2;
    }
    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }
    public double getProva3() {
        return prova3;
    }
    public void setProva3(double prova3) {
        this.prova3 = prova3;
    }
    
    public double calcMedia() {
        Scanner sc = new Scanner(System.in);
        double media = (this.prova1 + this.prova2)/ 2;
        if(media >= 7) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Informe a terceira prova: ");
            this.prova3 = sc.nextDouble();
            if (prova3>=7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "nomeAluno='" + nomeAluno + '\'' +  ", matricula='" + matricula + '\'' + '}';
    }
}
