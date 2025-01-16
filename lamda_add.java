package lamda;

public class lamda_add {

	public static void main(String[] args) {
		
		
		calc obj = (a,b) ->
		{
			int result = a+b;
			System.out.println("Addition is : "+result);
		};
		
		obj.add(10,20);

	}

}
