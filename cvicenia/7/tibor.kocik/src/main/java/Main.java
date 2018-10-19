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



        Person person = new Person();
        person.setFirstName("Patvaros");
        person.setLastName("Nigel");
        person.setAge(143);

    }





}
