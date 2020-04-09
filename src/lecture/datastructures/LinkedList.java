package lecture.datastructures;

import java.util.List;

public class LinkedList<D>{

    private Node<D> firstNode = null;

    public void add(D data){
        Node<D> newNode = new Node<D>(data);

        if(firstNode == null){
            this.firstNode = newNode;
            return;
        }

        Node<D> currentNode = firstNode;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }

        currentNode.setNextNode(newNode);
    }

    public boolean remove(D data){

        if(firstNode != null){

            if(firstNode.getData().equals(data)){
                firstNode = firstNode.getNextNode();
                return true;
            }

            Node<D> currentNode = firstNode;
            while(currentNode.getNextNode() != null){
                if(currentNode.getNextNode().getData().equals(data)){
                    currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                    return true;
                }
                currentNode = currentNode.getNextNode();
            }
        }

        return false;
    }



    private class Node<D>{
        private D data;
        private Node nextNode;

        public Node(D data){
            this.data = data;
            this.nextNode = null;
        }

        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }

        public Node getNextNode(){
            return this.nextNode;
        }

        public D getData(){
            return this.data;
        }
    }
}
