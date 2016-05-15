
public class CarrinhodeCompras {

// Variável estática responsável por armazenar o número total de ingredientes usados
public static int contaPizza = 0;
public int precoaserpago;

	public CarrinhodeCompras(Pizza pizza){
		if (pizza.ingredientesdessapizza == 0){
			
			System.err.println("Uma das suas pizzas está sem ingrediente. Adicione ingredientes na sua pizza");
		}
	}

	public void adicionaPizza(){
		contaPizza++;
		precoaserpago = Pizza.precofinalpizzas;
		
	}
	
	//criando um objeto da classe pizza
	Pizza pizza = new Pizza();
	
	
	
}
