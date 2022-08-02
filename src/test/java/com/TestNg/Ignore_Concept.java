package com.TestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
@Test
	private void spotify() {
	System.out.println("spotify");

	}
@Test
private void wynk() {
System.out.println("wynk");
}
@Test
private void ganna() {
System.out.println("ganna");
}

@Ignore
private void music() {
	System.out.println("music");

}
@Ignore
private void mxplayer() {
System.out.println("mx");
}
}
