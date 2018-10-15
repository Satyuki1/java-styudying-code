import java.util.Scanner;
public class jishuoushu {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a=scan.nextInt();
		
		if(a%2==0) {
			System.out.println("是偶数");
		}
		else {
			System.out.println("不是偶数");
		}
		
	}
}
