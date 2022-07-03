public class Character implements Cloneable {
    private String body;
    private Hat hat;
    private String skin;
    private int age;
    private double height;
    private double weight;

    
    public Character(String body, Hat hat, String skin, int age, double height, double weight){
        this.body = body;
        this.hat = hat;
        this.skin = skin;
        this.age = age;
        this.height = height;
        
        this.weight = weight;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Hat getHat() {
        return hat;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public Character clone() throws CloneNotSupportedException {
        Character characterClone = (Character) super.clone();
        characterClone.hat = (Hat) characterClone.hat.clone();
        return characterClone;
    }

    @Override
    public String toString() {
        return "Character{" +
                "body='" + body + '\'' +
                ", hat=" + hat +
                ", skin='" + skin + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
