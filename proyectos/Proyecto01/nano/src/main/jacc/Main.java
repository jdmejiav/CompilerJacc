import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main{

	//usage java Main <filenames>
	public static void main (String [] args){
		for (int i =0;i<args.length;i++){

			try{
				FileReader fr = new FileReader(args[i]);
				NanoLexer dl = new NanoLexer(fr);
				NanoParser dp = new NanoParser(dl);
				dl.nextToken();
				if (dp.parse()){
					System.out.println(args[i]+" está bien formado");
				}else {
					System.out.println(args[i]+" no está bien formado");
				}
			}catch (FileNotFoundException fnfe){
				System.err.println("Erro: "+args[i]+" no existe");
			}

		}

	}
}
