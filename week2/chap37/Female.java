package week2.chap37;

public class Female implements Employee, Wife{
    //속성
    private String name;
    private int age;
    private String job;

    @Override
    public void workTogether(Employee employee) {
        String name = employee.getName();
        System.out.println(name + " 인 직장동료와 업무를 하고 있습니다.");
    }
    @Override
    public void takeCareHusband(Husband husband) {
        String name = husband.getName();
        System.out.println(name + " 인 남편을 케어합니다.");
    }
    @Override
    public String getName() {
        return this.name;
    }
    public Female(String name) {
        this.name = name;
    }
}
