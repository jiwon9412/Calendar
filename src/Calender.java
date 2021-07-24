import java.util.Scanner;

public class Calender {
	public int get_weekday(String week) {
		if(week.equals("SU")) {return 0;}
		else if(week.equals("MO")) {return 1;}
		else if(week.equals("TU")) {return 2;}
		else if(week.equals("WE")) {return 3;}
		else if(week.equals("TH")) {return 4;}
		else if(week.equals("FR")) {return 5;}
		else if(week.equals("SA")) {return 6;}
		else {return 0;}

	}
	
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
	public void print_calendar(int year, int month, String week) {
		
		
		int	maxday = get_maxday(year, month);
		int weekday = get_weekday(week);

		System.out.printf("   << %4d년%3d월 >>\n",year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		for(int i=0; i<weekday; i++) {
			System.out.printf("   ");
		}
		for(int i=1; i<=maxday; i++) {
			System.out.printf("%3d",i);
			if((i+weekday)%7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
	
	}

}
