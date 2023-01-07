package org.abstrac;

public class TryCatchFinally {
	public static void main(String[] args) throws AgeInvaliException {
		
		int age = 12;
		
		if (age >= 18) {
			System.out.println("Eli vote ");
		} else {
			
			throw new AgeInvaliException();

		}
		
	}
	
}
