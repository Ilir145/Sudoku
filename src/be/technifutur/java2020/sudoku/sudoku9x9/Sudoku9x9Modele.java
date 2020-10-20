package be.technifutur.java2020.sudoku.sudoku9x9;

import be.technifutur.java2020.sudoku.sudokuCommun.SudokuCommunModele;

public class Sudoku9x9Modele extends SudokuCommunModele {

    private char[] tabValide = {'1','2','3','4','5','6','7','8','9'};

    protected Sudoku9x9Modele() {
        super(9, 9);
    }

    @Override
    public boolean dansGrille(int ligne, int col) {
        if( ligne > 0 && ligne < 9 && col > 0 && col <9 )
            return true;
        else
            return false;
    }

    @Override
    public char[] tabValide() {
        return this.tabValide;
    }
}
