import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Scratch {
    public static void main(String[] args) {
        String[] strArr = { "aaa", "bbb", "ccc"};
        List<String> strList = Arrays.asList(strArr);

        Stream<String> strStream1 = strList.stream();
        Stream<String> strStream2 = Arrays.stream(strArr);

        strStream1.sorted().forEach(System.out::println);
        strStream2.sorted().forEach(System.out::println);

        Stream<String> stream = Stream.of(strArr);
        Stream<String> stream2 = stream.distinct();
        Stream<String> stream3 = stream.sorted();
        Stream<String> stream4 = stream.limit(5);

        int sum = strStream1.parallel()
                .mapToInt(s -> s.length())
                .sum();

        Stream<String> strStream = Stream.of("A","B","C","D");

        IntStream intStream = new Random() .ints(1,46);
        Stream<String> lotto = intStream.distinct().limit(6).sorted().mapToObj(i -> i+", ");
        lotto.forEach(System.out::println);




        class student{
            String name;
            boolean isMale;
            int grade;
            int ban;
            int score;

            public student(String name, boolean isMale, int grade, int ban, int score) {
                this.name = name;
                this.isMale = isMale;
                this.grade = grade;
                this.ban = ban;
                this.score = score;
            }

            public String getName() {
                return name;
            }

            public boolean isMale() {
                return isMale;
            }

            public int getGrade() {
                return grade;
            }

            public int getBan() {
                return ban;
            }

            public int getScore() {
                return score;
            }

            @Override
            public String toString() {
                return "student{" +
                        "name='" + name + '\'' +
                        ", isMale=" + isMale +
                        ", grade=" + grade +
                        ", ban=" + ban +
                        ", score=" + score +
                        '}';
            }

            enum Level {
                HIGH, LOW, MID

            }
        }
    }
}