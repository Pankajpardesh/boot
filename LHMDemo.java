package com.nt.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.lang.model.type.ArrayType;

public class LHMDemo implements Comparable {

	public static void main(String[] args) {
		int[] a= {1,2,3,3,5,4,2,6,2,3};
		SortedSet sh=new TreeSet();
		for (int i = 0; i < a.length; i++) {
			sh.add(a[i]);
		}
		 		System.out.println(sh);
		System.out.println(sh.first());
		System.out.println(sh.last());
		int z=(int) sh.first();
		int y=(int) sh.last();
		System.out.println("Addition"+(z+y));
		
		System.out.println(sh.headSet(4));
		System.out.println(sh.tailSet(4));
		System.out.println(sh.contains(2));
		System.out.println(sh.subSet(2, 5));
		
		
}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}