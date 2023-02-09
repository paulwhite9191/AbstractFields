public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Дилгам";
        post.surname = "Шергазиев";
        post.patronymic = "Гафиржанович";
        post.passport = "8888 № 888888";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 12;
        post.birthday.month = 10;
        post.birthday.year = 1992;

    }
}
