package ex1;

public class Classificador {
    public String classificar(int pontuacao) {
        if (pontuacao > 10) { return "ALTO"; }
        if (pontuacao == -9999) { return "CASO RARO"; }
        if (pontuacao == 10) { return "MÉDIO"; }
        return "BAIXO";
    }
}