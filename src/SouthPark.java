public class SouthPark {
    private String Cartman;
    private String Kyle;
    private String Stan;
    private String Kenny;
    private String Butters;

    public String getCartman() {

        return Cartman;
    }

    public String getKyle() {

        return Kyle;
    }

    public String getStan() {

        return Stan;
    }

    public String getKenny() {

        return Kenny;
    }

    public String getButters()
    {
        return Butters;
    }

    public void setCartman(String cartman) {

        Cartman = cartman;
    }

    public void setKyle(String kyle) {

        Kyle = kyle;
    }

    public void setStan(String stan) {

        Stan = stan;
    }

    public void setKenny(String kenny) {

        Kenny = kenny;
    }

    public void setButters(String butters) {

        Butters = butters;
    }
    public SouthPark(){
        this("Evil","Objective","Voice of reason","Dead","Gullible");
    }
public SouthPark(String Cartman, String Kyle, String Stan, String Kenny, String Butters){
        setCartman(Cartman);
        setKyle(Kyle);
        setStan(Stan);
        setKenny(Kenny);
        setButters(Butters);
}
    @Override
    public String toString() {
        return new String("Cartman is Evil\n\nKyle is Objective\n\nStan is the voice of Reason\n\nKenny Has Died a multiple of times\n\nButters is Gullible to Everything");
    }
}


