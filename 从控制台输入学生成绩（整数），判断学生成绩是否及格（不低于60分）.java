import java.util.Scanner;
public class grade {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please input your grade");
		int a=scan.nextInt();
		if(a<60) {
			System.out.println("you grade is not qualified");
		}
		else {
			System.out.println("you grade is  qualified");
		}
	}

}
