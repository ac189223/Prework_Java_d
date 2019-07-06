/*
1. W pliku `Main1.java` stwórz dwie zmienne, o nazwach: `nr1, nr2`, przechowujące liczby całkowite.
2. Następnie za pomocą instrukcji warunkowej ```if ... else ```, wypisz w konsoli, która z nich jest większa.
3. Wypisany String ma być wg wzoru: `Większa liczba to 7.`
*/

public class Main1 {

    public static void main(String[] args) {
		int nr1 = 4535, nr2 = 77766;
		System.out.print("Większa liczba to ");
		if (nr1 > nr2) {
			 System.out.println(nr1 + ".");
		} else {
			 System.out.println(nr2 + ".");
		}
    }

}
