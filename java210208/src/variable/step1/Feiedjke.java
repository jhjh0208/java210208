package variable.step1;

public class Feiedjke {
	
	int age = 20;

	public static void main(String[] args) {
		
		Feiedjke fe = new Feiedjke();
		
		fe.age = 59;
		System.out.println("당신의 나이는 "+fe.age+"입니다");
	}

}
