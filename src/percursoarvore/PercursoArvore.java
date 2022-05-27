package percursoarvore;

/**
 * Classe principal para a execução do percurso em árvore binária.
 * 
 * <p>
 * O objetivo desse projeto é fazer a leitura de uma árvore binária em percursos
 * de pré-ordem, em ordem e pós-ordem.
 * 
 * @author Gustavo Simon
 */
public class PercursoArvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 
        // Para construir a árvore, basta adicionar chamadas para adicionar os nodos da árvore.
        // 
        // Para adicionar os nodos, basta informar no método addNode o nodo pai, o novo nodo 
        // e o lado em que ele deve ser posicionado.
        // 
        // Exemplo de árvore:
        //
        //                 A
        //               /   \
        //              B     C
        //             /    /   \
        //            D    E    F
        //                 \   /  \
        //                  G H    I
        // 
        //
        Tree tree = new Tree("A");
        tree.addNode("A","B", Side.LEFT);
        tree.addNode("B", "D", Side.LEFT);
        tree.addNode("A", "C", Side.RIGHT);
        tree.addNode("C", "E", Side.LEFT);
        tree.addNode("E", "G", Side.RIGHT);
        tree.addNode("C", "F", Side.RIGHT);
        tree.addNode("F", "H", Side.LEFT);
        tree.addNode("F", "I", Side.RIGHT);
        //
        System.out.println("Percurso Pre-Ordem: " + tree.preOrdem());
        System.out.println("Percurso Em Ordem: " + tree.inOrdem());
        System.out.println("Percurso Pós-Ordem: " + tree.posOrdem());
    }
}
