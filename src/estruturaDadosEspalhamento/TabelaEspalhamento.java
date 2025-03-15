package estruturaDadosEspalhamento;

import ListasLigadas.ListaLigada;

public class TabelaEspalhamento<T> {

    private ListaLigada<ListaLigada<T>> elementos;
    private int numeroCategorias = 16;

    public TabelaEspalhamento() {
        this.elementos = new ListaLigada<ListaLigada<T>>();
        for (int i = 0; i < this.numeroCategorias; i++) {
            this.elementos.inserir(new ListaLigada<T>());
        }
    }
}
