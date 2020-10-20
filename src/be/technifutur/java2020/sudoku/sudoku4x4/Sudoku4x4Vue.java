package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.MenuSudoku;
import be.technifutur.java2020.sudoku.Sudoku;
import be.technifutur.java2020.sudoku.sudokuCommun.SudokuCommunVue;

public class Sudoku4x4Vue extends SudokuCommunVue implements Sudoku {

    @Override
    public void afficheGrilleVide() {
        System.out.println(this.grilleVide);
    }

    public Sudoku4x4Vue() {
        super("" + "+--------+--------+\n"+
                "|  .  .  |  .  .  |\n"+
                "|  .  .  |  .  .  |\n"+
                "+--------+--------+\n"+
                "|  .  .  |  .  .  |\n"+
                "|  .  .  |  .  .  |\n"+
                "+--------+--------+\n");
    }


}
