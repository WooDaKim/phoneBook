import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookLogic {
    Scanner scanner = new Scanner(System.in);

    HashMap<String, Person> map = new HashMap<>();


    void menu(){

        while (true) {
            System.out.println("-----------------------------------------------");
            System.out.println("기능을 입력하세요");
            System.out.println("list");
            System.out.println("add");
            System.out.println("edit");
            String menu = scanner.next();
            //메뉴
            switch (menu) {
                case "list": //리스트보기
                    menuList();
                    break;
                case "add": //등록
                    inputInfo();
                    break;
                case "edit" : //수정
                    editInfo();
                default://종료
                    break;
            }
        }
    }

    private void editInfo() {
        String name = guide("등록할 이름을 입력하세요.");
        if(map.containsKey(name)==false){
            System.out.println("없는 이름입니다.");
        } else {
        String editName = guide("수정할 이름을 적어주세요.");
        String editPhone = guide("수정할 번호를 입력하세요.");
        Person person = map.get(name);

        person.setName(editName);
        person.setNumber(editPhone);

        }

    }

    // list
    void menuList() {
        System.out.println(map);
    }

    //add 입력
    void inputInfo() {
        Person person = new Person();
        String name = guide("등록할 이름을 입력하세요.");
        String phone = guide("등록할 번호를 입력하세요.");

        person.setName(name);
        person.setNumber(phone);

        map.put(name, person);

    }

    String guide(String message) {
        System.out.println(message);
        String info = scanner.next();
        return info;
    }
}

