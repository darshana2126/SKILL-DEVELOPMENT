package exe;

public class both {

	public static void main(String[] args) {

	try {
		int a[]= {10,20,30};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(10/2);
		
	} catch (ArithmeticException e) {
		System.out.println("sdgvx"+e);
		
	}
	catch (ArrayIndexOutOfBoundsException e1) {
		System.out.println("sdgvx"+e1);
		
	}
	System.out.println("vsvfb");
	}
	}