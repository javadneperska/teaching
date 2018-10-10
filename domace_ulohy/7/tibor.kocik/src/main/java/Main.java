import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //DU - urote program, ktory z ext. suboru nacita geometricke utvary roznych druhov minimalne 4 druhy, vyrata ich obsah a obvod a dlzku uhlopriecky, nasledne tieto
        //hodnoty zapise do ext. suboru vo formate csv

        ArrayList<ArrayList<String>> utvary = readCSVFromFile("utvary");
        GeomMath.MathMagic(utvary);



    }

    public static ArrayList<ArrayList<String>> readCSVFromFile(String nameOfTheFile) throws IOException {
        File file = new File(nameOfTheFile + ".csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        StringBuilder sb = new StringBuilder();
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        ArrayList<String> inner = new ArrayList<String>();
        while ((st=br.readLine()) != null)
        {
            for (int i = 0; i < st.length(); i++) {
                if(st.charAt(i) != ',')
                {
                    sb.append(String.valueOf(st.charAt(i)));
                }
                else
                {
                    inner.add(sb.toString());
                    sb = new StringBuilder();
                }
                if(i==st.length()-1)
                {
                    inner.add(sb.toString());
                }

            }
            data.add(inner);
            inner = new ArrayList<String>();
            sb = new StringBuilder();
        }

        return data;
    }


}
