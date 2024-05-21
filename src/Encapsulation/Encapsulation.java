package Encapsulation;

/**
 * Hidden data fields from user - using private access modifier
 * To interact with the data -> using getter and setter
 */
public class Encapsulation {
    private int hiddenNumber;
    private String hiddeName;

    public Encapsulation() {
    }

    // Encapsulation e = new Encapsulation();
    // e.setHiddenNumber(20.5);
    //
    // avoid setting or retrieving the data directly with the . operator

    public int getHiddenNumber() {
        return hiddenNumber;
    }

    public String getHiddeName() {
        return hiddeName;
    }

    public void setHiddenNumber(int hiddenNumber) {
        // some condition for the number
        if (hiddenNumber > 10) {
            System.out.println("Invalid number");
            // throw Exception
        }
        this.hiddenNumber = hiddenNumber;
    }

    public void setHiddeName(String hiddeName) {
        // some condition for the name
        this.hiddeName = hiddeName;
    }

    /**
     *
     *      Encapsulation e = new E();
     * Now, instead of this:
     *      e.hiddenName = "ABC";
     * it should be this:
     *      e.setHiddenName("ABC");
     */
}