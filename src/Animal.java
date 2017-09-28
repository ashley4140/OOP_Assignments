public class Animal {
    private String Rabbit;
    private int age;
    private float weight;
    private String name;

    public String getRabbit() {
        return Rabbit;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public void setRabbit(String rabbit) {
        Rabbit = rabbit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public Animal(){
        this("LionHead Rabbit","Oliver Twist",3,2f);
    }
    public Animal(String Rabbit,String name,int age,float weight){
        setRabbit(Rabbit);
        setName(name);
        setAge(age);
        setWeight(weight);
    }
  @Override
  public String toString(){
        return new String ("LionHead Rabbit,Oliver Twist,3,2KG");
  }

}
