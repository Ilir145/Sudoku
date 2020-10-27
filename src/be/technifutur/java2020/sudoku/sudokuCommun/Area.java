package be.technifutur.java2020.sudoku.sudokuCommun;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Area {

    private Possibilities possibilities;
    private AreaType type;
    public  Set<Position> setDePositions;

    public Area(int size,AreaType type,Position first) {
        possibilities = new Possibilities(size);
        this.type = type;
        this.setDePositions = new LinkedHashSet<>();
        switch(type){
            case LIGNE:
                initLine(first, size);
                break;
            case COLONNE:
                initColonne(first, size);
                break;
            case CARRE:
                initCarre(first, size);
                break;
        }
    }

    private void initCarre(Position first,int size){
        int rac = (int)Math.sqrt(size);
        for (int i = 0;i<rac;i++){
            for (int j = 0;j<rac;j++){
                this.setDePositions.add(new Position(first.getLigne()+i, first.getColonne()+j));
            }
        }
    }

    private void initColonne(Position first,int size) {
        for(int i = 0;i<size;i++){
            this.setDePositions.add(new Position(first.getLigne()+i, first.getColonne()));
        }
    }

    private void initLine(Position first,int size) {
        for(int i = 0;i<size;i++){
            this.setDePositions.add(new Position(first.getLigne(), first.getColonne()+i));
        }
    }

    public Set<Position> getPositionSet(){
        return this.setDePositions;
    }

    public static void main(String[] args) {
        Area zone = new Area(9,AreaType.CARRE,new Position(3,3));

        for(Position p : zone.getPositionSet()){
            System.out.println(p.toString());
        }
    }


}
