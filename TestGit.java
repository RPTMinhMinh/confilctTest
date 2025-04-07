import java.util.List;
import java.util.stream.Stream;

public class TestGit {
  public static void main(String[] args) {
    System.out.println("test");
    System.out.println("develop");
    System.out.println("eeee");
    List<String> list = List.of("a", "b", "c");
    list.forEach(System.out::println);
    Stream<String> stream = list.stream();
//    stream.forEach(System.out::println);
    stream.filter(i -> i.equals("a")).forEach(System.out::println);
  }
}

