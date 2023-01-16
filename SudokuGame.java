import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class SudokuGame extends JFrame implements ActionListener {
    // is-a JFrame

    private SudokuBoard board;

    private JPanel gamePanel;
    private JPanel sub3by3Panel1;
    private JPanel sub3by3Panel2;
    private JPanel sub3by3Panel3;
    private JPanel sub3by3Panel4;
    private JPanel sub3by3Panel5;
    private JPanel sub3by3Panel6;
    private JPanel sub3by3Panel7;
    private JPanel sub3by3Panel8;
    private JPanel sub3by3Panel9;

    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;
    private JTextField tf7;
    private JTextField tf8;
    private JTextField tf9;
    private JTextField tf10;
    private JTextField tf11;
    private JTextField tf12;
    private JTextField tf13;
    private JTextField tf14;
    private JTextField tf15;
    private JTextField tf16;
    private JTextField tf17;
    private JTextField tf18;
    private JTextField tf19;
    private JTextField tf20;
    private JTextField tf21;
    private JTextField tf22;
    private JTextField tf23;
    private JTextField tf24;
    private JTextField tf25;
    private JTextField tf26;
    private JTextField tf27;
    private JTextField tf28;
    private JTextField tf29;
    private JTextField tf30;
    private JTextField tf31;
    private JTextField tf32;
    private JTextField tf33;
    private JTextField tf34;
    private JTextField tf35;
    private JTextField tf36;
    private JTextField tf37;
    private JTextField tf38;
    private JTextField tf39;
    private JTextField tf40;
    private JTextField tf41;
    private JTextField tf42;
    private JTextField tf43;
    private JTextField tf44;
    private JTextField tf45;
    private JTextField tf46;
    private JTextField tf47;
    private JTextField tf48;
    private JTextField tf49;
    private JTextField tf50;
    private JTextField tf51;
    private JTextField tf52;
    private JTextField tf53;
    private JTextField tf54;
    private JTextField tf55;
    private JTextField tf56;
    private JTextField tf57;
    private JTextField tf58;
    private JTextField tf59;
    private JTextField tf60;
    private JTextField tf61;
    private JTextField tf62;
    private JTextField tf63;
    private JTextField tf64;
    private JTextField tf65;
    private JTextField tf66;
    private JTextField tf67;
    private JTextField tf68;
    private JTextField tf69;
    private JTextField tf70;
    private JTextField tf71;
    private JTextField tf72;
    private JTextField tf73;
    private JTextField tf74;
    private JTextField tf75;
    private JTextField tf76;
    private JTextField tf77;
    private JTextField tf78;
    private JTextField tf79;
    private JTextField tf80;
    private JTextField tf81;

    private Font font1;

    private JButton newGame;

    private JTextField[] subPanelOneJTF;
    private JTextField[] subPanelTwoJTF;
    private JTextField[] subPanelThreeJTF;
    private JTextField[] subPanelFourJTF;
    private JTextField[] subPanelFiveJTF;
    private JTextField[] subPanelSixJTF;
    private JTextField[] subPanelSevenJTF;
    private JTextField[] subPanelEightJTF;
    private JTextField[] subPanelNineJTF;

    private JTextField[][] jtfArray;

    public static void main (String[] args){
        new SudokuGame();
    }

    public SudokuGame() {
        // Initialize the GUI Here.
        font1 = new Font(Font.SANS_SERIF, Font.BOLD, 24);

        // Each sub panel will be composed of 9 JTextFields in a 3by3 alignment.
        tf1 = constructJTextFields(tf1);
        tf2 = constructJTextFields(tf2);
        tf3 = constructJTextFields(tf3);
        tf4 = constructJTextFields(tf4);
        tf5 = constructJTextFields(tf5);
        tf6 = constructJTextFields(tf6);
        tf7 = constructJTextFields(tf7);
        tf8 = constructJTextFields(tf8);
        tf9 = constructJTextFields(tf9);
        tf10 = constructJTextFields(tf10);
        tf11 = constructJTextFields(tf11);
        tf12 = constructJTextFields(tf12);
        tf13 = constructJTextFields(tf13);
        tf14 = constructJTextFields(tf14);
        tf15 = constructJTextFields(tf15);
        tf16 = constructJTextFields(tf16);
        tf17 = constructJTextFields(tf17);
        tf18 = constructJTextFields(tf18);
        tf19 = constructJTextFields(tf19);
        tf20 = constructJTextFields(tf20);
        tf21 = constructJTextFields(tf21);
        tf22 = constructJTextFields(tf22);
        tf23 = constructJTextFields(tf23);
        tf24 = constructJTextFields(tf24);
        tf25 = constructJTextFields(tf25);
        tf26 = constructJTextFields(tf26);
        tf27 = constructJTextFields(tf27);
        tf28 = constructJTextFields(tf28);
        tf29 = constructJTextFields(tf29);
        tf30 = constructJTextFields(tf30);
        tf31 = constructJTextFields(tf31);
        tf32 = constructJTextFields(tf32);
        tf33 = constructJTextFields(tf33);
        tf34 = constructJTextFields(tf34);
        tf35 = constructJTextFields(tf35);
        tf36 = constructJTextFields(tf36);
        tf37 = constructJTextFields(tf37);
        tf38 = constructJTextFields(tf38);
        tf39 = constructJTextFields(tf39);
        tf40 = constructJTextFields(tf40);
        tf41 = constructJTextFields(tf41);
        tf42 = constructJTextFields(tf42);
        tf43 = constructJTextFields(tf43);
        tf44 = constructJTextFields(tf44);
        tf45 = constructJTextFields(tf45);
        tf46 = constructJTextFields(tf46);
        tf47 = constructJTextFields(tf47);
        tf48 = constructJTextFields(tf48);
        tf49 = constructJTextFields(tf49);
        tf50 = constructJTextFields(tf50);
        tf51 = constructJTextFields(tf51);
        tf52 = constructJTextFields(tf52);
        tf53 = constructJTextFields(tf53);
        tf54 = constructJTextFields(tf54);
        tf55 = constructJTextFields(tf55);
        tf56 = constructJTextFields(tf56);
        tf57 = constructJTextFields(tf57);
        tf58 = constructJTextFields(tf58);
        tf59 = constructJTextFields(tf59);
        tf60 = constructJTextFields(tf60);
        tf61 = constructJTextFields(tf61);
        tf62 = constructJTextFields(tf62);
        tf63 = constructJTextFields(tf63);
        tf64 = constructJTextFields(tf64);
        tf65 = constructJTextFields(tf65);
        tf66 = constructJTextFields(tf66);
        tf67 = constructJTextFields(tf67);
        tf68 = constructJTextFields(tf68);
        tf69 = constructJTextFields(tf69);
        tf70 = constructJTextFields(tf70);
        tf71 = constructJTextFields(tf71);
        tf72 = constructJTextFields(tf72);
        tf73 = constructJTextFields(tf73);
        tf74 = constructJTextFields(tf74);
        tf75 = constructJTextFields(tf75);
        tf76 = constructJTextFields(tf76);
        tf77 = constructJTextFields(tf77);
        tf78 = constructJTextFields(tf78);
        tf79 = constructJTextFields(tf79);
        tf80 = constructJTextFields(tf80);
        tf81 = constructJTextFields(tf81);

        makeArray();

        sub3by3Panel1 = addJtfToPanel(1, sub3by3Panel1, tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9);
        sub3by3Panel2 = addJtfToPanel(2, sub3by3Panel2, tf10, tf11, tf12, tf13, tf14, tf15, tf16, tf17, tf18);
        sub3by3Panel3 = addJtfToPanel(3, sub3by3Panel3, tf19, tf20, tf21, tf22, tf23, tf24, tf25, tf26, tf27);
        sub3by3Panel4 = addJtfToPanel(4, sub3by3Panel4, tf28, tf29, tf30, tf31, tf32, tf33, tf34, tf35, tf36);
        sub3by3Panel5 = addJtfToPanel(5, sub3by3Panel5, tf37, tf38, tf39, tf40, tf41, tf42, tf43, tf44, tf45);
        sub3by3Panel6 = addJtfToPanel(6, sub3by3Panel6, tf46, tf47, tf48, tf49, tf50, tf51, tf52, tf53, tf54);
        sub3by3Panel7 = addJtfToPanel(7, sub3by3Panel7, tf55, tf56, tf57, tf58, tf59, tf60, tf61, tf62, tf63);
        sub3by3Panel8 = addJtfToPanel(8, sub3by3Panel8, tf64, tf65, tf66, tf67, tf68, tf69, tf70, tf71, tf72);
        sub3by3Panel9 = addJtfToPanel(9, sub3by3Panel9, tf73, tf74, tf75, tf76, tf77, tf78, tf79, tf80, tf81);

        // BUTTON
        newGame = new JButton("New Game");
        newGame.addActionListener(this);

        gamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 2, 2));
        // Constructor removes default 5 pixel gap between it's elements

        gamePanel.add(sub3by3Panel1);
        gamePanel.add(sub3by3Panel2);
        gamePanel.add(sub3by3Panel3);
        gamePanel.add(sub3by3Panel4);
        gamePanel.add(sub3by3Panel5);
        gamePanel.add(sub3by3Panel6);
        gamePanel.add(sub3by3Panel7);
        gamePanel.add(sub3by3Panel8);
        gamePanel.add(sub3by3Panel9);
        gamePanel.add(newGame);


        getContentPane().add(gamePanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(490, 600);
        setResizable(false);
        setTitle("Sudoku");
        setVisible(true);
    }

    private void makeArray(){
        jtfArray = new JTextField[][]
                {
                        {tf1, tf2, tf3, tf10, tf11, tf12, tf19, tf20, tf21},
                        {tf4, tf5, tf6, tf13, tf14, tf15, tf22, tf23, tf24},
                        {tf7, tf8, tf9, tf16, tf17, tf18, tf25, tf26, tf27},
                        {tf28, tf29, tf30, tf37, tf38, tf39, tf46, tf47, tf48},
                        {tf31, tf32, tf33, tf40, tf41, tf42, tf49, tf50, tf51},
                        {tf34, tf35, tf36, tf43, tf44, tf45, tf52, tf53, tf54},
                        {tf55, tf56, tf57, tf64, tf65, tf66, tf73, tf74, tf75},
                        {tf58, tf59, tf60, tf67, tf68, tf69, tf76, tf77, tf78},
                        {tf61, tf62, tf63, tf70, tf71, tf72, tf79, tf80, tf81}
                };
    }

    /**
     * {@code constructJTextFields} consumes a JTextField, {@code jtf}, and formats its preferredSize, Font and Alignment.
     *
     * @param jtf The JTextField to be formatted
     * @return A JTextField that has been formatted
     */
    private JTextField constructJTextFields(JTextField jtf){
        jtf = new JTextField();
        jtf.setPreferredSize(new Dimension(50, 50));
        jtf.setFont(font1);
        jtf.setHorizontalAlignment(JTextField.CENTER);
        jtf.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        // When the JTextField's editability is altered, it's background changes by default. This makes it so that
        // the background colour that it is changed to is the same as it was before.


        // Anonymous class.
        KeyListener keyListener = new KeyListener() {
            public void keyPressed(KeyEvent keyEvent) {
                // A few things must be added when a typing in a JTF.
                // 1) Only allow single character values of 1-9.
                // 2) Ensure that when a valid char is entered, it already doesn't exist in the row/col/box
                // If it does, then make the two JTF have background red (with equal char val), indicating you messed up

                System.out.println("event fired!!! keyPressed");
                JTextField textField = (JTextField) keyEvent.getSource();
                // Source of the keyEvent is JTextField but method returns type Object, so cast must be done.

                textField.setText("");
                // THIS MAKES IT SO THAT ONLY ONE CHARACTER IS SHOWN ON THE SCREEN, ERASING THE PREVIOUS CHARACTER.
                // AN ISSUE OCCURS WHEN YOU WANT TO RETRIEVE THE VALUE OF THE JTF. IT WILL GIVE YOU THE PREVIOUS VALUE
                // (i.e. "" if nothing only one changed occured). The keyReleased method solves this.

                if (!isValidCharacter(keyEvent)) {
                    // Remove character
                    textField.setEditable(false);
                    System.out.println("Not valid key");
                } else {
                    // If a previously typed in-valid character made jtf uneditable, typing a valid char will make it
                    // editable
                    textField.setEditable(true);
                }
            }

            // Finds the index value of the JTF. Return -1, -1 if nothing found.
            private int[] findJtfIn2DArray(JTextField textField) {
                int[] returningArr = {-1, -1};

                for (int row = 0; row < 9; row++){
                    for (int col = 0; col < 9; col++){
                        if (textField.equals(jtfArray[row][col])){
                            returningArr[0] = row;
                            returningArr[1] = col;
                            return returningArr;
                        }
                    }
                }
                // Nothing found
                return returningArr;
            }

            public void keyReleased(KeyEvent keyEvent) {
                // add red textbox shit in here.

                System.out.println("event fired!!! keyReleased");
                JTextField textField = (JTextField) keyEvent.getSource();
                // Source of the keyEvent is JTextField but method returns type Object, so cast must be done.

                // Find out which JTF is equal to "textField" via a loop. This will get the column and row number of the
                // JTF and you can then do another itteration to see if Row/Col has that number. Not sure about Box yet.
                int[] jtfIndexValues = findJtfIn2DArray(textField);
                int jtfRow = jtfIndexValues[0];
                int jtfCol = jtfIndexValues[1];

                // We now have the row and column of the JTF in the jtfArray.
                // Now we need to check rows/col/box for equal num.
                String valueInputted = "" + (keyEvent.getKeyChar());

                // WE WANT TO MAKE IT SO THAT IF WE TYPE IN A NUMBER THAT BREAKS THE LAW, THEN HIGHLIGHT THE JTF WITH
                // RED. THAT IS, THE TYPED NUMBER THAT BROKE THE LAW WILL MAKE ALL JTF OF SAID NUMBER RED.


                // 1) FIRST STEP IS TO CHECK IF THE ROW HAS DUPES. IF SO, MAKE JTF RED.
                boolean areDupesInRow = checkRowForDuplicates(jtfArray[jtfRow], textField, valueInputted);

                // 2) DO THE SAME THING FOR COLUMNS.
                boolean areDupesInCol = checkColumnForDuplicates(textField, valueInputted, jtfCol);

                // 3) DO THE SAME FOR BOXES
                boolean areDupesInBox = checkBoxForDuplicates(jtfRow, jtfCol, textField, valueInputted);

                // Clear all red JTF. We will recolour if needed very soon
                //resetJTFColour();

                if (areDupesInCol || areDupesInRow || areDupesInBox){
                    // Duplicates exist. Set all JTF that is = valueInputted to bg color red and ensure that you cannot
                    // click on any other JTF until you resolve this issue.
                    System.out.println("dupes exist");

                    // STILL NEED TO MAKE IT RED
                    setJTFColorRed(valueInputted, areDupesInBox, areDupesInCol, areDupesInRow, jtfRow, jtfCol);
                    // RESTRICTS ANY ACCESS TO ANY OTHER JTF
                    restrictAllJTFAccessButFocused(jtfRow, jtfCol, false);
                } else {
                    resetJTFColour();
                    restrictAllJTFAccessButFocused(jtfRow, jtfCol, true);
                    restrictGeneratedJTFAccess(board);
                }
            }

            private void restrictAllJTFAccessButFocused(int jtfRow, int jtfCol, boolean toClear){
                for (int row = 0; row < 9; row++){
                    for (int col = 0; col < 9; col++){
                        // If we want to set it back to editable
                        if (toClear) {
                            jtfArray[row][col].setEditable(true);
                        } else {
                            if (!(row == jtfRow && col == jtfCol)){
                                jtfArray[row][col].setEditable(false);
                            }
                        }
                    }
                }
            }

            private JTextField[] findJTFArray(int row, int col){
                if (row < 3){
                    if (col < 3){
                        return subPanelOneJTF;
                    } else if (col < 6){
                        return subPanelTwoJTF;
                    } else {
                        return subPanelThreeJTF;
                    }
                } else if (row < 6){
                    if (col < 3){
                        return  subPanelFourJTF;
                    } else if (col < 6){
                        return subPanelFiveJTF;
                    } else {
                        return subPanelSixJTF;
                    }
                } else {
                    if (col < 3){
                        return subPanelSevenJTF;
                    } else if (col < 6){
                        return subPanelEightJTF;
                    } else {
                        return subPanelNineJTF;
                    }
                }
            }

            // Determines if there are any equal values within a box and highlights it red if so.
            private boolean checkBoxForDuplicates(int row, int col, JTextField jtf, String value){

                JTextField[] boxJTFArray = findJTFArray(row, col);

                // WE FOUND OUT WHICH BOX THE JTF IS IN, SEND TO THE ROW VERSION OF THIS METHOD.
                return checkRowForDuplicates(boxJTFArray, jtf, value);
            }

            // Determines if there are any equal values within a column and highlights it red if so.
            private boolean checkColumnForDuplicates(JTextField jtf, String value, int col){
                // Essentially the same thing as the rows version. All that needs to be done is to make an array
                // of the columns and send it to the rows method.
                return checkRowForDuplicates(createColumnValueArray(col), jtf, value);
            }

            // Creates an Array of JTF where it takes the one JTF from each row that all have the same column
            private JTextField[] createColumnValueArray(int col){
                JTextField[] columnJTFArray = new JTextField[9];

                for (int i = 0; i < 9; i++){
                    columnJTFArray[i] = jtfArray[i][col];
                }
                return columnJTFArray;
            }

            // Determines if there are any equal values within a row and highlights it red if so.
            private boolean checkRowForDuplicates(JTextField[] rowJTFArray, JTextField jtf, String value){

                for (JTextField element : rowJTFArray){
                    // Loops all the JTF in the jtfArray. Now we check the values of all JTF and compare it with "value"
                    // We must omit the event source from this though.

                    // Check if the JTF is the event source. This checks if they are not the same object.
                    if (element != jtf){
                        // Checks if the looped JTF has an identical value to the event source jtf.
                        if (element.getText().equals(value)){
                            return true;
                        }
                    }
                }

                return false;
            }

            // Makes all JTF that have broken law with focused JTF background color red.
            private void setJTFColorRed(String value, boolean dupesinBox, boolean dupesInCol, boolean dupesInRow,
                                        int row, int col){
                // We know the row and col of the JTF that is focused.

                if (dupesinBox){
                    for (JTextField element : findJTFArray(row, col)){
                        if (element.getText().equals(value)){
                            element.setBackground(Color.red);
                        }
                    }
                }

                if (dupesInCol) {
                    for (JTextField element : createColumnValueArray(col)){
                        if (element.getText().equals(value)){
                            element.setBackground(Color.red);
                        }
                    }
                }

                if (dupesInRow){
                    for (JTextField element : jtfArray[row]){
                        if (element.getText().equals(value)){
                            element.setBackground(Color.red);
                        }
                    }
                }
            }

            private boolean isValidCharacter(KeyEvent e){
                int input = Character.getNumericValue(e.getKeyChar());

                // Character.getNumericValue returns postive integer values above -1 if it is a valid integer. If not, it sends
                // integer values lower than -1 depending on if it is a number or not a number at all.
                if (input > -1) {
                    // Only concerned with numbers 1-9
                    if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input == 6 || input == 7
                            || input == 8 || input == 9){
                        return true;
                    }
                }
                return false;
            }

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
        };


        jtf.addKeyListener(keyListener);

        return jtf;

    }




    // Makes all JTF have BG colour white
    private void resetJTFColour(){
        // Colour is red meaning other JTF in array have red colour too. Clear all JTF colours.
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){
                jtfArray[row][col].setBackground(Color.white);
            }
        }
    }

    private JPanel addJtfToPanel(int subPanelNumber, JPanel subPanel, JTextField tf1, JTextField tf2, JTextField tf3,
                                 JTextField tf4,JTextField tf5, JTextField tf6, JTextField tf7, JTextField tf8,
                                 JTextField tf9){
        // We need to keep track of the subPanel's components. Using an array and manipulating it is the best way.
        switch (subPanelNumber){
            case 1:
                subPanelOneJTF = makeJTFArr(tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9);
                break;
            case 2:
                subPanelTwoJTF = makeJTFArr(tf10, tf11, tf12, tf13, tf14, tf15, tf16, tf17, tf18);
                break;
            case 3:
                subPanelThreeJTF = makeJTFArr(tf19, tf20, tf21, tf22, tf23, tf24, tf25, tf26, tf27);
                break;
            case 4:
                subPanelFourJTF = makeJTFArr(tf28, tf29, tf30, tf31, tf32, tf33, tf34, tf35, tf36);
                break;
            case 5:
                subPanelFiveJTF = makeJTFArr(tf37, tf38, tf39, tf40, tf41, tf42, tf43, tf44, tf45);
                break;
            case 6:
                subPanelSixJTF = makeJTFArr(tf46, tf47, tf48, tf49, tf50, tf51, tf52, tf53, tf54);
                break;
            case 7:
                subPanelSevenJTF = makeJTFArr(tf55, tf56, tf57, tf58, tf59, tf60, tf61, tf62, tf63);
                break;
            case 8:
                subPanelEightJTF = makeJTFArr(tf64, tf65, tf66, tf67, tf68, tf69, tf70, tf71, tf72);
                break;
            case 9:
                subPanelNineJTF = makeJTFArr(tf73, tf74, tf75, tf76, tf77, tf78, tf79, tf80, tf81);
                break;
        }

        subPanel = new JPanel(new GridLayout(3,3,1,1));
        subPanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));

        subPanel.add(tf1);
        subPanel.add(tf2);
        subPanel.add(tf3);
        subPanel.add(tf4);
        subPanel.add(tf5);
        subPanel.add(tf6);
        subPanel.add(tf7);
        subPanel.add(tf8);
        subPanel.add(tf9);

        return subPanel;
    }

    // Adds all JTFs into an array
    private JTextField[] makeJTFArr(JTextField tf1, JTextField tf2, JTextField tf3, JTextField tf4,JTextField tf5,
                                    JTextField tf6, JTextField tf7, JTextField tf8, JTextField tf9){
        JTextField[] jtfArray = {tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9};
        return jtfArray;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // We want to populate the textboxes with the numbers here.
        // The 0 values should be left blank
        // Other values must be readable only.

        // new game button
        board = new SudokuBoard();

        // finalBoard I.v has the values we want.

        // When we start a new game, we want to clear any pre-existing values on the baord. Ensure board is empty
        // Before populating
        clearJTextFields();
        resetJTFColour();

        // Make generated JTF values un-editable
        restrictGeneratedJTFAccess(board);
    }

    // Restricts access to any other JTF if a value inputted in one
    private void restrictGeneratedJTFAccess(SudokuBoard board){
        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){

                if (board.getFinalBoard()[row][col] != 0) {

                    JTextField temp = jtfArray[row][col];

                    temp.setText("" + board.getFinalBoard()[row][col]);
                    temp.setEditable(false);
                }
            }
        }
    }

    // Clears all JTF in the jtfArray
    private void clearJTextFields(){
        for (JTextField[] elementArr : jtfArray){
            for (JTextField element : elementArr){
                element.setText("");
            }
        }
    }
}
