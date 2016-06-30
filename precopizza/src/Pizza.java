import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Pizza {
/*	
// Variável estática responsável por armazenar o número total de ingredientes usados para todas as pizzas
public static int contaIngredientes = 0;
// Lista responsável por armazenar o número de ingredientes
List<String> listaIngredientes = new ArrayList<String>();
// Total de ingredientes usados para essa pizza


public int ingredientesdessapizza;

// Calculando preço final de todas as pizzas


*/
	
//public int tomate;
//public int chocolate;
//public int queijo;
//public int ovo;
//public int presunto;
//public int azeitona;
//public int valor = 0;
//public static int precofinalpizzas = 0;
public static int contaIngredientes = 0;	

// Criando a tabela hash para armazenar os ingredientes da pizza
Map<String,Integer> listaIngrediente = new HashMap<String, Integer>();
	private int auxiliarValorElemento = 0;
	
//Método para adicionar ingredientes na tabela hash contabilizando a quantidade dos mesmos	
	public void adicionaIngrediente(String ingrediente){
		if (listaIngrediente.containsKey(ingrediente)){
			auxiliarValorElemento = listaIngrediente.get(ingrediente);
			auxiliarValorElemento ++;
			listaIngrediente.put(ingrediente, auxiliarValorElemento);
			contabilizaIngrediente();
		}
		else{
			listaIngrediente.put(ingrediente, 1);
			contabilizaIngrediente();
		}
	}
		//contabilizaIngrediente();
		/*if (ingrediente == "chocolate"){
			chocolate++;
			listaIngrediente.put("chocolate", chocolate);
		}
		else if(ingrediente == "queijo"){
			queijo++;
			listaIngrediente.put("queijo", queijo++);
		}
		else if(ingrediente == "tomate"){
			tomate++;
			listaIngrediente.put("tomate", tomate++);
		}
		else if(ingrediente == "ovo"){
			ovo++;
			listaIngrediente.put("ovo", ovo++);
		}
		else if(ingrediente == "presunto"){
			presunto++;
			listaIngrediente.put("presunto", presunto++);
		}
		else{
			azeitona++;
			listaIngrediente.put("azeitona", azeitona);
		}
	}
	
	
	
	
	
	public static void zeraRegistro(){
		contaIngredientes = 0;
	}*/

	//Método para contabilizar o preço da pizza
	public int getPreco(){
		
		int numeroIngredientes = 0; 
		//Iterando a tabela hash para contabilizar o número de ingredientes em cada tipo de ingrediente.
		for(Map.Entry<String, Integer> par: listaIngrediente.entrySet()){
			numeroIngredientes = numeroIngredientes + par.getValue();
		}
		
		if(numeroIngredientes<=2){
			
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
	public static int contabilizaIngrediente(){
		contaIngredientes ++;
		return contaIngredientes;
	}
	
}
