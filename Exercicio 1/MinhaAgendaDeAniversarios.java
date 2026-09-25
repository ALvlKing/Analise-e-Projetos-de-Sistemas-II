package exercicio1;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
    private ArrayList<Aniversariante> listaAniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.listaAniversariantes = new ArrayList<>();
    }

    @Override
    public void adicionarAniversariante(Aniversariante a) {
        this.listaAniversariantes.add(a);
    }

    @Override
    public boolean removerAniversariante(Aniversariante a) {
        return this.listaAniversariantes.remove(a);
    }

    @Override
    public ArrayList<Aniversariante> obterAniversariantesDoMes(int mes) {
        ArrayList<Aniversariante> aniversariantesDoMes = new ArrayList<>();
        for (Aniversariante a : this.listaAniversariantes) {
            if (a.getDataAniversario().getMes() == mes) {
                aniversariantesDoMes.add(a);
            }
        }
        return aniversariantesDoMes;
    }
}
