package soomi.calendar;

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
	}
}