package homework;

public class Star3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=9;
		outerLoop:
		for(int i=1;i<=cnt;i++)
		{
			if(i%2==0)
				continue;
			innerLoop:
			for(int j=1;j<=i;j++) {
				
				System.out.print("*" );
			}
			System.out.println("  ");
			System.out.println("  ");
		}

	}

}
