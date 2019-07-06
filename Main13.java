/*
W pliku `Main13.java` napisz program, który wystawi ocenę z testu.

* `0-39` pkt – ocena niedostateczna 
* `40-54` pkt – ocena dopuszczająca 
* `55-69` pkt – ocena dostateczna 
* `70-84` pkt – ocena dobra 
* `85-98` pkt – ocena bardzo dobra 
* `99-100` pkt – ocena celująca

1. Stwórz zmienną `points`, do której będzie przypisany wynik z testu.
2. Na początku sprawdź, czy liczba punktów jest:
* większa bądź równa `0`, jeśli nie – wypisz na konsoli komunikat: `Liczba punktów mniejsza niż 0.`;
* mniejsza bądź równa `100`, jeśli nie – wypisz na konsoli komunikat: `Liczba punktów większa niż 100.`.
4. Następnie sprawdź jaka ocena odpowiada danej liczbie punktów i wypisz ją na konsoli wg wzoru: `Wynik: ocena dobra`.
5. Rozwiąż to zadanie używając konstrukcji `if ... else if ... else`.
*/

public class Main13 {

    public static void main(String[] args) {
	byte i = 87;	
	if (i < 0) {
		System.out.println("Liczba punktów mniejsza niż 0.");
	} else if (i > 100) {
		System.out.println("Liczba punktów większa niż 100.");
	} else if (i < 40) {
		System.out.println("Wynik: ocena niedostateczna.");
	} else if (i < 55) {
		System.out.println("Wynik: ocena dopuszczająca.");
	} else if (i < 70) {
		System.out.println("Wynik: ocena dostateczna.");
	} else if (i < 85) {
		System.out.println("Wynik: ocena dobra.");
	} else if (i < 99) {
		System.out.println("Wynik: ocena bardzo dobra.");
	} else {
		System.out.println("Wynik: ocena celująca.");
	}
    }

}
