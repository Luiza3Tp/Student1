import java.util.ArrayList;
import java.util.Objects;

public class Student {

    private String imie;

    private String nazwisko;
    private String numerIndeksu; //pierw zapisałam to w postaci liczbowej ale, nie wiem czy w numerze nie ma abc
    public String rokStudiow; //pierw zapisałam to w postaci liczbowej ale, nie wiem czy to nie jak by 2rok studów magisterskich
    public  ArrayList<Przedmiot> przedmiots = new ArrayList<>();
    public Student(String nazwisko ,String imie, String numerIndeksu, String rokStudiow) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.numerIndeksu = numerIndeksu;
        this.rokStudiow = rokStudiow;
    }

    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public String getNumerIndeksu() {
        return numerIndeksu;
    }
 // moglam zrobić to % ale tak ladnie wygenerowało
    @Override
    public String toString() {
        return "Student" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numerIndeksu=" + numerIndeksu +
                ", rokStudiow=" + rokStudiow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko) && Objects.equals(numerIndeksu, student.numerIndeksu) && Objects.equals(rokStudiow, student.rokStudiow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, numerIndeksu, rokStudiow);
    }
    public void dodaj(Przedmiot przedmiot){
        przedmiots.add(przedmiot);
        System.out.println("przedmiot"+przedmiots);
    }
}
