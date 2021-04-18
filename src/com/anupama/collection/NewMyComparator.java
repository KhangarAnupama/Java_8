package com.anupama.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NewMyComparator {


	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(15);
		arrayList.add(31);
		arrayList.add(16);
		arrayList.add(41);
		arrayList.add(19);
		arrayList.add(14);
		arrayList.add(13);
		System.out.print(arrayList);

		Collections.sort(arrayList, (i1,i2) ->{
			if(i2 > i1) {
				return 1;
			}else if (i1 > i2) {
				return -1;
			}else {
				return 0;
			}
		});
		System.out.print(arrayList);
	}

}
