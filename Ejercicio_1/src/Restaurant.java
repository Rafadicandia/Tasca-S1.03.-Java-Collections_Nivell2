import java.util.Objects;

public class Restaurant {
    private String name;
    private  int punctuation;

    public Restaurant (String name, int punctuation){
        if (name==(null)){
            throw new IllegalArgumentException("The name of the restaurant can't be null");
        }

        if (name.isBlank()){
            throw new IllegalArgumentException("The name of the restaurant can't be empty");
        }
        if (punctuation<0){
            throw new IllegalArgumentException("The punctuation can't be lower than 0");
        }
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
