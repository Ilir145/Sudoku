package be.technifutur.java2020.sudoku.sudokuCommun;

import be.technifutur.java2020.sudoku.sudoku9x9.Sudoku9x9Modele;

public abstract class SudokuCommunVue {
    protected String grilleVide;
    private  SudokuCommunModele modele;

    public void setModele(SudokuCommunModele modele) {
        this.modele = modele;
    }

    public SudokuCommunVue(String grille){
        grilleVide = grille;
    }




    public abstract void afficheGrilleVide();


    public void afficheGrille(){
        Character[] grille2 = new Character[(modele.getGrilleDim())*(modele.getGrilleDim())];
        int k = 0;
        for(int i = 0; i < (modele.getGrilleDim());i++){
            for(int j = 0; j < (modele.getGrilleDim());j++) {
                if (this.modele.dansGrille(i, j)) {
                    if (this.modele.getValue(i, j) != 0)
                        grille2[k] = this.modele.getValue(i, j);
                    else
                        grille2[k] = '.';
                    k++;
                }
            }
        }
        System.out.printf(grilleVide.replace(".","%s"),grille2);
    }



}
