
import java.util.HashMap;
import java.util.Map;


public class Pizza {

	public static int contaIngredientesTodasPizzas = 0;
	
	// Criando a tabela hash para armazenar os ingredientes da pizza
	static Map<String,Integer> listaIngrediente = new HashMap<String, Integer>();
	private static int auxiliarValorElemento = 0;
	private int contaIngredienteCadaPizza = 0;
	
	//Método para adicionar ingredientes na tabela hash contabilizando a quantidade dos mesmos	
	public void adicionaIngrediente(String ingrediente){
		contabilizaIngrediente(ingrediente);
		contaIngredientesTodasPizzas++;
		contaIngredienteCadaPizza++;
	}
	
	//Método para contabilizar o número de ingrediente para todas as pizzas
	public static void contabilizaIngrediente(String ingrediente){
			
		if (listaIngrediente.containsKey(ingrediente)){
			auxiliarValorElemento = listaIngrediente.get(ingrediente);
			auxiliarValorElemento++;
			listaIngrediente.put(ingrediente, auxiliarValorElemento);
			
		}
		else{
			listaIngrediente.put(ingrediente, 1);
				
		}
			
	}
			
	//Método que retorna o número de ingredientes de cada pizza
	public int getIngredienteCadaPizza(){
		return contaIngredienteCadaPizza;
	}
	
	//Método para contabilizar o preço da pizza
	public int getPreco(){
		
	if(contaIngredienteCadaPizza<=2 && contaIngredienteCadaPizza>0){
			
		return 15;
			
	}
	else if (contaIngredienteCadaPizza >2 && contaIngredienteCadaPizza<=5){
			
		return 20;
	}
	else if (contaIngredienteCadaPizza>5){
			
		return 23;
	}
	else
		return 0;
	}
	
	
}
