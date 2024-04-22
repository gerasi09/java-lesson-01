public class Lesson10 {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("user123");
        user1.setFirstname("Amanda");
        user1.setLastname("Parker");
        user1.setEmail("amanda@java.local");
        System.out.println("user1: " + user1);

        User user2 = new User();
        user2.setUsername("user123");
        user2.setFirstname("Amanda");
        user2.setLastname("Parker");
        user2.setEmail("amanda@java.local");
        System.out.println("user2: " + user2);

        User user3 = new User();
        user3.setUsername("user123");
        user3.setFirstname("Amanda");
        user3.setLastname("Parker");
        user3.setEmail("amanda@java.local");
        System.out.println("user3: " + user3);

        User user4 = new User();
        user4.setUsername("user123");
        System.out.println("user4: " + user4);

        User test = user1;
        System.out.println("test = user1");
        System.out.println();

        System.out.println("user1 == test-> " + (user1 == test));
        System.out.println("user1.equals(test) -> " + user1.equals(test));
        System.out.println();

        System.out.println("user1 == user2 -> " + (user1 == user2));
        System.out.println("user1.equals(user2) -> " + user1.equals(user2));
        System.out.println();

        System.out.println("user1 == user3 -> " + (user1 == user3));
        System.out.println("user1.equals(user3) -> " + user1.equals(user3));
        System.out.println();

        System.out.println("user2 == user3 -> " + (user2 == user3));
        System.out.println("user2.equals(user3) -> " + user2.equals(user3));
        System.out.println();

        System.out.println("user1 == user4 -> " + (user1 == user4));
        System.out.println("user1.equals(user4) -> " + user1.equals(user4));

    }

}
