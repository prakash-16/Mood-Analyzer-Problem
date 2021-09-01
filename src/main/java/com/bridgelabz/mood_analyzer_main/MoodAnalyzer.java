package com.bridgelabz.mood_analyzer_main;

public class MoodAnalyzer {

	public String analyseMood(String message) throws MoodAnalyzerException {
		try {
			String[] words = message.toLowerCase().split(" ");
			for (String word : words) {
				if (word.equals("happy")) {
					return "Happy";
				} else if (word.equals("sad")) {
					return "Sad";
				}
			}
			return "Happy";

		} catch (NullPointerException e) {
			throw new MoodAnalyzerException("Not a valid Input");
		}
	}
	

}
