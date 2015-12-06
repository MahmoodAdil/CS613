/**	A GA(Gentic Algorith)uses a Population, some Selection strategy,
*	some Reproducation strategy, some Replacement strategy,
*	and more
*
*****/
class GAController{
	Population population;
	FitnessEvaluator fitness;
	
	GAController{
		population = new Population();
		fitness = new FitnessEvaluator();
	}
	
	void run(){
		fitness.evaluate(population);
	}
	
	public static void main(String[] args){
		GAController control = new GaController();
		control.run();
		System.out.println(control.population);
	} 
}