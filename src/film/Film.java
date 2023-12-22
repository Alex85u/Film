import java.util.ArrayList;
import java.util.List;

public class Film {
private String title;
private String actor;
private String country;

// Конструктор класса
public Film(String title, String actor, String country) {
this.title = title;
this.actor = actor;
this.country = country;
}

// Метод для поиска фильма по названию или актеру
public static List<Film> searchFilm(List<Film> films, String searchTerm) {
List<Film> searchResults = new ArrayList<>();
for (Film film: films) {
if (film.title.toLowerCase().contains(searchTerm.toLowerCase()) || film.actor.toLowerCase().contains(searchTerm.toLowerCase())) {
searchResults.add(film);
}
}
return searchResults;
 }
 
// Метод для редактирования страны фильма
public void editCountry(String newCountry) {
 this.country = newCountry;
}

 // Метод для вывода полной информации о фильме
 public void printInfo() {
System.out.println("Название фильма: " + title);
System.out.println("Актер: " + actor);
System.out.println("Страна: " + country);
 }

public static void main(String[] args) {
// Создание списка фильмов
List<Film> films = new ArrayList<>();
films.add(new Film("Фильм 1", "Актер 1", "Страна 1"));
films.add(new Film("Фильм 2", "Актер 2", "Страна 2"));
films.add(new Film("Фильм 3", "Актер 3", "Страна 3"));
 
// Выполнение поиска по фильму или актеру
String searchTerm = "Фильм 1";
 List<Film> searchResults = searchFilm(films, searchTerm);
System.out.println("Результаты поиска:");
for (Film film : searchResults) {
film.printInfo();
}

// Редактирование страны фильма
Film filmToEdit = films.get(0);
filmToEdit.editCountry("Новая страна");
System.out.println("Информация о фильме после редактирования:");
filmToEdit.printInfo();
}
}