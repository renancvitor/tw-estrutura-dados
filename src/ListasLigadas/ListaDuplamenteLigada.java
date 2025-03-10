package ListasLigadas;

public class ListaDuplamenteLigada<T> {

    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanho;

    public ListaDuplamenteLigada() {
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
            novoNo.setAnterior(this.ultimoNo);
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

    public boolean contem(T elemento) {
        for (int i = 0; i < tamanho(); i++) {
            No<T> noAtual = recuperarNo(i);
            if (noAtual.getElemento() != null && noAtual.getElemento().equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int indice(T elemento) {
        for (int i = 0; i < tamanho(); i++) {
            No<T> noAtual = recuperarNo(i);
            if (noAtual.getElemento() != null && noAtual.getElemento().equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void remover(int posicao) {
        if (posicao == tamanho()) {
            throw new IllegalArgumentException(String.format("Posição inválida [%d]", posicao));
        }
        if (posicao == 0) {
            No<T> proximoNo = this.primeiroNo.getProximo();
            this.primeiroNo.setProximo(null);
            proximoNo.setAnterior(null);
            this.primeiroNo = proximoNo;
        } else if (posicao == tamanho() - 1) {
            No<T> penultimoNo = this.ultimoNo.getAnterior();
            penultimoNo.setProximo(null);
            this.ultimoNo.setAnterior(null);
            this.ultimoNo = penultimoNo;
        } else {
            No<T> noAtual = recuperarNo(posicao);
            No<T> noAnterior = noAtual.getAnterior();
            No<T> proximoNo = noAtual.getProximo();
            noAnterior.setProximo(proximoNo);
            proximoNo.setAnterior(noAnterior);
            noAtual.setProximo(null);
            noAtual.setAnterior(null);
        }
        this.tamanho--;
    }

    public void remover(T elemento) {
        int indice = indice(elemento);
        if (indice == - 1) {
            throw new IllegalArgumentException("Elemento inválido - " + elemento.toString());
        }
        remover(indice);
    }

    public void inserirEM(int posicao, T elemento) {
        if (posicao >= tamanho()) {
            throw new IllegalArgumentException(String.format("Posição inválida [%d]", posicao));
        }
        if (posicao == 0) {
            No<T> novoNo = new No<T>(elemento);
            novoNo.setProximo(this.primeiroNo);
            this.primeiroNo.setAnterior(novoNo);
            this.primeiroNo = novoNo;
        } else if (posicao == this.tamanho() - 1) {
            No<T> novoNo = new No<T>(elemento);
            this.ultimoNo.setProximo(novoNo);
            novoNo.setAnterior(this.ultimoNo);
            this.ultimoNo = novoNo;
        } else {
            No<T> noAnterior = recuperarNo(posicao - 1);
            No<T> noAtual = recuperarNo(posicao);
            No<T> novoNo = new No<T>(elemento);
            noAnterior.setProximo(novoNo);
            novoNo.setProximo(noAtual);
            noAtual.setAnterior(novoNo);
            novoNo.setAnterior(noAnterior);
        }
        this.tamanho++;
    }

    public void inserirPrimeiro(T elemento) {
        inserirEM(0, elemento);
    }

    public void inserirUltimo(T elemento) {
        inserirEM(tamanho - 1, elemento);
    }

    public T recuperar(int posicao) {
        No<T> no = recuperarNo(posicao);
        if (no != null) {
            return no.getElemento();
        }
        return null;
    }

    private No<T> recuperarNo(int posicao) {
        if (posicao >= tamanho()) {
            throw new IllegalArgumentException((String.format("Posição inválida [%d]", posicao)));
        }
        No<T> resultado = null;
        for (int i = 0; i <= posicao; i++) {
            if (i == 0) {
                resultado = this.primeiroNo;
            } else {
                resultado = resultado.getProximo();
            }
        }
        return resultado;
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
