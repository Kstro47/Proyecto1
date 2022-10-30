package Modelo;

public class arrayList<T> {

    private int first;
    private int last;
    private int size;
    private Node[] array;
    
    public arrayList(int max) {
        this.first = this.last = -1;
        this.size = 0;
        this.array = new Node[max];
    }
    
    public boolean contains(Celda celda){
        for (int i = 0; i < size; i++) {
            if (this.array[0].getCelda() != null){
                if (this.array[0].getCelda() == celda){
                    return true;
                }                
            }
        }
        return false;
    }
    
    public boolean isEmpty(){
        return first == -1;
    }
    
    public boolean isFull(){
        return size == this.array.length;
    }
    
    public void empty(){
        this.first = this.last = -1;
        this.size = 0;
        this.array = new Node[this.array.length];        
    }
    
    public int searchEmptySlot(){
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == null){
                return i;
            }
            
        }
        return -1;
    }
    
    public Node getCelda(int num){   
        return this.array[num];                    
    }
    
    public Object get(int num){
        Object data = this.array[num].getData();
        return data;                    
    }
    
    
    public void add(T data, Celda celda){
        if (!this.isFull()){
            Node node = new Node(data, celda);
            int position = this.searchEmptySlot();
            this.array[position] = node;
            if (this.isEmpty()){
                this.first = this.last = position;               
            } else {
                this.array[this.last].setNext(position);
                this.last = position;
            }
            this.size++;
        }    
    }
    
    public void remove(int num){
        this.array[num] = null; 
        }
    
    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node[] getArray() {
        return array;
    }

    public void setArray(Node[] array) {
        this.array = array;
    }

}
    
