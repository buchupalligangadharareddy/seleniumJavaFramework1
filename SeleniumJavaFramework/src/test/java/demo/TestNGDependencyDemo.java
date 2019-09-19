package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	@Test(dependsOnMethods={"test2"},priority=2)
public void test1(){
	System.out.println("test1");
}
@Test(priority=1)
public void test2(){
	System.out.println("test2");
}
@Test
public void test3(){
	System.out.println("test3");
}
}
