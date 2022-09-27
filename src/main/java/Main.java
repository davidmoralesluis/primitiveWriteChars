import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String cadea="o tempo está xélido";
        File newText=new File(System.getProperty("user.dir")+"/src/main/java/text5.txt");

        DataOutputStream escribir=new DataOutputStream(new FileOutputStream(newText)); //if true añadir
        DataInputStream leer=new DataInputStream(new FileInputStream(newText));

        for (int i = 0; i < 2; i++) {
            escribir.writeChars(cadea);

            System.out.printf("escribiendo :");
            for (int j = 0; j < cadea.length(); j++) {
                System.out.print(leer.readChar());
            }
            System.out.println();
        }

        escribir.close();
        leer.close();
    }
}
