package lecture.datastructures;

public class TreeExample {
    public static void main(String[] args) {

        Tree<Integer> numberTree = new Tree<Integer>();

        numberTree.add(25);
        numberTree.add(15);
        numberTree.add(45);
        numberTree.add(5);
        numberTree.add(7);
        numberTree.add(35);
        numberTree.add(5);

        System.out.println("Baum ist fertig!");
    }
}
