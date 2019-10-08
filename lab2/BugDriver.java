public class BugDriver{

	public static void main(String[] args){
		Bug bugsy = new Bug(10);
		System.out.println(bugsy.getPosition());
		for (int i = 0; i < 5; ++i){
			bugsy.move();
		}
		System.out.println(bugsy.getPosition());
		bugsy.turn();
		bugsy.move();
		System.out.println(bugsy.getPosition());
		bugsy.turn();
		for (int i = 0; i < 100; ++i){
			bugsy.move();
		}
		System.out.println(bugsy.getPosition());
	}

}
