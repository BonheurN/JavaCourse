
public class Friends {
	
	public static void main(String[]args) {
		
		Friend friend1 = new Friend("Frederick");
		Friend friend2 = new Friend("Mugisha");
		Friend friend3 = new Friend("Patrick");
		Friend friend4 = new Friend("Squidward");
		Friend friend5 = new Friend("Sandy");
		System.out.println(Friend.numberoffriends);
		Friend.displayoffriends();
		
	}
}
class Friend{
	String name;
	static int numberoffriends;
	Friend(String name){
		this.name = name;
		numberoffriends ++;
	}
	static void displayoffriends() {
		System.out.println("You have number of "+numberoffriends+" friends");
	}
	
}