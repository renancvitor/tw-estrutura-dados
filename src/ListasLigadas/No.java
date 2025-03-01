package ListasLigadas;

class No<T> {

    private T elemento;
    private No<T> proximo;

    public No() {
        this.proximo = null;
    }

    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    public No(No<T> proximo, T elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
}
