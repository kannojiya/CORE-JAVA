
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class exam {

public static void main(String[] args) {
int x = 10;
String str = "Winter is coming";
String str1 ="Is";
double d = 879.9087;
try {
        File newTextFile = new File("demo.txt");

        try (FileWriter fw = new FileWriter(newTextFile)) {
        fw.write(String.valueOf(x));
        fw.write(Integer.toString(x));
        fw.write("\n");
        fw.write(String.valueOf(d));
        fw.write("\n");
        fw.write(String.valueOf(d));
        fw.write("\n");
        fw.write(Double.toString(d));
        fw.write("\n");
        fw.write(str);
        fw.write("\n");
        fw.write(x + " " + str+" "+" "+d+" "+str1);
    }
            
    try (FileReader fr = new FileReader(newTextFile)) {
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
    }

        } catch (IOException iox) {
        }
}

}
