package lecture.chapter7;

public interface Bookable {

    public int freeSlots();
    public void book(int slots) throws NotEnoughFreeSlots;


}
