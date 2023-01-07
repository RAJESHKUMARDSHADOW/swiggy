package org.abstrac;

public  class LogInEmail extends FacebookLogin{
	
	@Override
	void logInFunctionality() {
		System.out.println("It Is An Abstract Method");
	}

	
	
	
	
	
	public static void main(String[] args) {
		LogInEmail lie = new LogInEmail();
		
		lie.logInFunctionality();
		lie.login();
	}

	
}
