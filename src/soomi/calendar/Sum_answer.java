package soomi.calendar;

import java.util.Scanner;

public class Sum_answer {
	public static void main(String[] args) {
		int a, b;
		Scanner sc=new Scanner(System.in);
		
		String s1, s2;
		System.out.println("두 수를 입력해주세요: ");
		s1 = sc.next();
		s2 = sc.next();
//		System.out.println(s1 + " , " + s2); // 잘 입력됐나 확인. 여기까지는 String.
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
//		System.out.println(a + ", " + b); // 이 때는 숫자 10과 100.
		
		int c= a+b;
		System.out.println("두 수의 합은 " + c + "입니다." );
		// 이 방법도 좋으나, 이 때는 c라는 정수형 변수를 선언하지 않을 경우 
		// a+b에 괄호를 해야하고(정수형 출력을 위해) 복잡하고 더럽다
		
		System.out.printf("%d와 %d의 합은 %d입니다", a, b, (a+b));
		sc.close();
		// printf 및 %d 사용: 보다 프로다운 방
	}

}
