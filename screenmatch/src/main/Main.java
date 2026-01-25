package main;
import java.util.ArrayList;

import calculos.FiltroRecomendacao;
import modelos.Filme;
import modelos.Titulo;
import modelos.Serie;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList <Titulo> titulos = new ArrayList<>();
        Filme filme1 = new Filme("Django livre", "2023");
        Filme filme2 = new Filme("Poderoso chefão", "1972");
        Filme filme3 = new Filme("Bastardos inglórios", "2009");
        Serie serie1 = new Serie("Game of thrones", "2007");
        titulos.add(filme1);
        titulos.add(filme2);
        titulos.add(filme3);
        titulos.add(serie1);
        System.out.println(titulos);
        System.out.println("Enhanced for abaixo.");
        for(Titulo titulo: titulos){
            if (titulo instanceof Filme){
                System.out.println(titulo);
            } else {
                System.out.println("É série " + serie1.getNome());
            }
        }

    }
}
