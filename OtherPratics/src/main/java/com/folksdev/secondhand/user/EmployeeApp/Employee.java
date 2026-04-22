package com.folksdev.secondhand.user.EmployeeApp;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

     double tax(double salary){
        if(salary<1000) return 0;
        else return salary*0.03;
     }

     int bonus(int workHours){
        if(workHours<=40) return 0;
        else return (workHours-40)*30;
     }

     double raiseSalary(){
        final int nowYear = 2021;
        int workYear = nowYear - hireYear;

        if(workYear<10)
            return salary*0.05;
        else if(workYear<20)
            return salary*0.1;
        else return salary*0.15;
     }

    @Override
    public String toString() {
        double tax = tax(salary);
        int bonus = bonus(workHours);
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = salary + bonus - tax;
        double totalSalary = salary + bonus + raise - tax;

        return "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax + "\n" +
                "Bonus : " + bonus + "\n" +
                "Maaş Artışı : " + raise + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + salaryWithTaxAndBonus + "\n" +
                "Toplam maaş : " + totalSalary;
    }
}
