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
			if(month>12) {
				System.out.println("1~12월 중 입력하세요.");
				continue;
			}
			cal.print_calendar(year, month);
		}
	}
	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.run_prompt();
		
	}

}
