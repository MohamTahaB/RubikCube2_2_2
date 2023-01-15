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
        toPass.push(this.initialNode);
        System.out.print("here is topass size after creation : ") ;
        System.out.println(toPass.size());
        System.out.print("here is passed size after creation : ") ;
        System.out.println(passed.size());
    }


    public void addToPass(Node node) {
        toPass.add(node) ;
    }


    public void incrementSearch() {
        System.out.print("Now here is topass size : ") ;
        System.out.println(toPass.size());
        System.out.print("Now here is passed size : ") ;
        System.out.println(passed.size());
        Node currentNode = toPass.remove() ;
        if (currentNode.getCurrentCube().equals(solution)) {
            System.out.println("Solution found at level "  + currentNode.getLevel()) ;
        }
        else {
            passed.add(currentNode.getCurrentCube()) ;
            currentNode.generateSons();
            for (Node n : currentNode.getSons()) {
                Cube aux = new Cube(n.getCurrentCube()) ;
                if (!passed.contains(aux)) {
                    toPass.add(n) ;
                }

            }
            /*if (!passed.contains(currentNode.getCurrentCube())) {
                passed.add(currentNode.getCurrentCube()) ;
                Cube aux = currentNode.getCurrentCube() ;
                aux.show();

                // rotatefrntclkw
                Cube aux1 = new Cube(aux) ;
                aux1.rotateFrontClkw();
                aux1.show();
                System.out.println(passed.contains(aux1));
                if (!passed.contains(aux1)) {
                    passed.add(aux1) ;
                    currentNode.addSon(aux1);
                    toPass.push(currentNode.getSons().get(currentNode.getSons().size() - 1));
                    System.out.println(1);
                    System.out.print("db topass size : ") ;
                    System.out.println(getToPass().size());
                    System.out.print("db passed size : ") ;
                    System.out.println(getPassed().size());
                }

                Cube aux2 = new Cube(aux) ;
                aux2.rotateFrontAntiClkw();
                if (!passed.contains(aux2)) {
                    passed.add(aux2) ;
                    currentNode.addSon(aux2);
                   toPass.push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
                }



                //rotate back

                Cube aux3 = new Cube(aux) ;
                Cube aux4 = new Cube(aux) ;
                aux3.rotateBackClkw();
                aux4.rotateBackAntiClkw();
                if (!passed.contains(aux3)) {
                    passed.add(aux3) ;
                    currentNode.addSon(aux3);
                    toPass.push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
                }



                if (!passed.contains(aux4)) {
                    passed.add(aux4) ;
                    currentNode.addSon(aux4);
                    toPass.push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
                }


                //right rotation ;

                Cube aux5 = new Cube(aux) ;
                Cube aux6 = new Cube(aux) ;
                aux5.rotateRightClkw();
                aux6.rotateRightAntiClkw();


                if (!passed.contains(aux5)) {
                    passed.add(aux5) ;
                    currentNode.addSon(aux5);
                    toPass.push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
                }



                if (!passed.contains(aux6)) {
                    passed.add(aux6) ;
                    currentNode.addSon(aux6);
                    toPass.push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
                }

                //left rotation

                Cube aux7 = new Cube(aux) ;
                Cube aux8 = new Cube(aux) ;
                aux7.rotateLeftClkw();
                aux8.rotateLeftAntiClkw();


                if (!passed.contains(aux7)) {
                    passed.add(aux7) ;
                    currentNode.addSon(aux7);
                    toPass.push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
                }



                if (!passed.contains(aux8)) {
                    passed.add(aux8) ;
                    currentNode.addSon(aux8);
                    toPass.push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
                }

                //up rotation

                Cube aux9 = new Cube(aux) ;
                Cube aux10 = new Cube(aux) ;
                aux9.rotateUpClkw();
                aux10.rotateUpAntiClkw();


                if (!passed.contains(aux9)) {
                    passed.add(aux9) ;
                    currentNode.addSon(aux9);
                    toPass.push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
                }



                if (!passed.contains(aux10)) {
                    passed.add(aux10) ;
                    currentNode.addSon(aux10);
                    toPass.push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
                }


                //down rotation

                Cube aux11 = new Cube(aux) ;
                Cube aux12= new Cube(aux) ;
                aux11.rotateDownClkw();
                aux12.rotateDownAntiClkw();


                if (!passed.contains(aux11)) {
                    passed.add(aux11) ;
                    currentNode.addSon(aux11);
                    toPass.push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
                }



                if (!passed.contains(aux12)) {
                    passed.add(aux12) ;
                    currentNode.addSon(aux12);
                    toPass.push(currentNode.getSons().get(currentNode.getSons().size() - 1)); ;
                }

                aux.rotateDownClkw();

            }*/

        }

    }

    public ArrayDeque<Node> getToPass() {
        return toPass;
    }

    public HashSet<Cube> getPassed() {
        return passed;
    }
}
