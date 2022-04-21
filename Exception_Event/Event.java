public abstract class Event {
    private final String name;
    private final int releaseYear;
    private final int age;


    public Event(String name, int releaseYear, int age) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", age=" + age +
                '}';
    }
}
