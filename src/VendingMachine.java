/**
 * Created by t00193720 on 28/09/2017.
 */
public class VendingMachine {
    private int can;
    private int token;

    public VendingMachine(int cans)
    {
        this.can = cans;
    }

    public int getCan() {
        return can;
    }

    public int getToken() {
        return token;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public void addToken()
    {
        if(can>0) {
            token++;
            can--;
        }
        else
            System.out.println("Sorry .... no cans left in machine!!!!");



    }

    public void fillUp(int cans)
    {
        this.can+=cans;
    }

    public String toString()
    {
        return "Total Cans Left: " + getCan() + "\tTotal tokens: " + getToken();
    }

    public static void main(String[] args) {
        VendingMachine v1 = new VendingMachine(50);
        System.out.println(v1);
        v1.addToken();
        System.out.println(v1);
        v1.setCan(3);
        v1.fillUp(10);
        v1.addToken();
        v1.addToken();
        v1.addToken();
        System.out.println(v1);
        v1.addToken();
        


    }
}
