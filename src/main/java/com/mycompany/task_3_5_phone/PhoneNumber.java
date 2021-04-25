package com.mycompany.task_3_5_phone;

public class PhoneNumber {
    private String number;
    
    //задаем в конструкторе способ, которым будум отбирать номера 
    //единственное различие для двух случаем заключается в последней цифре
    public PhoneNumber(String num) {
        String cc, ac, g3, g4;
        int upperBound = num.length();

        g4 = num.substring(upperBound-4, upperBound);
        upperBound -= 4;
        g3 = num.substring(upperBound-3, upperBound);
        upperBound -= 3;
        ac = num.substring(upperBound-3, upperBound);
        upperBound -= 3;
        cc = "";

        if (num.charAt(0) == '+') {
            cc = num.substring(1, upperBound);
        }
        else if (num.charAt(0) == '8') {
            cc = "7";
        }
        this.number = "+" + cc + " " + ac + "-" + g3 + "-" + g4;
    }
    
    //выводит строковое представление
    public String toString() {
        return number;
    }
}
