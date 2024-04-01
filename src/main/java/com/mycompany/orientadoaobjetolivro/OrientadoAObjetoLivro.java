
package com.mycompany.orientadoaobjetolivro;

import java.util.Locale;
import java.util.Scanner;

public class OrientadoAObjetoLivro {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do livro que deseja ler: ");
        String nomeL = teclado.nextLine();
        System.out.print("Qual o tema do livro? ");
        String temaL = teclado.nextLine();
        System.out.print("Digite o nome do autor da obra: ");
        String autorL = teclado.nextLine();
        
        Livro obra = new Livro();
        
        obra.nomeDoLivro = nomeL;
        obra.temaDoLivro = temaL;
        obra.autorDoLivro = autorL;
        
        boolean resultado = obra.perguntachave();
        obra.aberto = resultado;
        
        obra.escrever();
        obra.estado();
    }
}
