package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import driver.DriverFactory;

public class Executa extends DriverFactory {

	public static void abrirNavegador() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();

	}

	public static void fecharNavegador() {
		driver.quit();
	}
}
