package week3.chap64.builder;

public class BuilderTest {

    public static void main(String[] args){
        // 적용 전
        User user1 = new User("John", "Doe", 30, "johndoe@example.com");

        System.out.println("적용 전 User: " + user1);
        // 적용 후
        User user2 = new User.UserBuilder() // 순서를 바꿔도 에러가 나지 않는다. 
                .lastName("Doe").firstName("John")
                .email("johndoe@example.com").age(30)
                .build();

        System.out.println("적용 후 User: " + user2);

    }
}
