public class Test {

    public static void main(String[] args) {
        Cube cube = new Cube() ;
        cube.rotateDownClkw();



        Search s = new Search(cube) ;


        for (int i = 0 ; i < 30 ; i++) {
            s.incrementSearch();
        }

    }
}
