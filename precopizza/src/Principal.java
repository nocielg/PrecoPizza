import java.util.HashMap;
import java.util.Map;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//Criando as pizzas
	Pizza pizza1 = new Pizza();
	pizza1.adicionaIngrediente("azeitona");
	pizza1.adicionaIngrediente("tomate");
	pizza1.adicionaIngrediente("queijo");
	
	Pizza pizza2 = new Pizza();
	pizza2.adicionaIngrediente("presunto");
	pizza2.adicionaIngrediente("chocolate");
	
	Pizza pizza3 = new Pizza();
	pizza3.adicionaIngrediente("requeijao");
	
	
		
	//Adicionando as pizzas no carrinho de compra
	CarrinhodeCompras carrinho = new CarrinhodeCompras();
	carrinho.adicionaPizzaNoCarrinho(pizza1);
	carrinho.adicionaPizzaNoCarrinho(pizza2);
	carrinho.adicionaPizzaNoCarrinho(pizza3);
			
	//Imprimindo o número de pizzas no carrinho e o valor total das mesmas
	System.out.printf("O preço total das pizzas no carrinho é %d",carrinho.retornaValorTotalPrecoPizzasCarrinho());
	System.out.printf("O numero de pizzas no carrinho é %d", carrinho.retornaNumeroPizzasCarrinho());
	
	
	//Imrimindo a quantidade de ingredientes utilizada para cada pizza.
	System.out.printf("Na pizza 1 foram utilizados %d", pizza1.getIngredienteCadaPizza());
	System.out.printf("Na pizza 2 foram utilizados %d", pizza2.getIngredienteCadaPizza());
	System.out.printf("Na pizza 3 foram utilizados %d", pizza3.getIngredienteCadaPizza());
	System.out.println("O total de ingredientes utilizados nas pizzas foi de:" + Pizza.contaIngredientesTodasPizzas);
	for (Map.Entry<String, Integer> entry : Pizza.listaIngrediente.entrySet()){
		System.out.println("Ingrediente:" + entry.getKey());
		System.out.println("Quantidade" + entry.getValue());
	}
	
	}
}
	

