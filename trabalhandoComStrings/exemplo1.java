package trabalhandoComStrings;

import java.util.Scanner;

public class exemplo1 {
	
static int repetido (String s)
{
	int i = 0, j = 0, cont = 0;
	char c,d;
	char[] letra;
	boolean encontrou = false;
	letra = new char[s.length()];
		for (j = 0; j < s.length(); j++)
		{
			for(i = j + 1 ; i < s.length();i++)
			{
			c = s.charAt(i);
			d = s.charAt(j);
	
		            for (int l=0; l < s.length(); l++) {
		                if (d==letra[l]) {
		                    encontrou=true;                 
		                    break;
		                }
		            }
		            if ((c == d) && !encontrou) {
		                cont++;                                        
		                letra[j] = d;
		            }
		            encontrou=false;
		        }
	    }
	    return cont;
	}

	public static void main (String args[]){
	    Scanner leitor = new Scanner(System.in);
	    String palavra = "";
	    int vezes;
	    System.out.printf("Digite uma palavra para a busca:");
	    palavra = leitor.nextLine();
	    vezes = repetido(palavra);
	    System.out.println(vezes);
	    leitor.close();
	}
}

