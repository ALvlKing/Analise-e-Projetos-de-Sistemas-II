package exercicio2;

public class Gerente extends FuncionarioCLT {
    private int tamanhoEquipe;
    private double percentualBonus;

    public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    public int getTamanhoEquipe() {
        return tamanhoEquipe;
    }

    public void setTamanhoEquipe(int tamanhoEquipe) {
        this.tamanhoEquipe = tamanhoEquipe;
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }

    public void setPercentualBonus(double percentualBonus) {
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario() {
        double bonus = getSalarioBase() * percentualBonus;
        return super.calcularSalario() + bonus;
    }

    @Override
    public double calcularDesconto() {
        double descontoTotal = super.calcularDesconto();
        if (tamanhoEquipe > 10) {
            descontoTotal += 100.0;
        }
        return descontoTotal;
    }
}
