import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        // (writeln (map (lambda (x) (+ x 1)) (list 1 2 3 4)))
        list1.stream().map(x -> x + 1).forEach(System.out::println);
        System.out.println();

        // (writeln (map (lambda (x) (+ x 5)) (list 1 2 3 4)))
        list1.stream().map(x -> x + 5).forEach(System.out::println);
        System.out.println();

        // (writeln (map (lambda (x) (if (even? x) (+ x 1) x)) (list 1 2 3 4)))
        list1.stream().map(x -> x % 2 == 0 ? x + 1 : x).forEach(System.out::println);
        System.out.println();

        // (writeln (map (lambda (x) (if (even? x) (* x x) x)) (list 1 2 3 4)))
        list1.stream().map(x -> x % 2 == 0 ? x * x : x).forEach(System.out::println);
        System.out.println();

        // (writeln (filter (lambda (x) (even? x)) (list 1 2 3 4)))
        // or
        // (writeln (filter even? (list 1 2 3 4)))
        list1.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println();

        var list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));

        // (writeln (filter (lambda (x) (> x 5)) (list 4 5 6 7 8)))
        list2.stream().filter(x -> x > 5).forEach(System.out::println);
        System.out.println();
    }
}
