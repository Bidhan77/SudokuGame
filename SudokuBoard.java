import java.util.*;

public class SudokuBoard {
    // An AL of Arrays set to accept 3 arrays.
    ArrayList<int[]> firstLineOfThree = new ArrayList<int[]>(3);
    ArrayList<int[]> secondLineOfThree = new ArrayList<int[]>(3);
    ArrayList<int[]> thirdLineOfThree = new ArrayList<int[]>(3);
    // Integer arrays which represent each row of the Sudoku Game.
    private int[] lineOne = {2, 9, 6, 3, 1, 8, 5, 7, 4};
    private int[] lineTwo = {5, 8, 4, 9, 7, 2, 6, 1, 3};
    private int[] lineThree = {7, 1, 3, 6, 4, 5, 2, 8, 9};
    private int[] lineFour = {6, 2, 5, 8, 9, 7, 3, 4, 1};
    private int[] lineFive = {9, 3, 1, 4, 2, 6, 8, 5, 7};
    private int[] lineSix = {4, 7, 8, 5, 3, 1, 9, 2, 6};
    private int[] lineSeven = {1, 6, 7, 2, 5, 3, 4, 9, 8};
    private int[] lineEight = {8, 5, 9, 7, 6, 4, 1, 3, 2};
    private int[] lineNine = {3, 4, 2, 1, 8, 9, 7, 6, 5};

    private int[][] finalBoard = new int[9][9];

    public int[][] getFinalBoard(){
        return finalBoard;
    }

    // Constructs Sudoku Board
    public SudokuBoard(){
        initializeLinesOfThrees(lineOne, lineTwo, lineThree, lineFour, lineFive, lineSix, lineSeven, lineEight,
                lineNine);
        createBoard();
        hideBoardValues();
    }

    // Initializes the three lines of three
    private void initializeLinesOfThrees(int[] lineOne, int[] lineTwo, int[] lineThree, int[] lineFour, int[] lineFive,
                                         int[] lineSix, int[] lineSeven, int[] lineEight, int[] lineNine){
        firstLineOfThree.add(lineOne);
        firstLineOfThree.add(lineTwo);
        firstLineOfThree.add(lineThree);

        secondLineOfThree.add(lineFour);
        secondLineOfThree.add(lineFive);
        secondLineOfThree.add(lineSix);

        thirdLineOfThree.add(lineSeven);
        thirdLineOfThree.add(lineEight);
        thirdLineOfThree.add(lineNine);
    }

    private void constructLinesFromAL(ArrayList<int[]> al, int rowCounter){
        for (int alIndex = 0; alIndex < 3; alIndex++){
            for (int i = 0; i < 9; i++){
                // Ensures that the elements are placed in the proper coordinates of the 2D Array
                finalBoard[rowCounter + alIndex][i] = al.get(alIndex)[i];
            }
        }
    }

    private void createBoard() {
        constructLinesFromAL(firstLineOfThree, 0);
        constructLinesFromAL(secondLineOfThree, 3);
        constructLinesFromAL(thirdLineOfThree, 6);
    }

    // Hides the values of the board
    private void hideBoardValues(){
        Random rand = new Random();
        int randomRow;
        int randomColumn;
        for (int i = 0; i < 30; i++){
            randomRow = rand.nextInt(9);
            randomColumn = rand.nextInt(9);
            finalBoard[randomRow][randomColumn] = 0;
        }
    }

}