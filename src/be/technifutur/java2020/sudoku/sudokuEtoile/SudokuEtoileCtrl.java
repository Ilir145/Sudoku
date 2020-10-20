package be.technifutur.java2020.sudoku.sudokuEtoile;

import be.technifutur.java2020.sudoku.sudoku4x4.User;
import be.technifutur.java2020.sudoku.sudoku4x4.UserConsole;
import be.technifutur.java2020.sudoku.sudoku4x4.UserTest;

public class SudokuEtoileCtrl {
    private SudokuEtoileVue vue = new SudokuEtoileVue();
    private SudokuEtoileModele modele = new SudokuEtoileModele();

    public void setVue(SudokuEtoileVue vue) {
        this.vue = vue;
    }

    public void setModele(SudokuEtoileModele modele) {
        this.modele = modele;
    }

    public String modifModele(User user){

        System.out.println("Input ou q/Q pour quitter :");
        String input = user.getString();

        if(input.equalsIgnoreCase("q")){
            System.out.println("Au revoir");
        }
        else {
            if ( input.matches( "(([1-2][0-9])|([1-9]))\\.(([1-2][0-9])|([1-9]))\\.[1-9]" )) {
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
        SudokuEtoileCtrl ctrl = new SudokuEtoileCtrl();
        UserConsole userC = new UserConsole();
        UserTest userT = new UserTest();

        ctrl.setVue(vue);
        ctrl.vue.setModele(modele);
        ctrl.vue.afficheGrille();
        ctrl.setModele(modele);
        ctrl.modifModeleNfois(userC);

    }
}
