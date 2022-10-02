import java.util.Scanner;

public class WordGameApp {
	static String word[] = {"아버지", ""};
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int num; // 게임 참가 인원
		
		System.out.println("끝말잇기 게임을 시작합니다...");
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		num = sc.nextInt();
		Player player[] = new Player[num]; // 인원만큼 Player 객체 생성
		
		for(int i=0; i<player.length; i++)
		{
			player[i] = new Player();
			System.out.print("참가자의 이름을 입력하세요>>");
			player[i].name = sc.next();
		}
		
		System.out.println("시작하는 단어는 "+word[0]+"입니다");
		
		boolean a = true;
		while(a) {
			for(int i=0; i<player.length; i++)
			{
				System.out.print(player[i].name+">>");
				word[1] = player[i].SayWord();
				a = player[i].Succeed();	
				word[0] = word[1];
				if(a==false)
				{
					System.out.print(player[i].name+"이(가) 졌습니다.");
					break;
				}
			}
		}
		sc.close();
	}
}

class Player{
	String name; // 참가자 이름
	String SayWord() { // 단어 입력 메소드
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	boolean Succeed() { // 성공 여부 확인
		char lastChar = WordGameApp.word[0].charAt(WordGameApp.word[0].length()-1); // 앞서 입력된 단어의 마지막 문자
		char firstChar = WordGameApp.word[1].charAt(0); // 이번에 입력된 단어의 첫번째 문자
		if(lastChar == firstChar)
			return true;
		else
			return false;
	}
}