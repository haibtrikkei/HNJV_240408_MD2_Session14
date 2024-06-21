package default_method_interface;

public class Test {
    public static void main(String[] args) {
        UsingDefaultMethod obj = new UsingDefaultMethod();
        System.out.println("Test ham cong: "+obj.cong(10,20));
        System.out.println("Test ham tru: "+obj.tru(20,10));
        obj.input();
        obj.display();
    }
}
