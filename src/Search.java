import java.util.AbstractSet;

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


}
