public class AlunoUniville extends Pessoa {
    public AlunoUniville(double prova1, double prova2, double prova3) {
        super.setProva1(prova1);
        super.setProva2(prova2);
        super.setProva3(prova3);
    }
    
    //OVERRIDING: Quando um método de classe filha sobrescreve um método da classe mãe.

    @Override
    public double calcMedia() {
        double media = (getProva1() + (getProva2() * 2) + (getProva3() * 3))/ 6;
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return "AlunoUniville{" +
                "prova1=" + super.getProva1() +
                ", prova2=" + super.getProva2() +
                ", prova3=" + super.getProva3() +
                '}';
    }
}
