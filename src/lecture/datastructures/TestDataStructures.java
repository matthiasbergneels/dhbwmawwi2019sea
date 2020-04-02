package lecture.datastructures;

public class TestDataStructures {


    public static void main(String[] args) {
        LinkedList foodList = new LinkedList();

        foodList.add("Brot");
        foodList.add("Marmelade");
        foodList.add("Nougatcreme");

        System.out.println(foodList.remove("Nougatcreme"));
        System.out.println(foodList.remove("Blub"));

        foodList.add("Brötchen");

    }
}
