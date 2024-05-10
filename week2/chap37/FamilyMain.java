package week2.chap37;

public abstract class FamilyMain implements FamilyRole{ 
    // 인터페이스에 default를 많이 쓰는건 좋은 습관 x -> 추상클래스 생성 

    protected String name;

    @Override
    public void educateBaby(Baby baby) {
        String name = baby.getName();
        System.out.println(name + "아기를 열심히 교육하고 있습니다.");
    }

    @Override
    public void takeCareWife(Wife wife) {
        String name = wife.getName();
        System.out.println(name + " 인 아내를 케어합니다.");
    }
}
