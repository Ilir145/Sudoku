package be.technifutur.java2020.sudoku.sudoku4x4;


import be.technifutur.java2020.sudoku.sudokuCommun.SudokuCommunModele;

public class Sudoku4x4Modele extends SudokuCommunModele {
    private char[] tabValide = {'1','2','3','4'};

    protected Sudoku4x4Modele() {
        super(4, 4);
    }

    @Override
    public boolean dansGrille(int ligne, int col) {
        if( ligne > 0 && ligne < 4 && col > 0 && col <4 )
            return true;
        else
            return false;
    }

    @Override
    public char[] tabValide() {
        return this.tabValide;
    }

}
