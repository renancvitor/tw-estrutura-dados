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

    public NoArvore<T> buscar(NoArvore<T> noBusca) {
        return this.buscar(this.raiz, noBusca);
    }

    private NoArvore<T> buscar(NoArvore<T> ref, NoArvore<T> noBusca) {
        if (ref.getValor().equals(noBusca.getValor())) {
            return ref;
        } else {
            if (ref.peso() < noBusca.peso()) {
                // Tem que ir para direita
                if (ref.getNoDireita() == null) {
                    throw new IllegalArgumentException("Elemento não encontrado na árvore.");
                } else {
                    System.out.println(" >>> Navegando à direita do nó. " + ref.getValor().toString());
                    return buscar(ref.getNoDireita(), noBusca);
                }
            } else {
                // Tem que ir para esquerda
                if (ref.getNoEsquerdo() == null) {
                    throw new IllegalArgumentException("Elemento não encontrado na árvore.");
                } else {
                    System.out.println(" >>> Navegando à esquerdaa do nó. " + ref.getValor().toString());
                    return buscar(ref.getNoEsquerdo(), noBusca);
                }
            }
        }
    }

    public void emOrdem() {
        // Esquerda => Rai\z => Direita
        this.emOrdem(this.raiz);
    }

    public void preOrdem() {
        // Raiz => Esquerda => Direita
        this.preOrdem(this.raiz);
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

    private void preOrdem(NoArvore<T> ref) {
        System.out.println(ref.getValor().toString());

        if (ref.getNoEsquerdo() != null) {
            preOrdem(ref.getNoEsquerdo());

            if (ref.getNoDireita() != null) {
                preOrdem(ref.getNoDireita());
            } else {
                if (ref.getNoDireita() != null) {
                    preOrdem(ref.getNoDireita());
                }
            }
        }
    }

    @Override
    public String toString() {
        return this.raiz == null ? "{[X]}" : this.raiz.toString();
    }
}
