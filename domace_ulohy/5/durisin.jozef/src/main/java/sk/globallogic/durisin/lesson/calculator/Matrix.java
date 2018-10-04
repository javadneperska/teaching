package sk.globallogic.durisin.lesson.calculator;

import java.util.ArrayList;


/**
 * Class for representing a matrix.
 */
public class Matrix {
    private ArrayList<ArrayList<Integer>> matrix;
    private ArrayList<ArrayList<Integer>> columns;

    /**
     * Initializes a matrix.
     *
     * @param matrixList values
     */
    public Matrix(final ArrayList<ArrayList<Integer>> matrixList) {
        matrix = matrixList;

        columns = new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (ArrayList<Integer> row: matrix) {
                tmp.add(row.get(i));
            }
            columns.add(tmp);
        }
    }

    /**
     * Gets matrix values as rows.
     *
     * @return rows
     */
    public ArrayList<ArrayList<Integer>> getMatrix() {
        return matrix;
    }

    /**
     * Gets matrix values as columns.
     *
     * @return columns
     */
    public ArrayList<ArrayList<Integer>> getColumns() {
        return columns;
    }

    /**
     * Multiplies matrices.
     *
     * @param b multiplicand matrix
     *
     * @return result matrix
     */
    public Matrix multi(final Matrix b) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (matrix.size() != b.getColumns().size()) {
            return null;
        }

        for (ArrayList<Integer> row: matrix) {
            ArrayList<Integer> resultRow = new ArrayList<>();
            for (ArrayList<Integer> column: b.getColumns()) {
                Integer resultValue = 0;
                for (int i = 0; i < column.size(); i++) {
                    resultValue += row.get(i) * column.get(i);
                }
                resultRow.add(resultValue);
            }
            result.add(resultRow);
        }

        return new Matrix(result);
    }

}
