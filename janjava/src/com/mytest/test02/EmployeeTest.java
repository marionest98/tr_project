package com.mytest.test02;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] emps = {new Employee("A1892", "이진선", "AI개발부", "사원", 3500), 
						   new Employee("B8077", "심용권", "Web개발부", "부장", 7000),
						   new Employee("F5691", "신지영", "총괄개발부", "전무", 9000)};
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int count = 0;
		
		for(Employee e : emps) {
			if(e.getNo().equals(input)) {
				System.out.println(e);
				count++;
			}
		}
		if(count == 0) {
			System.out.println("해당사원이 없습니다.");
		}

	}

}
