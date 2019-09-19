package demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParamatersDemo {
	@Parameters({"Name"})
	@Test
public void test5(String Name){
	System.out.println(" name is:"+Name);
}
}
