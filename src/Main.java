import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Scanner scanner1 = new Scanner(System.in);
//        Country country1 = new Country("Rossia",300000000,5627000,"Русский");
//        Country country2 = new Country("Kyrgyzstan",7000000,24345,"Кыргызча");
//        Country country3 = new Country("Uzbekstan",10000000,243345,"Узбук");
//        Country country4 = new Country("USA",500000000,3424345,"English");
//        Country country5 = new Country("Tajikstan",9000000,34345," Тфжикче");
//        Country country6 = new Country("France",56000000,64345,"Фрвнсузкий");
//        Country[] countries = {country1,country2,country3,country4,country5,country6};
//        System.out.println("1 = getMax 2 = findByCountryName 3 = findAll");
//        int num = scanner.nextInt();
//            if (num == 1) {
//                getMax(countries);
//            } else if (num == 2) {
//                findByCountryName(scanner1.nextLine(), countries);
//            } else if (num == 3) {
//                findAll(countries);
//            }else {
//                System.out.println("Error");
//            }
//
//    }
//    public static void getMax(Country[] countries){
//        int counter = countries[0].getSquare();
//        for (Country country : countries) {
//            if (country.getSquare() > counter) {
//                counter = country.getSquare();
//                System.out.println(country.getName().toString());
//            }
//        }
//        System.out.println("Max area: " + counter);
//
//        int counter2 = countries[0].getSquare();;
//        for (Country country: countries) {
//            if (counter2 > country.getSquare() ){
//                counter2 = country.getSquare();
//                System.out.print(country.getName().toString());
//            }
//        }
//    }
//    public static void findByCountryName(String countryName,Country[] countries){
//        for (Country country : countries) {
//            if (country.getName().equals(countryName)){
//            }
//        }
//    }
//    public static void findAll(Country[] countries){
//        for (Country country : countries) {
//            System.out.println(country.getName());
//
        Author author1 = new Author("Александр Пушкин", "pushkin@gmail.com", 'M');
        Author author2 = new Author("Лев Толстой", "tolstoi@gmail.com", 'M');
        Author author3 = new Author("Николай Гоголь", "gogol@gmail.com", 'M');
        Author author4 = new Author("Асел Турганбекова", "asel@gmail.com", 'W');
        Author author5 = new Author("Жамиля Торокулова", "jamila@gmail.com", 'W');

        Book book1 = new Book("Дубровский", author1, 1000, 5);
        Book book2 = new Book("Война и мир", author2, 500, 4);
        Book book3 = new Book("Тарас Бульба", author3, 750, 6);
        Book book4 = new Book("Мир", author4, 300, 3);
        Book book5 = new Book("Горы", author5, 400, 2);

        Scanner sc = new Scanner(System.in);
        Author[] authors = {author1, author2, author3, author4, author5};
        Book[] books = {book1, book2, book3, book4, book5};
        getMaxMin(books, authors);
        //System.out.print("Enter name of author: ");
        //getAuthor(sc.nextLine(), books);


    }

    public static void getMaxMin(Book[] books, Author[] authors) {
        int max = books[0].getPrise(), min = books[0].getPrise();
        for (Book book : books) {
            max = Math.max(max, book.getPrise());
            min = Math.min(min, book.getPrise());
        }
        for (Book book: books) {
            if (book.getPrise()==max){
                System.out.println("Max price of book: " + max + "\nName of book: " + book.getName() + "\n" + book.getAuthor());
            } else if (book.getPrise()==min) {
                System.out.println("\nMin price of book: " + min + "\nName of book: " + book.getName() + "\n" + book.getAuthor());
            }
        }
    }

    public static void getAuthor(String name, Book[] books) {
        for (Book book : books) {
            if (name.equals(book.getAuthor().getFullName())) {
                System.out.println(name + "\n" + book.getName());
            }
        }
    }
}