import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GeomMath {

    public static double ContentOfShape(ArrayList<String> shape)
    {
        if(shape.get(0).contains("Stvorec"))
        {
            return Double.parseDouble(shape.get(1)) * Double.parseDouble(shape.get(1));
        }
        else if(shape.get(0).contains("Obdlznik"))
        {
            return Double.parseDouble(shape.get(1)) * Double.parseDouble(shape.get(2));
        }
        else if(shape.get(0).contains("Kosostvorec"))
        {
            return Double.parseDouble(shape.get(1)) * Double.parseDouble(shape.get(5));
        }
        else if(shape.get(0).contains("Kosodlznik"))
        {
            return Double.parseDouble(shape.get(1)) * Double.parseDouble(shape.get(5));
        }
        return 0;
    }

   public static double CircumferenceOfShape(ArrayList<String> shape)
   {
       if(shape.get(0).contains("Stvorec") || shape.get(0).contains("Kosostvorec"))
       {
           return 4 * Double.parseDouble(shape.get(1));
       }
       else if(shape.get(0).contains("Obdlznik") || shape.get(0).contains("Kosodlznik"))
       {
           return 2 * (Double.parseDouble(shape.get(1)) + Double.parseDouble(shape.get(2)));
       }

       return 0;
   }

   public static double DiagonalOfShape(ArrayList<String> shape)
   {
       if(shape.get(0).contains("Stvorec"))
       {
           return Double.parseDouble(shape.get(1)) * Math.sqrt(2);
       }
       else if(shape.get(0).contains("Obdlznik"))
       {
           return Math.sqrt(Double.parseDouble(shape.get(1))*Double.parseDouble(shape.get(1)) + Double.parseDouble(shape.get(2))*Double.parseDouble(shape.get(2)));
       }
       else if(shape.get(0).contains("Kosostvorec"))
       {
           return Double.parseDouble(shape.get(1))*Math.sqrt(2-2*Math.cos(Math.asin(Double.parseDouble(shape.get(5))/Double.parseDouble(shape.get(1)))));
       }
       else if(shape.get(0).contains("Kosodlznik"))
       {
           return Math.sqrt(Double.parseDouble(shape.get(1))*Double.parseDouble(shape.get(1)) +
                   Double.parseDouble(shape.get(2))*Double.parseDouble(shape.get(2))-
                   2*Double.parseDouble(shape.get(1))*Double.parseDouble(shape.get(2))*
                           Math.cos(Math.asin(Double.parseDouble(shape.get(5))/Double.parseDouble(shape.get(2)))));
       }
       return 0;
   }

    public static void MathMagic(ArrayList<ArrayList<String>> utvary) throws FileNotFoundException {
        ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
        ArrayList<String> row = new ArrayList<String>();
        row.add("UTVAR");
        row.add("OBSAH");
        row.add("OBVOD");
        row.add("UHLOPRIECKA");
        results.add(row);

        for (int i = 1; i < utvary.size(); i++) {
            row = new ArrayList<String>();
            row.add(utvary.get(i).get(0));
            row.add(String.valueOf(GeomMath.ContentOfShape(utvary.get(i))));
            row.add(String.valueOf(GeomMath.CircumferenceOfShape(utvary.get(i))));
            row.add(String.valueOf(GeomMath.DiagonalOfShape(utvary.get(i))));
            results.add(row);
        }

        PrintWriter pw = new PrintWriter(new File("vyrataneUtvary.csv"));
        StringBuilder sb = new StringBuilder();

        for(ArrayList<String> inner:
                results)
        {
            for (int i = 0; i < inner.size(); i++) {
                sb.append(inner.get(i).toString());
                if(i!=inner.size()-1)
                {
                    sb.append(",");
                }
            }
            sb.append("\n");
        }
        pw.write(sb.toString());
        pw.close();
    }

}
