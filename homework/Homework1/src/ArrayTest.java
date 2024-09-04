
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] AnArray = new int[10];
		int j = 25;
		
		for (int i = 0; i < AnArray.length; i++) 
		{
			AnArray[i] = j;
			j--;
		}
		
		for (int i = 0; i < AnArray.length; i++)
		{
				System.out.print(AnArray[i]);
		}
	}

}
