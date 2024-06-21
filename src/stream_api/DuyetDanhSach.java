package stream_api;

import sapxep_lambda.Student;

import java.util.ArrayList;
import java.util.List;

public class DuyetDanhSach {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(1,"Cuong","Ha Noi"));
        list.add(new Student(2,"Lan","Ha Nam"));
        list.add(new Student(3,"Anh","Thai Binh"));
        list.add(new Student(4,"Binh","An Giang"));
        list.add(new Student(5,"Hai","Hoa Binh"));

        list.forEach(s-> System.out.println(s));

        System.out.println("\nDuyet theo stream map");
        List<Student> list1 = list.stream().map(stu ->{
            stu.setName(stu.getName().toUpperCase());
            return stu;
        }).toList();
        list1.forEach(s-> System.out.println(s));
    }
}
