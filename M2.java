class M2 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to karikalan magic show");
		if (spiders("Dev","Testing"))
		{
			System.out.println("Answer");
			if (correct("ok"))
			{
				System.out.println("Don't Worry");
				System.out.println("we are hulk");
				hulk();
			}
			System.out.println("Haii from BigBoss");
			System.out.println("Bye from main");
		}
	}

	public static boolean spiders(String data,String jsp){
		System.out.println("Welcome to Us"+data+"--"+jsp);
		return true;
	}
	public static boolean correct(String s){
		System.out.println("Haii");
		return true;
	}
	public static void hulk(){
		System.out.println("haii");
		return ;
	}
}
