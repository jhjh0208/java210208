package com.base;

public class MainMethod {

	public static void main(String[] args) {
		//만일 숫자라면 20을 출력할거야
		//만일 문자라면 1010을 출력할거야
		//int+int=int
		//int+Stimg=붙여쓰기다
		System.out.println(args[0]+10);
		//너 타입이 뭐니?
		//타입을 체크할 수 있는 연산자가 있다.-왜냐하면 자바는 컴파일할 때 타입을 따지니까....
		if(args[0] instanceof String) {
			System.out.println("나는 문자열이야");
		}
		else {
			System.out.println("나는 문자열 아닌데...");
		}
		if(true) {//else를 실행할 경우는 죽어도 없다. 왜? 상수니까.
			System.out.println("나는 문자열이야");
		}
		else {
			System.out.println("나는 문자열 아닌데...");
		}
		for(int i=0;i<10;i=i+1) {
			if(true) { //else를 실행할 경우는 죽어도 없다. 왜? 상수니까.
				System.out.println("나는 문자열이야");
			}
		}
	}
}

