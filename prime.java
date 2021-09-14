
public class prime {

	public static void main(String[] args) {
		int x = 17;
		int y = x/2;
		boolean flag =false;
		if(x==0 || x==1) {
			System.out.println("Number is not a prime");
		}
		else {
			for (int i =2;i<=y;i++) {
				if(x%i==0) {
					System.out.println("Number is not a prime");
					flag  = true;
					break;
				}
			}
			if(flag == false) {
				System.out.println("Number is Prime");
			}
		}

	}

}
