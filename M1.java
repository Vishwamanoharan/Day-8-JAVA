class M1 
{
	public static void main(String [] args)throws Exception{
		System.out.println("haii from main");
		Thread.sleep(1500);

		
		sheela();

		System.out.println("Bye from main");
	}
	public static void sheela() 
	{
		
		System.out.println("Hai from sheela");
		
		leela();
		
		System.out.println("Bye from sheela");
	}

	public static void leela(){
		System.out.println("Haii from leela");
		
		System.out.println("Bye from leela");
	}

	
}
