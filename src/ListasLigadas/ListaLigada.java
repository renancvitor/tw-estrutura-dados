package ListasLigadas;

public class ListaLigada<T> {

    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanho;

    public ListaLigada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public void inserir(T elemento) {
        No<T> novoNo = new No<T>(elemento);
        if (estaVazia()) {
            this.primeiroNo = novoNo;
            this.ultimoNo = novoNo;
        } else {
            this.ultimoNo.setProximo(novoNo);
            this.ultimoNo = novoNo;
        }
        this.tamanho++;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        if (estaVazia()) {
            return "ListaLigada{}";
        } else {
            No<T> noInicial = this.primeiroNo;
            StringBuilder sb = new StringBuilder();
            sb.append("Lista {");
            sb.append(noInicial.getElemento() != null ? noInicial.getElemento().toString() : "<NULO>");
            sb.append(",");
            while (noInicial.getProximo() != null) {
                sb.append(noInicial.getProximo().getElemento() != null ? noInicial.getProximo().getElemento().toString() : "<NULO>");
                sb.append(",");
                noInicial = noInicial.getProximo();
            }
            sb.append("}");
            return sb.toString();
        }
    }
}
