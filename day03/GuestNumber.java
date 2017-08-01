import java.util.Random;
import java.util.Scanner;

public class GuestNumber{
	public static void main (String[] args){
		int radomNumber = new Random().nextInt(100);
		System.out.println("随机数已生成");
		
		System.out.println("----请输入您猜的数字：----");
		Scanner sc = new Scanner(System.in);
		int enterNumber = sc.nextInt();
		
		while(enterNumber != radomNumber){
			if(enterNumber > radomNumber){
				System.out.println("sorry,您猜大了！继续下一次循环");
			}else {
				System.out.println("sorry,您猜小了！继续下一次循环");
			}
			
			System.out.println("----请输入您猜的数字：----");
			enterNumber = sc.nextInt();
			
		}
		System.out.println("恭喜你，答对了！");
	}
}