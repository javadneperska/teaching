import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] first = {{1,1},{1,1}};
        int[][] second = {{2,2},{2,2}};
        int[][] res = new int[2][2];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first.length; j++) {
                res[i][j] = first[i][j] + second[i][j];
            }
        }
        System.out.println(Arrays.toString(res[0]));
        System.out.println(Arrays.toString(res[1]));

//DU - urote program, ktory z ext. suboru nacita geometricke utvary roznych druhov minimalne 4 druhy, vyrata ich obsah a obvod a dlzku uhlopriecky, nasledne tieto
        //hodnoty zapise do ext. suboru vo formate csv

        Person person = new Person();
        person.setFirstName("Patvaros");
        person.setLastName("Nigel");
        person.setAge(143);

    }





}
