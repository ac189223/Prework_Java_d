/*
W pliku `Main9.java` napisz program rysujący, na podstawie wartości zmiennej `n`, następujący schemat: (Przykład dla `n = 3`)  

```
* 2 3
* * 3
* * *
```

Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego `if`, dzięki któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli. 
*/

public class Main9Table {

    public static void main(String[] args) {
	int n = 9;
	String[] Table = new String[n];
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			if (i >= j) {
		        	Table[j-1]=("*");
			} else {
		        	Table[j-1]=(String.valueOf(j));
			}
	        }
		for (int l = 0; l < n; l++) {
		       	System.out.print(Table[l]);
		       	System.out.print(" ");
		}
	       	System.out.println("");
	}
    }

}
