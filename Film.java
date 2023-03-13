import java.util.Set;
import java.util.TreeSet;

class Film implements Comparable<Film> {
    private String name;
    private Set<Actor> actors;

    public Film(String name) {
        this.name = name;
        this.actors = new TreeSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    @Override
    public int compareTo(Film other) {
        return this.getName().compareTo(other.getName());

    }
}