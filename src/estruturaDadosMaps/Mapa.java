package estruturaDadosMaps;

import ListasLigadas.ListaLigada;

public class Mapa<K, V> {

    private ListaLigada<ListaLigada<Associacao<K, V>>> elementos;
    private int quantidadeCategorias = 16;

    public Mapa() {
        this.elementos = new ListaLigada<ListaLigada<Associacao<K, V>>>();
        for (int i = 0; i < this.quantidadeCategorias; i++) {
            this.elementos.inserir(new ListaLigada<Associacao<K, V>>());
        }
    }

    private int gerarNumeroEspalhamento(K chave) {
        return Math.abs(chave.hashCode() % this.quantidadeCategorias);
    }
}
