package javaLangage.primitif;

public class TestPossibilities {
    public int data;

    public static void main(String[] args) {
        this.data = 0b000000000; 







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
        String tabData = Integer.toBinaryString(this.data);
        int comp = 0;
        for(int i = 0; i < tabData.length();i++){
            if(tabData.charAt(i) == '1')comp++;
        }
        return comp;
    }
}
