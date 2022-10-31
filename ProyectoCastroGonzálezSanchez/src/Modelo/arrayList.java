package Modelo;

public class arrayList<T> {
    
    private int max;
    private int first;
    private int last;
    private int size;
    private Node[] array;
    
    public arrayList(int max) {
        this.max = max;
        this.first = this.last = -1;
        this.size = 0;
        this.array = new Node[max];
        for (int i = 0; i < max; i++) {
            this.array[i] = new Node(i);
        }
    }
    
    public boolean contains(Celda celda){
        for (int i = 0; i < size; i++) {
            if (this.array[i] != null){
                if (this.array[i].getCelda() == celda){
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
    
    public Node getNode(int num){   
        return this.array[num];                    
    }
    
    public String get(int num){
        String data = this.array[num].getData();
        return data;                    
    }
    
    
    public void addS(String data){
        if (!this.isFull()){
            Node node = new Node(data);
            for (int i = 0; i < max; i++) {
                if (this.array[i].getNum() == i) {
                    this.array[i] = node;
                }
            }    
            this.size++;
        }
    } 
    
    public void addC(Celda celda){
        if (!this.isFull()){
            Node node = new Node(celda);
            for (int i = 0; i < max; i++) {
                if (this.array[i].getNum() == i) {
                    this.array[i] = node;
                }
            }    
            this.size++;
        }
    }
    
    public void replace(int num){
        this.array[num] = new Node(num); 
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
        return this.size;
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
    
