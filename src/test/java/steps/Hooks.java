package steps;

import io.cucumber.java.Before;
import utils.DriverUtils;

public class Hooks {
	
	@Before
	public void setUp() {
		DriverUtils.abrirAplicacao();
	}

}
