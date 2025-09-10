# Trabalho RA2

Este projeto é a implementação de uma Árvore Binária de Busca (ABB) em Java. O programa cumpre todos os requisitos solicitados, incluindo a criação da estrutura, inserção, remoção (de três tipos) e os três principais métodos de percurso.

## 👥 Integrantes do Grupo

* **Lucas Dal Pra Brascher**

## ✅ Funcionalidades Implementadas

O projeto inclui os seguintes algoritmos:

1.  **Inserção**: Adiciona um novo elemento à árvore, mantendo a propriedade da ABB (elementos menores à esquerda, maiores à direita). Não são permitidos elementos duplicados.
2.  **Percursos**:
    * **In-Ordem**: Resulta nos elementos em ordem crescente.
    * **Pré-Ordem**: Visita a raiz, a sub-árvore esquerda e a sub-árvore direita.
    * **Pós-Ordem**: Visita a sub-árvore esquerda, a sub-árvore direita e a raiz.
3.  **Remoção**:
    * **Remover Maior Elemento**: Encontra e remove o maior valor presente na árvore.
    * **Remover Menor Elemento**: Encontra e remove o menor valor presente na árvore.
    * **Remover Elemento Específico**: Remove um nó com um valor `N`, tratando corretamente os três casos (nó folha, nó com um filho, nó com dois filhos).

## 🛠️ Estrutura do Projeto

O código está organizado em três classes principais, conforme a representação solicitada:

* **`Node.java`**: Define a estrutura de um nó da árvore.
* **`ArvoreBinaria.java`**: Contém a lógica principal da árvore e todos os seus métodos de manipulação.
* **`Main.java`**: Classe utilizada para testar e demonstrar todas as funcionalidades da árvore.

## ⚙️ Como Compilar e Executar

Este projeto não requer nenhuma dependência externa, apenas um JDK (Java Development Kit) instalado na máquina.

1.  **Clone o repositório:**
    Abra o terminal ou Git Bash e execute o comando abaixo:
    ```bash
    git clone [COLE AQUI A URL HTTPS DO SEU REPOSITÓRIO GIT]
    ```

2.  **Acesse a pasta do projeto:**
    ```bash
    cd [NOME-DA-PASTA-DO-REPOSITÓRIO]
    ```
    *(O nome da pasta geralmente é o mesmo nome do repositório no GitHub)*

3.  **Compile os arquivos `.java`:**
    Ainda no terminal, dentro da pasta do projeto, execute o comando:
    ```bash
    javac Main.java
    ```
    *(Este comando compilará todas as classes necessárias: `Main.java`, `ArvoreBinaria.java` e `Node.java`)*

4.  **Execute o programa:**
    Após a compilação, execute a classe principal:
    ```bash
    java Main
    ```

A saída do programa mostrará o passo a passo da inserção dos elementos, os resultados dos três percursos e o estado da árvore após cada operação de remoção.

## 📜 Restrições do Projeto

Este trabalho foi desenvolvido seguindo estritamente as restrições impostas:
* Não foram utilizadas funções prontas ou bibliotecas de coleções do Java (`ArrayList`, `TreeSet`, etc.).
* Apenas tipos primitivos foram usados para armazenar os dados.
* Nenhuma estrutura de dados complexa ou função auxiliar proibida foi utilizada.
