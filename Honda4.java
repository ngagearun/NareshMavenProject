
 abstract class Bike {
	
	abstract void run();
	String modelnumber;
	Bike(String modelnumber){
		
		this.modelnumber=modelnumber;
		
	}
	static void di(){
		
	}
	
	public String returnmodelnumber(){
		return modelnumber;
	}

}

class Honda4 extends Bike{
	
	
	Honda4(String modelnumber) {
		super(modelnumber);
		di();
		
	}

	@Override
	void run() {
       System.out.println("60km/hr");		
	}
	
	public static void main(String[] args){
		
		Honda4 honda=new Honda4("Hpnda4 2017");
		Bike b=new Honda4("modelnumber");
		String data=honda.returnmodelnumber();
		System.out.println(data);
		honda.run();
		
	}

	
	
	
}
