package decrator;

public class GilrFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GirlF myGF = new GirlF("baby");
		Science sc = new Science("math",myGF);
		System.out.println(sc.getDescription());
	}

}
