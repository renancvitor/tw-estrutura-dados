package estruturaDadosArvoreBinaria;

public class Arvore<T> {

    private NoArvore<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public NoArvore<T> getRaiz() {
        return this.raiz;
    }

    public void inserir(NoArvore<T> no) {
        no.setNoDireita((null));
        no.setNoEsquerdo(null);

        if (this.raiz == null) {
            this.raiz = no;
        } else if (raiz.peso() < no.peso()) {
            no.setNoDireita(no);
        }
    }
}
