package be.technifutur.java2020.sudoku.sudoku9x9;

import be.technifutur.java2020.sudoku.Sudoku;
import be.technifutur.java2020.sudoku.sudokuCommun.SudokuCommunVue;


public class Sudoku9x9Vue extends SudokuCommunVue implements Sudoku  {

    @Override
    public void afficheGrilleVide() {
        System.out.println(this.grilleVide);
    }

    public Sudoku9x9Vue() {
         super("" +
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
                 "+-----------+-----------+-----------+\n");
    }


}
