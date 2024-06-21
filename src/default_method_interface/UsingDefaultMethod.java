package default_method_interface;

public class UsingDefaultMethod implements MyInterface1{
    @Override
    public void input() {
        System.out.println("Override method input");
    }

    @Override
    public void display() {
        System.out.println("Override method display");
    }
}
