import java.util.function.*;

class Scratch {
    public static void main(String[] args) {
        IntSupplier s = () -> (int)(Math.random()*100)+1;
        IntConsumer c = i -> System.out.println(i+ ", ");
        IntPredicate p = i -> i%2 == 0;
        IntUnaryOperator op = i -> 1/10*10;



        Function<String, Integer> f = Integer::parseInt;
        Function<Integer, int[]> f1 = int[]::new;

        IntFunction f3 = int[]::new;
    }
}