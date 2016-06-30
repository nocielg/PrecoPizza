
import java.util.HashMap;
import java.util.Map;


public class Pizza {

	private static int contaIngredientesTodasPizzas = 0;
	
// Criando a tabela hash para armazenar os ingredientes da pizza
Map<String,Integer> listaIngrediente = new HashMap<String, Integer>();
	private int auxiliarValorElemento = 0;
	private int contaIngredienteCadaPizza = 0;
	//Consertar segundo paragrafo
//Método para adicionar ingredientes na tabela hash contabilizando a quantidade dos mesmos	
	public void adicionaIngrediente(String ingrediente){
		if (listaIngrediente.containsKey(ingrediente)){
			auxiliarValorElemento = listaIngrediente.get(ingrediente);
			auxiliarValorElemento ++;
			listaIngrediente.put(ingrediente, auxiliarValorElemento);
			contabilizaIngrediente();
			contaIngredienteCadaPizza++;
		}
		else{
			listaIngrediente.put(ingrediente, 1);
			contabilizaIngrediente();
			contaIngredienteCadaPizza++;
		}
	}
	
	//Método para contabilizar o preço da pizza
	public int getPreco(){
		
		int numeroIngredientes = 0; 
		//Iterando a tabela hash para contabilizar o número de ingredientes em cada tipo de ingrediente.
		for(Map.Entry<String, Integer> par: listaIngrediente.entrySet()){
			numeroIngredientes = numeroIngredientes + par.getValue();
		}
		
		if(numeroIngredientes<=2 && numeroIngredientes>0){
			
			return 15;
			
		}
		else if (numeroIngredientes >2 && numeroIngredientes<=5){
			
			return 20;
		}
		else if (numeroIngredientes>5){
			
			return 23;
		}
		else
			return 0;
	}
	
	//Método para contabilizar o número de ingrediente em todas as pizzas
	public static void contabilizaIngrediente(){
		contaIngredientesTodasPizzas ++;
		
	}
		
	//Método que retorna o número de ingredientes de cada pizza
	public int getIngredienteCadaPizza(){
		return contaIngredienteCadaPizza;
	}
	
}
