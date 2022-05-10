package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest3 {

	public static void main(String[] args) {

		//練習問題1
		ArrayList<String> tanaka = new ArrayList<String>();
		tanaka.add("1");
		tanaka.add("田中太郎");
		tanaka.add("男性");
		tanaka.add("27");

		//練習問題2
		System.out.println(tanaka.get(1));


		//練習問題4
		Employee employee1 = new Employee();
		employee1.setNum(1);
		employee1.setName("田中太郎");
		employee1.setAge(27);
		employee1.showProfile();

		Employee employee2 = new Employee();
		employee2.setNum(2);
		employee2.setName("佐藤花子");
		employee2.setAge(22);
		employee2.showProfile();

		Employee employee3 = new Employee();
		employee3.setNum(3);
		employee3.setName("鈴木次郎");
		employee3.setAge(31);
		employee3.showProfile();

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		employees.add(new Employee());
		employees.add(new Employee());

		//練習問題5
		ArrayList<String> scores = new ArrayList<String>();
		scores.add("国語：90");
		scores.add("数学：80");
		scores.add("英語：65");
		for(String score:scores) {
			System.out.println(score);
		}

		//練習問題6
		//この問題は単純な修理で、追加や削除処理が必要ないので、ArrayListを選んだ。

	}

}
