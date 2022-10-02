import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
}

public class PhoneBook {
	int num;
	String name, tel;
	Scanner scanner = new Scanner(System.in);
	Phone phoneArr[];
	
	public void getNum() {
		System.out.print("인원수>>");
		num = scanner.nextInt();
		phoneArr = new Phone[num];
	}
	
	public void getInfo() {
		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name = scanner.next();
			tel = scanner.next();
			phoneArr[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}
	
	public void search() {
		boolean state = false;
		
		while (true) {
			System.out.print("검색할 이름>>");
			name = scanner.next();
			
			if (name.equals("그만")) break;
			
			for (int i = 0; i < num; i++) {
				if(name.equals(phoneArr[i].getName())) {
					System.out.println(name+"의 번호는 "+phoneArr[i].getTel()+" 입니다.");
					state = true;
				}
			}
			
			if(state == false)
				System.out.println(name+" 이 없습니다.");
		}
	}
	
	
	public static void main(String[] args) {
		PhoneBook phonebook = new PhoneBook();
		phonebook.getNum();
		phonebook.getInfo();
		phonebook.search();
	}
}
