/*
	随机点名器：
	1.存储姓名
	2.预览所有人姓名
	3.随机出一个人的姓名
	2017-08-09 下午9:28
*/
import java.util.Random;
public class CallName{
	public static void main(String[] args){
		String[] names = {"张三","李四","王五","李磊","韩美","老王","毛毛","张费"};
		
		for(int i = 0; i < names.length; i++){
		System.out.println(names[i]);
		}
		System.out.println("==================");
		
		Random ran = new Random();
		int index = ran.nextInt(names.length);
		System.out.println(names[index]);
	}
}
	