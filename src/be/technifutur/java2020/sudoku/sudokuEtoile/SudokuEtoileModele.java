package be.technifutur.java2020.sudoku.sudokuEtoile;

import be.technifutur.java2020.sudoku.sudokuCommun.SudokuCommunModele;

public class SudokuEtoileModele extends SudokuCommunModele {

    private char[] tabValide = {'1','2','3','4','5','6','7','8','9'};

    public SudokuEtoileModele() {
        super(21, 21);
    }


    public  boolean dansGrille(int ligne,int col){
        boolean rp = false;

        if(!(((col>8 && col <12) && !(ligne > 5 && ligne < 15)) || ((ligne>8 && ligne <12) && !(col > 5 && col < 15))))
        {
            rp = true;
        }

        return rp;
    }

    @Override
    public char[] tabValide() {
        return tabValide;
    }


}
