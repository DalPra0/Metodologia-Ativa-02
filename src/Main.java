public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        int[] numeros = {14, 15, 4, 9, 7, 18, 3, 5, 16, 20, 17};

        System.out.println("--- Inserindo elementos na árvore ---");
        for (int numero : numeros) {
            System.out.println("Inserindo: " + numero);
            arvore.inserir(numero);
        }

        System.out.println("\n--- Percursos na árvore completa ---");
        arvore.percorrerInOrdem();
        arvore.percorrerPreOrdem();
        arvore.percorrerPosOrdem();

        System.out.println("\n--- Testando remoções ---");

        System.out.println("\nRemovendo o menor elemento (3)...");
        arvore.removerMenor();
        arvore.percorrerInOrdem();

        System.out.println("\nRemovendo o maior elemento (20)...");
        arvore.removerMaior();
        arvore.percorrerInOrdem();

        System.out.println("\nRemovendo um elemento folha (17)...");
        arvore.remover(17);
        arvore.percorrerInOrdem();

        System.out.println("\nRemovendo um elemento com dois filhos (14 - a raiz)...");
        arvore.remover(14);
        arvore.percorrerInOrdem();
    }
}