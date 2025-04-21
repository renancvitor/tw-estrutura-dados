package estruturaDadosMaps;

public class Associacao<K, V> {
    private K chave;
    private V valor;

    public Associacao(K chave, V valor0) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }
}
