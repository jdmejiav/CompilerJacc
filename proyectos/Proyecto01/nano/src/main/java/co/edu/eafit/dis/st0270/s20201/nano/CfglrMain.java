package co.edu.eafit.dis.st0270.s20201.nano;

import gnu.getopt.Getopt;
import java.io.StringReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
/*import co.edu.eafit.dis.st0270.s20201.nano.lexer.NanoTokens;
import co.edu.eafit.dis.st0270.s20201.nano.lexer.NanoLexer;
import co.edu.eafit.dis.st0270.s20201.nano.lexer.NanoParser;//*/
import co.edu.eafit.dis.st0270.s20201.nano.lexer.CfglrLexer;
import co.edu.eafit.dis.st0270.s20201.nano.parser.CfglrParser;

/**
 * <code>DyckMain</code> is responsable to start the
 * implementation of a LR(1) compiler, in two different versions: manual
 * and cup.
 *
 * @author Juan Francisco Cardona McCormick
 * @version 0.0.1.26
 * @since   0.0.1.0
 */
public class CfglrMain {

   private enum CompilerKind { MANUAL, CUP };

   /**
    * <code>usage</code> shows a commands lines, every time there an error on the
    * format command line this static fuction is called.
    */
   public static void usage() {
      System.err.println("Usage: java DyckMain [{-m(manual)|-j(jacc)} [-s] [<filename>] ...");
      System.exit(1);
   }

   /**
    * <code>main</code> is the start point of the execution of the DyckCompiler package.
    */
   public static void main(String args[]) {

      Getopt getOpt = new Getopt("CfglrMain", args, "m:s:");
      int c;
      String str = null;
      CompilerKind ck = CompilerKind.MANUAL;

      while ((c = getOpt.getopt()) != -1) {
         switch (c) {
           case 'm':
              if(getOpt.getOptarg().equals("manual")) {
                 ck = CompilerKind.MANUAL;
              }else{
                usage();
              }
              break;
        case 'j':/*
        ck=null;
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
				System.err.println("Error: "+args[i]+" no existe");
			}
		}//*/
    break;
         case 's':
            str = getOpt.getOptarg();
            break;

         default:
            usage();
            break;
         }
      }

      int startFiles = getOpt.getOptind();

      if (str == null && startFiles == args.length) usage();

      switch(ck) {
      case MANUAL:
         {
            CfglrParser dp = null;

            if (str != null) {
               try {
                  dp = new CfglrParser(new CfglrLexer(new StringReader(str)));
		  dp.parser();
                  System.out.println("Valid expression: " + str);
               }
               catch (Exception e) {
                  System.err.println(e);
                  System.err.println("Invalid expression: " + str);
               }
            }

            for (int i = startFiles; i < args.length; ++i) {
               try {
                  dp = new CfglrParser(new CfglrLexer(new FileReader(args[i])));
		  dp.parser();
                  System.err.println("Valid file: " + args[i]);
               }
               catch (Exception e) {
                  System.err.println(e);
                  System.err.println("Invalid File: " + args[i]);
               }
            }
         }
         break;

      }
      System.exit(0);
   }
}
