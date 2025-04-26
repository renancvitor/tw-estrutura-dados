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
        } else {
            this.inserir(this.raiz, no);
        }
    }

    private void inserir(NoArvore<T> ref, NoArvore<T> novoNo) {
        if (ref.peso() < novoNo.peso()) {
            if (ref.getNoDireita() == null) {
                ref.setNoDireita(novoNo);
            } else {
                inserir(ref.getNoDireita(), novoNo);
            }
        } else {
            if (ref.getNoEsquerdo() == null) {
                ref.setNoEsquerdo(novoNo);
            } else {
                inserir(ref.getNoEsquerdo(), novoNo);
            }
        }
    }

    public void emOrdem() {
        this.emOrdem(this.raiz);
    }

    private void emOrdem(NoArvore<T> ref) {
        if (ref.getNoEsquerdo() != null) {
            emOrdem(ref.getNoEsquerdo());
            System.out.println(ref.getValor().toString());

            if (ref.getNoDireita() != null) {
                emOrdem(ref.getNoDireita());
            }
        } else {
            System.out.println(ref.getValor().toString());

            if (ref.getNoDireita() != null) {
                emOrdem(ref.getNoDireita());
            }
        }
    }

    @Override
    public String toString() {
        return this.raiz == null ? "{[X]}" : this.raiz.toString();
    }
}
