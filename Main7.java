/*
1. W pliku `Main7.java` stwórz dwie pętle niezależne i wypisz wartości ich liczników w każdej iteracji. 
2. Wykorzystaj np.```System.out.println("i= " + i + " j= " + j);```
3. Zadanie rozwiąż używając dwóch pętli `for`.

*Podpowiedź: Zasada tworzenia pętli zagnieżdżonych (zależnych i niezależnych) została omówiona w prezentacji **Podstawy programowania**. Jeśli masz wątpliwości, zajrzyj do sekcji **Pętle: for, for zagnieżdżony oraz while** w tej prezentacji.*
*/

public class Main7 {

	public static void main(String[] args) {
		for (byte i = 1; i <= 10; i++) {
			for (byte j = 1; j <= 8; j++) {
				System.out.println("i= " + i + " j= " + j);
			}
		}
	}

}
