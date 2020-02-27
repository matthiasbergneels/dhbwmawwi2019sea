package lecture.chapter7;

import java.awt.print.Book;

public class TravelAgencey {


    public static void main(String[] args){

        Bookable[] bookableThings = new Bookable[5];

        Plane myPlane = new Plane(250);
        myPlane.fly();
        myPlane.freeSlots();
        try {
            myPlane.book(110);
        }catch (NotEnoughFreeSlots notEnoughSlotsException){
            System.out.println(notEnoughSlotsException.getMessage());
        }
        bookableThings[0] = new Hotel(100);     // narrowing cast
        bookableThings[1] = myPlane;                      // narrowing cast


        for(Bookable bookableThing : bookableThings){
            if(bookableThing != null){
                System.out.println("Freie Plätze: " + bookableThing.freeSlots());

                try{
                    bookableThing.book(110);
                    System.out.println("Plätze gebucht!");
                }catch (NotEnoughFreeSlots notEnoughSlotsException){
                    System.out.println(notEnoughSlotsException.getMessage());

                    try {
                        bookableThing.book(notEnoughSlotsException.freeSlots);
                    }catch (NotEnoughFreeSlots notEnoughSlotsException2){
                        System.out.println("Ich hab mein Bestes versucht...");

                    }catch(Exception e){
                        System.out.println("Generische Ausnahme!");
                        return;
                    }

                }

                System.out.println("Freie Plätze: " + bookableThing.freeSlots());

                if(bookableThing instanceof Plane) {
                    Plane newPlane = (Plane) bookableThing;     // widening Cast
                    newPlane.fly();
                }
            }
        }




    }

}
