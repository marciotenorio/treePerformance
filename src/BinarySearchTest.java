import java.util.Random;

public class BinarySearchTest {
    BinarySearchTree bst = new BinarySearchTree();
    private int size;

    public BinarySearchTest(int size){
        this.size = size;
    }

    public void firstInsertion(){
        long begin = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            bst.insert(i);
        }
        long last = System.currentTimeMillis();
        System.out.printf("Primeira inserção " + size +": " + (last - begin) + "em milisegundos\n");
    }
    public void firstSearch(){
        long begin = System.currentTimeMillis();
        for (int i = size - 1; i >= 0 ; i--) {
            bst.search(i);
        }
        long last = System.currentTimeMillis();
        System.out.printf("Primeira busca " + size +": " + (last - begin) + "em milisegundos\n");

    }
    public void firstRemove(){
        long begin = System.currentTimeMillis();
        for (int i = size - 1   ; i >= 0 ; i--) {
            bst.remove(i);
        }
        long last = System.currentTimeMillis();
        System.out.printf("Primeira remoção " + size +": " + (last - begin) + "em milisegundos\n");
    }
    public void secondInsertion(){
        long begin = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int insert;
            while (true){
                insert = new Random().nextInt(2 * size) + 1;
                if(!bst.search(insert))
                    break;
            }
            bst.insert(insert);
        }
        long last = System.currentTimeMillis();
        System.out.printf("Segunda inserção " + size +": " + (last - begin) + "em milisegundos\n");
    }
    public void secondSearch(){
        long begin = System.currentTimeMillis();
        for (int i = (size*2) - 1; i >= 0 ; i--) {
            bst.search(i);
        }
        long last = System.currentTimeMillis();
        System.out.printf("Segunda busca " + size +": " + (last - begin) + "em milisegundos\n");
    }
    public void secondRemove(){
        long begin =  System.currentTimeMillis();
        for (int i = (size*2) - 1; i >= 0 ; i--) {
            bst.remove(i);
        }
        long last = System.currentTimeMillis();
        System.out.printf("Segunda remoção " + size +": " + (last - begin) + "em milisegundos\n");
    }
}