package method_references;

import sapxep_lambda.Student;

import java.util.ArrayList;
import java.util.List;

public class DuyetDSSV {
    public static void main(String[] args) {
        List<sapxep_lambda.Student> list = new ArrayList<>();

        list.add(new sapxep_lambda.Student(1,"Cuong","Ha Noi"));
        list.add(new sapxep_lambda.Student(2,"Lan","Ha Nam"));
        list.add(new sapxep_lambda.Student(3,"Anh","Thai Binh"));
        list.add(new sapxep_lambda.Student(4,"Binh","An Giang"));
        list.add(new Student(5,"Hai","Hoa Binh"));

        list.forEach(Student::display);
    }
}
