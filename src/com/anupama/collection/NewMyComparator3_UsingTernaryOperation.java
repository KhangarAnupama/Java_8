package com.anupama.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NewMyComparator3_UsingTernaryOperation {


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
	//	System.out.print(arrayList);

		// Ternary Operation
		Collections.sort(arrayList, (i1,i2) -> (i2 > i1) ? 1 : (i1 > i2) ? -1 :0 );
		System.out.print(arrayList);
		List<Integer> l = arrayList.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		System.out.print(l);
	}

}
