import java.util.ArrayList;

public class Node {

    private Cube currentCube ;
    private Cube fatherCube ;
    private ArrayList<Node> sons ;


    public Node( Cube currentCube , Cube fatherCube , ArrayList<Node> sons) {
        this.currentCube = currentCube ;
        this.fatherCube = fatherCube ;
        this.sons = sons ;
    }


    public Node( Cube currentCube , Cube fatherCube ) {
        this.currentCube = currentCube ;
        this.fatherCube = fatherCube ;
        this.sons = null ;
    }

    public void addSon(Cube son) {
        sons.add(new Node(son , currentCube)) ;
    }

    public Cube getCurrentCube() {
        return currentCube;
    }

    public Cube getFatherCube() {
        return fatherCube;
    }

    public ArrayList<Node> getSons() {
        return sons;
    }

    public void setCurrentCube(Cube currentCube) {
        this.currentCube = currentCube;
    }

    public void setFatherCube(Cube fatherCube) {
        this.fatherCube = fatherCube;
    }

    public void setSons(ArrayList<Node> sons) {
        this.sons = sons;
    }
}
