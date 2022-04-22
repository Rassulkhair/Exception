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
                new Movie("Апокалипсис в Голливуде", 2010, 16),
                new Movie("Кингсмен", 2020, 18)
        };
    }

    private static Theater[] getTheatres() {
        return new Theater[]{
                new Theater("Анна Каренина", 2017, 16),
                new Theater("Щелкунчик", 2020, 8),
                new Theater("Ромео и Джульета", 2012, 18)
        };
    }
}
