package soomi.calendar;

import java.util.Scanner;

public class Calendar_answer {

	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {

		// 숫자(월)를 입력받아 그 달이 몇 개의 일로 구성되어 있는지, 즉
		// 해당 달의 최대 일수 출력하기
		// 배열 이용하여 해보기 

		Scanner sc = new Scanner(System.in);
		Calendar_answer cal = new Calendar_answer();

		
		System.out.println("반복 횟수를 입력하세요. ");
		int repeat = sc.nextInt();
		
		for (int i=0; i<repeat ; i++) {
			
			System.out.print("달을 입력하세요. : ");
			int month = sc.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
			System.out.println();
		
		}
		
		System.out.println("OK bye~");
		sc.close();
		// cal.printSampleCalendar();

	}

	public void printSampleCalendar() {
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
	}
}
