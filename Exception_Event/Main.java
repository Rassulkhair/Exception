public class Main {
    public static void main(String[] args) {
        for (Movie movie : getMovies()) {
            validEvent(movie);
        }
        for (Theater theatre : getTheatres()) {
            validEvent(theatre);
        }
        System.out.println("Все события корректны");
    }

    private static void validEvent(Event event) {
        if (event.getName() ==null || event.getAge() == 0 || event.getReleaseYear() ==0) {
            throw new RuntimeException();
        }
    }

    private static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Inception", 2010, 16),
                new Movie("Tenet", 2020, 16)
        };
    }

    private static Theater[] getTheatres() {
        return new Theater[]{
                new Theater("Anna Karenina", 2017, 16),
                new Theater("fjsdfkj", 2020, 29),
                new Theater("ferfe", 2012, 23)
        };
    }
}
