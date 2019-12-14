/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
class TPress {
    //поля класса

    private String name;
    private String type;
    private int range;

    
    TPress(){ }//Конструктор по умолчанию
    
    TPress(String nameIn, String typeIn, int  rangeIn){ //конструктор получающий параметры
        this.name = nameIn;
        this.type = typeIn;
        this.range = rangeIn;
    }
    
    
    TPress(TPress publication){ //конструктор копирования
        this(publication.name, publication.type, publication.range);
    }
    
    
    public void setData(String m_name, String m_type, int m_range) { // метод класса для ввода данных
        
        name = m_name;
        type = m_type;
        range = m_range;
}
    
    public  String getName() { // метод класса вывод имени
        return name;
    }
    
    public  String getType() { // метод класса вывод типа
        return type;
    }
    
    public  int getRange() { // метод класса вывод тиража
        return range;
    }
    
    public static ArrayList<TPress> rangeFilter(ArrayList<TPress> arrayIn, int minRange){ // метод класса возвращает фильтрация по тиражу
        ArrayList<TPress> pressaF = new ArrayList<TPress>(); 
        for (int i =0; i < arrayIn.size(); i++) {
            if (arrayIn.get(i).range > minRange){
                pressaF.add(arrayIn.get(i));
            }
        } 
        return pressaF;
    }
        
    
    
}
