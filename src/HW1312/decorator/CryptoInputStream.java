package HW1312.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CryptoInputStream extends FilterInputStream {
    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field {@code this.out} for later use, or
     *            <code>null</code> if this instance is to be
     *            created without an underlying stream.
     */
    private byte[] pass;
    public CryptoInputStream(InputStream inputStream, String pass) {
        super(inputStream);
        this.pass = pass.getBytes();
    }

    @Override
    public int read(byte[] message) throws IOException {

        super.read(message);

        for (int i = 0; i<message.length; i++) {
            int index = i % pass.length;
            message[i] = (byte) (message[i] ^ (pass[index]));
        }
        return message.length;
    }
}
