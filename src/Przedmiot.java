import java.util.Objects;

public class Przedmiot {


    private String nazwaPrzedmiotu;

    public Integer punktyECTS; // JUZ SIE GUBIE INT CZY INTEGER

    public Przedmiot(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public Przedmiot(int punktyECTS) {
        this.punktyECTS = punktyECTS;
    }

    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }

    public void setPunktyECTS(int punktyECTS) {
        this.punktyECTS = punktyECTS;
    }

    @Override
    public String toString() {
        return nazwaPrzedmiotu + "-" + punktyECTS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Przedmiot przedmiot = (Przedmiot) o;
        return Objects.equals(nazwaPrzedmiotu, przedmiot.nazwaPrzedmiotu) && Objects.equals(punktyECTS, przedmiot.punktyECTS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaPrzedmiotu, punktyECTS);
    }

    public Przedmiot() {
    }
}
