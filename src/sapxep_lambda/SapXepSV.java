package sapxep_lambda;

import java.util.ArrayList;
import java.util.List;

public class SapXepSV {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(1,"Cuong","Ha Noi"));
        list.add(new Student(2,"Lan","Ha Nam"));
        list.add(new Student(3,"Anh","Thai Binh"));
        list.add(new Student(4,"Binh","An Giang"));
        list.add(new Student(5,"Hai","Hoa Binh"));

        list.forEach(s-> System.out.println(s));

        list.sort((Student s1, Student s2)-> s2.getName().compareTo(s1.getName()));
        System.out.println("\nDanh sach sap xep giam dan theo ten sinh vien: ");
        list.forEach(s-> System.out.println(s));
    }
}
