package org.abstrac;

import java.io.File;
import java.io.IOException;

public class Throws {

	public static void main(String[] args) throws InterruptedException, IOException {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			
			Thread.sleep(3000);
		}
		File f = new File("c:");
		f.createNewFile();
	}
}
