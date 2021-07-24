import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		String s1 = sc.next();
		String s2 = sc.next();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.printf("두 수의 합은 %d입니다."+'\n',a+b);
		
		sc.close();
	}

}
