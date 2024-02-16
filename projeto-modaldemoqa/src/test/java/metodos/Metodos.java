package metodos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driver.DriverFactory;

public class Metodos extends DriverFactory {

	public static void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public static void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public static void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));

	}

	public static void tirarPrint() {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(srcFile, new File("./nomeEvidencia.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void scroll(int tempo) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,200)", "");

	}
}