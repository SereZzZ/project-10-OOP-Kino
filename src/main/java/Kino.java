public class Kino {
    private String[] movies = new String[0];
    private int max;

    public Kino(int max) {
        this.max = max;
    }

    public Kino() {
        max = 5;
    }


    public void addFilm(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (max < movies.length) {
            resultLength = max;
        } else {
            resultLength = movies.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
