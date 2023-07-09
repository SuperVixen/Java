package Domen;

public class HotDrink extends Product {
    // Поля
    private int hotDrintTemp;
// Свойства
    public int getHotDrintTemp() {
        return hotDrintTemp;
    }

    public void setHotDrintTemp(int hotDrintTemp) {
        this.hotDrintTemp = hotDrintTemp;
    }
    //конструкторы
     public HotDrink(){
        super();
        this.hotDrintTemp = 40;
    }
    // public HotDrink(){
    //     super(4, 10, "Hot Drink", -1);
    //     this.hotDrintTemp = 40;
    // }
    // public HotDrink(int price, int place, String name, long id){
    //     super(price,place,name,id);
    //     this.hotDrintTemp = 40;
    // }
    public HotDrink (int price, int place, String name, long id, int temp){
        super(price,place,name,id);
        this.hotDrintTemp = temp;
    }

    @Override
    public String toString() {
        return super.toString() + "temperature = "+ hotDrintTemp +"\n" ;
    }

}