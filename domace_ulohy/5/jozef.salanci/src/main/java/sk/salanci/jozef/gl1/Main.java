package sk.salanci.jozef.gl1;


//Probate program kitty nacita diva externe suborn pri com externe subordinates bude obsahovat maticu risle 4*4
//
//        Program sa nasse s spyta pouzivate na nazvy subor  nacita tieto subory a urobi  nasobenie matic a vypise vysledok na orazovku
//
//        Podporujuci program toot zadnai bude program story zgeneruje 2 subory


public class Main {
//    public static String firstCSV;
//    public static String secondCSV;

    public static String firstFile;
    public static String secondFile;
    public static double[][] firstArray;
    public static double[][] secondArray;

    public static void main(String[] args) {

        System.out.println("Sucin dvoch matic 4X4");
        firstFile = FileHandler.fileName("prveho");
        secondFile = FileHandler.fileName("druheho");
//        System.out.println(FileHandler.getPath(firstFile));
//        System.out.println(FileHandler.getPath(secondFile));
        FileHandler.parserCsv(FileHandler.getPath(firstFile));
        firstArray=FileHandler.myArray.clone();
        FileHandler.parserCsv(FileHandler.getPath(secondFile));
        secondArray=FileHandler.myArray.clone();
//        FileHandler.arrayOutput(firstArray);
        System.out.println("==================================");
//        FileHandler.arrayOutput(secondArray);
        FileHandler.matrixMultiplication(firstArray, secondArray);
        FileHandler.arrayOutput(FileHandler.matrixMultiplication);
    }

}

