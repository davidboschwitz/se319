package lab1;

import java.io.OutputStream;
import java.io.PrintStream;
/**
 *
 * @author davidboschwitz
 */
public class CustomLogWriter extends PrintStream{
    
    public CustomLogWriter(OutputStream out) {
        super(out);
    }
    
    
    @Override
    public void println(String s){
        super.println(System.currentTimeMillis() + ": " + s);
    }
}
