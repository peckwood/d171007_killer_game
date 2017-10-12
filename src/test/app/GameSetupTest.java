package test.app;

import org.junit.Test;

import main.app.GameSetup;

public class GameSetupTest {
	@Test
	public void testSetup(){
		GameSetup setup = new GameSetup();
		setup.setup("10 2 3 2 2");
		System.out.println(setup);
		
		
	}
}
