package com.qa.util;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtil {

	public static String getName() {
		String generateRandom = RandomStringUtils.randomAlphabetic(2);
		return ("name" + generateRandom);
	}
	
	public static String  getSalary() {
		String generateRandom = RandomStringUtils.randomNumeric(5);
		return (generateRandom);
	}
	
	public static String  getage() {
		String generateRandom = RandomStringUtils.randomNumeric(2);
		return (generateRandom);
	}
	
	
	
}
