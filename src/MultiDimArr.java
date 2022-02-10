import java.util.Scanner;

public class MultiDimArr {


    public static void main(String[] args) {

        String[][] ticTacToe = {{" ", "│", " ", "│", " "},
                {"――――――"},
                {" ", "│", " ", "│", " "},
                {"――――――"},
                {" ", "│", " ", "│", " "}};
        Scanner move = new Scanner(System.in);
        System.out.println("Press enter to start");
        int count = 0;
        play(true, ticTacToe, move, count);
    }

    public static void  gameEnd (String[][] ticTacToe, int count){
        //horizontal win X
        if ((ticTacToe[0][0].equals("x") && ticTacToe[0][2].equals("x") && ticTacToe[0][4].equals("x")) || (ticTacToe[2][0].equals("x") && ticTacToe[2][2].equals("x") && ticTacToe[2][4].equals("x")) || (ticTacToe[4][0].equals("x") && ticTacToe[4][2].equals("x") && ticTacToe[4][4].equals("x"))){
            System.out.println("      X Wins!");
            System.exit(1);
        }
        //vertical win X
        if ((ticTacToe[0][0].equals("x") && ticTacToe[2][0].equals("x") && ticTacToe[4][0].equals("x")) || (ticTacToe[0][2].equals("x") && ticTacToe[2][2].equals("x") && ticTacToe[4][2].equals("x")) || (ticTacToe[0][4].equals("x") && ticTacToe[2][4].equals("x") && ticTacToe[4][4].equals("x"))){
            System.out.println("      X Wins!");
            System.exit(1);
        }
        //diagonal win X
        if((ticTacToe[0][0].equals("x") && ticTacToe[2][2].equals("x") && ticTacToe[4][4].equals("x")) || (ticTacToe[0][4].equals("x") && ticTacToe[2][2].equals("x") && ticTacToe[0][4].equals("x"))){
            System.out.println("      X Wins!");
            System.exit(1);
        }
        //horizontal win O
        if ((ticTacToe[0][0].equals("o") && ticTacToe[0][2].equals("o") && ticTacToe[0][4].equals("o")) || (ticTacToe[2][0].equals("o") && ticTacToe[2][2].equals("o") && ticTacToe[2][4].equals("o")) || (ticTacToe[4][0].equals("o") && ticTacToe[4][2].equals("o") && ticTacToe[4][4].equals("o"))){
            System.out.println("      O Wins!");
            System.exit(1);
        }
        //vertical win O
        if ((ticTacToe[0][0].equals("o") && ticTacToe[2][0].equals("o") && ticTacToe[4][0].equals("o")) || (ticTacToe[0][2].equals("o") && ticTacToe[2][2].equals("o") && ticTacToe[4][2].equals("o")) || (ticTacToe[0][4].equals("o") && ticTacToe[2][4].equals("o") && ticTacToe[4][4].equals("o"))){
            System.out.println("      O Wins!");
            System.exit(1);
        }
        //diagonal win O
        if((ticTacToe[0][0].equals("o") && ticTacToe[2][2].equals("o") && ticTacToe[4][4].equals("o")) || (ticTacToe[0][4].equals("o") && ticTacToe[2][2].equals("o") && ticTacToe[4][0].equals("o"))){
            System.out.println("      O Wins!");
            System.exit(1);
        }
        if (count == 9){
            System.out.println("      It's a Tie!");
            System.exit(1);
        }

    }

    public static void play(Boolean turnX, String[][] ticTacToe, Scanner move, int count){
        String playerMove = move.nextLine();
        if (count % 2 == 0){
            turnX = false;
        }else{
            turnX = true;
        }
        // top left (0,0)
        // top middle (0,2)
        // top right (0,4)
        // mid left (2,0)
        // mid middle (2,2)
        // mid right (2,4)
        // bot left (4,0)
        // bot middle (4,2)
        // bot right (4,4)

        if (playerMove.equals("11")){
            if (ticTacToe[0][0].equals("x") || ticTacToe[0][0].equals("o")) {
                System.out.println("Error: Choose an Open Space");
                count--;
            } else if (turnX) {
                ticTacToe[0][0] = "x";
                count++;
            } else {
                ticTacToe[0][0] = "o";
                count++;
            }
        }

        if (playerMove.equals("12")){
            if (ticTacToe[0][2].equals("x") || ticTacToe[0][2].equals("o")) {
                System.out.println("Error: Choose an Open Space");
                count--;
            } else if (turnX) {
                ticTacToe[0][2] = "x";
                count++;
            } else {
                ticTacToe[0][2] = "o";
                count++;
            }
        }
        if (playerMove.equals("13")){
            if (ticTacToe[0][4].equals("x") || ticTacToe[0][4].equals("o")) {
                System.out.println("Error: Choose an Open Space");
                count--;
            } else if (turnX) {
                ticTacToe[0][4] = "x";
                count++;
            } else {
                ticTacToe[0][4] = "o";
                count++;
            }
        }
        if (playerMove.equals("21")){
            if (ticTacToe[2][0].equals("x") || ticTacToe[2][0].equals("o")) {
                System.out.println("Error: Choose an Open Space");
                count--;
            } else if (turnX) {
                ticTacToe[2][0] = "x";
                count++;
            } else {
                ticTacToe[2][0] = "o";
                count++;
            }
        }
        if (playerMove.equals("22")){
            if (ticTacToe[2][2].equals("x") || ticTacToe[2][2].equals("o")) {
                System.out.println("Error: Choose an Open Space");
                count--;
            } else if (turnX) {
                ticTacToe[2][2] = "x";
                count++;
            } else {
                ticTacToe[2][2] = "o";
                count++;
            }
        }
        if (playerMove.equals("23")){
            if (ticTacToe[2][4].equals("x") || ticTacToe[2][4].equals("o")) {
                System.out.println("Error: Choose an Open Space");
                count--;
            } else if (turnX) {
                ticTacToe[2][4] = "x";
                count++;
            } else {
                ticTacToe[2][4] = "o";
                count++;
            }
        }
        if (playerMove.equals("31")){
            if (ticTacToe[4][0].equals("x") || ticTacToe[4][0].equals("o")) {
                System.out.println("Error: Choose an Open Space");
                count--;
            } else if (turnX) {
                ticTacToe[4][0] = "x";
                count++;
            } else {
                ticTacToe[4][0] = "o";
                count++;
            }
        }
        if (playerMove.equals("32")){
            if (ticTacToe[4][2].equals("x") || ticTacToe[4][2].equals("o")) {
                System.out.println("Error: Choose an Open Space");
                count--;
            } else if (turnX) {
                ticTacToe[4][2] = "x";
                count++;
            } else {
                ticTacToe[4][2] = "o";
                count++;
            }
        }
        if (playerMove.equals("33")){
            if (ticTacToe[4][4].equals("x") || ticTacToe[4][4].equals("o")) {
                System.out.println("Error: Choose an Open Space");
                count--;
            } else if (turnX) {
                ticTacToe[4][4] = "x";
                count++;
            } else {
                ticTacToe[4][4] = "o";
                count++;
            }
        }


        for (int i = 0; i < ticTacToe.length; i++) {
            System.out.println();
            for (int j = 0; j < ticTacToe[i].length; j++) {
                System.out.print(ticTacToe[i][j] + " ");
            }
        }


        gameEnd(ticTacToe, count);
        play(turnX, ticTacToe, move, count);


    }
}