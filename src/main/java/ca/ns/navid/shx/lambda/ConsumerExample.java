package ca.ns.navid.shx.lambda;

import java.util.List;
import java.util.function.Consumer;

/**
 * This is an example of usage of java.util.{@link Consumer} functional interface.
 */
public class ConsumerExample {

    private static <T> void doAction(List<T> list, Consumer<T> consumer) {

        for (T element : list) {
            consumer.accept(element);
        }
    }

    void main(String[] args) {

        //Print Uppercase Names
        List<String> names = List.of("Jenifer", "Negar", "John", "Paria", "Donald", "Sina");
        doAction(names, name -> IO.println(name.toUpperCase()));
    }
}
