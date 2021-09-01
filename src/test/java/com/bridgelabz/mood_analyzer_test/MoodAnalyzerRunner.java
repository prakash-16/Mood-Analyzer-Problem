package com.bridgelabz.mood_analyzer_test;

import java.util.*;
import static org.junit.Assert.*;
import com.bridgelabz.mood_analyzer_main.*;
import org.junit.Test;

public class MoodAnalyzerRunner {

	
	@Test
	public void exception_if_user_provides_invalid_mood() {
		MoodAnalyzer obj = new MoodAnalyzer();
		String result = obj.analyseMood(null);
		assertEquals("Not a valid Input", result);	
	}
	
	@Test
	public void exception_if_user_provides_invalid_mood() {
		MoodAnalyzer obj = new MoodAnalyzer();
		String result = obj.analyseMood("");
		assertEquals("Not a valid Input", result);	
	}

}
