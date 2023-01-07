package org.abstrac;

public class JeyaramBatch11 {
	public static void main(String[] args) throws MinorException {
		
	int jeyaram = 26;
	
	if (jeyaram <= 18) {
		System.out.println("not minor");
	}
	else {
		throw new MinorException();
	}
	}

}
