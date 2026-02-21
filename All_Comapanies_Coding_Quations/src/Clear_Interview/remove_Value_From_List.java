package Clear_Interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class remove_Value_From_List {

	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>();
		nameList.add("Arafath");
		nameList.add("Anjani");
		nameList.add("Rakesh");

		String modifiedValue = "Rakesh";

		Iterator<String> list = nameList.iterator();

		while (list.hasNext()) {
			String str = list.next();
			if (str.equalsIgnoreCase(modifiedValue)) {
				list.remove();

			}
		}

		System.out.println(nameList);

	}

}
