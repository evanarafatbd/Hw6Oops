package day6HW;

public class Birds extends Fishes implements AnimalKingdom {
	
	private String name, function;
	private int weight;
	
	
	public String name(String name) {
		this.name = name;
		System.out.println("The mamals name is" + name);
		return name;
	}
	
	public String function(String function) {
		this.function = function;
		System.out.println("Tiger likes to"+ function);
		return function;
	}
		
	public int weight(int weight) {
		this.weight = weight;
		System.out.println("The tiger weighs "+ weight+ " lbs");
		return weight;

}

	
	public void mamalslWalks(String name, String function) {
		this.name = name;
		this.function = function;
		System.out.println("The "+ name+ " likes to" + function+ "fast for fun");
	}


	public void fishesSwims(String name) {
		this.name = name;
		System.out.println("The"+ name+" like to swim fast to hunt.");
		
		
	}


	public void birdsFlies(String name, String function) {
		this.name= name;
		this.function= name;
		System.out.println("The "+ name+ "likes to "+ function+ " high.");
		
	}

	@Override
	public void mamalslWalks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fishesSwims() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void birdsFlies() {
		// TODO Auto-generated method stub
		
	}
}
