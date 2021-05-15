
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NSeries(1);

	}

	public static int NSeries(int n)
	  {
		System.out.println(n);
	   if(n==5)
	   {	
		return n;
	   }
	   else {
	    return NSeries(++n);
	   }
	   
	  }
}
