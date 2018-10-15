import java.util.Scanner;
public class zhengchu {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a=scan.nextInt();
		System.out.println("请输入第二个数");
		int b=scan.nextInt();
		if(a%b==0) {
			System.out.println("可以整除");
		}
		else {
			System.out.println("不可以整除");
		}
		
	}
}
