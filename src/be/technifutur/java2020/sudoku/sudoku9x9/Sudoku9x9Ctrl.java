package be.technifutur.java2020.sudoku.sudoku9x9;


import be.technifutur.java2020.sudoku.sudoku4x4.User;
import be.technifutur.java2020.sudoku.sudoku4x4.UserConsole;
import be.technifutur.java2020.sudoku.sudoku4x4.UserTest;

public class Sudoku9x9Ctrl {
    private Sudoku9x9Vue vue = new Sudoku9x9Vue();
    private Sudoku9x9Modele modele = new Sudoku9x9Modele();

    public void setVue(Sudoku9x9Vue vue) {
        this.vue = vue;
    }

    public void setModele(Sudoku9x9Modele modele) {
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
        Sudoku9x9Modele modele = new Sudoku9x9Modele();
        Sudoku9x9Vue vue = new Sudoku9x9Vue();
        Sudoku9x9Ctrl ctrl = new Sudoku9x9Ctrl();
        UserConsole userC = new UserConsole();
        UserTest userT = new UserTest();

        ctrl.setVue(vue);
        ctrl.vue.setModele(modele);
        ctrl.vue.afficheGrille();
        ctrl.setModele(modele);
        ctrl.modifModeleNfois(userT);

    }
}
