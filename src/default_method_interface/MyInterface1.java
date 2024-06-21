package default_method_interface;

public interface MyInterface1 {
    void input();
    void display();
    default  int cong(int a, int b){
        return a+b;
    }
    default int tru(int a, int b){
        return a-b;
    }
}
