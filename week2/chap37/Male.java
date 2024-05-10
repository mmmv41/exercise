package week2.chap37;

public class Male extends FamilyMain implements FamilyRole ,Employee{
    private String name;
    private int age;
    private String job;
    
    @Override
    public void workTogether(Employee employee) {
        String name = employee.getName();
        System.out.println(name + " 인 직장동료와 업무를 하고 있습니다.");
    }

    @Override
    public String getName() {
        return this.name;
    }
    
    public Male(String name) {
        this.name = name;
    }
}
