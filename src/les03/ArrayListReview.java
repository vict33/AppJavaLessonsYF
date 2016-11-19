package les03;

import java.util.ArrayList;

public class ArrayListReview {
	ArrayList<String> a1;
	ArrayList<ArrayList<String>> a2;

	public ArrayListReview() {

		a1 = new ArrayList<String>();
		a1.add("qq");
		a1.add("wwee");
		a1.add("rrttyy");

		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i) + ",\tlength=" + a1.get(i).length());
		}
	}

}
