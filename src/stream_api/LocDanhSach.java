package stream_api;

import java.util.Arrays;
import java.util.List;

public class LocDanhSach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,2,3,4,32,45,3,4,5,3,5,6,3,5,65,2);

        final List<Integer> listEven = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println("Danh sach cac phan tu chan: ");
        listEven.forEach(x-> System.out.print(x+"\t"));
        System.out.println();
    }
}
