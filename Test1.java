
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NSeries(1);
	}

	public static int NSeries(int n)
	  {
	   
	   if(n<5)
	   {
		System.out.println(n);
		return NSeries(n+1);
	   }
	   else
		 System.out.println(n);
	    return n;
	  }
}
