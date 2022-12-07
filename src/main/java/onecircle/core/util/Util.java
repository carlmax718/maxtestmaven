package onecircle.core.util;

import java.util.*;

/**
 * 
 * This is Utility Class for generic methods & functions
 *
 */
public class Util {

	/**
	 * Constructor
	 */
	Util() {
	}

	/**
	 * This method returns HashMap for a given JSON string object
	 * 
	 * @param json
	 * @return
	 */
	public static HashMap<String, String> getMapFromJsonString(String json) {

		HashMap<String, String> resMap = new HashMap<>();
		if (json != null && !json.isEmpty()) {
			String[] jsonArray = json.replace("{", "").replace("}", "").split(",");

			for (String s : jsonArray) {
				String[] strElems = s.split(":");
				if (strElems.length == 2) {
					resMap.put(strElems[0].substring(1, strElems[0].length() - 1), strElems[1]);
				}
			}
		}

		return resMap;
	}

	/**
	 * This method formats String to Numerical format for Integer and Big Integer
	 * parsing
	 * 
	 * @param str
	 * @return String
	 */
	public static String formatStringToNumber(String str) {
		if (str != null && str.contains(".")) {
			int endIndex = str.indexOf('.', 0);
			return str.substring(0, endIndex);
		} else {
			return str;
		}
	}

	/***
	 * This method checks if given string is Uppercase
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isStringUppercase(String input) {
		char currentCharacter;
		boolean upperCasePresent = false;

		for (int i = 0; i < input.length(); i++) {
			currentCharacter = input.charAt(i);
			if (Character.isUpperCase(currentCharacter)) {
				upperCasePresent = true;
			} else {
				return false;
			}
		}

		return upperCasePresent;
	}

	/**
	 * This method validates is a ticker is valid ticker or not
	 * @param input
	 * @return
	 */
	public static boolean isValidTicker(String input) {
	//	char currentCharacter;
	//	boolean upperCasePresent = false;
	//	int dotCount = 0;

		if(!input.equals(input.toUpperCase())) {
			return false;
		}
		
		else if(input.indexOf(".") != input.lastIndexOf(".")) {
			return false;
		}
		
		return true;
	}	
	/*	for (int i = 0; i < input.length(); i++) {
			currentCharacter = input.charAt(i);
			if (Character.isUpperCase(currentCharacter)) {
				upperCasePresent = true;
			} else if (currentCharacter == '.' && dotCount <= 1) {
				upperCasePresent = true;
				dotCount++;
			} else {
				return false;
			}
		}

		return upperCasePresent;
		
	}*/

}
