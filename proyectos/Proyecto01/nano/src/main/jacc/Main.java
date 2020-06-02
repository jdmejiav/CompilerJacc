 import java.io.FileReader;
 import java.io.FileNotFoundException;
 public class Main{
    //usage java main filenames ...
    public static void main(String args[]){
        for (int i=0;i<args.length;i++){
            try{
                FileReader fr=new FileReader(args[i]);
                CfglrLexer dl=new CfglrLexer(fr);
                CfglrParser dp=new CfglrParser(dl);
                if(dp.parse()){
                    System.out.println(""+args[i]+
                                       " está bien formado");
                }else{
                    System.out.println(""+args[i]+
                                       " no está bien formado");
                }
                
            }
            catch(FileNotFoundException fnfe){
                System.err.println("Error: "+ args[i] + " no existe");
            }
        }
    }
 }
