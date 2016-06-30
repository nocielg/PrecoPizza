
public class CarrinhodeCompras {
private int contaPrecoPizzas = 0;
private static int contabilizaNumeroPizzasNoCarrinho;
	//Método que adiciona pizzas no carrinho
	public void adicionaPizzaNoCarrinho(Pizza pizza){
		// Se o preco da pizza for zero, quer dizer que a mesma foi criada, mas não possui nenhum ingrediente. Sendo assim, não pode ser adicionada no carrinho.
		if (pizza.getPreco() == 0){
			System.err.println("A sua pizza está sem ingrediente. Adicione ingredientes para poder adicioná- la ao carrinho.");
		}
		// Caso contrário, a pizza pode ser adicionada no carrinho. Sendo assim, a variável que contabiliza o número de pizzas no carrinho é incrementada juntamente
		// com a variável que contabiliza o número total de pizzas acrescentadas no carrinho.
		else{
			contaPrecoPizzas = contaPrecoPizzas + pizza.getPreco();
			contabilizaNumeroPizzasNoCarrinho++;
		}
	}
	// Método que retorna o valor total das pizzas adicionadas no carrinho.
	public int retornaValorTotalPrecoPizzasCarrinho(){
		return contaPrecoPizzas;
	}
	
	public int retornaNumeroPizzasCarrinho(){
		return contabilizaNumeroPizzasNoCarrinho;
	}

	
}
