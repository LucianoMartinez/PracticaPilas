/**
 * Created by luciano on 08/nov/2017.
 */
public class Main {

    public static void main(String[] args){
        pilas p = new pilas();

        p.push(2);
        p.push(8);
        p.push(1);

        p.peek();
        p.cima();
        p.pop();
        p.peek();
        p.pop();
        p.cima();
        p.pop();
        p.peek();
    }
}
