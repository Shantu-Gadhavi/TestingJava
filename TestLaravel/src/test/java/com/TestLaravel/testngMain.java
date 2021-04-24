package com.TestLaravel;

import java.util.ArrayList;
import java.util.List;


import org.testng.TestNG;
import org.testng.annotations.Test;


public class testngMain {
	
	
	@Test
	public void verifyTestSuiteName()
	{
		TestNG runner = new TestNG();
		List<String> suitefiles = new ArrayList<String>();
		
		runner = new TestNG();
		suitefiles = new ArrayList<String>();
		
		if(MainFrame.userAdd == true ) {
			suitefiles.add("Suites/testAddUser.xml");
		}
		
		runner.setTestSuites(suitefiles);
		runner.run();
	}
}
