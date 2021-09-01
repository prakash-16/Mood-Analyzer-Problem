package com.bridgelabz.mood_analyzer_main;

public class MoodAnalyzer {

	public String analyseMood(String message) {
		String[] words = message.toLowerCase().split(" ");
		for (String word : words) {
			if (word.toLowerCase().equals("happy")) {
				return "Happy";
			} else if (word.toLowerCase().equals("sad")) {
				return "Sad";
			}
		}
		return "Happy";
	}

}
