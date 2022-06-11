package student;

import java.util.ArrayList;

import main.Scanners;


public class StudentBuilder implements Builder {
    ArrayList<String> name;
	ArrayList<String> item;

	public StudentBuilder() {
		name=new ArrayList<String>();
		item=new ArrayList<String>();
	}
	public Information build() {
		return new Information(this);
	}

	public StudentBuilder setName() {
		System.out.println("아이들에게 중요한 사람들의 이름을 적어주세요 :)\n");
		this.name = Scanners.getStrings();
		return this;
	}

	public StudentBuilder setItem() {
		System.out.println("아이들이 관심을 가지고 있는 항목의 이름을 적어주세요 :)\n");
		this.item = Scanners.getStrings();
		return this;
	}
}
