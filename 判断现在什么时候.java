import java.util.Scanner;
public class shijian {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入现在的时间，精确到小时");
		int a =scan.nextInt();
		if(a>=0&&a<=5) {
			System.out.println("现在是早上");
		}
		else if(a>5&&a<=12) {
			System.out.println("现在是上午");
		}
		else if(a>12&&a<=3) {
			System.out.println("现在是中午");
			
		}
		else if(a>3&&a<=8) {
			System.out.println("现在是下午");
		}
		else if(a>8&&a<=12) {
			System.out.println("现在是晚上");
		}
			
		
	}
