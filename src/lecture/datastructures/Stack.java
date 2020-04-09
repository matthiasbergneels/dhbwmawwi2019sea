package lecture.datastructures;

public class Stack<D> {

    Node<D> topNode = null;

    // lege ein Element auf den Stack
    public void push(D data){

    }

    // nehme das oberste Element vom Stack runter
    public D pop(){

        return null;
    }

    // zeige das oberste Element vom Stack
    public D peek(){

        return null;
    }


    private class Node<D>{

        private D data;
        private Node<D> nextNode;

        public Node(D data){
            this.data = data;
        }

        public Node<D> getNextNode(){
            return this.nextNode;
        }

        public D getData(){
            return this.data;
        }


    }
}
