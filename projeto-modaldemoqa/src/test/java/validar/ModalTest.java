package validar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class ModalTest {

	Elementos el = new Elementos();

	@BeforeEach
	public void abrirNavegador() {
		Executa.abrirNavegador();
	}

	@AfterEach
	public void fecharNavegador() {
		Executa.fecharNavegador();
	}

	@Test
	public void clicarModalSmall() throws InterruptedException {
		Metodos.scroll(0);
		Metodos.clicar(el.smallModal);
		Metodos.validarTexto(el.mensagem, "This is a small modal. It has very less content");
		Metodos.tirarPrint();
		Thread.sleep(2000);
		Metodos.clicar(el.fecharSmall);

	}

	@Test
	public void clicarModalLarge() throws InterruptedException {
		Metodos.scroll(0);
		Metodos.clicar(el.largeModal);
		Metodos.validarTexto(el.mensagemLarge,
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		Metodos.tirarPrint();
		Thread.sleep(2000);
		Metodos.clicar(el.fecharLarge);

	}
}
