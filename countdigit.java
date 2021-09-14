
public class countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num = 123456;
    System.out.println("The number is"+ num);
    int count =0;
    while (num!=0){
    	num = num/10;
    	count++;
    }
    System.out.println("The no.of digits are"+ count);
	}

}
