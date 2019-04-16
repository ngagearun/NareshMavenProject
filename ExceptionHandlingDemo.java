import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExceptionHandlingDemo {
	
	int a=10,b=40,div;
	void div() throws InterruptedException, FileNotFoundException{
		try{
		div=b/a;		
		}
		catch(ArithmeticException e){
			  // System.out.println(e.getMessage());	
			   e.printStackTrace();
			}
		finally{
			System.out.println("I am in finally block");
		}
}
	
	
	
	void display(){
		System.out.println("I am in display method");
	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		
		ExceptionHandlingDemo e1=new ExceptionHandlingDemo();
		e1.div();
		e1.display();

	}

}
