package HW1312.decorator;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;

public class CryptoOutputStream extends FilterOutputStream {

    private byte[] pass;
    public CryptoOutputStream(OutputStream out, String pass) {
        super(out);
        this.pass = pass.getBytes();
    }

    @Override
    public void write(byte[] inputString) throws IOException {

        byte [] crypto = new byte[inputString.length];
        for (int i = 0; i<inputString.length; i++) {
            int index = i % pass.length;
            crypto[i] = (byte) (inputString[i] ^ (pass[index]));
        }
        super.write(crypto);
    }
}
