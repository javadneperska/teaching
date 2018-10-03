package sk.moravcik.kristian.gl1.hw5;

import org.la4j.Matrix;
import org.la4j.matrix.dense.Basic2DMatrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.text.NumberFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<String, String>();
        System.out.println("Welcome to Calculus / Vita Vas aplikacia Calculus");
        System.out.print("Select language / Vyberte jazyk (EN - 1, SK - 2): ");
        int langChoice = sc.nextInt();
        Calculator c = new Calculator();
        c.setLang(langChoice);
        boolean exit = false;

        do {
            System.out.println("1. " + c.getMap().get(c.getLang()+"add"));
            System.out.println("2. " + c.getMap().get(c.getLang()+"mul"));
            System.out.println("3. " + c.getMap().get(c.getLang()+"div"));
            System.out.println("4. " + c.getMap().get(c.getLang()+"genmatrixfile"));
            System.out.println("5. List all available files");
            System.out.println("6. Matrix Sum");
            System.out.println("0. " + c.getMap().get(c.getLang()+"quit"));
            System.out.print("\n");
            System.out.print(c.getMap().get(c.getLang()+"choice"));
            int num = sc.nextInt();

            switch(num) {
                case 1:
                    System.out.print(c.getMap().get(c.getLang()+"addres") + c.add());
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print(c.getMap().get(c.getLang()+"mulres") + c.mul());
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print(c.getMap().get(c.getLang()+"divres") + c.div());
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.print("Zadaj nazov suboru: ");
                    String fileName = sc.next();
                    c.setMatrix(Matrix.from1DArray(4, 4, c.getMat() ));

                    try (PrintWriter out = new PrintWriter(fileName)) {
                        out.println(c.getMatrix().toCSV(NumberFormat.getNumberInstance(Locale.UK)));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    File dir = new File(".");
                    File[] filesList = dir.listFiles();
                    for (File file : filesList) {
                        if (file.isFile()) {
                            System.out.println(file.getName());
                        }
                    }
                    break;
                case 6:
                    try {
                        Scanner in = new Scanner(new FileReader(c.readFilename()));
                        StringBuilder sb = new StringBuilder();
                        while(in.hasNext()) {
                            sb.append(in.next() + ",");
                        }

                        in = new Scanner(new FileReader(c.readFilename()));
                        StringBuilder sb2 = new StringBuilder();
                        while(in.hasNext()) {
                            sb2.append(in.next() + ",");
                        }

                        in.close();
                        System.out.print("Result of sum: ");
                        System.out.println(Matrix.fromCSV(sb.toString()).add(Matrix.fromCSV(sb2.toString())));

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    break;

                case 0:
                    exit=true;
                    break;
            }
        } while(!exit);
    }
}