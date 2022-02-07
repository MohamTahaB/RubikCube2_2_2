import java.util.ArrayList;

public class Tree<T> {
    private Node<T> root ;

    public Tree(T rootData) {
        root = new Node() ;
        root.setData(rootData);

    }

    public Node<T> getRoot() {
        return root;
    }

    public class Node<T> {
        private T data ;
        private Node<T> parent ;
        private boolean cont = true ;
        private ArrayList<T> children ;
        private int h ;

        public Node() {
            data = null ;
            parent = null ;
            children = new ArrayList<T>() ;
            h = 0 ;
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

        public void setCont(boolean cont) {
            this.cont = cont;
        }

        public void setH(int h) {
            this.h = h;
        }

        public boolean isCont() {
            return cont;
        }

        public ArrayList<T> getChildren() {
            return children;
        }

        public int getH() {
            return h;
        }

        public T getData() {
            return data;
        }
    }

}
