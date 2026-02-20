package calc;

public class calc {
	void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
		void sub(int a, int b) {
		int d=a-b;
		
		System.out.println(d);
	}
		void div(int a, int b) {
			int e=a/b;
			
			System.out.println(e);
		}

		void mul(int a, int b) {
			int f=a*b;
			
			System.out.println(f);
		}


	public static void main(String[] args) {
		calc ad=new calc();
		ad.add(5, 50);
		ad.sub(15, 50);
		ad.div(25, 50);
		ad.mul(35, 50);

	}

}
