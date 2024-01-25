package com.Generic_Utility;

import java.util.Date;
import java.util.Random;

public class Java_Utility {

	public static int getRandomNumber() {
		Random ran = new Random();
		return ran.nextInt(10000);
	}

	public static String getName() {
		return new Date().toString().replace(" ", "_").replace(":", "_");
	}
}

