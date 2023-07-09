package Domen;

public class Bottle extends Product {
    // Поля
    private float bottleVolume;
// Свойства
    public float getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(float bottleVolume) {
        this.bottleVolume = bottleVolume;
    }
    //конструкторы

    // public Bottle(){
    //     super(int price, int place, String name, long id);
    //     // this.price = 22;
    //     // this.place = 22;
    //     // this.name = "bottle";
    //     // this.id = 22;
    //     this.bottleVolume = 1.5;
    // }
    public  Bottle(int price, int place, String name, long id){
        super(price,place,name,id);
        this.bottleVolume = 0f;
    }
    public Bottle (int price, int place, String name, long id, float bottleVolume){
        super(price,place,name,id);
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String toString() {
        return super.toString() + "volume="+bottleVolume +"\n" ;
    }

}