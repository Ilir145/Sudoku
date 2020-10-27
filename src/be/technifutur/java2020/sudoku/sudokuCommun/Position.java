package be.technifutur.java2020.sudoku.sudokuCommun;

public class Position {

    private  int ligne;
    private int colonne;

    public Position(int ligne,int colonne) {
        this.colonne = colonne;
        this.ligne = ligne;
    }

    public int getColonne() {
        return colonne;
    }

    public int getLigne() {
        return ligne;
    }

    @Override
    public String toString() {
        return "Position{" +
                "ligne=" + ligne +
                ", colonne=" + colonne +
                '}';
    }
}
