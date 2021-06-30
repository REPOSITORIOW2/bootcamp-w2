package LaChiqui;


public class FogosIndividual implements Fogos{

	private String barulho;
	
	public FogosIndividual(String barulho) {
		// TODO Auto-generated constructor stub
		this.barulho = barulho;
	}
	
	@Override
	public void explode() {
		System.out.println(this.barulho);
		
	}
	
	
}
