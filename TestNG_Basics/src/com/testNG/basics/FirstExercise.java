package com.testNG.basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Direct Commit from branch
public class FirstExercise {
	@Parameters({"url"})
		@Test
		public void demo(String urlglobal)
		{
			System.out.println("practice_first_method_call"+urlglobal);
		}
	}

