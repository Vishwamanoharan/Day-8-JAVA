class M3 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome I'M here");
		int a=ram(14,2,2000);
		System.out.println("Number is : "+a);
		String b=kenny("Where you are",26.48);
		if (surya(10,20))
		{
			System.out.println("Welcome to everyone");
		}
		else{
			System.out.println("Go back");
		}
	}
	private static int ram(int a,int b,int c){
		System.out.println("Ram brithaday" +a+","+b+","+c);
		return 19;
	}
	public static String kenny(String a,double b){
		System.out.println(a);
		System.out.println(b);
		return "what";
	}
	protected static boolean surya(int a,int b){
		System.out.println("Welcome"+(a+b));
		return false;
	} 
}
