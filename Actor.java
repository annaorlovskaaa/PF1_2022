import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Actor implements Comparable<Actor> {
    private final String name;
    private final Set<Film> films;

    public Actor(String name) {
        this.name = name;
        this.films = new TreeSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    @Override
    public int compareTo(Actor other) {
        return this.getName().compareTo(other.getName());
    }
}

class ActorComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        return a1.getName().compareTo(a2.getName());
    }
}