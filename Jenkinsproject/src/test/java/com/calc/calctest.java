package com.calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calctest {
	calc c = null;

	@Before
	public void setup() {
		c = new calc();
	}

	@Test
	 public void add()
	 {
		 int a = 12;
		 int b = 15;
		 int actual = (int)c.add(a,b);
		 int expected = 27;
		 Assert.assertEquals(expected, actual);

	 }

}
