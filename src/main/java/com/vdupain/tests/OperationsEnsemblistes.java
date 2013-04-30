package com.vdupain.tests;


import java.util.List;

public interface OperationsEnsemblistes {

    List sort(List list);

    List union(List list1, List list2);

    List intersection(List list1, List list2);

    List difference(List list1, List list2);

}
