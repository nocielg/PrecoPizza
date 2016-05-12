import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Pizza {

// Variável estática responsável por armazenar o número total de ingredientes usados para todas as pizzas
public static int contaIngredientes = 0;
// Lista responsável por armazenar o número de ingredientes
List<String> listaIngredientes = new ArrayList<String>();
// Total de ingredientes usados para essa pizza

public int tomate;
public int chocolate;
public int queijo;
public int ovo;
public int presunto;
public int azeitona;
public int ingredientesdessapizza;


	public void adicionaIngrediente(String ingrediente){
		listaIngredientes.add(ingrediente);
		
		contabilizaIngrediente();
		if (ingrediente == "chocolate"){
			chocolate++;
			ingredientesdessapizza++;
		}
		else if(ingrediente == "queijo"){
			queijo++;
			ingredientesdessapizza++;
		}
		else if(ingrediente == "tomate"){
			tomate++;
			ingredientesdessapizza++;
		}
		else if(ingrediente == "ovo"){
			ovo++;
			ingredientesdessapizza++;
		}
		else if(ingrediente == "presunto"){
			presunto++;
			ingredientesdessapizza++;
		}
		else{
			azeitona++;
			ingredientesdessapizza++;
		}
	}
	
	public int getPreco(){
		int tamanhoLista = listaIngredientes.size();
		if(tamanhoLista<=2){
			return 15;
		}
		else if (tamanhoLista >2 && tamanhoLista<=5){
			return 20;
		}
		else
			return 23;
	}
	
	public static void contabilizaIngrediente(){
		contaIngredientes += 1;
	}
	
}
