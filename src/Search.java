import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Iterator;

public class Search {

    private Cube cube ;
    private Tree<Cube> tree ;
    private AbstractSet<Cube> listOfFaces ;
    private final Cube originalCube = new Cube() ;

    public Search(Cube cube) {
        this.cube = new Cube() ;
        this.cube.copie(cube) ;

        tree = new Tree<Cube>(this.cube) ;
    }

    public void startSearch() {
        System.out.println("Searching for the minimum moves to solve the cube") ;
        AbstractQueue<Tree.Node> attente = new AbstractQueue<Tree.Node>() ;
        attente.add(tree.getRoot()) ;
        // need a loop to stop the search

    }

    public void setCube(Cube cube) {
        this.cube = cube;
    }
}
