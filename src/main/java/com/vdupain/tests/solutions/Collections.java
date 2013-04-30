package com.vdupain.tests.solutions;


import com.vdupain.tests.OperationsEnsemblistes;

import java.util.ArrayList;
import java.util.List;

public class Collections implements OperationsEnsemblistes {
    public List sort(List list) {
        List sort = new ArrayList(list);
        java.util.Collections.sort(sort);
        return sort;
    }

    public List union(List list1, List list2) {
        List union = new ArrayList(list1);
        union.addAll(list2);
        return union;
    }

    public List intersection(List list1, List list2) {
        List intersection = new ArrayList(list1);
        intersection.retainAll(list2);
        return intersection;
    }

    public List difference(List list1, List list2) {
        List difference = union(list1, list2);
        difference.removeAll(intersection(list1, list2));
        return difference;
    }
}
