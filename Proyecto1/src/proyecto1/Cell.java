package proyecto1;

/**
 *
 * @author Emilio Jr
 */
public class Cell {
        private Cell pNext;
        private Cell bottomCell, topCell, rightCell, leftCell; //variables de las celdas adyacentes a una celda.
        private int num; //variables de la coordenada x e y así como el ancho de la celda
        private boolean visited; //boolean que permite saber si una celda ya fue visitada.

        
    public Cell(){
       bottomCell = null;
       topCell = null;
       rightCell = null;
       leftCell = null;
       num = 0;
       visited = false;  
    }
    
    

    
    public Cell getpNext() {
        return pNext;
    }

    public void setpNext(Cell pNext) {
        this.pNext = pNext;
    }
    
    public Cell getBottomCell() {
        return bottomCell;
    }

    public void setBottomCell(Cell downCell) {
        this.bottomCell = downCell;
    }

    public Cell getTopCell() {
        return topCell;
    }

    public void setTopCell(Cell upCell) {
        this.topCell = upCell;
    }

    public Cell getRightCell() {
        return rightCell;
    }

    public void setRightCell(Cell rightCell) {
        this.rightCell = rightCell;
    }

    public Cell getLeftCell() {
        return leftCell;
    }

    public void setLeftCell(Cell leftCell) {
        this.leftCell = leftCell;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

        
}

        
