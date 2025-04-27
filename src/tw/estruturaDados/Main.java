package tw.estruturaDados;

import ListasLigadas.ListaDuplamenteLigada;
import ListasLigadas.ListaLigada;
import estruturaDadosArvoreBinaria.Arvore;
import estruturaDadosArvoreBinaria.NoArvore;
import estruturaDadosArvoreBinaria.NoArvorePessoa;
import estruturaDadosFilas.Fila;
import estruturaDadosMaps.Mapa;
import estruturaDadosModelos.Pessoa;
import estruturaDadosPilhas.Pilha;
import estruturaDadosSets.Set;
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
        System.out.println("4. Lista duplamente ligada");
        System.out.println("5. Pilha");
        System.out.println("6. Fila");
        System.out.println("7. Set");
        System.out.println("8. Mapa");
        System.out.println("9. Árvore binária");

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
            case 4:
                fazerlistaDuplamenteLigada();
                break;
            case 5:
                fazerPilha();
                break;
            case 6:
                fazerFila();
                break;
            case 7:
                fazerSet();
                break;
            case 8:
                fazerMapa();
                break;
            case 9:
                fazerArvore();
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
        System.out.println(false);
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

        listaPessoa.remover(p);
        System.out.println(listaPessoa.toString());
        listaPessoa.remover(0);
        System.out.println(listaPessoa.toString());

        System.out.println("Lista de pessoas:");
        for (int i = 0; i < listaPessoa.tamanho(); i++) {
            System.out.println(listaPessoa.recuperar(i).toString());
        }
    }

    private static void fazerlistaDuplamenteLigada() {
        ListaDuplamenteLigada<Pessoa> listaPessoa = new ListaDuplamenteLigada<Pessoa>();
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

        listaPessoa.remover(p);
        System.out.println(listaPessoa.toString());
        listaPessoa.remover(0);
        System.out.println(listaPessoa.toString());

        System.out.println("Lista de pessoas:");
        for (int i = 0; i < listaPessoa.tamanho(); i++) {
            System.out.println(listaPessoa.recuperar(i).toString());
        }
    }

    private static void fazerPilha() {
        Pilha<Pessoa> pilhaPessoas = new Pilha<Pessoa>();
        System.out.println(pilhaPessoas.estaVazia());
        pilhaPessoas.empilhar(new Pessoa(1, "TreinaWeb 01"));
        pilhaPessoas.empilhar(new Pessoa(2, "TreinaWeb 02"));
        pilhaPessoas.empilhar(new Pessoa(3, "TreinaWeb 03"));
        Pessoa p1 = pilhaPessoas.desempilhar();
        System.out.println(p1.toString());
    }

    private static void fazerFila() {
        Fila<Pessoa> filaPessoa = new Fila<Pessoa>();
        System.out.println(filaPessoa.estaVazia());
        filaPessoa.enfileirar(new Pessoa(1, "TreinaWeb 01"));
        filaPessoa.enfileirar(new Pessoa(2, "TreinaWeb 02"));
        filaPessoa.enfileirar(new Pessoa(3, "TreinaWeb 03"));
        System.out.println(filaPessoa.toString());
        Pessoa p1 = filaPessoa.desenfileirar();
        System.out.println(p1.toString());
    }

    private static void fazerSet() {
        Set<Pessoa> setPessoas = new Set<Pessoa>();
        System.out.println(setPessoas.estaVazia());
        System.out.println(setPessoas.inserir(new Pessoa(1, "TreinaWeb 01")));
        System.out.println(setPessoas.toString());
        System.out.println(setPessoas.inserir(new Pessoa(1, "TreinaWeb 01")));
        System.out.println(setPessoas.toString());
        System.out.println(setPessoas.inserir(new Pessoa(2, "TreinaWeb 01")));
        System.out.println(setPessoas.toString());
        System.out.println(setPessoas.inserir(new Pessoa(2, "TreinaWeb 01")));
        System.out.println(setPessoas.toString());
    }

    private static void fazerMapa() {
        Mapa<String, Pessoa> mapaPessoas = new Mapa<String, Pessoa>();
        System.out.println(mapaPessoas.toString());
        mapaPessoas.adcionar("legal", new Pessoa(1, "TreinaWeb"));
        System.out.println(mapaPessoas.toString());
        System.out.println(mapaPessoas.contemChave("legal"));
        System.out.println(mapaPessoas.contemChave("chata"));
        mapaPessoas.adcionar("chata", new Pessoa(2, "João"));
        System.out.println(mapaPessoas.contemChave("chata"));
        mapaPessoas.adcionar("legal", new Pessoa(3, "TreinaWeb Editado"));
        System.out.println(mapaPessoas.toString());
        mapaPessoas.remover("chata");
        System.out.println(mapaPessoas.toString());
        System.out.println(mapaPessoas.recuperar("legal"));
        mapaPessoas.remover("chave");
    }

    private static void fazerArvore() {
        Arvore<Pessoa> arvorePessoas = new Arvore<Pessoa>();
        System.out.println(arvorePessoas.toString());
        arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(5, "TreinaWeb 5")));
        System.out.println(arvorePessoas.toString());
        arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(4, "TreinaWeb 4")));
        System.out.println(arvorePessoas.toString());
        arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(6, "TreinaWeb 6")));
        System.out.println(arvorePessoas.toString());
        arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(7, "TreinaWeb 7")));
        System.out.println(arvorePessoas.toString());
        System.out.println("Busca...");
        NoArvore<Pessoa> noPessoa6 = new NoArvorePessoa(new Pessoa(6, "TreinaWeb 6"));
        System.out.println(arvorePessoas.buscar(noPessoa6));

        arvorePessoas.inserir(new NoArvorePessoa(new Pessoa( 1, "TreinaWeb 1")));
        System.out.println("\n*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println(" ~### EM ORDEM ###~ \n");
        arvorePessoas.emOrdem();

        arvorePessoas.inserir(new NoArvorePessoa(new Pessoa(8, "TreinaWeb 8")));
        System.out.println("\n*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println(" ~### PRE ORDEM ###~ \n");
        arvorePessoas.preOrdem();

        System.out.println("\n*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println(" ~### POS ORDEM ###~ \n");
        arvorePessoas.posOrdem();
    }
}