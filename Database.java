import java.util.Set;
import java.util.TreeSet;

class Database {
    private static final Set<Film> films = new TreeSet<>();
    private static final Set<Actor> actors = new TreeSet<>();

    public static void addFilm(Film film) {
        films.add(film);
    }

    public static void addActor(Actor actor) {
        actors.add(actor);
    }

    public static Set<Film> getFilms() {
        return films;
    }

    public static Set<Actor> getActors() {
        return actors;
    }
}