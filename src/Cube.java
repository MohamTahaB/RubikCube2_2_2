import java.util.Arrays;

public class Cube {
    String[][] Up ;
    String[][] Down ;
    String[][] Right ;
    String[][] Left ;
    String[][] Front ;
    String[][]  Back ;

    public Cube() {
        Up = new String[][] {{"w" , "w"} , {"w" , "w"}};
        Down =  new String[][]  {{"y", "y"}, {"y", "y"}};
        Right =  new String[][]  {{"r" , "r"} , {"r" , "r"}} ;
        Left = new String[][] {{"o" , "o"} , {"o" , "o"}} ;
        Front =  new String[][] {{"g" , "g"} , {"g" , "g"}} ;
        Back = new String[][]  {{"b" , "b"} , {"b" , "b"}} ;

    }

    public Cube(Cube c) {
        Up = new String[2][2];
        Down = new String[2][2];
        Right = new String[2][2];
        Left = new String[2][2];
        Front = new String[2][2];
        Back = new String[2][2];

        for (int i = 0 ; i < 2 ; i++){
            for (int j = 0 ; j < 2 ; j++) {
                this.Up[i][j] = c.getUp()[i][j] ;
                this.Down[i][j] = c.getDown()[i][j] ;
                this.Right[i][j] = c.getRight()[i][j] ;
                this.Left[i][j] = c.getLeft()[i][j] ;
                this.Front[i][j] = c.getFront()[i][j] ;
                this.Back[i][j] = c.getBack()[i][j] ;
            }
        }
    }

    public void rotateFrontClkw(){
        //first rotation of front
        String att = Front[0][1] ;
        Front[0][1] = Front[0][0] ;
        Front[0][0] = Front[1][0] ;
        Front[1][0] = Front[1][1] ;
        Front[1][1] = att ;

        //now to the rest of the faces ;
        String a , b ;
        a = Up[1][0] ;
        b = Up[1][1] ;
        Up[1][0] = Left[1][1];
        Up[1][1] = Left[0][1] ;

        Left[1][1] = Down[0][1];
        Left[0][1] = Down[0][0];

        Down[0][1] = Right[0][0] ;
        Down[0][0] = Right[1][0];

        Right[0][0] = a ;
        Right[1][0] = b ;
    }

    public void rotateFrontAntiClkw() {
       rotateFrontClkw();
        rotateFrontClkw();
        rotateFrontClkw();
    }


    public void rotateBackClkw() {
        String att = Back[0][1] ;
        Back[0][1] = Back[0][0] ;
        Back[0][0] = Back[1][0] ;
        Back[1][0] = Back[1][1] ;
        Back[1][1] = att ;

        //now to the rest
        String aux1  = Up[0][1] , aux2 = Up[0][0] ;
        Up[0][1] = Right[1][1] ;
        Up[0][0] = Right[0][1] ;

        Right[1][1] = Down[1][0] ;
        Right[0][1] = Down[1][1] ;

        Down[1][0] = Left[0][0] ;
        Down[1][1] = Left[1][0] ;

        Left[0][0] = aux1 ;
        Left[1][0] = aux2 ;
    }

    public void rotateBackAntiClkw() {
        rotateBackClkw() ;
        rotateBackClkw() ;
        rotateBackClkw() ;
    }

    public void rotateRightClkw() {
        // the face first
        String aux = Right[0][0] ;
        Right[0][0] = Right[1][0] ;
        Right[1][0] = Right[1][1] ;
        Right[1][1] = Right[0][1] ;
        Right[0][1] = aux ;

        //Now to the rest

        String aux1 = Up[0][1]  , aux2 = Up[1][1] ;
        Up[0][1] = Front[0][1] ;
        Up[1][1] = Front[1][1] ;

        Front[0][1] = Down[0][1] ;
        Front[1][1] = Down[1][1] ;

        Down[0][1] = Back[1][0] ;
        Down[1][1] = Back[0][0] ;

        Back[1][0] = aux1 ;
        Back[0][0] = aux2 ;
    }

    public void rotateRightAntiClkw() {
        rotateRightClkw() ;
        rotateRightClkw() ;
        rotateRightClkw() ;
    }

    public void rotateLeftClkw(){
        //the face first

        String aux = Left[0][0] ;
        Left[0][0] = Left[1][0] ;
        Left[1][0] = Left[1][1] ;
        Left[1][1] = Left[0][1] ;
        Left[0][1] = aux ;

        //now to the rest
        String aux1 = Up[0][0] , aux2 = Up[1][0] ;

        Up[0][0] = Back[1][1] ;
        Up[1][0] = Back[0][1] ;

        Back[1][1] = Down[0][0] ;
        Back[0][1] = Down[1][0] ;

        Down[0][0] = Front[0][0] ;
        Down[1][0] = Front[1][0] ;

        Front[0][0] = aux1 ;
        Front[1][0] = aux2 ;
    }

    public void rotateLeftAntiClkw() {
        rotateLeftClkw() ;
        rotateLeftClkw() ;
        rotateLeftClkw() ;
    }

    public void rotateUpClkw() {
        String aux = Up[0][0] ;
        Up[0][0] = Up[1][0] ;
        Up[1][0] = Up[1][1] ;
        Up[1][1] = Up[0][1] ;
        Up[0][1] = aux ;

        // now the rest

        String aux1 = Back[0][0] , aux2 = Back[0][1] ;

        Back[0][0] = Left[0][0] ;
        Back[0][1] = Left[0][1] ;

        Left[0][0] = Front[0][0] ;
        Left[0][1] = Front[0][1] ;

        Front[0][0] = Right[0][0] ;
        Front[0][1] = Right[0][1] ;

        Right[0][0] = aux1 ;
        Right[0][1] = aux2 ;
    }

    public void rotateUpAntiClkw() {
        rotateUpClkw() ;
        rotateUpClkw() ;
        rotateUpClkw() ;
    }

    public void rotateDownClkw(){
        //first the face

        String aux = Down[0][0] ;
        Down[0][0] = Down[1][0] ;
        Down[1][0] = Down[1][1] ;
        Down[1][1] = Down[0][1] ;
        Down[0][1] = aux ;

        //now the rest

        String aux1 = Front[1][0] , aux2 = Front[1][1] ;

        Front[1][0] = Left[1][0] ;
        Front[1][1] = Left[1][1] ;

        Left[1][0] = Back[1][0] ;
        Left[1][1] = Back[1][1] ;

        Back[1][0] = Right[1][0] ;
        Back[1][1] = Right[1][1] ;

        Right[1][0] = aux1 ;
        Right[1][1] = aux2 ;
    }


    public void rotateDownAntiClkw() {
        rotateDownClkw() ;
        rotateDownClkw() ;
        rotateDownClkw() ;
    }

    public void show() {
        System.out.println("front : ") ;
        System.out.println(Front[0][0] + " " + Front[0][1]) ;
        System.out.println(Front[1][0] + " " + Front[1][1]) ;

        System.out.println("right : ") ;
        System.out.println(Right[0][0] + " " + Right[0][1]) ;
        System.out.println(Right[1][0] + " " + Right[1][1]) ;

        System.out.println("back : ") ;
        System.out.println(Back[0][0] + " " + Back[0][1]) ;
        System.out.println(Back[1][0] + " " + Back[1][1]) ;

        System.out.println("left : ") ;
        System.out.println(Left[0][0] + " " + Left[0][1]) ;
        System.out.println(Left[1][0] + " " + Left[1][1]) ;

        System.out.println("up : ") ;
        System.out.println(Up[0][0] + " " + Up[0][1]) ;
        System.out.println(Up[1][0] + " " + Up[1][1]) ;

        System.out.println("down : ") ;
        System.out.println(Down[0][0] + " " + Down[0][1]) ;
        System.out.println(Down[1][0] + " " + Down[1][1]) ;
    }

    public String[][] getUp() {
        return Up;
    }

    public String[][] getDown() {
        return Down;
    }

    public String[][] getRight() {
        return Right;
    }

    public String[][] getLeft() {
        return Left;
    }

    public String[][] getFront() {
        return Front;
    }

    public String[][] getBack() {
        return Back;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Arrays.equals(Up, cube.Up) && Arrays.equals(Down, cube.Down) && Arrays.equals(Right, cube.Right) && Arrays.equals(Left, cube.Left) && Arrays.equals(Front, cube.Front) && Arrays.equals(Back, cube.Back);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(Up);
        result = 31 * result + Arrays.hashCode(Down);
        result = 31 * result + Arrays.hashCode(Right);
        result = 31 * result + Arrays.hashCode(Left);
        result = 31 * result + Arrays.hashCode(Front);
        result = 31 * result + Arrays.hashCode(Back);
        return result;
    }

    /*public boolean equals(Cube cube) {
        boolean ans =  (this.Front[0][0] == cube.getFront()[0][0] && this.Front[0][1] == cube.getFront()[0][1] && this.Front[1][0] == cube.getFront()[1][0] && this.Front[1][1] == cube.getFront()[1][1]) ;
        if (!ans) {
            return false ;
        }
        ans = ans && (this.Back[0][0] == cube.getBack()[0][0] && this.Back[0][1] == cube.getBack()[0][1] && this.Back[1][0] == cube.getBack()[1][0] && this.Back[1][1] == cube.getBack()[1][1]) ;
        if (!ans) {
            return false ;
        }
        ans = ans && (this.Right[0][0] == cube.getRight()[0][0] && this.Right[0][1] == cube.getRight()[0][1] && this.Right[1][0] == cube.getRight()[1][0] && this.Right[1][1] == cube.getRight()[1][1]) ;
        if(!ans) {
            return false ;
        }
        ans = ans && (this.Left[0][0] == cube.getLeft()[0][0] && this.Left[0][1] == cube.getLeft()[0][1] && this.Left[1][0] == cube.getLeft()[1][0] && this.Left[1][1] == cube.getLeft()[1][1]) ;
        if (!ans) {
            return false ;
        }
        ans = ans && (this.Up[0][0] == cube.getUp()[0][0] && this.Up[0][1] == cube.getUp()[0][1] && this.Up[1][0] == cube.getUp()[1][0] && this.Up[1][1] == cube.getUp()[1][1]) ;
        if (!ans) {
            return false ;
        }
        ans = ans && (this.Down[0][0] == cube.getDown()[0][0] && this.Down[0][1] == cube.getDown()[0][1] && this.Down[1][0] == cube.getDown()[1][0] && this.Down[1][1] == cube.getDown()[1][1]) ;
        if (!ans) {
            return false ;
        }
        return true ;

    }*/

    public void copie(Cube cube) {
        this.Front[0][0] = cube.getFront()[0][0] ;
        this.Front[0][1] = cube.getFront()[0][1] ;
        this.Front[1][0] = cube.getFront()[1][0] ;
        this.Front[1][1] = cube.getFront()[1][1] ;

        this.Back[0][0] = cube.getBack()[0][0] ;
        this.Back[0][1] = cube.getBack()[0][1] ;
        this.Back[1][0] = cube.getBack()[1][0] ;
        this.Back[1][1] = cube.getBack()[1][1] ;


        this.Right[0][0] = cube.getRight()[0][0] ;
        this.Right[0][1] = cube.getRight()[0][1] ;
        this.Right[1][0] = cube.getRight()[1][0] ;
        this.Right[1][1] = cube.getRight()[1][1] ;


        this.Left[0][0] = cube.getLeft()[0][0] ;
        this.Left[0][1] = cube.getLeft()[0][1] ;
        this.Left[1][0] = cube.getLeft()[1][0] ;
        this.Left[1][1] = cube.getLeft()[1][1] ;


        this.Up[0][0] = cube.getUp()[0][0] ;
        this.Up[0][1] = cube.getUp()[0][1] ;
        this.Up[1][0] = cube.getUp()[1][0] ;
        this.Up[1][1] = cube.getUp()[1][1] ;

        this.Down[0][0] = cube.getDown()[0][0] ;
        this.Down[0][1] = cube.getDown()[0][1] ;
        this.Down[1][0] = cube.getDown()[1][0] ;
        this.Down[1][1] = cube.getDown()[1][1] ;

    }
}
