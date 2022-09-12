package org.git;

public class GitInJava {
	
	private void add() {
		short year= 1998;
		byte age=24;
		int pincode=600081;
		long phno= 7871739467l;
		float salary=58563.89765f;
		double price= 25823.1356;
		String name="Manikandan prabu";
		char gender='M';
		Boolean verkadala=false;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(year);
		System.out.println(pincode);
		System.out.println(phno);
		System.out.println(salary);
		System.out.println(gender);
		System.out.println(price);
		System.out.println(verkadala);
		
		System.out.println("your Salary is:"+salary);
		System.out.println("your pincode is:"+pincode);

	}


	
	public static void main(String[] args) {
		GitInJava d= new GitInJava();
		d.add();
		

	}

}
