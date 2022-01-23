
public class List<T> {
    private int size;
    private T[] array;
    
    public List() {
        this.array = (T[]) new Object[10];
        this.size = 0;
    }
    
    public int indexOf(T value) {
        for (int i = 0; i < this.size; i++) {
            if (array[i] == value || array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    
    public void add(T value) {
        if (this.size == array.length) {
            this.grow();
        }
        this.array[size] = value;
        size++;
    }
    
    private void grow() {
        int newSize = this.size + this.size/2;
        T[] newArray = (T[]) new Object[newSize];
        System.arraycopy(this.array, 0, newArray, 0, this.size);
        this.array = newArray;
    }
    
    public void moveToLeft(int fromWhere) {
        for (int i = fromWhere; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
    }
    
    public void remove(T value) {
        int index = this.indexOf(value);
        if (index < 0) {
            return;
        }
        this.moveToLeft(index);
        this.size--;
    }
    
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }
    
    public int size() {
        return this.size;
    }
    
    public T value(int index) {
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.size + "]");
        }
        return this.array[index];
    }
}
