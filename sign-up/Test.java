import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Scanner;

public class Test {

    public static User[] getUsers() {
        User user1 = new User("Jhon", "pass", "jhon@gmail.com", 24);
        User user2 = new User("Rassulkhair", "RassulIsGod", "rasulhair@gmail.com", 21);
        User user3 = new User("Aron", "arriva", "aron@gmial.com", 16);
        return new User[]{user1, user2, user3};
    }


    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User parasha= getUserByLoginAndPassword(login, password);
        validateUser(parasha);


        System.out.println("Доступ предоставлен");

    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (login.equals(user.login) && password.equals(user.password)) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден.");
    }

    public static void validateUser(User user) throws AccessDeniedException{
        if (user.age<18){
            throw new AccessDeniedException("Вам нет 18 ти лет. Доступ запрещен");
        }
    }

}

