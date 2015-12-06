import java.util.ArrayList;
/**
*	a class to represent a population
*
**/
class Population{
	int size = 10;//a population of size 10
	ArrayList<Chromosome> population = new ArrayList<Chromosome>();
	/**
	*No-args constructor. If called - generates
	*a randomly population of Chromosomes
	**/
	Population(){
		for(int i=0; i<size; i++){
			add(new Chromosome());
		}
	}
	
	void add(Chromosome anIndividual){
		population.add(anIndividual);
	}
	
	public String toString(){
		StringBuilder populationAsString = new StringBuilder();
		for(Chromosome c : population){
			populationAsString.append(c.toString()+"\n");
		}
		return populationAsString.toString();
	}
	
	public static void main(String[] args){
		Population p = new Population();
		System.out.println(p);
	}
}