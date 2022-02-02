public class Test {

    public static void main(String[] args) {
        String[][] Up = new String[][] {{"w" , "w"} , {"w" , "w"}};
        String[][] Down =  new String[][]  {{"w", "w"}, {"w", "w"}};

        if (Up == Down) {
            System.out.println("true");
        }
        else {
            System.out.println("false") ;
        }
    }
}
