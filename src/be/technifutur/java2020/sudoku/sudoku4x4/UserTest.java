package be.technifutur.java2020.sudoku.sudoku4x4;

public class UserTest implements User{

    private String[] tabChar = {"1.2.3","1.1.4","2.3.1","3.3.2","3.1.8","3.1.4","2.2.a","6.5.8","7.4.5","4.4.4","9.9.9","6.6.6"};
    private int indCourant = -1;

    @Override
    public String getString() {
        if(indCourant < 11) {
            indCourant++;
            return tabChar[indCourant];
        }
        else{
            return "q";
        }

    }


}
