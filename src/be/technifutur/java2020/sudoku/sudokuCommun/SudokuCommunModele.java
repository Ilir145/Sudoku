package be.technifutur.java2020.sudoku.sudokuCommun;

import java.util.EmptyStackException;

public abstract class SudokuCommunModele {
    protected char[][] grille ;
    static private char EMPTY = 0;

    protected SudokuCommunModele(int lig,int col){
        grille = new char[lig][col];
    }


    public boolean setValue(char val,int ligne,int col)
    {
        if(this.isValide(val) && this.dansGrille( ligne, col)){
            this.grille[ligne][col] = val;
        }
        return this.isValide(val) && this.dansGrille( ligne, col);

    }

    public char getValue(int ligne,int col){
        return this.grille[ligne][col];
    }

    public void remove(int lig,int col){
        grille[lig][col] = EMPTY;
    }
    public boolean isEmpty(int lig,int col){
        if(grille[lig][col] == 0)
        {
            return true;
        }
        else
            return false;
    }

    public abstract boolean dansGrille(int ligne,int col);

    public abstract char[] tabValide();

    public boolean isValide(char val) {
        boolean rp = false;

        for (int i = 0; i < this.tabValide().length; i++) {
            if (val == this.tabValide()[i]) {
                rp = true;
            }
        }
        return rp;
    }
}
