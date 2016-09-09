package lab1;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 *
 * @author davidboschwitz
 */
public class EncryptedPrintStream extends PrintStream {
    
    public EncryptedPrintStream(OutputStream out) {
        super(out);
    }
    
    @Override
    public void println(String s){
        byte[] data = s.getBytes();
        for(int i = 0; i < data.length; i++){
            super.write(data[i] ^ 0b11110000);
        }
    }
    
}
