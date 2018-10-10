/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Boss
 */
public class ParseCsv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName;
        String[][] people;
        Utils utils = new Utils();
        utils.printEnterFileName();
        fileName = utils.scanFileName();


         String firstName;
         String lastName;
         String title;
         String birthNumber;
         int age;
         Gender gender;
         int manCounter=0;
         int womanCounter=0;

         List<Person> peopleList = new ArrayList<>();

        people = utils.get2dArrayFromFile(fileName);

       for(int i=1; i<people.length;i++){
           firstName = people[i][0];
           lastName = people[i][1];
           title= people[i][2];
           birthNumber = people[i][3];
           age = Integer.valueOf(people[i][4]);
           gender= Gender.valueOf(people[i][5]);
           Person person = new Person(firstName,lastName,title,birthNumber,age,gender);
           peopleList.add(person);
    }

        System.out.println("All people");
        for (int i = 0; i <peopleList.size() ; i++) {
            Person person = peopleList.get(i);
            System.out.println("Person number "+i+ ", information: "+ person.getFirstName()+" "+person.getLastName());
        }

        System.out.println("");
        for (int i = 0; i <peopleList.size() ; i++) {
                Person person = peopleList.get(i);
                int month = Integer.valueOf(person.getBirthNumber().substring(2,4));
                if(month>12){
                    System.out.println("According to the birth number this is a woman");
                }
                else{
                    System.out.println("According to the birth number this is a man");
                }

                Gender tmpGender;
                tmpGender = person.getGender();
                if(String.valueOf(tmpGender).equalsIgnoreCase("MALE")){
                    manCounter++;
                }else{
                    womanCounter++;
                }
        }


        System.out.println("Count of all people :" + Person.counter);
        System.out.println("Count of  man :" + manCounter);
        System.out.println("Count of  woman :" + womanCounter);
}
}
