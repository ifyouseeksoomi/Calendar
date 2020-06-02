package soomi.calendar;

import java.util.Scanner;

public class Sum_myanswer {
	public static void main(String[] args) {
		// 입력: 키보드로 두 수의 입력을 받기
		// 출력: 키보드로 두 수의 합을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하세요: ");
		String input = sc.nextLine();
		
		String[] splitedInput = input.split(" ");
		int first = Integer.parseInt(splitedInput[0]);
		int second = Integer.parseInt(splitedInput[1]);
		
		System.out.println("두 수의 합은 " + (int)(first+second) + "입니다.");
		
		
	}
}
