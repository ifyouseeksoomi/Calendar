package soomi.calendar;

import java.util.Scanner;

public class Calendar_answer {
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
		// 배열 이용하여 해보
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. : ");
		int input = sc.nextInt();

		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d은 %d일까지 있습니다.\n", input, maxDays[input-1]);
		sc.close();
			

		}


	}

