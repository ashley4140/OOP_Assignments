/**
 * Created by t00193720 on 28/09/2017.
 */
public class FamilyGuy {
private String Peter;
private String Lois;
private String Meg;
private String Chris;
private String Stewie;
private String Brian;

    public String getPeter() {
        return Peter;
    }

    public String getLois() {
        return Lois;
    }

    public String getMeg() {
        return Meg;
    }

    public String getChris() {
        return Chris;
    }

    public String getStewie() {
        return Stewie;
    }

    public String getBrian() {
        return Brian;
    }

    public void setPeter(String peter) {
        Peter = peter;
    }

    public void setLois(String lois) {
        Lois = lois;
    }

    public void setMeg(String meg) {
        Meg = meg;
    }

    public void setChris(String chris) {
        Chris = chris;
    }

    public void setStewie(String stewie) {
        Stewie = stewie;
    }

    public void setBrian(String brian) {
        Brian = brian;
    }
    public FamilyGuy() {
        this("Idiot and Best character", "Nagging Wife", "Shut Up Meg", "Slow Elder Son but middle child", "Intellegent one of the family", "Talking Dog");
    }
    public FamilyGuy(String peter,String lois,String meg,String chris,String stewie,String brian) {
    setPeter(peter);
    setLois(lois);
    setMeg(meg);
    setChris(chris);
    setStewie(stewie);
    setBrian(brian);
    }
    @Override
    public String toString() {
        return new String("Peter is the Father\n\nLois is the Mother\n\nMeg is the eldest and the most hated in the family\n\nChris is the middle child and an idiot\n\nStewie is the youngest and the smartest in the family\n\nBrian is the familys talking dog");
    }
}

