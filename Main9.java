/*
W pliku `Main9.java` napisz program rysujący, na podstawie wartości zmiennej `n`, następujący schemat: (Przykład dla `n = 3`)  

```
* 2 3
* * 3
* * *
```

Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego `if`, dzięki któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli. 
*/

public class Main9 {

    public static void main(String[] args) {
	int n = 9;
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			if (i >= j) {
		        	System.out.print("* ");
			} else {
		        	System.out.print(j + " ");
			}
	        }
	       	System.out.println("");
	}
    }

}
