import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KinoTest {

    @Test
    public void shouldAddKino() {
        Kino films = new Kino();
        films.addFilm("Бладшот");
        films.addFilm("Вперёд");
        films.addFilm("Джентльмены");

        String[] expected = {"Бладшот", "Вперёд", "Джентльмены"};
        String[] actual = films.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWhereLimitIsLessThanQuantity() { //выводит последние фильмы, лимит меньше количества фильмов
        Kino films = new Kino(3);
        films.addFilm("Бладшот");
        films.addFilm("Вперёд");
        films.addFilm("Отель Белград");
        films.addFilm("Джентльмены");
        films.addFilm("Человек-невидимка");
        films.addFilm("Тролли.Мировой тур");
        films.addFilm("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowWhereLimitIsMoreThanQuantity() { //выводит последние фильмы, лимит больше количества фильмов
        Kino films = new Kino();
        films.addFilm("Бладшот");
        films.addFilm("Вперёд");
        films.addFilm("Отель Белград");

        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
