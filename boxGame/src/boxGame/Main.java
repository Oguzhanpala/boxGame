package boxGame;

public class Main {

	public static void main(String[] args) {

		Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
		Fighter alex = new Fighter("Alex", 10, 95, 100, 80);

		Match match = new Match(marc, alex, 80, 100);
		match.run();
	}

}