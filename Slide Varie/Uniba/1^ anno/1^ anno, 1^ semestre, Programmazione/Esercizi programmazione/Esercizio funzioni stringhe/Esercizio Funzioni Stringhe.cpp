/*
Esercizio con tutte le funzioni delle stringhe
*/
#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>

int main()
{
	printf("%s \n %s%s \n %s%s \n \n","Funzione isdigit: ",//La funzione isdigit determina e il suo argomento � una cifra
			isdigit('8') ? "8 � un" : "8 non � un", "numero",
			isdigit('#') ? "# � un" : "# non � un", "numero");
	printf("%s \n %s%s \n %s%s \n %s%s \n %s%s \n \n","Funzione isalpha: ",//La funzione isalpha determina se il suo argomento � una lettera
			isalpha('A') ? "A � una" : "A non � una", "lettera",
			isalpha('b') ? "b � una" : "b non � una", "lettera",
			isalpha('&') ? "& � una" : "& non � una", "lettera",
			isalpha('4') ? "4 � una" : "4 non � una", "lettera");
    printf("%s \n %s%s \n %s%s \n %s%s \n \n","Funzione isalnum: ",//La funzione islanum determina se il suo argomento � un numero p una lettera
			isalnum('A') ? "A � un" : "A non � un", "numero o una lettera",
			isalnum('#') ? "# � un" : "# non � un", " numero o una lettera",
			isalnum('8') ? "8 � un" : "8 non � un ", "numero o una lettera");
	printf("%s \n %s%s \n %s%s \n %s%s \n %s%s \n %s%s \n \n","Funzione isxdigit: ",//La funzione isxxdigit determina se il suo argomento � un numero esaecimale
			isxdigit('F') ? "F � un" : "F non � un", "numero esadecimale",
			isxdigit('J') ? "J � un" : "J non � un", "numero esadecimale",
			isxdigit('7') ? "7 � un" : "7 non � un", "numero esadecimale",
			isxdigit('$') ? "$ � un" : "$ non � un", "numero esadecimale",
			isxdigit('f') ? "f � un" : "f non � un", "numero esadecimale");
	printf("%s \n %s%s \n %s%s \n %s%s \n %s%s \n \n","Funzione islower: ",//La funzione islower determina se il suo argomento � una lettera minuscola
			islower('p') ? "p � una" : "p non � una", "lettera minuscola",
			islower('p') ? "p � una" : "p non � una", "lettera minuscola",
			islower('p') ? "p � una" : "p non � una", "lettera minuscola",
			islower('p') ? "p � una" : "p non � una", "lettera minuscola");
	printf("%s \n %s%s \n %s%s \n %s%s \n %s%s \n \n","Funzione isupper: ",//La funzione isupper determina se il suo argomento � una lettera maiuscola
			isupper('D') ? "D � una" : "D non � una", "lettera maiuscola",
			isupper('d') ? "d � una" : "d non � una", "lettera maiuscola",
			isupper('8') ? "8 � una" : "8 non � una", "lettera maiuscola",
			isupper('$') ? "$ � una" : "$ non � una", "lettera maiuscola");
	printf("%s\n %s%c \n %s%c \n %s%c \n %s%c \n \n","Funzione toupper e tolower",/*La funzione toupper converte il suo argomento in minuscolo o in maiuscolo, 
																					 la funzione tollower converte il uo argomento da maisucolo in minusoclo,
																					 se nel loro argomento vi � un errore, restituisocno il loro argomento cos� com'�.*/
			"u convertita in maiuscolo �: ", toupper('u'),
			"7 convertita in maiuscolo �: ", toupper('7'),
			"$ convertita in maiuscolo �: ", toupper('$'),
			"L convertita in minuscolo �: ", tolower('L'));
}
