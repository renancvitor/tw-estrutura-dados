package tw.estruturaDados;

import estruturaDadosModelos.Pessoa;
import estruturaDadosVetores.Vetor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a opção deseja: ");
        System.out.println("1. Gerenciamento de memória");
        System.out.println("2. Vetores");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                fazerGerenciamentoMemoria();
                break;
            case 2:
                fazerVetor();
                break;
        }

        scanner.close();
    }

    private static void fazerGerenciamentoMemoria() {
        int a = 3;
        System.out.println(a);
        int b = a;
        System.out.println(b);
        b = 2;
        System.out.println("______________________");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println("______________________");

        Pessoa p1 = new Pessoa(1, "TreinaWeb");
        System.out.println(p1.toString());
        Pessoa p2 = new Pessoa(1, "TreinaWeb");
        System.out.println(p2.toString());
        System.out.println("______________________");

        // p2.setNome("TreinaWeb modificado");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));
    }

    private static void fazerVetor() {

        Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>();
        vetorPessoas.inserir(new Pessoa(1, "TreinaWeb 01"));
        vetorPessoas.inserir(new Pessoa(2, "TreinaWeb 02"));
        vetorPessoas.inserir(new Pessoa(3, "TreinaWeb 03"));
        vetorPessoas.inserir(new Pessoa(4, "TreinaWeb 04"));
        vetorPessoas.inserirEm(1, new Pessoa(5, "TreinaWeb 05"));
        System.out.println(vetorPessoas);
    }
}
