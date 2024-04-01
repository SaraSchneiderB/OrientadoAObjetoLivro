/*
Defesa de Dissertação:

Atributos: Nome do Livro;
           Tema do Livro;
           Autor do Livro;
                      
Método: ler;

Estado:    Aberto;
 */
package com.mycompany.orientadoaobjetolivro;

import java.util.Scanner;

public class Livro {

    String nomeDoLivro;
    String temaDoLivro;
    String autorDoLivro;
    boolean aberto;

    void estado() {
        System.out.print("Resumo da obra:");
        System.out.print("\nNome da obra: " + this.nomeDoLivro);
        System.out.print("\nTema abordado: " + this.temaDoLivro);
        System.out.print("\nAutor do livro: " + this.autorDoLivro);
    }

    void escrever() {
        if (this.aberto == true) {
            System.out.println("\nO livro está pronto para ser lido, aproveite!\n");
        } else {
            System.out.println("\nVocê precisa abrir o livro para iniciar a leitura\n");
        }
    }

    void abrir() {
        this.aberto = true;
    }

    void fechar() {
        this.aberto = false;
    }

    boolean perguntachave() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("O livro está aberto? (Sim/Não)");
        String resposta = teclado.nextLine().toLowerCase();

        if (resposta.equals("sim")) {
            return true;
        } else if (resposta.equals("não") || resposta.equals("nao")) {
            return false;
        } else {
            System.out.println("Resposta inválida. Digite 'sim' ou 'não'");
            return perguntachave();
        }
    }
}
