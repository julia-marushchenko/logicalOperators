package com.uben.main;

public class LogicalOperands {
	
	public static void main(String args []) {
		
		String name1 = "cat1";
		String name2 = "cat1";
		String name3 = "cat2";
		String name4 = "cat3";
		
		if(name1 == name2){
			System.out.println("gleich");
		}
		
		if(name1 == name3) {
			System.out.print("gleich");
		} else {
			System.out.println("nein");
		}
		
		if(name1 == name2 & name1 != name3) {
			System.out.println("both passen");
		}
		
		if(name1 == name2 && name1 != name3) {
			System.out.println("both passen");
		}
		
		// not displayed because second condition does not gives result True
		if(name1 == name2 & name1 == name3) {
			System.out.println("passt nicht");
		}
		
		if(name1 == name2 && name1 == name3) {
			System.out.println("passt nur erste");
		}
		
		// passed only if one of conditions is True, but both are checked
		if(name1 == name2 | name1 == name3) {
			System.out.println("erste passt");
		}
		
		// passed only first condition, second was not even checked, because we have got True in "name1 == name2"
		if(name1 == name2 || name1 == name3) {
			System.out.println("erste passt");
		}
		
		if(name1 == name2 && name1 == name2) {
			System.out.println("both passen");
		}
	}

}
