package tests;

import org.testng.annotations.Test;

import pages.RegisterPage;
import tests.models.ModelsProcess;
import tests.models.Register;

public class RegisterTest extends TestCase {
	/*
	 * Test Steps
	 * 1. Open website
	 * 2. Click on Register
	 * 3. Input all valid data
	 * 4. Click register
	 * 5. Register successfully
	 */
	@Test
	public void registerSuccessfully() {
		ModelsProcess modelsProcess= new ModelsProcess();
		String testData = "RegisterData.csv";
		Register register= modelsProcess.convertRegisterFromCsv(testData);
		
		//Go to register page directory
		RegisterPage registerPage= new RegisterPage(testBase.driver);
		testBase.driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm");
		registerPage.inputData(register);
		
	}

}
