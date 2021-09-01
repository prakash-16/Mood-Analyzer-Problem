package com.bridgelabz.mood_analyzer_main;

public class MoodAnalyzer {

	public String message;

	public String MoodAnalyzer() {
		String result = analyseMood();
		if (result.equals("Happy")) {
			return "Happy";
		}
		return "Sad";
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
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
