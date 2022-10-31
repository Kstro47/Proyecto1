package Controlador;

//Librerías
import java.io.Serializable; //Librería para serializar el objeto y guardarlo en un archivo.
import java.util.ArrayList; //Librería para poder utilizar todos los métodos de un ArrayList.

public class Laberinto implements Serializable
{
    //Atributos
    ArrayList<GenerarLaberinto> listaCorridas = new ArrayList<GenerarLaberinto>(); //La lista de corridas que mantiene cada proyecto.
    
    //Constructor por defecto
    public Laberinto()
    {
        
    }
    
    /**
     * iniciar
     * 
     * Este método es el encargado de dar inicio a la generación del laberinto al mismo tiempo que asigna a cada corrida sus datos
     * correspondientes incluyendo el tiempo de ejecución del algoritmo de generación.
     * 
     * @param filas es el número de filas que tendrá el laberinto.
     * @param columnas es el número de columnas que tendrá el laberinto.
     * @param anchoCeldas es el ancho de la celda en píxeles que tendrá el laberinto.
     */
    public void iniciar(int filas, int columnas, int anchoCeldas)
    {
        //Generar el Laberinto.
        GenerarLaberinto Laberinto = new GenerarLaberinto(filas, columnas, anchoCeldas);
        Laberinto.setFilasLaberinto(filas);
        Laberinto.setColumnasLaberinto(columnas);
        Laberinto.inicializarPanel(); //Inicializo la matriz que será manipulada para generar el laberinto.
        Laberinto.iniciarGeneracion(filas, columnas); //Inicia la generación del laberinto.
        listaCorridas.add(Laberinto); //Añado la corrida actual a la lista de corridas.
    }

    //Getters y setters
    public ArrayList<GenerarLaberinto> getListaCorridas() {
        return listaCorridas;
    }

    public void setListaCorridas(ArrayList<GenerarLaberinto> listaCorridas) {
        this.listaCorridas = listaCorridas;
    }
}
