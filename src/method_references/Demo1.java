package method_references;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,1,3,4,2,4,5);

        list.forEach(System.out::println);
    }
}
