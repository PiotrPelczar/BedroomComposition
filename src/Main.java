public class Main {

    public static void main (String [] args) {
        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("south");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("west");
        Celling celling = new Celling(3, 1);
        Bed bed = new Bed("old",2,1,1);
        Lamp lamp = new Lamp("modern", false);

        Bedroom bedroom = new Bedroom("Pete's room", wall1, wall2, wall3, wall4, celling, lamp, bed);

        bedroom.makingBed();

    }
}
