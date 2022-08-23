public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;

    public Bed(String style, int pillows, int height, int sheets) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
    }

    public void make(){
        System.out.println("Making bed");
    }

}
