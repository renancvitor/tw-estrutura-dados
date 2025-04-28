package desafioCodigoArvoreBinaria;

class Arvore<T extends Comparable<T>> {

    private NoArvore<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserir(NoArvore<T> no) {
        if (this.raiz == null) {
            this.raiz = no;
        } else {
            this.inserir(this.raiz, no);
        }
    }

    private void inserir(NoArvore<T> ref, NoArvore<T> novoNo) {
        if (((Comparable<T>) novoNo.getValor()).compareTo(ref.getValor()) < 0) {
            if (ref.getNoEsquerdo() == null) {
                ref.setNoEsquerdo(novoNo);
            } else {
                inserir(ref.getNoEsquerdo(), novoNo);
            }
        } else {
            if (ref.getNoDireito() == null) {
                ref.setNoDireito(novoNo);
            } else {
                inserir(ref.getNoDireito(), novoNo);
            }
        }
    }

    public void emOrdem() {
        this.emOrdem(this.raiz);
    }

    private void emOrdem(NoArvore<T> ref) {
        if (ref != null) {
            emOrdem(ref.getNoEsquerdo());
            System.out.println(ref.getValor().toString());
            emOrdem(ref.getNoDireito());
        }
    }
}
