import java.util.Date;

public class Employee {
    private String name;
    private double salary;
    private double workHours;
    private int hireYear;
    private int presently = 2021;

    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax() {
        if (salary > 1000) {
            this.salary = salary * 0.97;
            System.out.println("%3 vergi uygulandı");
        } else {
            this.salary = salary;
            System.out.println("Maaş 1000TL altında olduğundan vergi uygulanmadı.");
        }
    }
    void bonus() {
        if (workHours > 40) {
            this.salary += (this.workHours - 40) * 30;
            System.out.println("Mesai ücreti : " + (this.workHours - 40) * 30);
        }
    }
    void raiseSalary() {
        if ((presently - hireYear) < 10) {
            this.salary += salary * 0.05;
            System.out.println("Maaşına %5 zam uygulandı. ");
        } else if ((presently - hireYear) > 9 && (presently - hireYear) < 20) {
            this.salary += salary * 0.10;
            System.out.println("Maaşına %10 zam uygulandı. ");
        } else if ((presently - hireYear) > 19) {
            this.salary += salary * 0.15;
            System.out.println("Maaşına %15 zam uygulandı. ");
        }
    }
    public String toString() {
        this.tax();
        this.bonus();
        this.raiseSalary();

        return "Adı: " + this.name + "\nMaaşı: " + this.salary + "\nÇalışma Saati: " + this.workHours + "\nBaşlangıç Yılı: " + this.hireYear;
    }
}
