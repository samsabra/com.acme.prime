package com.acme.prime.eval.provider;

import junit.framework.TestCase;

/*
 * 
 * 
 * 
 */

public class EvalImplTest extends TestCase {
	
	/*
	 * 
	 * 
	 * 
	 */
	
	public void testSimpleAddition() throws Exception {
		EvalImpl t = new EvalImpl();
		assertEquals( 3.0,  t.eval("1 + 2"));
	}	
	public void testSimpleSubstraction() throws Exception {
		EvalImpl t = new EvalImpl();
		assertEquals( 3.0,  t.eval("7 - 4"));
	}
}
