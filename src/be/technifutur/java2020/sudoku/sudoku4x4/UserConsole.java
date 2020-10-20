package be.technifutur.java2020.sudoku.sudoku4x4;

import java.util.Scanner;

public class UserConsole implements User{

    Scanner sc = new Scanner(System.in);
    @Override
    public String getString() {
        return sc.nextLine();
    }


}
