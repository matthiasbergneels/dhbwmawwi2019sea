package lecture.datastructures;

public class LinkedList {

    private Node firstNode = null;

    public void add(String data){
        Node newNode = new Node(data);

        if(firstNode == null){
            this.firstNode = newNode;
            return;
        }

        Node currentNode = firstNode;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(newNode);
    }





    private class Node{
        private String data;
        private Node nextNode;

        public Node(String data){
            this.data = data;
            this.nextNode = null;
        }

        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }

        public Node getNextNode(){
            return this.nextNode;
        }

        public String getData(){
            return this.data;
        }
    }
}
