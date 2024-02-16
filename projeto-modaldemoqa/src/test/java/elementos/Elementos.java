package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By smallModal = By.id("showSmallModal");
	public By mensagem = By.xpath("//div[text()='This is a small modal. It has very less content']");
	public By fecharSmall = By.id("closeSmallModal");

	public By largeModal = By.id("showLargeModal");
	public By mensagemLarge = By.xpath("//div[4]/div/div/div[2]/p");
	public By fecharLarge = By.id("closeLargeModal");

}
