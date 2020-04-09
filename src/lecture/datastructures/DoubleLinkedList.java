package lecture.datastructures;

public class DoubleLinkedList<D> {

    private Node<D> firstNode = null;
    private Node<D> lastNode = null;

    public void add(D data){
        Node<D> newNode = new Node<D>(data);

        if(this.firstNode == null && this.lastNode == null){
            // Empty List
            this.firstNode = newNode;
            this.lastNode = newNode;
        }else{
            this.lastNode.setNextNode(newNode);
            newNode.setPrevNode(this.lastNode);
            this.lastNode = newNode;
        }
    }

    public void addFirst(D data){
        Node<D> newNode = new Node<D>(data);

        if(this.firstNode == null && this.lastNode == null) {
            // Empty List
            this.firstNode = newNode;
            this.lastNode = newNode;
        }else{
            this.firstNode.setPrevNode(newNode);
            newNode.setNextNode(this.firstNode);
            this.firstNode = newNode;
        }
    }

    public boolean remove(D data){

        Node<D> nodeToDelete = findNode(data);

        if(nodeToDelete != null){
            if(nodeToDelete.getPrevNode() != null){
                nodeToDelete.getPrevNode().setNextNode(nodeToDelete.getNextNode());
            }else{

            }


        }

        return false;
    }

    private Node<D> findNode(D data) {
        if(firstNode != null) {

            Node<D> currentNode = firstNode;
            do {
                if (currentNode.getData().equals(data)) {
                    return currentNode;
                }
                currentNode = currentNode.getNextNode();
            } while (currentNode.getNextNode() != null);
        }

        return null;
    }

    public boolean contains(D data){
        // TODO
        return false;
    }

    @Override
    public String toString() {
        if(firstNode == null){
            return "Empty List";
        }

        return toString(firstNode);
    }

    private String toString(Node<D> node){
        String ausgabe = "";
        ausgabe = ausgabe + node.getData() + "\n";

        if(node.getNextNode() != null) {
            ausgabe = ausgabe + toString(node.getNextNode());
        }

        return ausgabe;
    }


    private class Node<D>{

        private Node<D> prevNode;
        private D data;
        private Node<D> nextNode;

        public Node(D data){
            this.prevNode = null;
            this.data = data;
            this.nextNode = null;
        }

        public D getData(){
            return data;
        }

        public Node<D> getNextNode(){
            return this.nextNode;
        }

        public void setNextNode(Node<D> nextNode){
            this.nextNode = nextNode;
        }

        public Node<D> getPrevNode(){
            return this.prevNode;
        }

        public void setPrevNode(Node<D> prevNode){
            this.prevNode = prevNode;
        }

    }
}
