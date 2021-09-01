package com.bridgelabz.mood_analyzer_test;

import java.util.*;
import static org.junit.Assert.*;
import com.bridgelabz.mood_analyzer_main.*;
import org.junit.Test;

public class MoodAnalyzerRunner {

	@Test
	public void ifMood_happy_return_happy_ifMood_sad_return_sad_else_return_happy() {
		MoodAnalyzer obj = new MoodAnalyzer("I am in sad Mood");
		assertEquals("Sad", obj.MoodAnalyzer());	
	}
	
	@Test
	public void ifMood_any_return_happy_ifMood_sad_return_sad_else_return_happy() {
		MoodAnalyzer obj = new MoodAnalyzer("I am in happy Mood");
		assertEquals("Happy", obj.MoodAnalyzer());	
	}

}
