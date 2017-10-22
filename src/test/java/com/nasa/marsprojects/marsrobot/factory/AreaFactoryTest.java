package com.nasa.marsprojects.marsrobot.factory;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class AreaFactoryTest {
	
	private AreaFactory areaFactory;
	
	@Before
	public void setUp() {
		areaFactory = new AreaFactory();
		areaFactory.setMaxXCoordinate(5);
		areaFactory.setMaxYCoordinate(5);
		areaFactory.setMinXCoordinate(0);
		areaFactory.setMinYCoordinate(0);
	}
	
	@Test
	public void shouldCreateArea() {
		assertNotNull(areaFactory.create());
	}
}
