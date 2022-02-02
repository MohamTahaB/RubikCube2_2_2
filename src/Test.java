public class Test {

    public static void main(String[] args) {
        String[][] Up = new String[][] {{"w" , "w"} , {"w" , "w"}};
        String[][] Down =  new String[][]  {{"w", "w"}, {"w", "w"}};

        Cube cube1 = new Cube() ;
        Cube cube2 = new Cube() ;


        cube1.rotateUpClkw();
        cube2.rotateUpAntiClkw();
        cube2.rotateUpAntiClkw();
        cube2.rotateUpAntiClkw();


        if (cube1.equals(cube2)) {
            System.out.println("kayn") ;
        }
        else {
            System.out.println("m9wda 3lk") ;
        }
    }
}
