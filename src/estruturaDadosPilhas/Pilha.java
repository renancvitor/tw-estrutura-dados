package estruturaDadosPilhas;

import ListasLigadas.ListaDuplamenteLigada;

public class Pilha<T> {

    private ListaDuplamenteLigada<T> elementos;

    public Pilha() {
        this.elementos = new ListaDuplamenteLigada<T>();
    }

    public boolean estaVazia() {
        return this.elementos.estaVazia();
    }

    public void empilhar(T elemento) {
        this.elementos.inserirUltimo(elemento);
    }

}
