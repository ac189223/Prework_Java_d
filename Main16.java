/*
W pliku `Main16.java` utwórz dwie zmienne: `x` i `y`, będące dodatnimi liczbami całkowitymi.

1. Napisz program wyliczający największy wspólny dzielnik (*greatest common divisor – GDC*) dwóch liczb.
2. Skorzystaj z opisu na tej [stronie][GDC].
3. Wynik wyświetl w konsoli wraz z liczbami, dla których został wyliczony, wg wzoru: `Dla liczb 420 i 168 GDC to: 84`.
*/

public class Main16 {

    public static void main(String[] args) {
	int x, y, GDC, xx, yy;
	x = 140;
	y = 15;
	if (x == y) {
		GDC = x;
	} else {
		xx = x;
		yy = y;	
		while (Math.min(xx, yy) != 0) {
			if (xx > yy) {
				xx = xx % yy;
			} else {
				yy = yy % xx;
			}
		}
		GDC = Math.max(xx, yy);
	}
	System.out.println("Dla liczb " + x + " i " + y + " GDC to: " + GDC + ".");
    }

}
