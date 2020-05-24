package com.company;

public class Main {

    public static void main(String[] args) {
        int MIN_AGE = 40;
        Employee employee = new Employee("Olimov Muhammad", "programmer", "muhammedolimov@yandex.ru", "+9989131319370", 1000000, 25);
        //employee.getFullInfo();
        Employee[] personsArray = new Employee[5];
        personsArray[0] = employee;
        personsArray[1] = new Employee("Gates Bill", "businessman", "Gates_Bill@gmail.ru", "+688865165188", 1000000, 64);
        personsArray[2] = new Employee("Jeff Bezos", "businessman", "Jeff_Bezos@gmail.ru", "+649819819819", 1000000, 63);
        personsArray[3] = new Employee("Qin Yinglin", "businessman", "Qin_Yinglin@gmail.ru", "+23546465466", 1000000, 39);
        personsArray[4] = new Employee("Mark Zuckerberg", "businessman", "Mark_Zuckerberg@gmail.ru", "+74521651651", 1000000, 36);

        for (int i = 0; i < personsArray.length; i++) {
            if (personsArray[i].getAge() <MIN_AGE){
                personsArray[i].getFullInfo();
            }
        }
    }
}
