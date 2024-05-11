package week3.chap64.builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public User(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }
    @Override
    public String toString() {
        return "User{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", age=" + age +
               ", email='" + email + '\'' +
               '}';
    }
    private User(UserBuilder userBuilder){ // UserBuilder 클래스를 통해서만 생성 가능 
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.email = userBuilder.email;
    }

    //UserBuilder는 내부 정적 클래스로 만든다. 항상 같은 속성을 가지고 있다. 
    static class UserBuilder{
        String firstName;
        String lastName;
        int age;
        String email;

        public UserBuilder() {} // 빈 생성자 정의 
        
        public UserBuilder firstName(String firstName){ // 필드 이름을 메소드 이름으로. 자기 자신을 반환.
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName(String lastName){ 
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age){ // 
            this.age = age;
            return this;
        }
        public UserBuilder email(String email){ // 
            this.email = email;
            return this;
        }
        public User build(){ // user 반환하도록 
            return new User(this);
        }
    }

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public int getAge() {return age;}

    public String getEmail() {return email;}

}
