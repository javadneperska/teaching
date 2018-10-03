package sk.salanci.jozef.gl1;

public class Main {

    public static String firstFile;
    public static String secondFile;
    public static double[][] firstArray;
    public static double[][] secondArray;

    public static void main(String[] args) {

        System.out.println("Sucin dvoch matic 4X4");
        firstFile = FileHandler.fileName("prveho");
        secondFile = FileHandler.fileName("druheho");
        FileHandler.parserCsv(FileHandler.getPath(firstFile));
        firstArray=FileHandler.myArray.clone();
        FileHandler.parserCsv(FileHandler.getPath(secondFile));
        secondArray=FileHandler.myArray.clone();
        System.out.println("==================================");
        FileHandler.matrixMultiplication(firstArray, secondArray);
        FileHandler.arrayOutput(FileHandler.matrixMultiplication);
    }

}

