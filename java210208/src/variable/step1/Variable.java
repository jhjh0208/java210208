package variable.step1;

public class Variable {
	//선언부
	
	//메소드 선언
	void methodA(int x) {
		
	}
	double methodB(int x) {
		return 3.14;
	}
	//메인메소드 - 여기가 있어야 exe파일로 만둘 수 있어요.
	/******************************************
	 * 문제해결능력 키움.
	 * @return void이다 - 비어있다 - 돌려 받을 수 있는 값이 없다 - 이것 떄문에 에러가 발생할  수도 있다.
	 * @param args
	 */
	public static void main(String[] args) {
		//System:너의 컴퓨터 ,out속성:출력장치(하드웨어-모니터, 프린터...) , print():이건 illegal, print(int i), print(double pi), 
		System.out.print(5);//줄바꿈 안됨, 메소드를 호출할 수 있니? 주소번지.methodA();
		//메소드 선언할 떄는 좌중괄호, 우중괄호를 사용하고.
		//메소드  호출할 때는.
		//API안에 XXX.jar <- 이 안에(클래스[소스가 만들어 졌으니까 구체적이다] 안에, 객체[결정되지 않았다] 안에) 있는 걸을 꺼내쓴다.
		//print메소두눈 여러 개 이다. 같은 아름의 메소드를 여러 개 만들 수도 있다.
		//SELECT 이름 FROM 회원 집합
		// WHERE 아이디='test'
		//   AND 비번='123'
		//System.out.print();//줄바꿈 안됨 - 반환값이 없으니까 에러인거야? 반환값이 뭔데? - 출력 결과물(목적) 그래서 24번은 주석으로 막아야 한다.
		Variable v = new Variable();
		System.out.print(v.methodB(1));
		//System.out.print(v.methodA(1));
		System.out.print(1+"   "+1);//줄바꿈 안됨
		System.out.print(10+10);//줄바꿈 안됨
		System.out.print(10+"10");//줄바꿈 안됨
		System.out.print(10+""+10);//줄바꿈 안됨
		System.out.println("   ");//
		System.out.println();//줄바꿈 추가된 메소드
	}

}
