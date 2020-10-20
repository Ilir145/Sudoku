package be.technifutur.java2020.sudoku;

import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Vue;
import be.technifutur.java2020.sudoku.sudoku9x9.Sudoku9x9;
import be.technifutur.java2020.sudoku.sudokuEtoile.SudokuEtoile;

import java.util.Scanner;

public class MenuSudoku {
    public void run() {
        Scanner sc = new Scanner(System.in);
        String choix = null;

        do {

            System.out.println("+-------Menu------+");
            System.out.println("1)  4 x 4         |");
            System.out.println("2)  9 x 9         |");
            System.out.println("3)  Etoile        |");
            System.out.println("4)  Quitter       |");
            System.out.println("+-----------------+");
            System.out.println("Votre choix : ");

            choix = sc.nextLine();
            switch (Integer.parseUnsignedInt(choix)) {
                case 1:
                    Sudoku4x4Vue s4 = new Sudoku4x4Vue();
                    s4.afficheGrilleVide();
                    break;
                case 2:
                    Sudoku9x9 s9 = new Sudoku9x9();
                    s9.afficheGrilleVide();
                    break;
                case 3:
                    SudokuEtoile sE = new SudokuEtoile();
                    sE.afficheGrilleVide();
                    break;
                case 4:
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("La valeur n est pas comrpise dans le menu");
            }
        } while (Integer.parseUnsignedInt(choix) != 4);
    }


}
