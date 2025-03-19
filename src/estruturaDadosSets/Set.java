package estruturaDadosSets;

import ListasLigadas.ListaLigada;
import estruturaDadosEspalhamento.TabelaEspalhamento;

public class Set<T> {

    private TabelaEspalhamento<T> elementos;

    public Set() {
        this.elementos = new TabelaEspalhamento<T>();
    }

    public boolean inserir(T elemento) {
        return this.elementos.inserir(elemento);
    }

    public boolean estaVazia() {
        return this.elementos.tamanho() == 0;
    }

    public int tamanho() {
        return this.elementos.tamanho();
    }

    public boolean contem(T elemento) {
        return this.elementos.contem(elemento);
    }

    public void remover(T elemento) {
        this.elementos.remover(elemento);
    }

//    private boolean contemOtimizado(T elemento) {
//        for (int i = 0; i < this.elementos.tamanho(); i++) {
//            T el = this.elementos.recuperar(1);
//            if (el.hashCode() == elemento.hashCode()) {
//                return true;
//            }
//        }
//        return false;
//    }

    @Override
    public String toString() {
        return "Set {" +
                "elementos=" + elementos +
                '}';
    }
}
