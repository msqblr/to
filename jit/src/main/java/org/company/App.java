package org.company;

/**
 * To disable JIT try -Djava.compiler=NONE vm option.
 */
public class App {
    public static void main(String[] args) {
        long start = System.nanoTime();
        long test = 0;
        for (int i = 0; i < 1000; i++) {
            test +=i;
        }
        System.out.println(test);
        long end  = System.nanoTime();
        System.out.println(end - start);

        start = System.nanoTime();
        test = 0;
        for (int i = 0; i < 10000000; i++) {
            test +=i;
        }
        System.out.println(test);
        end  = System.nanoTime();
        System.out.println(end - start);
    }
}
