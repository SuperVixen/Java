package NoteBook;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Note {

    public String vendor; //производитель
    public String model;    //модель ноута
    public float monitorSize; //диагональ дисплея
    public String cpu;      //модель процессора
    public int ram;         //объём оперативной памяти
    public int hdd;         //объём жёсткого/твердотельного диска
    public Date manufactureDate;//дата производства
    public long id;         //идентификатор

    public Note(String vendor, String model, float monitorSize, String cpu, int ram, int hdd, Date manufactureDate,
            long id) {
        this.vendor = vendor;
        this.model = model;
        this.monitorSize = monitorSize;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.manufactureDate = manufactureDate;
        this.id = id;
    }

    public boolean inStorage(){
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE,MMMM d, yyyy", Locale.ENGLISH);
        //TODO Auto - generated method stud
        return "Производитель: " + vendor + " Модель: " + model + 
                " Монитор: " + monitorSize + " Процессор: " + cpu + 
                " Память:" + ram + "Гб Дисковое пространство: " + hdd +
                "Гб Дата выпуска: " + formatter.format(manufactureDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return vendor == note.vendor && model == note.model && manufactureDate == note.manufactureDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendor, model, monitorSize, cpu, ram, hdd, manufactureDate, id);
    }
    
}
