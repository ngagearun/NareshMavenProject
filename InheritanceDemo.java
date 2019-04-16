public class InheritanceDemo {

	public static void main(String[] args) {
		//interfacename objname=new chilclassname();
		
		Bank b=new SBIBank();
		System.out.println(b.getrateofinterest());
		Bank b1=new HDFCBank();
		System.out.println(b1.getrateofinterest());
	}

}
