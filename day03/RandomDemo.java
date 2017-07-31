import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		//创建Random类的实例
		Random r = new Random();
		//得到0-100范围内的随机整数，将产生的随机整数赋值给i变量
		int i = r.nextInt(100);
		//得到0.0-1.0范围内的随机小数，将产生的随机小数赋值给d变量
		double d = r.nextDouble();
		System.out.println(i);
		System.out.println(d);
	}
}