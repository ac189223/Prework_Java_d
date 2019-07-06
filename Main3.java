/*
1. W pliku `Main3.java` stwórz pętlę, która 10 razy wypisze w konsoli tekst: *"Lubię Javę"*.
2. Napisz zarówno pętlę `for` jak i pętlę `while`.
3. W sumie napis będzie widoczny 20 razy.
*/

public class Main3 {

	public static void main(String[] args) {
		for (byte i = 1; i <= 10; i++) {
			if (i == 10) {
				System.out.println("Lubię Javę      " + i + " for");
			} else {
				System.out.println("Lubię Javę      " + i + "  for");
			}
		}
		byte i = 1;
		while (i <= 10) {
			if (i == 10) {
				System.out.println("Lubię Javę      " + i + " while");
			} else {
				System.out.println("Lubię Javę      " + i + "  while");
			}
			i++;
		}	
	}

}
