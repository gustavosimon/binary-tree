package percursoarvore;

/**
 * Classe representando a árvore binária que deve ser processada.
 * 
 * @author Gustavo Simon
 */
public class Tree {

    /** Nó raiz que possui a árvore binária a ser processada */
    private Node tree;

    public Tree(String root) {
        this.tree = new Node(root);
    }

    /**
     * Adiciona um novo nó à arvore.
     * 
     * @param parentNode Nome do nó pai
     * @param nodeName Nome do novo nó
     * @param side Lado em que deve ser adicionado o novo nó
     */
    public void addNode(String parentNode, String nodeName, Side side){
        if (side == Side.RIGHT) {
            addRightNode(parentNode, nodeName);
        }  else if (side == Side.LEFT) {
            addLeftNode(parentNode, nodeName);
        }
    }
     
    /**
     * Adiciona um novo nó à esquerda.
     * 
     * @param parentNode Nome do nó pai
     * @param nodeName Nome do novo nó
     */
    public void addLeftNode(String parentNode, String nodeName){
        Node node = findNode(tree, parentNode);
        if (node == null) {
            return;
        }
        node.setLeft(new Node(nodeName));
    }
     
    /**
     * Adiciona um novo nó à direita.
     * 
     * @param parentNode Nome do nó pai
     * @param nodeName Nome do novo nó
     */
    public void addRightNode(String parentNode, String nodeName){
        Node node = findNode(tree, parentNode);
        if (node == null) {
            return;
        }
        node.setRight(new Node(nodeName));
    }
     
    /**
     * Encontra o nó a partir do nome.
     * 
     * @param root nó raiz
     * @param name nome do nó que está sendo buscado
     * @return {@code Node} nó encontrado, null se não for encontrado 
     */
    private Node findNode(Node root, String name){
        if (root == null || name == null || name.isEmpty()) { 
            return null;
        }
        if (root.getName().equals(name)) { 
            return root;
        }
        Node leftNode = findNode(root.getLeft(), name);
        if (leftNode != null) { 
            return leftNode; 
        }
        return findNode(root.getRight(), name);
    }
     
    /**
     * Limpa a árvore.
     * 
     * @param root raiz da árvore
     */
    public void clear(String root) {
        nullNodes(tree);
        tree = new Node(root);
    }
     
    /**
     * Método recursivo para realizar a limpeza da árvore.
     * 
     * @param Node nó
     */
    private void nullNodes(Node node){
        if (node == null) {
            return;
        }
        nullNodes(node.getRight());
        nullNodes(node.getLeft());
        node.setLeft(null); 
        node.setRight(null);
        node = null;
    }
     
    /**
     * Busca em pré-ordem.
     * 
     * @return String árvore em pré-ordem
     */
    public String preOrdem(){
        if (tree == null) { 
            return "";
        }
        return readPreOrdem(tree);
    }
     
    /**
     * Leitura para busca em pré-ordem.
     * 
     * @param node nó que deve ser processado
     * @return String árvore em pré-ordem
     */
    private String readPreOrdem(Node node){
        if (node == null) {
            return "";
        }
        String rt = node.toString();
        if (node.getLeft() != null) {
            rt += (rt.isEmpty() ? "" : ",") + readPreOrdem(node.getLeft());
        }
        if (node.getRight() != null) {
            rt += (rt.isEmpty() ? "" : ",") + readPreOrdem(node.getRight());
        }
        return rt;
    }
     
    /**
     * Busca em ordem.
     * 
     * @return String árvore em ordem
     */
    public String InOrdem(){
        if (tree == null) { 
            return "";
        }
        return readInOrdem(tree);
    }
     
    /**
     * Leitura para busca em ordem.
     * 
     * @param node nó que deve ser processado
     * @return String árvore em ordem
     */
    private String readInOrdem(Node node){
        if (node == null) {
            return "";
        }
        String rt = "";
        if (node.getLeft() != null) {
            rt += (rt.isEmpty() ? "" : ",") + readInOrdem(node.getLeft());
        }
        rt += (rt.isEmpty() ? "" : ",") + node.toString();
        if (node.getRight() != null) {
            rt += (rt.isEmpty() ? "" : ",") + readInOrdem(node.getRight());
        }
        return rt;
    }
     
    /**
     * Busca em pós-ordem.
     * 
     * @return String árvore em pós-ordem
     */
    public String posOrdem(){
        if (tree == null) { 
            return "";
        }
        return readPosOrdem(tree);
    }
     
    /**
     * Leitura para busca em pós-ordem.
     * 
     * @param node nó que deve ser processado
     * @return String árvore em pós-ordem
     */
    private String readPosOrdem(Node node){
        if (node == null) {
            return "";
        }
        String rt = "";
        if (node.getLeft() != null) {
            rt += (rt.isEmpty() ? "" : ",") + readPosOrdem(node.getLeft());
        }
        if (node.getRight() != null) {
            rt += (rt.isEmpty() ? "" : ",") + readPosOrdem(node.getRight());
        }
        rt += (rt.isEmpty() ? "" : ",") + node.toString();
        return rt;
    }
    
}
