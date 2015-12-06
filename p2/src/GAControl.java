class GAControl{
	//declaring the selector and reproducer to by of type interface
	//i.e interface Selection (as type) and interface Reproduction (as type)
	Selection selector;//basically Strategy Pattern is HERE!
	Reproduction reproducer;//Strategy Pattern is HERE!
	//start() method
	void start(){
		Population population = new Population();
		
		int generations = 2;
		double mutationRate=0.1;
		for(int i=0; i<generations; i++){
			Individual parent1 = selector.selectParent(population);
			Individual parent2 = selector.selectParent(population);
			
			//Individual child1 = reproducer.crossover(parent1, parent2);
			//Individual child2 = reproducer.crossover(parent1, parent2);
			
			//mutator.mutate(child1, mutationRate);
			//mutator.mutate(child2, mutationRate);
			
			//replacer.tryReplace(child1, population);
			//replacer.tryReplace(child2, population);
		}		
	}
	/**
	*These methods allow any implementor of the Selection interface
	*to be passed in ,or, any implementor of the Reproduction interface
	*and then set the selector or reproducer to refer to an object of 
	*the type passed in.
	**/
	/**
	*The type defined is an interface but through polymorhism, any
	*concrete implementing class will be accepted
	**/
	
	void setSelection(Selection aSelectionStragegy){//and Strategy Pattern is HERE!
		selector = aSelectionStragegy;
	}
	
	void setReproduction(Reproduction aReproductionStragegy){
		reproducer = aReproductionStragegy;
	}
	
	public static void main(String[] args){
		GAControl controller = new GAControl();
		controller.setSelection(new SelectionFrench());
		controller.start();
		controller.setSelection(new SelectionIrish());
		controller.start();
	}
}