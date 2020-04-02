package lecture.datastructures;

public class DoubleLinkedList {




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
