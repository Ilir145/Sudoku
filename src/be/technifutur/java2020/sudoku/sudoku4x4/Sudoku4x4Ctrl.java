package be.technifutur.java2020.sudoku.sudoku4x4;

import java.util.Scanner;

public class Sudoku4x4Ctrl {
    private Sudoku4x4Vue vue = new Sudoku4x4Vue();
    private Sudoku4x4Modele modele = new Sudoku4x4Modele();

    public void setVue(Sudoku4x4Vue vue) {
        this.vue = vue;
    }

    public void setModele(Sudoku4x4Modele modele) {
        this.modele = modele;
    }

    public String modifModele(User user){

        System.out.println("Input ou q/Q pour quitter :");
        String input = user.getString();

        if(input.equalsIgnoreCase("q")){
            System.out.println("Au revoir");
        }
        else {
            if (input.charAt(1) == '.' && input.charAt(3) == '.') {
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
        Sudoku4x4Modele modele = new Sudoku4x4Modele();
        Sudoku4x4Vue vue = new Sudoku4x4Vue();
        Sudoku4x4Ctrl ctrl = new Sudoku4x4Ctrl();
        UserConsole userC = new UserConsole();
        UserTest userT = new UserTest();

        ctrl.setVue(vue);
        ctrl.vue.setModele(modele);
        ctrl.vue.afficheGrille();
        ctrl.setModele(modele);
        ctrl.modifModeleNfois(userT);

    }
}
