package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(float salary) {
        if(salary <= 10000 && salary > 0){
            salary *= 0.85;
            System.out.println(salary);
        }else if(salary > 10000 && salary <= 20000){
            salary -= salary*0.18;
            System.out.println(salary);
        } else if (salary > 20000) {
            salary -= salary*0.2;
            System.out.println(salary);
        }else if(salary < 0){
            System.out.println("wrong input!");
        }
    }
}
