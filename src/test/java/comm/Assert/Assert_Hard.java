package comm.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Hard {
	
	
	@Test 
	private void Hard() {

	String id ="leo";
	String pass="Leo";

	Assert.assertEquals(id, pass);
	System.out.println("validation");
	//if we gave wrong  values this AssertionError exception will throws
	}

}
