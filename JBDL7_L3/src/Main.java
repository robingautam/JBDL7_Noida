import FI.PredicateImpl;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


       /* Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
               return integer%2==0;
            }
        };

        System.out.println(predicate.test(23));


        Function<Integer,Double> function = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return (double) integer*integer;
            }
        };

        System.out.println(function.apply(4));

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 2;
            }
        };

        System.out.println(supplier.get());


        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Value is "+integer);
            }
        };

        consumer.accept(23);
    }


    */


        Predicate<Integer> predicate = (i) -> i%2==0;;
        System.out.println(predicate.test(2));


    }
}