package estruturaDadosArvoreBinaria;

import estruturaDadosModelos.Pessoa;

public abstract class NoArvore<T> {

    protected T valor;
    private NoArvore<T> noEsquerdo;
    private NoArvore<T> noDireita;

    public NoArvore(T valor, NoArvore<T> noEsquerdo, NoArvore<T> noDireita) {
        this.valor = valor;
        this.noEsquerdo = null;
        this.noDireita = null;
    }

    public NoArvore(Pessoa valor) {
    }

    public T getValor() {
        return valor;
    }

    public NoArvore<T> getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(NoArvore<T> noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    public NoArvore<T> getNoDireita() {
        return noDireita;
    }

    public void setNoDireita(NoArvore<T> noDireita) {
        this.noDireita = noDireita;
    }

    public abstract int peso();
}
