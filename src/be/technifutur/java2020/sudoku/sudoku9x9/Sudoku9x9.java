package be.technifutur.java2020.sudoku.sudoku9x9;

import be.technifutur.java2020.sudoku.Sudoku;

public class Sudoku9x9 implements Sudoku {
    private String grille = "" +
            "+-----------+-----------+-----------+\n"+
            "|  .  .  .  |  .  .  .  |  .  .  .  |\n"+
            "|  .  .  .  |  .  .  .  |  .  .  .  |\n"+
            "|  .  .  .  |  .  .  .  |  .  .  .  |\n"+
            "+-----------+-----------+-----------+\n"+
            "|  .  .  .  |  .  .  .  |  .  .  .  |\n"+
            "|  .  .  .  |  .  .  .  |  .  .  .  |\n"+
            "|  .  .  .  |  .  .  .  |  .  .  .  |\n"+
            "+-----------+-----------+-----------+\n"+
            "|  .  .  .  |  .  .  .  |  .  .  .  |\n"+
            "|  .  .  .  |  .  .  .  |  .  .  .  |\n"+
            "|  .  .  .  |  .  .  .  |  .  .  .  |\n"+
            "+-----------+-----------+-----------+\n";


    public void afficheGrilleVide(){
        System.out.println(grille);
    }
}
