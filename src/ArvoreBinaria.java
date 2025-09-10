public class ArvoreBinaria {
    private Node raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    private Node inserirRecursivo(Node noAtual, int valor) {
        if (noAtual == null) {
            return new Node(valor);
        }

        if (valor < noAtual.getInfo()) {
            noAtual.setEsquerda(inserirRecursivo(noAtual.getEsquerda(), valor));
        } else if (valor > noAtual.getInfo()) {
            noAtual.setDireita(inserirRecursivo(noAtual.getDireita(), valor));
        }

        return noAtual;
    }

    public void percorrerInOrdem() {
        System.out.print("In-ordem: ");
        percorrerInOrdemRecursivo(this.raiz);
        System.out.println();
    }

    private void percorrerInOrdemRecursivo(Node no) {
        if (no != null) {
            percorrerInOrdemRecursivo(no.getEsquerda());
            System.out.print(no.getInfo() + " ");
            percorrerInOrdemRecursivo(no.getDireita());
        }
    }

    public void percorrerPreOrdem() {
        System.out.print("Pré-ordem: ");
        percorrerPreOrdemRecursivo(this.raiz);
        System.out.println();
    }

    private void percorrerPreOrdemRecursivo(Node no) {
        if (no != null) {
            System.out.print(no.getInfo() + " ");
            percorrerPreOrdemRecursivo(no.getEsquerda());
            percorrerPreOrdemRecursivo(no.getDireita());
        }
    }

    public void percorrerPosOrdem() {
        System.out.print("Pós-ordem: ");
        percorrerPosOrdemRecursivo(this.raiz);
        System.out.println();
    }

    private void percorrerPosOrdemRecursivo(Node no) {
        if (no != null) {
            percorrerPosOrdemRecursivo(no.getEsquerda());
            percorrerPosOrdemRecursivo(no.getDireita());
            System.out.print(no.getInfo() + " ");
        }
    }

    public void removerMenor() {
        if (this.raiz != null) {
            this.raiz = removerMenorRecursivo(this.raiz);
        }
    }

    private Node removerMenorRecursivo(Node no) {
        if (no.getEsquerda() == null) {
            return no.getDireita();
        }
        no.setEsquerda(removerMenorRecursivo(no.getEsquerda()));
        return no;
    }

    public void removerMaior() {
        if (this.raiz != null) {
            this.raiz = removerMaiorRecursivo(this.raiz);
        }
    }

    private Node removerMaiorRecursivo(Node no) {
        if (no.getDireita() == null) {
            return no.getEsquerda();
        }
        no.setDireita(removerMaiorRecursivo(no.getDireita()));
        return no;
    }

    public void remover(int valor) {
        this.raiz = removerRecursivo(this.raiz, valor);
    }

    private Node removerRecursivo(Node noAtual, int valor) {
        if (noAtual == null) {
            return null;
        }

        if (valor < noAtual.getInfo()) {
            noAtual.setEsquerda(removerRecursivo(noAtual.getEsquerda(), valor));
        } else if (valor > noAtual.getInfo()) {
            noAtual.setDireita(removerRecursivo(noAtual.getDireita(), valor));
        } else {
            if (noAtual.getEsquerda() == null && noAtual.getDireita() == null) {
                return null;
            }
            else if (noAtual.getEsquerda() == null) {
                return noAtual.getDireita();
            } else if (noAtual.getDireita() == null) {
                return noAtual.getEsquerda();
            }
            else {
                Node menorNoDireita = encontrarMenor(noAtual.getDireita());
                noAtual.setInfo(menorNoDireita.getInfo());
                noAtual.setDireita(removerRecursivo(noAtual.getDireita(), menorNoDireita.getInfo()));
            }
        }
        return noAtual;
    }

    private Node encontrarMenor(Node no) {
        while (no.getEsquerda() != null) {
            no = no.getEsquerda();
        }
        return no;
    }
}