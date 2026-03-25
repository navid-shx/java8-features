package ca.ns.navid.shx.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    private static <T> List<T> generate(int size, Supplier<T> supplier) {

        List<T> list = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            list.add(supplier.get());
        }

        return list;
    }

    void main() {

        //Generate a list of random numbers
        List<Integer> result = generate(20, () -> new Random().nextInt(100));
        IO.println(result);
    }
}
