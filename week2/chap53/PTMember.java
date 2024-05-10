package week2.chap53;

import week2.chap52.PositiveNumberException;

public class PTMember {
    //조건
    // ID는 Null이 아님, ID는 8자이상 20자 이하, heigth와 weight는 양수

    private String ID;
    private String name;
    private Integer height;
    private Integer weight;
    private Gender gender;

    public void setID(String iD) {
        ID = iD;
    }
    
    public PTMember(String name, Integer height, Integer weight, String gender) {
        if (height < 0 ){
            throw new PositiveNumberException("키는 0보다 커야합니다.");
        }
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = Gender.valueofTerm(gender); //valueofTerm으로 Gender라는 타입으로 바꿔서 저장됨
    }
    
    @Override
    public String toString() {
        return "PTMember{" + 
                "ID= '" + ID + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender + '\'' +
                '}';

    }
    
}
