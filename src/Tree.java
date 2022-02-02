import java.util.ArrayList;

public class Tree<T> {
    private Node<T> root ;

    public Tree(T rootData) {
        root = new Node() ;
        root.setData(rootData);

    }

    public class Node<T> {
        private T data ;
        private Node<T> parent ;
        private ArrayList<T> children ;

        public Node() {
            data = null ;
            parent = null ;
            children = new ArrayList<T>() ;
        }

        public void setData(T data) {
            this.data = data;
        }

        public void setParent(Node<T> parent) {
            this.parent = parent;
        }

        public void setChildren(ArrayList<T> children) {
            this.children = children;
        }
    }

}
