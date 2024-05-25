package com.kmss;

import java.sql.Date;
import java.util.function.Supplier;

public class SupplierDemo_1 {

	public static void main(String[] args) {
		Supplier<String> s = () -> "This is a randome value";
		String random = s.get();
		System.out.println(random);
	}
}
