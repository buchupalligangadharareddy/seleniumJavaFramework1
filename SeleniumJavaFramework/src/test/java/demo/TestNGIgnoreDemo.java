package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class TestNGIgnoreDemo {
	
	@Test
public static void testA(){
	System.out.println("in testA");
	
}
@Test
public static void testB(){
	System.out.println("in testB");
	
}
}
