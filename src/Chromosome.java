/**
*	This class models (roughly) a Chromosome
*	It "contains" Genes. It uses an array to
*	model the fact that it contains "many" genes
**/
class Chromosome{
	Gene[] genes = new Gene[10];
	double fitness;
	
	Chromosome(){
		//to generate a random Chromosome
		for(int i=0; i<genes.length; i++){
			genes[i] = new Gene();
		}
	}
	
	void setFitness(double aFitness){
		fitness = aFitness;
	}
	
	public String toString(){
		StringBuilder chromosomeAsString = new StringBuilder();
		for(Gene g : genes){
			chromosomeAsString.append(g.toString());
			//chromosomeAsString.append(fitness);
		}
		String fitString = String.format("%.2f", fitness);
		chromosomeAsString.append("\t"+fitString);
		return chromosomeAsString.toString();
	}
	
	public static void main(String[] args){
		Chromosome x = new Chromosome();
		x.setFitness(0.45);//add to toString
		System.out.println(x);
	}
}