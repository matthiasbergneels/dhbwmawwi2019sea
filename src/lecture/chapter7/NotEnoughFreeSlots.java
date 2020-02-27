package lecture.chapter7;

public class NotEnoughFreeSlots extends Exception{
    protected int freeSlots;

    public NotEnoughFreeSlots(int slotsToBook, int freeSlotsLeft){
        super("Es wurde versucht " + slotsToBook + " Slots zu buchen; freie Slots " + freeSlotsLeft);
        this.freeSlots = freeSlotsLeft;
    }
}
