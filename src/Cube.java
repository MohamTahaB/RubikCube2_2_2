public class Cube {
    String[][] Up ;
    String[][] Down ;
    String[][] Right ;
    String[][] Left ;
    String[][] Front ;
    String[][]  Back ;

    public Cube() {
        Up = new String[][] {{"y", "y"}, {"y", "y"}};
        Down =  new String[][] {{"w" , "w"} , {"w" , "w"}} ;
        Right =  new String[][] {{"o" , "o"} , {"o" , "o"}} ;
        Left = new String[][] {{"r" , "r"} , {"r" , "r"}} ;
        Front =  new String[][] {{"g" , "g"} , {"g" , "g"}} ;
        Back = new String[][]  {{"b" , "b"} , {"b" , "b"}} ;

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

}
