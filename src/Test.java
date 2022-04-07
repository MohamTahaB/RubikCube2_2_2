public class Test {

    public static void main(String[] args) {
        Cube cube = new Cube() ;
        cube.rotateDownClkw();
        cube.rotateUpAntiClkw();
        cube.rotateLeftClkw();
        cube.rotateRightAntiClkw();

        Search s = new Search(cube) ;


        for (int i = 0 ; i < 50 ; i++) {
            s.incrementSearch();
        }

    }
}
