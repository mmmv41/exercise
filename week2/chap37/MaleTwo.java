package week2.chap37;

public class MaleTwo extends FamilyMain implements FamilyRole, Employee{

    @Override
    public void workTogether(Employee employee) {
        String name = employee.getName();
        System.out.println(name + " 인 직장동료와 업무를 하고 있습니다.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    public MaleTwo(String name){
        this.name = name;
    }
    
}
