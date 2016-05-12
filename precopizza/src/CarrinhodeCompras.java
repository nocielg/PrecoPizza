
public class CarrinhodeCompras {

// Variável estática responsável por armazenar o número total de ingredientes usados
public static int contaPizza = 0;

	public CarrinhodeCompras(Pizza pizza){
		if (pizza.ingredientesdessapizza == 0){
			
			System.err.println("Uma das suas pizzas está sem ingrediente. Adicione ingredientes na sua pizza");
		}
	}

	public void adicionaPizza(){
		contaPizza++;
	}
	
	//criando um objeto da classe pizza
	Pizza pizza = new Pizza();
	
}
