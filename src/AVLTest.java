import java.util.Random;

public class AVLTest {
    AVLTree<Pessoa> avl = new AVLTree<>();
    private int size;

    public AVLTest(int size){
        this.size = size;
    }

    public void firstInsertion(){
        long begin = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            avl.insert(new Pessoa(i));
        }
        long last = System.currentTimeMillis();
        System.out.printf("Primeira inserção " + size +": " + (last - begin) + "em milisegundos\n");
    }
    public void firstSearch(){
        long begin = System.currentTimeMillis();
        for (int i = size - 1; i >= 0 ; i--) {
            avl.search(i);
        }
        long last = System.currentTimeMillis();
        System.out.printf("Primeira busca " + size +": " + (last - begin) + "em milisegundos\n");

    }
    public void firstRemove(){
        long begin = System.currentTimeMillis();
        for (int i = size - 1   ; i >= 0 ; i--) {
            avl.remove(i);
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
                if(avl.search(insert) == null )
                    break;
            }
            avl.insert(new Pessoa(insert) );
        }
        long last = System.currentTimeMillis();
        System.out.printf("Segunda inserção " + size +": " + (last - begin) + "em milisegundos\n");
    }
    public void secondSearch(){
        long begin = System.currentTimeMillis();
        for (int i = (size*2) - 1; i >= 0 ; i--) {
            avl.search(i);
        }
        long last = System.currentTimeMillis();
        System.out.printf("Segunda busca " + size +": " + (last - begin) + "em milisegundos\n");
    }
    public void secondRemove(){
        long begin =  System.currentTimeMillis();
        for (int i = (size*2) - 1; i >= 0 ; i--) {
            avl.remove(i);
        }
        long last = System.currentTimeMillis();
        System.out.printf("Segunda remoção " + size +": " + (last - begin) + "em milisegundos\n");
    }
}
