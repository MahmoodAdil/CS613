class FitnessEvaluator{
	
	void evaluate(Population p){
		/**
		*for every Chromosome in the population
		*evaluate the fitness of each chromosome
		**/
		for(Chromosome c :p.population){
			evaluate(c);//call an overload version of evaluate
		}
	}
	
	void evaluate(Chromosome c){
		//make up some fitness measure
		//what about count the "c"s?
		/**
		*a random double between 0.0 and1(not include 1)
		*I need a setFitness method in Chromosome
		**/
		c.setFitness(Math.random());
	}
	
	public static void main(String[] args){
		Population p = new Population();
		FitnessEvaluator f = new FitnessEvaluator();
		f.evaluate(p);
		System.out.println(p);
	}
}