package be.technifutur.java2020.sudoku.sudokuCommun;

import java.util.HashSet;
import java.util.Set;

public class Cell {
    private Position position;
    private Set<Area> areaSet;

    public  Cell(Position position){
        this.position = position;
        areaSet = new HashSet<>();
    }

    public Position getPosition() {
        return position;
    }

    // Méthode délégé------------------------------------------------------------------

    public boolean add(Area area) {
        boolean add = false;
        if(area.getPositionSet().contains(this.position)) {
            add = areaSet.add(area);;
        }
        return add;
    }

    //---------------------------------------------------------------------------------
}
