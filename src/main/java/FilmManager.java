public class FilmManager {
    private String[] films = new String[0];
    private int limit;
    public FilmManager (){
        limit = 10;
    }
    public FilmManager (int limit){
        this.limit = limit;
    }
    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast(int limit) {
        int resultlrngth;
        if (films.length < limit) {
            resultlrngth = films.length;
        } else {
            resultlrngth = limit;
        }

        String[] tmp = new String[resultlrngth];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];

        }
        return tmp;
    }
}