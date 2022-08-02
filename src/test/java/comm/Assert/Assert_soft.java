package comm.Assert;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_soft {
	@Test
	private void soft() {
String name="roach";
String age="Roach";
SoftAssert soft=new SoftAssert();
soft.assertEquals(name,age);
System.out.println("verification");
//if we give wrong values it also run the method
		
	}

}
