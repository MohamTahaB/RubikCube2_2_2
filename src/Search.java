import java.util.*;

public class Search {
    private final Node initialNode ;
    private final int k ;
    private HashSet<Cube> passed ;
    private ArrayDeque<Node> toPass ;
    private Cube solution = new Cube() ;

    public Search(Cube cube) {
        initialNode = new Node(cube , null , 0) ;
        k = 20 ;
        passed = new HashSet<Cube>() ;
        toPass = new ArrayDeque<>() ;
        addToPass(this.initialNode); ;
    }


    public void addToPass(Node node) {
        toPass.add(node) ;
    }


    public void incrementSearch() {
        Node currentNode = getToPass().remove() ;
        if (currentNode.getCurrentCube().equals(solution)) {
            System.out.println("Solution found at level "  + currentNode.getLevel()) ;
        }
        else {
            passed.add(currentNode.getCurrentCube()) ;
            Cube aux = currentNode.getCurrentCube() ;

            // rotatefrntclkw
            aux.rotateFrontClkw();
            if (!passed.contains(aux)) {
                passed.add(aux) ;
                currentNode.addSon(aux);
                addToPass(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }
            aux.rotateFrontAntiClkw();

            aux.rotateFrontAntiClkw();
            if (!passed.contains(aux)) {
                passed.add(aux) ;
                currentNode.addSon(aux);
                addToPass(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }
            aux.rotateFrontClkw();


            //rotate back

            aux.rotateBackClkw();
            if (!passed.contains(aux)) {
                passed.add(aux) ;
                currentNode.addSon(aux);
                addToPass(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateBackAntiClkw();

            aux.rotateBackAntiClkw();

            if (!passed.contains(aux)) {
                passed.add(aux) ;
                currentNode.addSon(aux);
                addToPass(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateBackClkw();

            //right rotation ;
            aux.rotateRightClkw();

            if (!passed.contains(aux)) {
                passed.add(aux) ;
                currentNode.addSon(aux);
                addToPass(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateRightAntiClkw();

            aux.rotateRightAntiClkw();

            if (!passed.contains(aux)) {
                passed.add(aux) ;
                currentNode.addSon(aux);
                addToPass(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateRightClkw();

            //left rotation

            aux.rotateLeftClkw();

            if (!passed.contains(aux)) {
                passed.add(aux) ;
                currentNode.addSon(aux);
                addToPass(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateLeftAntiClkw();

            aux.rotateLeftAntiClkw();

            if (!passed.contains(aux)) {
                passed.add(aux) ;
                currentNode.addSon(aux);
                addToPass(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            //up rotation

            aux.rotateUpClkw();

            if (!passed.contains(aux)) {
                passed.add(aux) ;
                currentNode.addSon(aux);
                addToPass(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateUpAntiClkw();

            aux.rotateUpAntiClkw();

            if (!passed.contains(aux)) {
                passed.add(aux) ;
                currentNode.addSon(aux);
                addToPass(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateUpClkw();

            //down rotation

            aux.rotateDownClkw();

            if (!passed.contains(aux)) {
                passed.add(aux) ;
                currentNode.addSon(aux);
                addToPass(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateDownAntiClkw();

            aux.rotateDownAntiClkw();

            if (!passed.contains(aux)) {
                passed.add(aux) ;
                currentNode.addSon(aux);
                addToPass(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
            }

            aux.rotateDownClkw();
        }

    }

    public ArrayDeque<Node> getToPass() {
        return toPass;
    }
}
