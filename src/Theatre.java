import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor actor1 = new Actor("Петр", "Петров", Gender.MALE, 175);
        Actor actor2 = new Actor("Иван", "Иванов", Gender.MALE, 190);
        Actor actor3 = new Actor("Анна", "Антонова", Gender.FEMALE, 167);

        Director director1 = new Director("Василий", "Вайнонен", Gender.MALE, 7);
        Director director2 = new Director("Алексей", "Степанюк", Gender.MALE, 21);

        Person musicAuthor = new Person("Петр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Галина", "Калошина", Gender.FEMALE);

        Show show = new Show("Мертвые души", 115, director1, new ArrayList<>());
        show.addActor(actor1);
        show.addActor(actor2);
        System.out.println("Список актеров спектакля:");
        show.printAllActors();
        System.out.println("---------------");

        Opera opera = new Opera("Пиковая дама", 210, director2, new ArrayList<>(), musicAuthor,
                            """
                                      Весна. Летний сад. Площадка. На скамейкaх сидят и расхаживают
                                      нянюшки, гувернантки и кормилицы. Дети играют в горелки,
                                      прыгают через веревку, бросают мячи и прочее
                                      """,
                                     11);
        opera.addActor(actor1);
        opera.addActor(actor3);
        System.out.println("Список актеров оперы:");
        opera.printAllActors();
        System.out.println("---------------");

        Ballet ballet = new Ballet("Щелкунчик", 96, director1, new ArrayList<>(), musicAuthor,
                            """
                                      На Рождество в доме Штальбаумов собираются гости. Крёстный Дроссельмейер
                                      битва мышей во главе с Мышиным королем против армии игрушек, возглавляемой
                                      Щелкунчиком. Маша спасает Щелкунчика, бросив в мышей туфельку.
                                      """,
                                      choreographer);
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        System.out.println("Список актеров балета:");
        ballet.printAllActors();
        System.out.println("---------------");

        System.out.println("Заменяем актера...");
        ballet.replaceActor(actor1, actor2.getSurname());
        System.out.println("Новый состав:");
        ballet.printAllActors();
        System.out.println("---------------");

        System.out.println("Меняем актера в опере:");
        opera.replaceActor(actor3, "Кононов");
        System.out.println("---------------");

        System.out.println("Опера, либретто:");
        opera.printLibrettoText();
        System.out.println("---------------");

        System.out.println("Балет, либретто:");
        ballet.printLibrettoText();
    }
}
