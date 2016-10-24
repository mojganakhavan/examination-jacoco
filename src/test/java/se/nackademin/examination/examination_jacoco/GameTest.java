
package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GameTest {

	@Test
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
	}
	
	
	@Test
	public void  testcalculateOutPutBasedOnNames(){
		Game game = new Game();
		String firstName1 ="moj";
		String lastName1  ="akhavan";
		String firstName2 ="mojgan";
		String lastName2  ="akh";
		String firstName3 ="moj";
		String lastName3  ="akh";
		
		assertEquals("The result should be 0",game.calculateOutPutBasedOnNames(firstName1, lastName1),0);
		assertEquals("The result should be 1",game.calculateOutPutBasedOnNames(firstName2, lastName2),1);
		assertEquals("The result should be 2",game.calculateOutPutBasedOnNames(firstName3, lastName3),2);
		
	}
	
	
	@Test
	 public void testCalculateOutPutBasedOnGender() {
		 Game game = new Game();
		 
	 
		assertEquals("The result should be 0",game.calculateOutPutBasedOnGender('M'),0);
		assertEquals("The result should be 1",game.calculateOutPutBasedOnGender('F'),1);
		assertEquals("The result should be 2",game.calculateOutPutBasedOnGender('l'),2);
	 }
	
	@Test
	public void testCalculateOutPutBasedOnAge() {
		Game game = new Game();
		assertEquals("The result should be 0",game.calculateOutPutBasedOnAge(25),0);
		assertEquals("The result should be 1",game.calculateOutPutBasedOnAge(23),0);
		assertEquals("The result should be 2",game.calculateOutPutBasedOnAge(30),1);
	}
	
	@Test
	public void testCalculateOutPutBasedOnHomeCity() {
		Game game = new Game();
		assertEquals("The result should be 0",game.calculateOutPutBasedOnHomeCity("All"),0);
		assertEquals("The result should be 1",game.calculateOutPutBasedOnHomeCity("bll"),1);
		assertEquals("The result should be 2",game.calculateOutPutBasedOnHomeCity("cll"),2);
		assertEquals("The result should be 3",game.calculateOutPutBasedOnHomeCity("Dll"),3);
		assertEquals("The result should be 4",game.calculateOutPutBasedOnHomeCity("ell"),4);
		assertEquals("The result should be 5",game.calculateOutPutBasedOnHomeCity("Fll"),5);
		assertEquals("The result should be 6",game.calculateOutPutBasedOnHomeCity("gll"),6);
		assertEquals("The result should be 7",game.calculateOutPutBasedOnHomeCity("Hll"),7);
		assertEquals("The result should be 8",game.calculateOutPutBasedOnHomeCity("ill"),8);
		assertEquals("The result should be 9",game.calculateOutPutBasedOnHomeCity("jll"),9);
		assertEquals("The result should be 10",game.calculateOutPutBasedOnHomeCity("zll"),10);
		
	
	
	
	}
			
		
	@Test	
	public void testrunGame(){
			Game game= new Game();
			game.runGame("Game","Mojgan", "Akhavan",'F', 44, "Tehran"); 
	}
	
	
	@Test	
	public void testBuildFinalString(){
		Game game= new Game();
		Conversor conversor = new Conversor();
		ResultFromInputs rf = new ResultFromInputs();
	
	game.buildFinalString("Mojgan", "Akhavan", rf, conversor);
	}
	
	

	@Test
	public void testRun(){
		Game game = new Game();
		ArrayList<String> values = new ArrayList();
		values.add("Game");
		values.add("Mojgan");
		values.add("Akhavan");
		
		values.add("F");
		values.add("30");
		values.add("Tehran");
		
	game.run(values);
	}
	

}







/*package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {

	@Test
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
	}

	@Test
	public void testAgeOut(){
		ArrayList<String> values = new ArrayList<String>();
		Game game=new Game();
		values.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "62", "Fortaleza"));
		System.out.println(values);
		
		assertEquals("the result should be 62 ",game.getAgeFromInputValues(values),62);
	}
	
	
	
	@Test
	public void testCalculateOutPutGender(){
		Game game = new Game();
		
		assertEquals("The result should be 0",game.calculateOutPutBasedOnGender('M'),0);
		assertEquals("The result should be 1",game.calculateOutPutBasedOnGender('F'),1);
		assertEquals("The result should be 2",game.calculateOutPutBasedOnGender('N'),2);
		
	}
	
	
	@Test
	public void testCalculateOutPutage(){
		Game game = new Game();
		
		assertEquals("The result should be 0",game.calculateOutPutBasedOnAge(20),0);
		assertEquals("The result should be 1",game.calculateOutPutBasedOnAge(25),0);
		assertEquals("The result should be 2",game.calculateOutPutBasedOnAge(30),1);
		
	}
	
	
	
	
	
	@Test
	public void testCalculateOutputHomeCity(){
		Game game = new Game();
		assertEquals("The result should be 0",game.calculateOutPutBasedOnHomeCity("Alll"),0);
		assertEquals("The result should be 1",game.calculateOutPutBasedOnHomeCity("blll"),1);
		assertEquals("The result should be 2",game.calculateOutPutBasedOnHomeCity("clll"),2);
		assertEquals("The result should be 3",game.calculateOutPutBasedOnHomeCity("dlll"),3);
		assertEquals("The result should be 4",game.calculateOutPutBasedOnHomeCity("elll"),4);
		assertEquals("The result should be 5",game.calculateOutPutBasedOnHomeCity("flll"),5);
		assertEquals("The result should be 6",game.calculateOutPutBasedOnHomeCity("glll"),6);
		assertEquals("The result should be 7",game.calculateOutPutBasedOnHomeCity("hlll"),7);
		assertEquals("The result should be 8",game.calculateOutPutBasedOnHomeCity("illl"),8);
		assertEquals("The result should be 9",game.calculateOutPutBasedOnHomeCity("jlll"),9);
		assertEquals("The result should be 10",game.calculateOutPutBasedOnHomeCity("llll"),10);
			
		
	}
	
	
	
}*/
