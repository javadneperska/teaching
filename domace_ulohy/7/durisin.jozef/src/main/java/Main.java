import sk.globallogic.durisin.lesson.geometry.Parallelogram;
import sk.globallogic.durisin.lesson.geometry.Util;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Parallelogram> polygons = Util.readPolygons("polygons");
//            System.out.println(polygons);
            Util.writePolygons("result", polygons);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
