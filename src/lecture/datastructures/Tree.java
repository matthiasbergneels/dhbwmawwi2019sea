package lecture.datastructures;

public class Tree<D> {

    private Node<D> root = null;
    private int size;

    public void add(D data){
        if(data == null){
            return;
        }

        if(root == null){
            size++;
            root = new Node<D>(data);
            return;
        }

        // start Rekursion
        add(root, data);
    }

    private void add(Node<D> currentNode, D data){
        System.out.println("Rekursion Start an Elememt: " + currentNode.getData());

        int compareToResult = ((Comparable)currentNode.getData()).compareTo(data);

        if(compareToResult > 0){
            if(currentNode.getLeftNode() != null){
                add(currentNode.getLeftNode(), data);
            }else{
                size++;
                currentNode.setLeftNode(new Node<D>(data));
            }
        }else if(compareToResult < 0){
            if(currentNode.getRightNode() != null){
                add(currentNode.getRightNode(), data);
            }else{
                size++;
                currentNode.setRightNode(new Node<D>(data));
            }
        }

        System.out.println("Rekursion Ende an Elememt: " + currentNode.getData());
    }

    public boolean contains(D data){
        return contains(root, data);
    }

    private boolean contains(Node<D> currentNode, D data){
        if(currentNode == null){
            return false;
        }

        if(currentNode.getData().equals(data)){
            return true;
        }

        if(((Comparable)currentNode.getData()).compareTo(data) > 0){
            return contains(currentNode.getLeftNode(), data);
        }else{
            return contains(currentNode.getRightNode(), data);
        }
    }


    public D find(D data){

        return null;
    }

    public int size(){
        return size;
    }



    public void printInOrder(){
        if(root == null){
            System.out.println("Baum ist leer");
        }else{
            System.out.println("In-Order Ausgabe für Baum:");
            printInOrder(root);
        }
    }

    private void printInOrder(Node<D> currentNode){
        if(currentNode.getLeftNode() != null){
            printInOrder(currentNode.getLeftNode());
        }

        System.out.println(currentNode.getData());

        if(currentNode.getRightNode() != null){
            printInOrder(currentNode.getRightNode());
        }
    }

    public void printPreOrder(){
        if(root == null){
            System.out.println("Baum ist leer");
        }else{
            System.out.println("Pre-Order Ausgabe für Baum:");
            printPreOrder(root);
        }
    }

    private void printPreOrder(Node<D> currentNode){
        System.out.println(currentNode.getData());

        if(currentNode.getLeftNode() != null){
            printPreOrder(currentNode.getLeftNode());
        }

        if(currentNode.getRightNode() != null){
            printPreOrder(currentNode.getRightNode());
        }
    }

    public void printPostOrder(){
        if(root == null){
            System.out.println("Baum ist leer");
        }else{
            System.out.println("Post-Order Ausgabe für Baum:");
            // Todo Post Order
        }
    }


    private class Node<D>{

        private D data;
        private Node<D> leftNode;
        private Node<D> rightNode;

        public Node(D data){
            this.data = data;
        }

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
