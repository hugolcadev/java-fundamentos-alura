package main;
import java.util.ArrayList;

import calculos.FiltroRecomendacao;
import modelos.Filme;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList <Filme> filmes = new ArrayList<>();
        Filme filme1 = new Filme("Django livre", "2023");
        Filme filme2 = new Filme("Poderoso chefão", "1972");
        Filme filme3 = new Filme("Bastardos inglórios", "2009");
        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        System.out.println(filmes);
    }
}
