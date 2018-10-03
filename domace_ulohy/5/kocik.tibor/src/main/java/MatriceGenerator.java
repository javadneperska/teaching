import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatriceGenerator {


    public static void randMatrice(int x, int y, String nameOfTheFile) throws FileNotFoundException {
        ArrayList<ArrayList<Integer>> fullMatrice = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> innerMatrice = new ArrayList<Integer>();

        Random r = new Random();
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                innerMatrice.add((-10+(int)(Math.random()*((10-(-10)+1)))));
            }
            fullMatrice.add(innerMatrice);
            innerMatrice = new ArrayList<Integer>();
        }

        PrintWriter pw = new PrintWriter(new File(nameOfTheFile + ".csv"));
        StringBuilder writer = new StringBuilder();

        for (ArrayList<Integer> inner :
                fullMatrice) {
            for (int i = 0; i < inner.size(); i++) {
                writer.append(inner.get(i).toString());
                if(i!=inner.size()-1)
                {
                    writer.append(",");
                }
            }
            writer.append("\n");
        }
        pw.write(writer.toString());
        pw.close();
    }
}
