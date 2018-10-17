import java.util.Scanner;
public class 输入正整数打印个位数 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int a=scan.nextInt();
		if(a<=10) {
			System.out.println(a);
		}
		else if(a>=10) {
			System.out.println(a%10);
		}
	}

}
