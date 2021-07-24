import java.util.Scanner;

public class Calender {
	
	public static int get_maxday(int month) {
		int []months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return months[month-1];
		
	}
	public static void print_calendar(int year, int month) {
		int maxday = get_maxday(month);
		System.out.printf("   << %4d년%3d월 >>\n",year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i=1; i<=maxday; i++) {
			System.out.printf("%3d",i);
			if(i%7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
				
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("월을 입력하세요.");
			System.out.print(">");
			int month = sc.nextInt();
			if(month == -1) {
				System.out.println("Have a nice day!");
				break;
				}
			if(month>12) {
				System.out.println("1~12월 중 입력하세요.");
				continue;
			}
			print_calendar(2020, month);
		}
	}

}
