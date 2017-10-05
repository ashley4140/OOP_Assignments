public class house {
    private String address;
    private String type;
    private double price;
    private String owner;

   public String getAddress(){
       return address;
    }
   public String getType(){
       return type;
   }
   public double getPrice(){
       return price;
   }

    public String getOwner() {
        return owner;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public house(){
       this("No Address Specified", "No Type Specified", 0.0, "No owner specified");
    }
    public house(String address,String type,double price,String owner){
        setAddress(address);
        setType(type);
        setPrice(price);
        setOwner(owner);
    }
    @Override
    public String toString(){
        return new String ();
    }

}

