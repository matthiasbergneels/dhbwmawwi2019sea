package lecture.datastructures;

public class Tree<D> {

    private Node<D> root = null;

    public void add(D data){

    }

    public boolean contains(D data){

        return false;
    }

    public D find(D data){

        return null;
    }

    public int size(){

        return 0;
    }

    private class Node<D>{

        private D data;
        private Node<D> leftNode;
        private Node<D> rightNode;

        public D getData(){
            return this.data;
        }

        public void setLeftNode(Node<D> leftNode){
            this.leftNode = leftNode;
        }

        public Node<D> getLeftNode(){
            return this.leftNode;
        }

        public void setRightNode(Node<D> rightNode){
            this.rightNode = rightNode;
        }

        public Node<D> getRightNode(){
            return this.rightNode;
        }
    }
}
