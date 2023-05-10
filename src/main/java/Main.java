public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.pasport = "1234 № 12345678";
        post.patronymic = "Александрович";
        post.phone = "+7(123)-456-78-90";
        post.surname = "Петров";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 25;
        post.birthday.month = 9;
        post.birthday.year= 1998;
    }
}