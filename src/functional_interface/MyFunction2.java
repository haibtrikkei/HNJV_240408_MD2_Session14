package functional_interface;
@FunctionalInterface
public interface MyFunction2 {
    default int cong(int a, int b){
        return a+b;
    }

    int tru(int a, int b);
}
