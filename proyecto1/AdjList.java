package proyecto1;

/**
 *
 * @author yilme
 */
// Adjacency Matrix representation in Java

public final class AdjList {
    
  private Cell pFirst;
  private Cell pLast;
  private int size;
  private int numLenght;
  private int numWidth;

  
  public AdjList(int numLenght, int numWidth) {
    this.numLenght = numLenght;
    this.numWidth = numWidth;
    this.pFirst = null;
    this.pLast = null;
    this.size = numLenght*numWidth;
    this.appendCells();
    this.setCellNum();
//    this.setCellNeighboors();
    }
  
    public boolean IsEmpty() {
        return this.pFirst == null;
    }
    
    public void setCellNeighboors(){
        Cell aux = pFirst;
        for (int i = 0; i < this.size; i++) {
//            agarra todas las celdas en un for
        }
    }
    
    
//    asgina los vecinos de cada celda de la lista
    public void findCellNeihgboors(Cell cell, int numLenght, int numWidth){
        Cell temp = pFirst;
        
        for (int i = 0; i < numWidth-1; i++) {
            Cell next = temp.getpNext();
            temp.setRightCell(next);
            next.setLeftCell(temp);
            temp = next;
        }
        
        Cell aux = pFirst;
        for (int i = 0; i < numLenght-1; i++) {
            temp = temp.getpNext();
            aux.setBottomCell(temp);
            temp.setTopCell(aux);
            
            for (int j = 0; j < numWidth-1; j++) {
                Cell next = temp.getpNext();
                temp.setRightCell(next);
                next.setLeftCell(temp);
                
                aux = aux.getpNext();
                aux.setBottomCell(next);
                next.setTopCell(aux);
                
                temp = next;
            }   
        }
    }
    
    public Cell findCell(Cell cell, int num){
        for (int i = 0; i < num ; i++) {
            cell = cell.getpNext();
        }
        return cell;
    }
    
//    añade celdas a la lista
    public void appendCells() {
        for (int i = 0; i < this.size; i++) {  
            Cell cell = new Cell();
            if (IsEmpty()) {
                this.pFirst = cell;
                this.pLast = cell;
            } else {
                Cell aux = pLast;
                aux.setpNext(cell);
                pLast = cell;
            }
        }       
    }
    
//    asigna un numero a cada celda según su posición
    public void setCellNum() {
        Cell aux = pFirst;
        for (int i = 0; i < this.size; i++) {
            aux.setNum(i+1);
            aux = aux.getpNext();
        }
    }
    

    public void Print() {
        if (!IsEmpty()) {
            Cell aux = pFirst;
            for (int i = 0; i < this.size; i++) {
                System.out.println(aux.getNum());
                aux = aux.getpNext();
            }
        } else {
            System.out.println("La lista está vacía.");
        }
    }
    
    
    
//    Getters & setters
    public Cell getpFirst() {
        return pFirst;
    }

    public void setpFirst(Cell pFirst) {
        this.pFirst = pFirst;
    }

    public Cell getpLast() {
        return pLast;
    }

    public void setpLast(Cell pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumLenght() {
        return numLenght;
    }

    public void setNumLenght(int numLenght) {
        this.numLenght = numLenght;
    }

    public int getNumWidth() {
        return numWidth;
    }

    public void setNumWidth(int numWidth) {
        this.numWidth = numWidth;
    }


  }