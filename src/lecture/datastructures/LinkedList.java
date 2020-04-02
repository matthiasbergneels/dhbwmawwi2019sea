package lecture.datastructures;

import java.util.List;

public class LinkedList{

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

    public boolean remove(String data){

        if(firstNode != null){

            if(firstNode.getData().equals(data)){
                firstNode = firstNode.getNextNode();
                return true;
            }

            Node currentNode = firstNode;
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
