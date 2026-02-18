package lab_12_generic.customNumber;

import java.util.ArrayList;

public class MyCustomNumber<T extends Number> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    @Override
    public String toString()
    {
        return list.toString();
    }


}
