package CatLibrary;

import java.sql.Date;

import javafx.scene.chart.PieChart.Data;

public class Cat {
    

    public int weight;
    public String name;
    public int color;
    public Date age;
    public boolean gender;
    public long id;
    
    public Cat(int weight, String name, int color, Date age, boolean gender, long id) {
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public boolean medSup(){
        
    }
    
}