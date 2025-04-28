package desafioCodigoArvoreBinaria;

class NoArvore<T> {

    protected T valor;
    private NoArvore<T> noEsquerdo;
    private NoArvore<T> noDireita;

    public NoArvore(T valor, NoArvore<T> noEsquerdo, NoArvore<T> noDireita) {
        this.valor = valor;
        this.noEsquerdo = null;
        this.noDireita = null;
    }

    public NoArvore(T valor) {
        this.valor = valor;
        this.noEsquerdo = null;
        this.noDireita = null;
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

    public NoArvore<T> getNoDireito() {
        return noDireita;
    }

    public void setNoDireito(NoArvore<T> noDireita) {
        this.noDireita = noDireita;
    }

    public int peso() {
        return 0;
    }

    @Override
    public String toString() {
        return (this.noEsquerdo == null ? "{[X]}" : "{[" + this.noEsquerdo.toString() + "]}")
                + this.valor.toString() + "]}"
                + (this.noDireita == null ? "{[X]}" : "{[" + this.noDireita.toString() + "]}");
    }
}
