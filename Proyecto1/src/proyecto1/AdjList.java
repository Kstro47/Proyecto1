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
  private int numRows;
  private int numColumns;

  
  public AdjList(int numRows, int numColumns) {
    this.numRows = numRows;
    this.numColumns = numColumns;
    this.pFirst = null;
    this.pLast = null;
    this.size = numRows*numColumns;
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
    
    public void findCellNeihgboors(Cell cell, int numRows){
        if(cell.getNum() <= numRows){
            if (cell.getNum()-1 <= 0){
                cell.setRightCell(null);
                cell.setLeftCell(findCell(cell,1));
                cell.setBottomCell(findCell(cell,7));
            } else if (cell.getNum()+1 > numRows) {
                cell.setLeftCell(null);
                cell.setRightCell(findCell(cell,1));
                cell.setBottomCell(findCell(cell,7));
            }
            
        }
    }
    
    public Cell findCell(Cell cell, int num){
        for (int i = 1; i < cell.getNum()+ num ; i++) {
            cell = cell.getpNext();
        }
        return cell;
    }
    
    public void findRow(int cellNum, int numRows){
        if (cellNum <= numRows){
            
        }
    }
    
    
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

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
    }
  
  }