
public class Main {

    public static void main(String[] args) {
        BinarySearchTest bst = new BinarySearchTest(500000);
        AVLTest          avl = new AVLTest(500000);
        RedBlackTest     rbt = new RedBlackTest(500000);
        System.out.println("Resultados Arvore Binaria de Busca 1º Teste \n");
        //BST
        bst.firstInsertion();
        bst.firstSearch();
        bst.firstRemove();
        System.out.println("Resultados AVL 1º Teste \n");
        //AVL
        avl.firstInsertion();
        avl.firstSearch();
        avl.firstRemove();
        System.out.println("Resultados Arvore Rubro Negra 1º Teste \n");
        //RBT
        rbt.firstInsertion();
        rbt.firstSearch();
        rbt.firstRemove();
        System.out.println("Resultados Arvore Binaria de Busca 2º Teste \n");
        //BST
        bst.secondInsertion();
        bst.secondSearch();
        bst.secondRemove();
        System.out.println("Resultados AVL 2º Teste \n");
        //AVL
        avl.secondInsertion();
        avl.secondSearch();
        avl.secondRemove();
        System.out.println("Resultados RBT 2º Teste \n");
        //RBT
        rbt.secondInsertion();
        rbt.secondSearch();
        rbt.secondRemove();

    }
}
