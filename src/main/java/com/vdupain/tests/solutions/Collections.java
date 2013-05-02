package com.vdupain.tests.solutions;

import com.vdupain.tests.OperationsEnsemblistes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections implements OperationsEnsemblistes {

	@Override
	public List sort(List list) {
		List sort = new ArrayList(list);
		java.util.Collections.sort(sort);
		return sort;
	}

	@Override
	public List union(List list1, List list2) {
		List union = new ArrayList(list1);
		union.addAll(list2);
		return union;
	}

	@Override
	public List intersection(List list1, List list2) {
		List intersection = new ArrayList(list1);
		intersection.retainAll(list2);
		return intersection;
	}

	@Override
	public List difference(List list1, List list2) {
		List difference = union(list1, list2);
		difference.removeAll(intersection(list1, list2));
		return difference;
	}

	@Override
	public String join(List list1, char sep) {
		Iterator<Object> it = list1.iterator();
		StringBuilder sb = new StringBuilder();
		while (it.hasNext()) {
			sb.append(it.next());
			if (it.hasNext()) {
				sb.append(sep);
			}
		}
		return sb.toString();
	}

}
