package listas;
import listas.les.*;
import java.io.*;
public class Lista{
	public static void main(String[] args) {
//		LDE lista = new LDE();
//		lista.load(new File("lista-desorganizada-10k.csv"));
//		lista.bubble();
//		lista.save(new File("lista-organizada-10k.csv"));
		
		LES lista = new LES("lista-desorganizada-10k.csv");
		lista.sort(0);
		
		lista = new LES("lista-desorganizada-10k.csv");
		lista.sort(1);

		lista = new LES("lista-desorganizada-10k.csv");
		lista.sort(2);

		lista = new LES("lista-desorganizada-10k.csv");
		lista.sort(3);

	}
}