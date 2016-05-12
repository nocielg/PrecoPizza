
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza pizza = new Pizza();
		CarrinhodeCompras carrinho = new CarrinhodeCompras(pizza);
		
		//Pizza1
		Pizza pizza1 = new Pizza();
		carrinho.adicionaPizza();
		pizza1.adicionaIngrediente("chocolate");
		pizza1.adicionaIngrediente("tomate");
		pizza1.adicionaIngrediente("tomate");
		pizza1.adicionaIngrediente("tomate");
		pizza1.adicionaIngrediente("tomate");
		pizza1.adicionaIngrediente("tomate");
		
		//
		
		Pizza pizza2 = new Pizza();
		carrinho.adicionaPizza();
		//pizza2.adicionaIngrediente("queijo");
		
		//Pizza3
		Pizza pizza3 = new Pizza();
		carrinho.adicionaPizza();
		pizza3.adicionaIngrediente("ovo");
		pizza3.adicionaIngrediente("ovo");
		pizza3.adicionaIngrediente("ovo");
		pizza3.adicionaIngrediente("presunto");
		pizza3.adicionaIngrediente("azeitona");
		
		System.out.println(" O total de pizzas adicionadas no carrinho é "+ carrinho.contaPizza);
		System.out.println("A pizza 1 foi feita com "+ pizza1.tomate +" tomates");
		System.out.println("A pizza 2 foi feita com "+ pizza2.queijo +" queijos");
		System.out.println("A pizza 3 foi feita com "+ pizza3.ovo +" ovos");
		System.out.println("A pizza 3 foi feita com "+ pizza3.presunto +" presuntos");
		System.out.println("A pizza 3 foi feita com "+ pizza3.azeitona +" azeitonas");
		
			}

}
