package Controlador;

/**
 * Controlador.Laberinto
 *
 * La clase Proyecto del paquete Codigo es la encargada de mantener la lista de
 * las corridas al mismo tiempo que asigna a cada corrida todos sus datos
 * especificados por el usuario incluyendo el tiempo de generación, calculado en
 * base a cuánto dura esta implementación de cada algoritmo.
 */
//Librerías
import Modelo.ListaLaberinto;
import java.io.Serializable; //Librería para serializar el objeto y guardarlo en un archivo.
import java.util.ArrayList; //Librería para poder utilizar todos los métodos de un ArrayList.

public class Laberinto implements Serializable {

    //Atributos
    ArrayList<GenerarLaberinto> listaCorridas = new ArrayList<GenerarLaberinto>(); //La lista de corridas que mantiene cada proyecto.
    ListaLaberinto listaCorridas2 = new ListaLaberinto(null);

    //Constructor por defecto
    public Laberinto() {

    }

    /**
     * iniciar
     *
     * Este método es el encargado de dar inicio a la generación del laberinto
     * al mismo tiempo que asigna a cada corrida sus datos correspondientes
     * incluyendo el tiempo de ejecución del algoritmo de generación.
     *
     * @param filas es el número de filas que tendrá el laberinto.
     * @param columnas es el número de columnas que tendrá el laberinto.
     * @param anchoCeldas es el ancho de la celda en píxeles que tendrá el
     * laberinto.
     */
    public void iniciar(int filas, int columnas, int anchoCeldas) {
        //Generar el Laberinto.
        GenerarLaberinto Laberinto = new GenerarLaberinto(filas, columnas, anchoCeldas);
        Laberinto.setFilasLaberinto(filas);
        Laberinto.setColumnasLaberinto(columnas);
        Laberinto.inicializarPanel(); //Inicializo la matriz que será manipulada para generar el laberinto.
        Laberinto.iniciarGeneracion(); //Inicia la generación del laberinto.
        listaCorridas.add(Laberinto); //Añado la corrida actual a la lista de corridas.
        listaCorridas2.insertarFinal(Laberinto);
    }

    //Getters y setters
    public ListaLaberinto getListaCorridas2() {
        return listaCorridas2;
    }

    public void setListaCorridas2(ListaLaberinto listaCorridas2) {
        this.listaCorridas2 = listaCorridas2;
    }

    public ArrayList<GenerarLaberinto> getListaCorridas() {
        return listaCorridas;
    }

    public void setListaCorridas(ArrayList<GenerarLaberinto> listaCorridas) {
        this.listaCorridas = listaCorridas;
    }

}
