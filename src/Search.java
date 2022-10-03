import java.util.*;

public class Search {
    public final Node initialNode ;
    public final int k ;
    public HashSet<Cube> passed ;
    public ArrayDeque<Node> toPass ;
    public Cube solution = new Cube() ;

    public Search(Cube cube) {
        this.initialNode = new Node(cube , null , 0) ;
        k = 20 ;
        passed = new HashSet<Cube>() ;
        toPass = new ArrayDeque<>() ;
        getToPass().push(this.initialNode);
        System.out.print("here is topass size after creation : ") ;
        System.out.println(getToPass().size());
        System.out.print("here is passed size after creation : ") ;
        System.out.println(getPassed().size());
    }


    public void addToPass(Node node) {
        toPass.add(node) ;
    }


    public void incrementSearch() {
        System.out.print("Now here is topass size : ") ;
        System.out.println(getToPass().size());
        System.out.print("Now here is passed size : ") ;
        System.out.println(getPassed().size());
        Node currentNode = getToPass().remove() ;
        if (currentNode.getCurrentCube().equals(solution)) {
            System.out.println("Solution found at level "  + currentNode.getLevel()) ;
        }
        else {
            getPassed().add(currentNode.getCurrentCube()) ;
            Cube aux = currentNode.getCurrentCube() ;
            aux.show();

            // rotatefrntclkw
            aux.rotateFrontClkw();
            aux.show();
            System.out.println(getPassed().contains(aux));
            if (!getPassed().contains(aux)) {
                getPassed().add(aux) ;
                currentNode.addSon(aux);
                getToPass().push(currentNode.getSons().get(currentNode.getSons().size() - 1));
                System.out.println(1);
                System.out.print("db topass size : ") ;
                System.out.println(getToPass().size());
                System.out.print("db passed size : ") ;
                System.out.println(getPassed().size());
            }
            aux.rotateFrontAntiClkw();

            aux.rotateFrontAntiClkw();
            if (!getPassed().contains(aux)) {
                getPassed().add(aux) ;
                currentNode.addSon(aux);
                getToPass().push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }
            aux.rotateFrontClkw();


            //rotate back

            aux.rotateBackClkw();
            if (!getPassed().contains(aux)) {
                getPassed().add(aux) ;
                currentNode.addSon(aux);
                getToPass().push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateBackAntiClkw();

            aux.rotateBackAntiClkw();

            if (!getPassed().contains(aux)) {
                getPassed().add(aux) ;
                currentNode.addSon(aux);
                getToPass().push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateBackClkw();

            //right rotation ;
            aux.rotateRightClkw();

            if (!getPassed().contains(aux)) {
                getPassed().add(aux) ;
                currentNode.addSon(aux);
                getToPass().push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateRightAntiClkw();

            aux.rotateRightAntiClkw();

            if (!getPassed().contains(aux)) {
                getPassed().add(aux) ;
                currentNode.addSon(aux);
                getToPass().push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateRightClkw();

            //left rotation

            aux.rotateLeftClkw();

            if (!getPassed().contains(aux)) {
                getPassed().add(aux) ;
                currentNode.addSon(aux);
                getToPass().push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateLeftAntiClkw();

            aux.rotateLeftAntiClkw();

            if (!getPassed().contains(aux)) {
                getPassed().add(aux) ;
                currentNode.addSon(aux);
                getToPass().push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            //up rotation

            aux.rotateUpClkw();

            if (!getPassed().contains(aux)) {
                getPassed().add(aux) ;
                currentNode.addSon(aux);
                getToPass().push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateUpAntiClkw();

            aux.rotateUpAntiClkw();

            if (!getPassed().contains(aux)) {
                getPassed().add(aux) ;
                currentNode.addSon(aux);
                getToPass().push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateUpClkw();

            //down rotation

            aux.rotateDownClkw();

            if (!getPassed().contains(aux)) {
                getPassed().add(aux) ;
                currentNode.addSon(aux);
                getToPass().push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateDownAntiClkw();

            aux.rotateDownAntiClkw();

            if (!getPassed().contains(aux)) {
                getPassed().add(aux) ;
                currentNode.addSon(aux);
                getToPass().push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateDownClkw();
        }

    }

    public ArrayDeque<Node> getToPass() {
        return toPass;
    }

    public HashSet<Cube> getPassed() {
        return passed;
    }
}
