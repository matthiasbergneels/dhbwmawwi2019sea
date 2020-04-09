package lecture.datastructures;

public class Stack<D> {

    Node<D> topNode = null;

    // lege ein Element auf den Stack
    public void push(D data){
        topNode = new Node(data, topNode);
    }

    // nehme das oberste Element vom Stack runter
    public D pop(){
        if(topNode != null){
            D data = topNode.getData();
            topNode = topNode.getLowerNode();
            return data;
        }
        return null;
    }

    // zeige das oberste Element vom Stack
    public D peek(){
        if(topNode != null){
            return topNode.getData();
        }
        return null;
    }


    private class Node<D>{

        private D data;
        private Node<D> lowerNode;

        public Node(D data, Node<D> lowerNode){
            this.data = data;
            this.lowerNode = lowerNode;
        }

        public Node<D> getLowerNode(){
            return this.lowerNode;
        }

        public D getData(){
            return this.data;
        }


    }
}
