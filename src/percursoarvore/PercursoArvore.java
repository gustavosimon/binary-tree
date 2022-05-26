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
        System.out.println("-----------------------------------------");
        Tree arvore = new Tree("A");
         
        arvore.addNode("A","B", Side.LEFT);
        arvore.addNode("B", "D", Side.LEFT);
        arvore.addNode("A", "C", Side.RIGHT);
        arvore.addNode("C", "E", Side.LEFT);
        arvore.addNode("E", "G", Side.RIGHT);
        arvore.addNode("C", "F", Side.RIGHT);
        arvore.addNode("F", "H", Side.LEFT);
        arvore.addNode("F", "I", Side.RIGHT);
         
        System.out.println("PreOrdem (RED): " + arvore.preOrdem());
        System.out.println("InOrdem (ERD): " + arvore.InOrdem());
        System.out.println("PosOrdem (EDR): " + arvore.posOrdem());
        System.out.println("-----------------------------------------");
         
        arvore.clear("F");
         
        arvore.addNode("F","B", Side.LEFT);
        arvore.addNode("B","A", Side.LEFT);
        arvore.addNode("B","D", Side.RIGHT);
        arvore.addNode("D","C", Side.LEFT);
        arvore.addNode("D","E", Side.RIGHT);
        arvore.addNode("F","G", Side.RIGHT);
        arvore.addNode("G","I", Side.RIGHT);
        arvore.addNode("I","H", Side.LEFT);
         
        System.out.println("PreOrdem (RED): " + arvore.preOrdem());
        System.out.println("InOrdem (ERD): " + arvore.InOrdem());
        System.out.println("PosOrdem (EDR): " + arvore.posOrdem());
        System.out.println("-----------------------------------------");
         
        arvore.clear("A");
         
        arvore.addNode("A","B", Side.LEFT);
        arvore.addNode("B","C", Side.LEFT);
        arvore.addNode("C","E", Side.LEFT);
        arvore.addNode("E","I", Side.RIGHT);
        arvore.addNode("C","F", Side.RIGHT);
        arvore.addNode("F","J", Side.RIGHT);
        arvore.addNode("B","D", Side.RIGHT);
        arvore.addNode("D","G", Side.LEFT);
        arvore.addNode("D","H", Side.RIGHT);
        arvore.addNode("H","K", Side.LEFT);
        arvore.addNode("H","L", Side.RIGHT);
         
        System.out.println("PreOrdem (RED): " + arvore.preOrdem());
        System.out.println("InOrdem (ERD): " + arvore.InOrdem());
        System.out.println("PosOrdem (EDR): " + arvore.posOrdem());
        System.out.println("-----------------------------------------");
    }
}
