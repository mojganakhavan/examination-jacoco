







/*
 * package se.nackademin.examination.examination_jacoco;
 *

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

import org.junit.Test;

public class DataAnalysisTest {

	Logger logger = Logger.getLogger("MyLog");

	@Test
	public void test1() { 
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	} 
	@Test
	public void testResultNamesAndAge() {  
		//Logger logger = Logger.getLogger("MyLog");
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		String case1="The first name is smaller or equals in size to the last name and the participant is 30 or younger";
		String case2="The first name is greater or equals in size to the last name and the participant older than 30";
		
		values.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "30", "Fortaleza")); // 1 && 1
		String result1Case1 = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The resault should contain"+case1, result1Case1.contains(case1));
		

		
		ArrayList<String> values3 = new ArrayList<String>();
		values3.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "31", "Fortaleza"));// 1 && 0
		String result1Case12 = dataAnalysis.getResultStringNamesAndAge(values3);
		assertTrue("The resault should contain"+case1, !result1Case12.contains(case1));
		
		ArrayList<String> values4 = new ArrayList<String>();
		values4.addAll(Arrays.asList("Game", "Rafael", "Silv", "M", "29", "Fortaleza"));  //0 && 1
		String result1Case13 = dataAnalysis.getResultStringNamesAndAge(values4);
		assertTrue("The resault should contain"+case1, !result1Case13.contains(case1));
		
		
		ArrayList<String> values5 = new ArrayList<String>();
		values5.addAll(Arrays.asList("Game", "Rafael", "Si", "M", "42", "Fortaleza")); //1 && 1
		String resultCase21 = dataAnalysis.getResultStringNamesAndAge(values5);
		logger.info("******"+resultCase21);
		assertTrue("The result should contain"+case2, 
				resultCase21.contentEquals("The first name is greater or equals in size to the last name and the participant older than 30"));
	
		
		ArrayList<String> values6 = new ArrayList<String>();
		values6.addAll(Arrays.asList("Game", "Raf", "Silv", "M", "31", "Fortaleza"));    //0 && 1
		String resultCase22 = dataAnalysis.getResultStringNamesAndAge(values6);
		assertTrue("The result sould be "+case2,!resultCase22.contains(case2));
		
		ArrayList<String> values7 = new ArrayList<String>();
		values7.addAll(Arrays.asList("Game", "Rafael", "Silv", "M", "29", "Fortaleza")); //1 && 0
		String resultCase23 = dataAnalysis.getResultStringNamesAndAge(values7);
		assertTrue("The result sould be "+case2,!resultCase23.contains(case2));
		
		ArrayList<String> values8 = new ArrayList<String>();
		values8.addAll(Arrays.asList("Game", "Raf", "Silv", "M", "29", "Fortaleza"));   //0 && 0
		String resultCase24 = dataAnalysis.getResultStringNamesAndAge(values8);
		assertTrue("The result sould be "+case2,!resultCase24.contains(case2));
		
	}
	
	@Test
	
	public void testHomeCityandGender(){
		DataAnalysis dataAnalysis = new DataAnalysis();
		
		ArrayList<String> values8 = new ArrayList<String>();
		values8.addAll(Arrays.asList("Game", "Raf", "Silv", "M", "31", "Fort"));  //1&&1
		String resultCase1 = dataAnalysis.getResulStringHomecityAndAge(values8);
		assertTrue("The result sould be 'The name of the homecity is small and the participant is 30 or older'",
				resultCase1.contains("The name of the homecity is small and the participant is 30 or older"));
		
		
		ArrayList<String> values1 = new ArrayList<String>();
		values1.addAll(Arrays.asList("Game", "Raf", "Silv", "M", "20", "Fort"));//1&&0
		String resultCase2 = dataAnalysis.getResulStringHomecityAndAge(values1);
		assertTrue("The result sould be 'The name of the homecity is small and the participant is younger than 30'",
				resultCase2.contains("The name of the homecity is small and the participant is younger than 30"));
		
		
		ArrayList<String> values2 = new ArrayList<String>();
		values2.addAll(Arrays.asList("Game", "Raf", "Silv", "M", "32", "Fortaleza"));//1&&1
		String resultCase3 = dataAnalysis.getResulStringHomecityAndAge(values2);
		assertTrue("The result sould be 'The name of the homecity is big and the participant is 30 or older'",
				resultCase3.contains("The name of the homecity is big and the participant is 30 or older"));
		
		ArrayList<String> values3 = new ArrayList<String>();
		values3.addAll(Arrays.asList("Game", "Raf", "Silv", "M", "29", "Fortaleza"));//1&&1
		String resultCase4 = dataAnalysis.getResulStringHomecityAndAge(values3);
		assertTrue("The result sould be 'The name of the homecity is big and the participant is younger than 30'",
				resultCase4.contains("The name of the homecity is big and the participant is younger than 30"));
		
		
	}
		

}*/
