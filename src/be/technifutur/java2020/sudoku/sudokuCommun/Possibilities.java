package be.technifutur.java2020.sudoku.sudokuCommun;

import java.util.Set;

public class Possibilities {
    private int data;

    public Possibilities(Set<Integer> initialValues) {
        for(int val : initialValues){
               add(val);
        }
    }

    public  Possibilities(int val){
        data = (1 << val - 1);
    }

    public boolean add(int ind){
        ind--;
        if(this.data == (this.data = (this.data | (1<<ind)))){
            return false;
        }
        return true;
    }
    public boolean remove(int ind){
        ind--;
        if(this.data == (this.data =(this.data & ~(1<<ind)))){
            return false;
        }
        return true;
    }
    public boolean contains(int ind){
        ind--;
        if((this.data & (1<<ind)) != 0 ){
            return true;
        }
        return false;
    }

    public int size(){
        return Integer.bitCount(this.data);
    }
}
