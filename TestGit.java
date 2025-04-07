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
    System.out.println("Hello World");
    System.out.println("hehi");
  }
}

//  clone nhánh develop về
//  tạo nhánh mới và truy cập nhánh mới bằng git checkout -b ten_nhanh
//  kiểm tra nhánh bằng lệnh git branch (chuyển nhánh bằng git checkout ten_nhanh)
//  code vào nhánh đó và commit lên
//  c1: merge request vào nhánh test và tag maintainer vào review (vào git merge)
//  c2: vào nhánh develop sử dụng lệnh git merge ten_nhanh push lên nhánh develop


/*
test merge develop2  wwwww
 */