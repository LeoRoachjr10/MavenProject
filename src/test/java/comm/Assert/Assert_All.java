package comm.Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_All {
	public class Assert_soft {
		@Test
		private void soft() {
	String name="roach";
	String age="Roach";
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(name,age);
 
	System.out.println("verification");
	soft.assertAll();//if also the exception occurs we can get the syso value
}
}
}