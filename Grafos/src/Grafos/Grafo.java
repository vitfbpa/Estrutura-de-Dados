package Grafos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Grafo {
    ArrayList<String> vertices;

    int[][] matriz;
    int qtdVertices;
    int qtdArestas;

    public Grafo(ArrayList<String> vertices) {
        this.vertices = new ArrayList<>();
        this.vertices.addAll(vertices);
        this.qtdVertices = vertices.size();
        this.matriz = new int[qtdVertices][qtdVertices];
        this.qtdArestas = 0;

        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                System.out.println();
            }
        }
    }

    public void mostrarMatriz() {
        for (int i = 0; i < this.qtdVertices; i++) {
            System.out.print("\t" + i + "\t");
        }
        System.out.println("");
        for (int i = 0; i < this.qtdVertices; i++) {
            System.out.println(i + ":\t");
            for (int j = 0; j < this.qtdVertices; j++) {
                System.out.print(this.matriz[i][j] + "\t");
            }
        }
    }

    public static void lerArquivo_montarGrafo(String nomeArquivo, ArrayList<String> vertices, ArrayList<String> linhas) {
        try {
            FileReader arquivo = new FileReader(nomeArquivo);
            BufferedReader leitor = new BufferedReader(arquivo);

            String linha;
            String[] dadosLinha;
            while ((linha = leitor.readLine()) != null) {
                linha = linha.toUpperCase();
                dadosLinha = linha.split("@");
                linhas.add(linha);
                if (!vertices.contains(dadosLinha[0])) {
                    vertices.add(dadosLinha[0]);
                }
                if (!vertices.contains(dadosLinha[1])) {
                    vertices.add(dadosLinha[1]);
                }

            }
            arquivo.close();
            vertices.sort(null);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

