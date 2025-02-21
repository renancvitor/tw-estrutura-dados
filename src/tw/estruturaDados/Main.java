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

        Vetor vetorPessoas = new Vetor(3);
        vetorPessoas.inserirEm(0, new Pessoa(1, "TreinaWeb"));
        System.out.println(vetorPessoas.recuperar(0).getNome());
    }
}
