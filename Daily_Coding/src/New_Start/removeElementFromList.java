package New_Start;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeElementFromList {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Arafath");
		nameList.add("Anjani");
		nameList.add("Rakesh");

		Iterator<String> list = nameList.iterator();

		while (list.hasNext()) {

			String name = list.next();
			if (name.equalsIgnoreCase("Rakesh")) {
				list.remove();
			}
		}

		System.out.println(nameList);

	}

}
