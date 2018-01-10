package org.miig.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
  @Test
  @Parameters("test1")
  public void f(String test1) {
	  System.out.println("The param is " + test1);
  }
}
