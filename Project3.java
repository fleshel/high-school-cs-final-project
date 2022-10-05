import java.util.Scanner;
/**
 * Write a description of class Project3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Project3
{

    public static void main(String[] args)
    {
        System.out.println("Player 1 is x, Player 2 is o.\nPlayer 1 will use numbers (1-9) to specify their next position.\n Player 2 will use letters (a-g) to specify their next position.");
        // System.out.println("Would you like the computer to be random or smart? Enter random or smart.");
        int turn = 1;
        String board = "";
        board+=input(turn);
        makeBoard(board);
        turn++;
        board+=input(turn);
        makeBoard(board);
    }

    public static int player(int turn)
    {
        if((turn % 2) != 0){
            System.out.println("It is player 1's turn.");
            return 1;
        } else {
            System.out.println("It is player 2's turn.");
            return 2;
        }
    }

    public static String makeBoard(String x){
        if(x.indexOf("1") != -1){
            System.out.print("x|");
        } else if(x.indexOf("a") != -1) {
            System.out.print("o|");
        } else {
            System.out.print(" |");
        }
        if(x.indexOf("2") != -1){
            System.out.print("x|");
        } else if(x.indexOf("b") != -1) {
            System.out.print("o|");
        } else {
            System.out.print(" |");
        }
        if(x.indexOf("3") != -1){
            System.out.println("x");
        } else if(x.indexOf("c") != -1) {
            System.out.println("o");
        } else {
            System.out.println(" ");
        }
        if(x.indexOf("4") != -1){
            System.out.print("x|");
        } else if(x.indexOf("d") != -1) {
            System.out.print("o|");
        } else {
            System.out.print(" |");
        }
        if(x.indexOf("5") != -1){
            System.out.print("x|");
        } else if(x.indexOf("d") != -1) {
            System.out.print("o|");
        } else {
            System.out.print(" |");
        }
        if(x.indexOf("6") != -1){
            System.out.println("x");
        } else if(x.indexOf("e") != -1) {
            System.out.println("o");
        } else {
            System.out.println(" ");
        }
        if(x.indexOf("7") != -1){
            System.out.print("x|");
        } else if(x.indexOf("f") != -1) {
            System.out.print("o|");
        } else {
            System.out.print(" |");
        }
        if(x.indexOf("8") != -1){
            System.out.print("x|");
        } else if(x.indexOf("g") != -1) {
            System.out.print("o|");
        } else {
            System.out.print(" |");
        }
        if(x.indexOf("9") != -1){
            System.out.println("x");
        } else if(x.indexOf("e") != -1) {
            System.out.println("o");
        } else {
            System.out.println(" ");
        }
        return "";
    }

    public static String input(int player){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.next();
    }

}
