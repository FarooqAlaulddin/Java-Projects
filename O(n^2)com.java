// O(n^2)

//				   _____________________________
//                 | ****** Question #5*******  |
//                 |____________________________|

public class Q5 {

	public static void main(String[] args) {
		
		String legs="(((())";
		char f='(', b=')';
		
		int track=0;
		for(int i=0;i<legs.toCharArray().length-1;i++)
		{
			if(legs.charAt(i) ==f && legs.charAt(i+1) ==f)
			{
				for(int j =i+2; j<legs.toCharArray().length-1;j++)
				{
					if(j<legs.toCharArray().length) 
					{
						if((legs.charAt(j))== b && legs.charAt(j+1)==b)
						{
							track++;
						}
					}
				}
			}
		}
		System.out.println(" Question #5 O(N^2)");
		System.out.println(" The given string is     : ( ( ( ( ) )");
        System.out.println(" Total possible legs are :   " +track);

		
	}
}
