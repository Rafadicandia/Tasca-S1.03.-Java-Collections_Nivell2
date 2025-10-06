import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
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
        // 1. Comprobación de la misma referencia: si es el mismo objeto en memoria
        if (this == obj) {
            return true;
        }

        // 2. Comprobación de nulidad y tipo: si el objeto es null o no es de la misma clase
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // 3. Conversión (Casting): convertimos el objeto genérico a nuestro tipo
        Restaurant other = (Restaurant) obj;

        // 4. Lógica de Negocio: la comparación de atributos (tu lógica)
        return this.punctuation == other.punctuation && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        // La regla del contrato: usar los MISMOS atributos que en equals()
        return Objects.hash(name, punctuation);
    }

    @Override
    public int compareTo(Restaurant other) {
        // 1. Comparamos los nombres
        int comparacionNombre = this.name.compareTo(other.name);

        // 2. Si los nombres son diferentes (comparacionNombre != 0), devolvemos ese resultado.
        if (comparacionNombre != 0) {
            return comparacionNombre;
        }

        return other.punctuation - this.punctuation;
    }

    @Override
    public String toString() {
        return "Restaurant [Name: " + name + ", Punctuation: " + punctuation + "]";
    }



}
