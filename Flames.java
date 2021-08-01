public class Flames {

	public static void getRelationship(int diff ) {
		String flames = "FLAMES";
		
		StringBuilder str3 = new StringBuilder(flames);
		String temp;
		
		while(str3.length()!=1)
		{
			int y= diff%str3.length();
			
			if(y!=0)
			temp = str3.substring(y)+str3.substring(0, y-1);
			else
				temp = str3.substring(0,str3.length()-1);
			
			str3 = new StringBuilder(temp);
			//System.out.println(temp);
		}
		char result = str3.charAt(0);
		printFlames(result);
		
	}
	
	public static void printFlames(char result)
	{
		switch (result) {
		case 'F':System.out.println("FRIEND");break;
		case 'L':System.out.println("LOVE");break;
		case 'A':System.out.println("AFFECTION");break;
		case 'M':System.out.println("MARRIAGE");break;
		case 'E':System.out.println("ENEMY");break;
		case 'S':System.out.println("SIBLING");break;
		}
		
	}
	
	public static void getFlames(String str,String str2)
	{
		int diff = getDifference(str,str2);
		getRelationship(diff);
		
	}
	
	public static int getDifference(String str,String str2) 
	{
		int count=0;
			
			str=str.toUpperCase();		//Converting strings to Uppercase
			str2=str2.toUpperCase();
		
		char [] a = str.toCharArray();
		char [] b = str2.toCharArray();
		
		for(int i=0;i<str.length();i++) 
			for(int j=0;j<str2.length();j++)
				if(a[i]==b[j]) 
					a[i]=b[j]=' ';	
	
		for(int i=0;i<str.length();i++)
			if(a[i]==' ') 
				count++;	
			
		int diff = str.length()+str2.length()-2*count;
		
				return diff;
	
	}
	public static void main( String [] args) {
		String str,str2;
		str = "Aravindan";
		str2 = "Geethanjali";
		System.out.print("Relation between "+str+" & "+str2+" : ");
		getFlames(str,str2); 
			System.out.println();	
	}
}
