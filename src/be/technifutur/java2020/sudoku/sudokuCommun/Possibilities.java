package javaLangage.primitif;

public class Possibilities {
    public int data;

    public static void main(String[] args) {
        Possibilities test = new Possibilities();
        test.data = 0b000000000;

        test.add(5);
        test.add(2);
        test.add(7);
        test.add(8);

        System.out.println(Integer.toBinaryString(test.data));

        test.remove(5);
        test.remove(5);
        test.add(2);
        System.out.println(Integer.toBinaryString(test.data) + " " + test.size());
        if(test.contains(7))
            System.out.println(Integer.toBinaryString(test.data));

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
