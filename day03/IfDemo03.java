public class IfDemo03 {
	public static void main (String[] args) {
		int grade = 75; //定义学生成绩
		if (grade > 85) {
			//满足条件 grade > 80
			System.out.println("该成绩的等级为优");
		} else if (grade > 70) {
			//不满足条件grade > 80, 但满足条件grade > 70
			System.out.println("该成绩的等级为良");
		} else if (grade > 60) {
			//不满足条件grade > 70, 但满足条件grade > 60)
			System.out.println("该成绩的等级为中");
		} else {
			System.out.println("该成绩的等级为差");
		}
	}
}
		