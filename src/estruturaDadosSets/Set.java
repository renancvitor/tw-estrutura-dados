package estruturaDadosSets;

import ListasLigadas.ListaLigada;

public class Set<T> {

    private ListaLigada<T> elementos;

    public Set() {
        this.elementos = new ListaLigada<T>();
    }

    public void inserir(T elemento) {
        this.elementos.inserir(elemento);
    }

    public void inserirEm(int posicao, T elemento) {
        this.elementos.inserirEM(posicao, elemento);
    }

    public T recuperar(int posicao) {
        return this.elementos.recuperar(posicao);
    }

    public boolean estaVazia() {
        return this.elementos.estaVazia();
    }

    public int tamanho() {
        return this.elementos.tamanho();
    }

    public boolean contem(T elemento) {
        return this.elementos.contem(elemento)
    }

    public int indice(T elemento) {
        return this.elementos.indice(elemento);
    }

    public void remover(int posicao) {
        this.elementos.remover(posicao);
    }

    public void remover(T elemento) {
        this.elementos.remover(elemento);
    }
    
}
