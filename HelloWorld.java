
/*Writing a programm for Helloworld */

 class HelloWorld {
	 
	 int d=100;  //instance variable
	 static int e=200;//static variable
	 
	 void display(){
		 int g=200;//local variable
		System.out.println(d); 
		System.out.println(e);
	 }
	 
	 static void show(){
		 HelloWorld hello=new HelloWorld(); 
		hello.display();
		System.out.println(HelloWorld.e);
		
	 }
	 
	 HelloWorld(){
		 System.out.println("I am in Hellworld Constructr method");
	 }
	 
	 
	public static void main(String[] args){
		
		int accno = 100;
		 String name="Hello World Welcome Java";//initalis
		 float pi=3.14f;
		 char ch='a'; 
		 HelloWorld.show();
	  System.out.println(accno);
	  System.out.println(name);
	  System.out.println(pi);
	  System.out.println(ch);
	  System.out.println(e);
	 
	  HelloWorld hello=new HelloWorld();
	  System.out.println(hello.d);
	 }
	
	
	

}
