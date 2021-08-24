package com.ameen.common;

import java.util.ArrayList;
import java.util.List;

public class HelperMain {
	public static void main(String[] args) {
		Helper helper = new Helper();
		List<String> strList = new ArrayList<>();
		helper.doProcess(strList);
		System.out.println(strList);
		
		int i = 30;
		helper.doProcess1(i);
		System.out.println(i);
		
		Employee e = new Employee();
		e.setId(123);
		e.setName("Nisha");
		e.setAddress("Chennai");
		helper.doProcess4(e);
		System.out.println(e);
	}
}
