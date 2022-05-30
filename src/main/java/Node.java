import java.util.ArrayList;
import java.util.List;

public class Node {
    private boolean visited;
    private List<Node> neighbors=new ArrayList<>();
    private int row;
    private int column;

    public Node(int startRow, int startColumn) {
        this.row = startRow;
        this.column = startColumn;
    }



    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean isVisited(){
        return visited;
    }
    public void addNeighbor(Node neighbor){
        this.neighbors.add(neighbor);

    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }


    public List<Node> getNeighbors() {
        return neighbors;
    }


}
