
public class MethodOverloading {
	
	static int sum;
	
	void add(int a,int b){
	
		sum=a+b;
		System.out.println(sum);
	}
	
	void add(int a,int b,int c){
		sum=a+b+c;
		System.out.println(sum);
		
	}

	void add(int a,int b,int c,int d){
	
		sum=a+b+c+d;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading method=new MethodOverloading();
		method.add(30, 50);
		method.add(30, 50,60);
	}

}
