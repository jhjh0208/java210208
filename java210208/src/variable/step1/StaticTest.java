package variable.step1;

public class StaticTest {
	/*
	 * non-static타입은 static영역세서 접근 부라, 호출안돼, 사용못해
	 */
	static void avg() {//사용자 정의 메소드
		System.out.println("avg호출 성공");
	}
	public static void main(String[] args) {
	//	if(args[0]==null | args.length>0) {
		if(args.length==0) {
			//아래 문장은 조건에 따라 한 번도 실행기회를 못 가질 수도 있다.
			System.out.println("야! 입력해야지!!");
			return;
		}
		System.out.println(args[0]+10);//20출력 되도록 코드룰 수정하시오. 1010말고 20출력 되는걸 보고 싶다면 어떡하지?
		int imsi = Integer.parseInt(args[0]);
		System.out.println(imsi+10);
		System.out.println("==========>"+imsi+10);
		//main메소드는 자바가 제공하는 메소드입니다. O|X
		//사용자 정의 메소드도 가능하다.
		//내가 필요한 메소드는 문자열을 집어(파라미터로) 넣으면int타입으로 변환하여서 반환(리턴해,돌려주는,대입연산자 받을 수) 해주는 메소드가 필요해요.
		//parseInt()입니다.
		//네이버난 구글링을 해서 위 요구사항을 만족하는 코드를 작성해 보시오
		avg();
	}

}
