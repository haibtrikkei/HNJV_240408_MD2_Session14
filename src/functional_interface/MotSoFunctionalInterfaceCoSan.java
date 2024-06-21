package functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MotSoFunctionalInterfaceCoSan implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return false;
    }
}

class TestConsumer implements Consumer<String>{
    @Override
    public void accept(String s) {

    }
}

class TestSupply implements Supplier<String>{

    @Override
    public String get() {
        return "";
    }
}

class TestFunction implements Function<String, String>{

    @Override
    public String apply(String s) {
        return "";
    }
}