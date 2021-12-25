public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public void tax() {
        if (this.salary < 1000) {
            tax = 0;
        } else if (this.salary >= 1000) {
            tax = salary * 0.03;
        }
    }

    public void bonus(){
        if(this.workHours > 40 ){
            bonus = (this.workHours - 40) * 30 ;
        }
    }

    public void raiseSalary(){
        int time = 2021 - hireYear;

        if( time > 19 ){
            raiseSalary =  salary * 0.15;
        }else if ( time > 9 && time < 20){
            raiseSalary =  salary * 0.10;
        }else if (time < 10){
            raiseSalary =  salary * 0.05;
        }
    }

    public void printInfo(){
        System.out.println("İşçinin adı :" + name);
        System.out.println("İşçinin başlangıç maaşı :" + salary);
        System.out.println("İşçinin vergi borcu :" + tax);
        System.out.println("İşçinin mesai ücreti :" + bonus);
        System.out.println("İşçinin kıdem zammı :" + raiseSalary);
        System.out.println("İşçinin son maaşı : " +  (salary + bonus + raiseSalary - tax) );


    }

}
