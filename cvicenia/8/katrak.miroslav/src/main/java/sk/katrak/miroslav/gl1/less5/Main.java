package sk.katrak.miroslav.gl1.less5;

public class Main {

    public static final String NL = "\n";

    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("som");
        sb.append(NL);
        sb.append("na");
        sb.append(NL);
        sb.append("hodine");
        sb.append(NL);
        sb.append("javy");

        System.out.println(sb.toString());



        String miro =  "Miro";
        Integer miso = 1;

//        int i = miro.compareTo(miso);

        if(miro.equals(miso)){
            System.out.println("miro nie je miso");
        }

        int x = 1;
        int y = 2;

        if(x == y){

        }



        Integer x1 = new Integer(1);
        Integer y1 = new Integer(2);

        if(x1.equals(y1)){

        }

        if(x1 == y1){

        }


        String x2 = "xedo";
        String upperCase = x2.toUpperCase();
        System.out.println(upperCase);



        String jozo = "jozo";
        System.out.println(jozo.toString());


        Person p = new Person();
        p.setFirstName("Miroslav");
        System.out.println(p.toString());

        Person p1 = new Person();
        p1.setFirstName("Miroslav");
        System.out.println(p1.toString());

        if(p.equals(p1)){
            System.out.println("equals");
        }else {
            System.out.println("NOT equals");
        }


        if(p == p1){
            System.out.println("SOM EQUALS");
        }else {
            System.out.println("NOT SOM EQUALS");
        }
    }

}
