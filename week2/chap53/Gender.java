package week2.chap53;

public enum Gender {
    FEMALE("Female", "여자"),
    MALE("Male","남자"),
    UNKNOWN("Unknown", "미정");

    private String englishTerm;
    private String koreanTerm;

    Gender(String englishTerm, String koreanTerm) {
        this.englishTerm = englishTerm;
        this.koreanTerm = koreanTerm;
    }

    public static Gender valueofTerm(String str){
        for(Gender gender: values()){ 
            if(str.equals(gender.englishTerm) || str.equals(gender.koreanTerm)){
                return gender; // 영어나 한국어 둘중에 하나만 맞아도 젠더를 반환. 
            }
        }
        return Gender.UNKNOWN;
    }
}

