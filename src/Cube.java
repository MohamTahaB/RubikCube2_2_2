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
        //first rotation of the face
        String att = Front[0][0] ;
        Front[0][0] = Front[0][1] ;
        Front[0][1] = Front[1][1] ;
        Front[1][1] = Front[1][0] ;
        Front[1][0] = att ;

        //now to the rest
        String a , b ;
        a = Up[1][0] ;
        b = Up[1][1] ;
        Up[1][0] = Right[0][0];
        Up[1][1] = Right[1][0] ;

        Right[0][0] = Down[0][1] ;
        Right[1][0] = Down[0][0] ;

        Down[0][1] = Left[1][1];
        Down[0][0] = Left[0][1];

        Left[1][1] = a;
        Left[0][1] = b;
    }


}
