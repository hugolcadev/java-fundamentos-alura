import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List <Integer> inteiros = new ArrayList<>();
        for (int i=10; i>=1; i--){
            inteiros.add(i);
        }
        System.out.println(inteiros);
        Collections.sort(inteiros);
        System.out.println(inteiros);
    }
}
