package lecture.datastructures;

public class TestDataStructures {


    public static void main(String[] args) {
        LinkedList<String> foodList = new LinkedList<String>();

        foodList.add("Brot");
        foodList.add("Marmelade");
        foodList.add("Nougatcreme");

        System.out.println(foodList.remove("Nougatcreme"));
        System.out.println(foodList.remove("Blub"));

        foodList.add("Brötchen");



        DoubleLinkedList<String> carBrandList = new DoubleLinkedList<String>();

        carBrandList.add("BMW");
        carBrandList.add("Mercedes");
        carBrandList.add("Volvo");
        carBrandList.add("BMW");
        carBrandList.add("Porsche");

        System.out.println(carBrandList.toString());


        System.out.println(carBrandList.remove("Mercedes"));
        System.out.println(carBrandList.remove("Fiat"));
        System.out.println(carBrandList.remove("BMW"));




    }
}
