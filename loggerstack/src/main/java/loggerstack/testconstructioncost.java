package loggerstack;

import static org.junit.Assert.*;

import org.junit.Test;

public class testconstructioncost {

	@Test
	public void test() {
		construction C=new construction();

		assertEquals(100000.0,C.Cost("HighStandardMaterialsAndFullAutomatedHome", 4),0);
	}

}
