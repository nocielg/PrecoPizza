import static org.junit.Assert.*;

import org.junit.Test;


public class TesteCarrinho {
	
	@Test
	public void testandoAdicaoSemIngrediente() {
		Pizza pizza = new Pizza();
		assertEquals(0, pizza.ingredientesdessapizza);
		CarrinhodeCompras carrinhodecompras = new CarrinhodeCompras(pizza);
		
	}
	
	@Test
	public void verificaprecoPizzas(){
		//Adicionando ingredientes na primeira pizza pedida.
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("queijo");
		pizza1.adicionaIngrediente("tomate");
		pizza1.adicionaIngrediente("azeitona");
		pizza1.getPreco();
		
		//Adicionando ingredientes na segunda pizza pedida.
		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("ovo");
		pizza2.adicionaIngrediente("presunto");
		pizza2.getPreco();
		
		assertEquals(55, Pizza.precofinalpizzas);
	}

}
