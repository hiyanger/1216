package com.csv.department;

public class DepartmentFactory {
	public AbstractDepartment createDepatment(String code) {
		if (code.equals("1")) {
			return new jinjibu();
		} else if (code.equals("2")) {
			return new jinjibu();
		} else if (code.equals("3")) {
			return new jinjibu();
		} else {
			throw new RuntimeException();
			
		}
	}

}
