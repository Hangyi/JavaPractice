/*
    2017-08-10 下午10:05
    随机点名器
*/
import java.util.Random;
public class CallName{
    public static void main(String[] args){
        //定义数组，存储学生姓名
        String[] names = new String[8];
        //调用添加姓名方法
        addStudent(names);
        //调用遍历数组方法
        printStudentName(names);
        //调用随机姓名的方法
        String name = randomStudentName(names);
        System.out.println("----------");
        System.out.println(name);
    }
    
    public static String randomStudentName(String[] names){
        Random ran = new Random();
        int index = ran.nextInt(names.length);
        return names[index];
    }
    
    public static void printStudentName(String[] names){
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
    
    public static void addStudent(String[] names){
        names[0] = "zhangsan";
        names[1] = "lisi";
        names[2] = "wangwu";
        names[3] = "lilei";
        names[4] = "wamhm";
        names[5] = "zhage";
        names[6] = "meiguo";
        names[7] = "apple";
    }
}