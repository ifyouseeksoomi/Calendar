package soomi.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		System.out.println("Hello, Calendar");
		System.out.println();

		System.out.println("일 월 화 수 목 금 토 ");
		System.out.println("-----------------");

		for (int i = 1; i <= 28; i++) {
			System.out.printf("%3d", i);

			if (i % 7 == 0) {
				System.out.println();

			}

		}
	

	
		// 숫자(월)를 입력받아 그 달이 몇 개의 일로 구성되어 있는지, 즉
		// 해당 달의 최대 일수 출력하기
		

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int input = sc.nextInt();

		switch (input) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(input + "월은 31일로 구성되어 있습니다."); break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(input + "월은 30일로 구성되어 있습니다."); break;
		case 2:
			System.out.println(input + "월은 28일로 구성되어 있습니다."); break;
		default: 
			System.out.println("1부터 12사이의 숫자만 입력바랍니다."); 
			
			

		}


	}

}