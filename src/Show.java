import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(List<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printDirector() {
        System.out.println(getDirector());
    }

    public void printAllActors() {
        List<Actor> actors = getListOfActors();
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        List<Actor> list = getListOfActors();
        if (list.contains(actor)) {
            System.out.println("Внимание, " + actor + " уже есть в списке!");
        } else {
            list.addLast(actor);
        }
    }

    public void replaceActor(Actor newActor, String surNameOldActor) {
        List<Actor> actors = getListOfActors();
        int i = 0;
        for (Actor actor : actors) {
            if (actor.getSurname().equals(surNameOldActor)) {
                actors.set(i, newActor);
                return;
            }
            i++;
        }
        System.out.println("Актер " + surNameOldActor + " отсутствует в списке!");
    }

}
