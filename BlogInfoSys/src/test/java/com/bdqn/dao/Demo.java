package com.bdqn.dao;

import org.junit.Test;


public class Demo {
	
	@Test
	public void Testabc() {
		 
			abcparent abc = new abcChilde();
			abc.add();
		 
	}
	
	@Test
	public void aa() {
		System.out.println("----------");
	}
	
	
}

interface abcparent{
	default void add() {
		System.out.println("defaultMethod");
	}
	 void add1();
	
}

class abcChilde implements abcparent{

	@Override
	public void add1() {
		// TODO Auto-generated method stub
		System.out.println("-----------add1");
	}
	 
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("--------add");
	}
	
}