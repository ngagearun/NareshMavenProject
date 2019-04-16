import java.util.Scanner;


public class ArrayDemo {

	int arr[]=new int[5];
	String countries[]={"India","US","Singapre","UK"};
	char ch[]={'a','r','u','n'};//character array
	String name ="arun";
	
	public void inputvalues(){
		
	arr[0]=1001;
	arr[1]=1002;
	arr[2]=1003;
	arr[3]=1004;
	arr[4]=1005;
	
	}
	
	void display(){
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDemo array=new ArrayDemo();
		array.inputvalues();
		array.display();
	}

}
