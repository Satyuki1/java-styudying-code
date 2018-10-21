
public class 加密{
	public static void main(String[] args) {
		char c1='今';
		char c2='晚';
		char c3='吃';
		char c4='鸡';
		System.out.println("原文     "+c1+c2+c3+c4);
		char miyao='m';
		char m1=(char)(c1^miyao);
		char m2=(char)(c2^miyao);
		char m3=(char)(c3^miyao);
		char m4=(char)(c4^miyao);
		System.out.println("密文     "+m1+m2+m3+m4);
		//解密程序
		char j1=(char)(m1^miyao);
		char j2=(char)(m2^miyao);
		char j3=(char)(m3^miyao);
		char j4=(char)(m4^miyao);
		System.out.println("解密     "+j1+j2+j3+j4);
	}
}
