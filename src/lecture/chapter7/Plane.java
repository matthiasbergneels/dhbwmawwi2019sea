package lecture.chapter7;

public class Plane implements Bookable{

    private boolean[] seats;

    public Plane(int seatCount){
        seats = new boolean[seatCount];
    }

    public void fly(){
        System.out.println("und ich flieg, flieg, flieg... *sieg*");
    }

    @Override
    public int freeSlots() {
        int freeSeats = 0;
        for(boolean seat : seats){
            if(!seat){
                freeSeats++;
            }
        }
        return freeSeats;
    }

    @Override
    public void book(int slots) throws NotEnoughFreeSlots{
        if(freeSlots() >= slots){
            for(int i = 0; i < seats.length; i++){
                if(!seats[i]){
                    seats[i] = true;
                    slots--;
                }
                if(slots == 0){
                    return;
                }
            }
        }else{
            throw new NotEnoughFreeSlots(slots, freeSlots());
        }
    }
}
