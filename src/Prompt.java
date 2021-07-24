import java.util.Scanner;

public class Prompt {

	public void run_prompt() {
		
		Scanner sc = new Scanner(System.in);
		Calender cal = new Calender();
		while(true) {
			System.out.println("년도를 입력하세요.");
			System.out.print("YEAR>");
			int year = sc.nextInt();
			if(year == -1) {
				System.out.println("Have a nice day!");
				break;
				}
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH>");
			int month = sc.nextInt();
			if(month == -1) {
				System.out.println("Have a nice day!");
				break;
				}
			if(month > 12 || month < 1) {
				System.out.println("1~12월 중 입력하세요.");
				continue;
			}
			System.out.println("첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
			System.out.print("WEEKDAY>");
			String week = sc.next();
			
			cal.print_calendar(year, month, week);
		}
	}
	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.run_prompt();
		
	}

}
