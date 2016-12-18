package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


class Student implements Comparable{
	private int Num;
	private String name;
	private int ChGrade;
	private int EnGrade;
	private int MaGrade;
	public Student(int Num,String name,int ChGrade,int EnGrade,int MaGrade) {
		this.Num=Num;
		this.name=name;
		this.ChGrade=ChGrade;
		this.EnGrade=EnGrade;
		this.MaGrade=MaGrade;
	}
	public int compareTo(Object obj){
		Student e1=(Student)obj;
		double decide=(this.ChGrade+this.EnGrade+this.MaGrade)/3;
		double objDecide=(e1.ChGrade+e1.EnGrade+e1.MaGrade)/3;
		if(decide>objDecide)
			return -1;
		if(decide<objDecide)
			return 1;
		return 0;
	}
	public String toString(){
		return "学号："+Num+" 姓名："+name+" 国语成绩："+ChGrade+" 英语成绩："+EnGrade+" 数学成绩："+MaGrade+"\n";
	}
}
public class ex02 {

	public static void main(String[] args) {

	}System.out.println("输入学生信息，按1开始输入，按0结束");
	Scanner scan=new Scanner(System.in);
	int flag=scan.nextInt();
	int Num;
	String name;
	int ChGrade;
	int EnGrade;
	int MaGrade;
	Set<Student>myTree=new TreeSet<Student>();
	while(flag>0){
		System.out.println("学号：");
		Num=scan.nextInt();
		System.out.println("姓名：");
		name=scan.next();
		System.out.println("国语成绩：");
		ChGrade=scan.nextInt();
		System.out.println("英语成绩：");
		EnGrade=scan.nextInt();
		System.out.println("数学成绩：");
		MaGrade=scan.nextInt();
		myTree.add(new Student(Num, name, ChGrade, EnGrade, MaGrade));
		System.out.println("是否继续输入学生信息，按1继续，按0结束");
		flag=scan.nextInt();
	}
	System.out.println(myTree);


}
