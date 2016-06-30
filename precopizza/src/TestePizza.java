import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestePizza {

	
	Pizza pizza = new Pizza();	
		
	@BeforeClass
	public static void inicializandoTestes(){
		//Pizza.zeraRegistro();
	}
		
	@Test
	public void verificandovalorPizza() {
		pizza.adicionaIngrediente("queijo");
		pizza.adicionaIngrediente("tomate");
		pizza.adicionaIngrediente("ovo");
		assertEquals(20, pizza.getPreco());
		
	}
	
	@Test
	public void verificaItensAdicionados(){
		assertEquals (3, pizza.contaIngredientes);
	}
}
