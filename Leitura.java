import java.io.*;
public class Leitura{

	public String lerString(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader ler = new BufferedReader (isr);

		String var = "";
		try {	
			var = ler.readLine();
		}catch(IOException err){
			System.out.println ("deu erro!!");
		}

		return var;
	}
	public int lerInt(){	
		return Integer.parseInt(lerString());	
	}	
	public double lerDouble(){
		return Double.parseDouble(lerString());	
	}
}