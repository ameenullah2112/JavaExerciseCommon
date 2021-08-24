package com.ameen.common;

import java.util.List;

public class Helper {
	public void doProcess(List<String> stringList) {
		stringList.add("Ameen");
		stringList.add("Nisha");
	}
	
	public void doProcess1(int i) {
		i = 0;
	}
	
	public void doProcess2(String s) {
		s = "IthanFinalValue";
	}
	
	public void doProcess3(double d) {
		d = 0;
	}
	
	public void doProcess4(Employee e) {
		e.setAddress("Tenkasi");
		e.setName("Mohamed");
	}
}
