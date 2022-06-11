package student;

import java.util.ArrayList;


public class Information {
    private static ArrayList<String> name;
	private ArrayList<String> item;
	
	Information(StudentBuilder builder) {
		this.name = builder.name;
		this.item= builder.item;
	}
	public static String getName(int idx) {
		return name.get(idx);
	}
	public String getItem(int idx) {
		return item.get(idx);
	}
	public static int getNameSize() {
		return name.size();
	}
	public int getItemSize() {
		return item.size();
	}

}
