package percursoarvore;

/**
 * Classe representando um nó da árvore binária.
 * 
 * @author Gustavo Simon
 */
public final class Node {

    /** Nome do nó */
    private String name;
    /** Nó à esquerda do nó atual */
    private Node left;
    /** Nó à diretira do nó atual */
    private Node right;
    
    public Node() {
        this(null, null, null);
    }

    public Node(String name){
        this(name, null, null);
    }
    
    public Node(String name, Node left, Node rigth) {
        this.name  = name;
        this.left  = left;
        this.right = rigth;
    }

    /**
     * Retorna o nome do nó.
     * 
     * @return nome do nó
     */
    public String getName() {
        return name;
    }

    /**
     * Retorna o nó a esquerda do nó atual.
     * 
     * @return {@code Node} a esquerda do nó atual.
     */
    public Node getLeft() {
        return left;
    }

    /**
     * Retorna o nó a direita do nó atual.
     * 
     * @return {@code Node} a direita do nó atual.
     */
    public Node getRight() {
        return right;
    }

    /**
     * Define o nome do nó.
     * 
     * @param name nome do nó
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Define o nó a esquerda do nó atual.
     * 
     * @param {@code Node} nó a esquerda do nó atual
     */
    public void setLeft(Node left) {
        this.left = left;
    }

    /**
     * Define o nó a direita do nó atual.
     * 
     * @param {@code Node} nó a direita do nó atual
     */
    public void setRight(Node right) {
        this.right = right;
    }
    
    @Override
    public int hashCode() {
        return name == null ? 0 : name.hashCode();
    }
     
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Node)) { 
            return false;
        }
        return ((Node) obj).hashCode() == hashCode();
    }

    @Override
    public String toString() {
        return name == null ? "" : name;
    }

}
