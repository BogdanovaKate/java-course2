package Task10;

public class Box implements Comparable<Box>{
    private int size;

       public Box(int size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }

    @Override
    public int compareTo(Box o) {
        if (this.size > o.size){
            return 1;
        } else if (this.size < o.size) {
            return -1;
        }
        return 0;
    }

    public int getSize() {
        return size;
    }
}
