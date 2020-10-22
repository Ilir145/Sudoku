package be.technifutur.java2020.sudoku.sudokuCommun;

import be.technifutur.java2020.sudoku.sudoku4x4.User;
import be.technifutur.java2020.sudoku.sudoku4x4.UserConsole;
import be.technifutur.java2020.sudoku.sudoku4x4.UserTest;
import be.technifutur.java2020.sudoku.sudoku9x9.Sudoku9x9;
import be.technifutur.java2020.sudoku.sudoku9x9.Sudoku9x9Modele;
import be.technifutur.java2020.sudoku.sudoku9x9.Sudoku9x9Vue;
import be.technifutur.java2020.sudoku.sudokuEtoile.SudokuEtoileCtrl;
import be.technifutur.java2020.sudoku.sudokuEtoile.SudokuEtoileModele;
import be.technifutur.java2020.sudoku.sudokuEtoile.SudokuEtoileVue;

public class SudokuCommunCtrl {
    SudokuCommunVue vue;
    SudokuCommunModele modele;
    private  String formatEncodage;

    public void setVue(SudokuCommunVue vue) {
        this.vue = vue;
    }

    public void setFormatEncodage(String formatEncodage) {
        this.formatEncodage = formatEncodage;
    }

    public void setModele(SudokuCommunModele modele) {
        this.modele = modele;
    }

    public String modifModele(User user){

        System.out.println("Input ou q/Q pour quitter :");
        String input = user.getString();

        if(input.equalsIgnoreCase("q")){
            System.out.println("Au revoir");
        }
        else {
            if ( input.matches( formatEncodage )) {
                String[] tabS = input.split("\\.");
                this.modele.setValue(tabS[2].charAt(0), Integer.parseUnsignedInt(tabS[0]) - 1, Integer.parseUnsignedInt(tabS[1]) - 1);
            }
            else {
                System.out.println("Erreur de format! Le format attendu est x.x.x");
            }
            this.vue.afficheGrille();
        }
        return input;

    }

    public  void modifModeleNfois(User user){

        String choix = "a";
        while ( !choix.equalsIgnoreCase("q") ){
            choix = this.modifModele(user);

        }

    }

    public static void main(String... args){

        SudokuEtoileModele modele = new SudokuEtoileModele();
        SudokuEtoileVue vue = new SudokuEtoileVue();
        SudokuCommunCtrl ctrl = new SudokuCommunCtrl();
        UserConsole userC = new UserConsole();
        UserTest userT = new UserTest();
        ctrl.setFormatEncodage("(([1-2][0-9])|([1-9]))\\.(([1-2][0-9])|([1-9]))\\.[1-9]");

        System.out.println(modele.getGrilleDim());
        ctrl.setVue(vue);
        ctrl.vue.setModele(modele);
        ctrl.vue.afficheGrille();
        ctrl.setModele(modele);
        ctrl.modifModeleNfois(userC);

    }
}
