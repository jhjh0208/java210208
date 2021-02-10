package book.ch4;

public class ForTest {

	public static void main(String[] args) {
		int i = 11;
		int hap = 0;
		for(i=1; i<=10; i=i+1) {
			//System.out.println(i);
			if(i%2==0) {//너 i로 나눈 나머지가 0하고 같은거야?
				hap  = hap + i;
			}
		System.out.println("1부터 10까지 세면서 짝수의 합을 구한 결과는"+hap);
		
		
		}
         	
		
		
		System.out.println("==========");
		
		
	}

}
