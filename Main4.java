/*
1. W pliku `Main4.java` stwórz pętlę, która wypisze w konsoli liczby od 1 do 100, jedna w jednej linii.
2. Napisz zarówno pętlę `for` jak i pętlę `while`.
3. W sumie zostanie wypisanych 200 liczb.
*/

public class Main4 {

	public static void main(String[] args) {
		for (byte i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		byte i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}	
	}

}
