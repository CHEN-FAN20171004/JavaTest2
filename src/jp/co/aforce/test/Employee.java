package jp.co.aforce.test;

public class Employee {

	private int num;

	private String name;

	private String sex;

	private int age;

	void setNum(int num) {
		this.num=num;
	}

	void setName(String name) {
		this.name=name;
	}

	void setSex(String sex) {
		this.sex=sex;
	}

	void setAge(int age) {
		this.age=age;
	}

	void showProfile() {
		System.out.println("番号は"+this.num+"、名前は"+this.name+"、年齢は"+this.age+"歳です");
	}
}

