import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        this.figuras = new ArrayList<>();
    }

    public void adicionaFigura(FiguraGeometrica fig) {
        this.figuras.add(fig);
    }

    public void imprimeFiguras() {
        for (FiguraGeometrica fig : this.figuras) {
            System.out.println(fig.getNomeFigura());
        }
    }

    public double getMaiorAreaDeFigura() {
        if (this.figuras.isEmpty()) {
            return 0;
        }

        double maior = 0;
        for (FiguraGeometrica fig : this.figuras) {
            if (fig.calculaArea() > maior) {
                maior = fig.calculaArea();
            }
        }
        return maior;
    }

    public double calculaAreaTotalDeFiguras() {
        double total = 0;
        for (FiguraGeometrica fig : this.figuras) {
            total = total + fig.calculaArea();
        }
        return total;
    }
}
