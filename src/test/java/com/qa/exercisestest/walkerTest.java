package com.qa.exercisestest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.exercises.runner;

public class walkerTest {
	
        @Test
		public void testFactorial() {
			assertEquals("5!", runner.factorial(120));
			assertEquals("Not a factorial", runner.factorial(150));
		}

}
