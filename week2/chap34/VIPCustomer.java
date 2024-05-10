package week2.chap34;

public class VIPCustomer extends Customer {
    static int serialNum = 1; 
    // static은 설게도에 속한 클래스 변수이기 때문에 이어받지 x
    
    // private String customerID;
    // private String name;
    // private String customerGrade; -> 부모 클래스 이어받기
    // private int bonusPoint;
    // private double bonusPointRatio;

    //속성
    private String agentID; // vip 담당 직원 id
    private double discountRatio; // 구매 할인율

    //행위
    @Override // 겹치는 부분은 override
    public int calculatePrice(int price){ // 1. 돈을 지불한다.
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    public void callAgent(){ // 2. vip 담당 지구언 부른다. 
        System.out.println("담당 직원 " + this.agentID + "님 문의드릴게 있어요. ");
    }

    public VIPCustomer(String name){
        super();
        this.customerID = "VIP" + serialNum++;
        this.name = name;
        this.customerGrade = "VIP";
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1; // 10퍼센트 할인 
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    @Override
    void printMyInfo(){
        System.out.print("VIP");
        super.printMyInfo();
    }
}
