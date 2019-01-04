package HW1312.decorator;

import java.io.*;

public class Main {
    /* Используя паттерн Decorator создать шифрующие с помощью XOR потоки ввода/вывода.
    Они должны наследовать FilterInputStream и FilterOutputStream.
    Конструктор этих потоков должен принимать пароль в виде массива байт и поток, который он декорирует.

    Использование должно выглядеть следующим образом:
    Трафик автоматически шифрует и дешифруется:
    InputStream in = new CryptoInputStream(socket.getInputStream(), password);
    OutputStream out = new CryptoOutputStream(socket.getOutputStream(), password);

    Сохраняем в шифрованный файл и читаем из шифрованного файла:
    InputStream in = new CryptoInputStream(new FileInputStream("test.bin"), password);
    OutputStream out = new CryptoOutputStream(new FileOutputStream("test.bin"), password); */

    public static String getFileContent(File file, String encoding) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        try (BufferedReader br =
                     new BufferedReader(new InputStreamReader(fis, encoding))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        File inputFile = new File("D:\\Java\\ITMO2\\HW\\src\\Input.txt");
        File outputFile = new File("D:\\Java\\ITMO2\\HW\\src\\CryptedFile.txt");
        String password = "Qwerty is good!";

        try {
            String SourseMessage = getFileContent(inputFile, "UTF-8");
            System.out.println("Source message: \n" + SourseMessage);
            CryptoOutputStream cryptoOutputStream = new CryptoOutputStream(new FileOutputStream(outputFile), password);
            cryptoOutputStream.write(SourseMessage.getBytes());

            CryptoInputStream cryptoInputStream = new CryptoInputStream(new FileInputStream(outputFile), password);
            byte[] message = new byte[cryptoInputStream.available()];
            cryptoInputStream.read(message);

            String DecryptedMessage = new String(message);
            System.out.println("Decrypted message:\n" + DecryptedMessage);

        } catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }

    }

}
