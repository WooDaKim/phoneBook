import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        HashMap<String,String> map = new HashMap<>();

        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("-----------------------------------------------");
            System.out.println("기능을 입력하세요");
            System.out.println("list");
            System.out.println("add");
            String menu = scanner.next();

            //메뉴
            switch (menu) {
                case "list": //리스트보기
                    System.out.println(map);
                    break;
                case "add": //등록
                    System.out.println("이름을 입력하세요.");
                    String name = scanner.next(); //입력값을 바로 넣기 떄문에 New 해줄 필요가 없음
                    System.out.println("전화번호를 입력하세요.");
                    String phone = scanner.next();

                    person.setMember(map.put(name,phone));

                default://종료
                    break;
            }
        }


    }/////main
}
