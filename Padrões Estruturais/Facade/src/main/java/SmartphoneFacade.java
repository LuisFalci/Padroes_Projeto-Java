public class SmartphoneFacade {
    private Smartphone samsung;
    private Smartphone asus;
    private Smartphone motorola;

    public SmartphoneFacade() {
        this.samsung = new Samsung();
        this.asus = new Asus();
        this.motorola = new Motorola();
    }

    public String produzirSamsung(){
        return samsung.produz();
    }
    public String produzirAsus(){
        return asus.produz();
    }
    public String produzirMotorola(){
        return motorola.produz();
    }
}
