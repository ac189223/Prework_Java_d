/*
W pliku `Main10.java` napisz program rysujący na podstawie wartości zmiennej `n` następujący schemat (tutaj dla ```n = 5```).  

```
*
* *
* * *
* * * *
* * * * *
```

Możesz to zadanie rozwiązać na dwa sposoby:
1. używając pętli zależnych,
2. używając pętli niezależnych i instrukcji warunkowej `if`.

*Wzoruj się na poprzednich zadaniach. Trzeba tutaj trochę pomyśleć i rozumieć pętle zagnieżdżone.*
*/

public class Main10 {

    public static void main(String[] args) {
	int n = 9;
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			if (i >= j) {
		        	System.out.print("* ");
			}
	        }
	       	System.out.println("");
	}
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= i; j++) {
			if (i >= j) {
		        	System.out.print("* ");
			}
	        }
	       	System.out.println("");
	}

    }

}
