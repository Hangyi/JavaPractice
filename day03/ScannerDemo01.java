import java.util.Scanner;
public class ScannerDemo1 {
	public static void main(String[] args) {
		//创建Scanner引用类型的变量
		Scanner sc = new Scanner(System.in);
		//获取数字
		System.out.println("请输入一个数字");
		int n = sc.nextInt();
		System.out.println("n的值为" + n);
		//获取字符串
		System.out.println("请输入一个字符串");
		String str = sc.next();
		System.out.println("str的值为" + str);
	}
}		