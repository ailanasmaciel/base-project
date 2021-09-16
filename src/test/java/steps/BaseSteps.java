package steps;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import utils.DriverUtils;

public class BaseSteps {

	@Dado("que eu acesse o Sign In")
	public void queEuAcesseOSignIn() {
		DriverUtils.getDriver().findElement(By.cssSelector(".login")).click();
	}




}
