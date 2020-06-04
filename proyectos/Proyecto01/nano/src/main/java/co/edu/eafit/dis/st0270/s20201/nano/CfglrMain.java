package co.edu.eafit.dis.st0270.s20201.nano;

import gnu.getopt.Getopt;
import java.io.StringReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
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

   private enum CompilerKind { MANUAL, JACC };

   /**
    * <code>usage</code> shows a commands lines, every time there an error on the
    * format command line this static fuction is called.
    */
   public static void usage() {
      System.err.println("Usage: java CfglrMain [{-m(manual)|-j(jacc)} [-s] [<filename>] ...");
      System.exit(1);
   }

   /**
    * <code>main</code> is the start point of the execution of the DyckCompiler package.
    */
    public static void main(String[] args) {

       Getopt getOpt = new Getopt("CfglrMain", args, "mj");
       int c;
       boolean manual = false;
       boolean jacc = false;

       while ((c = getOpt.getopt()) != -1) {
          switch (c) {
             case 'm':
                manual = true;
                break;
             case 'j':
                jacc = true;
                break;
             default:
                manual=true;
                break;
          }
       }

       int startFiles = getOpt.getOptind();

       if (startFiles == args.length) usage();
       CfglrParser dp;
       NanoParser gjp;
       NanoLexer gjl;
       for (int i = startFiles; i < args.length; ++i) {
          if (manual) {
             try {
                dp = new CfglrParser(new CfglrLexer(new FileReader(args[i])));
                dp.parser();
                System.err.println("Valid file: " + args[i] + " with manual parser");
             }
             catch (Exception e) {
                System.err.println(e);
                System.err.println("Invalid File: " + args[i] + " with manual parser");
             }
          }
          if (jacc) {
             try {
                gjl = new NanoLexer(new FileReader(args[i]));
                gjp = new NanoParser(gjl);
                gjl.nextToken();
                if (gjp.parse()) {
                   System.err.println("Valid file: " + args[i] + " with jacc parser");
                } else {
                   System.err.println("Invalid file " + args[i] + " with jacc parser");
                }
             } catch (Exception e) {
                System.err.println(e);
             }
          }
       }
       System.exit(0);
   }
}
