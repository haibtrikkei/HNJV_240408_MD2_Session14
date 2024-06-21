package sapxep_lambda;

import java.util.Arrays;
import java.util.List;

public class SapXep {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,1,3,4,2,4,5);

        list.sort((Integer a,Integer b)->a.compareTo(b));
        System.out.println("Sap xep tang dan: ");

        list.forEach(i-> System.out.print(i+"\t"));
        System.out.println();
    }
}
