import java.util.ArrayList;

public class Node {

    private Cube currentCube ;
    private Node fatherCube ;
    private ArrayList<Node> sons ;
    private int level ;



    public Node( Cube currentCube , Node fatherCube , ArrayList<Node> sons, int level) {
        this.currentCube = currentCube ;
        this.fatherCube = fatherCube ;
        this.sons = sons ;
        this.level = level ;
    }

    public void generateSons() {
        Cube[] aux = new Cube[12] ;
        for (int i = 0 ; i < 12 ; i++) {
            aux[i] = new Cube(currentCube) ;
        }
        aux[0].rotateFrontClkw();
        aux[1].rotateFrontAntiClkw();
        aux[2].rotateBackClkw();
        aux[3].rotateBackAntiClkw();
        aux[4].rotateUpClkw();
        aux[5].rotateUpAntiClkw();
        aux[6].rotateDownClkw();
        aux[7].rotateDownAntiClkw();
        aux[8].rotateRightClkw();
        aux[9].rotateRightAntiClkw();
        aux[10].rotateLeftClkw();
        aux[11].rotateLeftAntiClkw();

        for (int i = 0 ; i< 12 ; i++) {
            sons.add(new Node( aux[i], this, this.level + 1)) ;
        }


    }



    public Node(Cube currentCube , Node fatherCube , int level) {
        this.currentCube = currentCube ;
        this.fatherCube = fatherCube ;
        this.sons = new ArrayList<Node>() ;
        this.level = level ;
    }

    public void addSon(Cube son) {
        sons.add(new Node(son , this , level + 1)) ;
    }

    public Cube getCurrentCube() {
        return currentCube;
    }

    public Node getFatherCube() {
        return fatherCube;
    }

    public ArrayList<Node> getSons() {
        return sons;
    }

    public void setCurrentCube(Cube currentCube) {
        this.currentCube = currentCube;
    }

    public void setFatherCube(Node fatherCube) {
        this.fatherCube = fatherCube;
    }

    public void setSons(ArrayList<Node> sons) {
        this.sons = sons;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
