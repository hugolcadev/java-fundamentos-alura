package calculos;

import modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui (Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    //exemplo de design ruim
    /* 
    public void inclui (Filme filme){
        tempoTotal += filme.getDuracaoEmMinutos();
    }

    public void inclui (Serie serie){
        tempoTotal += serie.getDuracaoEmMinutos();
    }
    */
}
