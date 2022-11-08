import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Country country1 = new Country("Rossia",300000000,5627000,"Русский");
        Country country2 = new Country("Kyrgyzstan",7000000,24345,"Кыргызча");
        Country country3 = new Country("Uzbekstan",10000000,243345,"Узбук");
        Country country4 = new Country("USA",500000000,3424345,"English");
        Country country5 = new Country("Tajikstan",9000000,34345," Тфжикче");
        Country country6 = new Country("France",56000000,64345,"Фрвнсузкий");
        Country[] countries = {country1,country2,country3,country4,country5,country6};
        System.out.println("1 = getMax 2 = findByCountryName 3 = findAll");
        int num = scanner.nextInt();
            if (num == 1) {
                getMax(countries);
            } else if (num == 2) {
                findByCountryName(scanner1.nextLine(), countries);
            } else if (num == 3) {
                findAll(countries);
            }else {
                System.out.println("Error");
            }

    }
    public static void getMax(Country[] countries){
        int counter = countries[0].getSquare();
        for (Country country : countries) {
            if (country.getSquare() > counter) {
                counter = country.getSquare();
                System.out.println(country.getName().toString());
            }
        }
        System.out.println("Max area: " + counter);

        int counter2 = countries[0].getSquare();;
        for (Country country: countries) {
            if (counter2 > country.getSquare() ){
                counter2 = country.getSquare();
                System.out.print(country.getName().toString());
            }
        }
    }
    public static void findByCountryName(String countryName,Country[] countries){
        for (Country country : countries) {
            if (country.getName().equals(countryName)){
            }
        }
    }
    public static void findAll(Country[] countries){
        for (Country country : countries) {
            System.out.println(country.getName());
        }
    }

}