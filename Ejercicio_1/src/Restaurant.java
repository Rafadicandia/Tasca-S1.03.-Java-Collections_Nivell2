import java.util.Objects;

public class Restaurant {
    private String name;
    private  int punctuation;

    public Restaurant (String name, int punctuation){
        this.name=name;
        this.punctuation=punctuation;
    }

    public String getName(){
        return name;
    }

    public int getPunctuation(){
        return punctuation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }


        Restaurant other = (Restaurant) obj;

        return this.punctuation == other.punctuation && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        // La regla del contrato: usar los MISMOS atributos que en equals()
        return Objects.hash(name, punctuation);
    }





}
