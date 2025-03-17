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

    public boolean inserir(T elemento) {
        int numeroEspalhamento = this.gerarNumeroEspalhamento(elemento);
        ListaLigada<T> categoria = this.elementos.recuperar(numeroEspalhamento);
        if (categoria.contem(elemento)) {
            return false;
        }
        categoria.inserir(elemento);
        return true;
    }

    private int gerarNumeroEspalhamento(T elemento) {
        return elemento.hashCode() % 16;
    }
}
