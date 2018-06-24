import java.io.*;
public class Leitura{

	public static String lerString(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader ler = new BufferedReader (isr);
		String var = "-1";
		try {	
			var = ler.readLine();
		}catch(IOException err){
			var = "-1";
		}
		finally {
			return var;
		}
	}

	public static int lerInt(){
		try {
			return Integer.parseInt(lerString());
		} catch(NumberFormatException err) {
			return -1;
		}
	}

	public static double lerDouble(){
		try {
			return Double.parseDouble(lerString());
		} catch(NumberFormatException err) {
			return -1;
		}
	}

	public static float lerFloat(){
		try {
			return Float.parseFloat(lerString());
		} catch(NumberFormatException err) {
			return (float) -1;
		}
	}
}