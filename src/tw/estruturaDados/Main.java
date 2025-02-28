package tw.estruturaDados;

import ListasLigadas.ListaLigada;
import estruturaDadosModelos.Pessoa;
import estruturaDadosVetores.Vetor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a opção deseja: ");
        System.out.println("1. Gerenciamento de memória");
        System.out.println("2. Vetores");
        System.out.println("3. Lista ligada");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                fazerGerenciamentoMemoria();
                break;
            case 2:
                fazerVetor();
                break;
            case 3:
                fazerListaLigada();
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

        System.out.println("Lista de pessoas: ");
        for (int i = 0; i < vetorPessoas.tamanho(); i++) {
            System.out.println(vetorPessoas.recuperar(i).getNome());
        }

        Pessoa p = vetorPessoas.recuperar(1);
        Pessoa pessoaErrada = new Pessoa(100, "TreinaWeb 100");
        System.out.println(vetorPessoas.contem(p));
        System.out.println(vetorPessoas.contem(pessoaErrada));
        System.out.println(vetorPessoas.indice(p));
        System.out.println(vetorPessoas.indice(pessoaErrada));

        vetorPessoas.remover(2);
        System.out.println(vetorPessoas.toString());
        vetorPessoas.remover(p);
        System.out.println(vetorPessoas.toString());
    }

    private static void fazerListaLigada() {
        ListaLigada<Pessoa> listaPessoa = new ListaLigada<Pessoa>();
        listaPessoa.inserir(new Pessoa(1, "TreinaWeb 01"));
        listaPessoa.inserir(new Pessoa(2, "TreinaWeb 02"));
        listaPessoa.inserir(new Pessoa(3, "TreinaWeb 03"));
        listaPessoa.inserir(new Pessoa(4, "TreinaWeb 04"));

        listaPessoa.inserirEM(1, new Pessoa(5, "TreinaWeb 05"));
        listaPessoa.inserirPrimeiro(new Pessoa(6, "TreinaWeb 06"));
        listaPessoa.inserirUltimo(new Pessoa(7, "TreinaWeb 07"));
        System.out.println(listaPessoa.toString());

        Pessoa p = listaPessoa.recuperar(1);
        Pessoa pessoaErrada = new Pessoa(100, "TreinaWeb 100");
        System.out.println(listaPessoa.contem(p));
        System.out.println(listaPessoa.contem(pessoaErrada));
        System.out.println(listaPessoa.indice(p));
        System.out.println(listaPessoa.indice(pessoaErrada));
    }

}
