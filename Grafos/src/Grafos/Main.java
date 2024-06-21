package Grafos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Ler o arquivo e montar o grafo
        ArrayList<String> vertices = new ArrayList<>();
        ArrayList<String> linhasDoArquivo = new ArrayList<>();
        String nomeArquivo = "C:\\Users\\laboratorio\\IdeaProjects\\Grafos\\src\\Grafos\\mapaCentral.txt";

        Grafo.lerArquivo_montarGrafo(nomeArquivo, vertices, linhasDoArquivo);
        // Grafo g = new Grafo(vertices);

        for (String i: vertices) {
            System.out.println(i);
        }

        // Ler o arquivo e montar as conexões



        // Exibir o grafo
    }
}
