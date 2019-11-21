package lecture.chapter4;

public class Loopexamples {

    public static void main(String[] args) {

        int counter = 0;

        System.out.println("while Beispiel:");
        while(counter++ < 10) {
            if(counter % 2 != 0){
                System.out.println("bringt unglück " + counter);

                continue;
            }

            System.out.println("Zähle " + counter);
        }

        counter = 0;
        System.out.println("do-while Beispiel:");
        do{
            System.out.println("Zähle " + counter++);
        }while(counter < 10);



        System.out.println("for Beispiel:");
        for(int i = 0; i < 10; i++){
            if(i == 5){
                System.out.println("evil " + i);
                break;
            }
            System.out.println("Zähle " + i);
        }



        // Loops & arrays

        String[] words = {"Ich", "habe", "hunger", "auf", "Wurst"};

        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }


        for(String word : words){
            if(word.equals("Wurst")){


            }
            System.out.println(word);
        }

        System.out.println("Schleifen Ende ");
    }
}
