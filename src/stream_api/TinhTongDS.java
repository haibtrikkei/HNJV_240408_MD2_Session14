package stream_api;

import java.util.Arrays;
import java.util.List;

public class TinhTongDS {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        int sum1 = list.stream().reduce(10,(sum,x)->sum+x);
        System.out.println("Tong cac phan tu: "+sum1);
    }
}
