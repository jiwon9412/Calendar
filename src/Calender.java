import java.util.Scanner;

public class Calender {
	public boolean is_leapyear(int year) {
		if(year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
			return true;
		}
		
		return false;
	}
	
	public int get_maxday(int year, int month) {
		int []months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int []leap_months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(is_leapyear(year)) {
			return leap_months[month-1];
		}
		else {
			return months[month-1];			
		}
		
	}
	public void print_calendar(int year, int month) {
		
		
		int	maxday = get_maxday(year, month);

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
	
	}

}
