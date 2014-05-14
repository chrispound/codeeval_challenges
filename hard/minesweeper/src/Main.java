import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: p590032
 * Date: 5/14/14
 * Time: 11:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class Main {


    private static String currentLine;

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            while ((currentLine = reader.readLine()) != null) {
                //build matrix
                String[] positionAndData = currentLine.split(";");
                String[] ColumnAndRow = positionAndData[0].split(",");
                String[][] matrix = new String[Integer.parseInt(ColumnAndRow[0])][Integer.parseInt(ColumnAndRow[1])];
                String[] data = new String[positionAndData[1].length()];
                for(int f =0; f < positionAndData[1].length(); f++) {
                    data[f] = String.valueOf(positionAndData[1].charAt(f));
                }
                //build matrix
                //todo solve without building the matrix
                int dataPosition = 0;
                for (int f = 0; f < matrix.length; f++) {
                    for (int i = 0; i < matrix[f].length; i++) {
                        matrix[f][i] = data[dataPosition];
                        dataPosition++;
                    }
                }
                for (int row = 0; row < matrix.length; row++) {
                    String[] currentRow = matrix[row];
                    for (int column = 0; column < currentRow.length; column++) {
                        int mineCount = 0;
                        String currentData = currentRow[column];
                        if (!currentData.equalsIgnoreCase("*")) {
                            //toprow
                            if (row - 1 >= 0) {
                                if (column - 1 >= 0) {
                                    if (matrix[row - 1][column - 1] != null && matrix[row - 1][column - 1].equalsIgnoreCase("*")) {
                                        mineCount++;
                                    }
                                }
                                if (matrix[row - 1] != null && matrix[row - 1][column] != null && matrix[row - 1][column].equalsIgnoreCase("*")) {
                                    mineCount++;
                                }
                                if (column + 1 < matrix[row - 1].length) {
                                    if (matrix[row - 1] != null && matrix[row - 1][column + 1] != null && matrix[row - 1][column + 1].equalsIgnoreCase("*")) {
                                        mineCount++;
                                    }
                                }
                            }
                            //current row
                            if (column - 1 >= 0) {
                                if (matrix[row] != null && matrix[row][column - 1] != null && matrix[row][column - 1].equalsIgnoreCase("*")) {
                                    mineCount++;
                                }
                            }
                            if (column + 1 < matrix[row].length) {
                                if (matrix[row] != null && matrix[row][column + 1] != null && matrix[row][column + 1].equalsIgnoreCase("*")) {
                                    mineCount++;
                                }
                            }
                            //next row
                            if (row + 1 < matrix.length) {
                                if (column - 1 >= 0) {
                                    if (matrix[row + 1][column - 1] != null && matrix[row + 1][column - 1].equalsIgnoreCase("*")) {
                                        mineCount++;
                                    }
                                }
                                if (matrix[row + 1][column] != null && matrix[row + 1][column].equalsIgnoreCase("*")) {
                                    mineCount++;
                                }
                                if (column + 1 < matrix[row + 1].length) {
                                    if (matrix[row + 1][column + 1] != null && matrix[row + 1][column + 1].equalsIgnoreCase("*")) {
                                        mineCount++;
                                    }
                                }
                            }
                            currentRow[column] = String.valueOf(mineCount);
                        }
                        System.out.print(currentRow[column]);
                    }
                }
                System.out.println("");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
