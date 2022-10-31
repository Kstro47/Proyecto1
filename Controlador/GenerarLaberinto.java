package Controlador;

/**
 * Controlador.GenerarLaberinto
 *
 * Esta clase en la encargada de generar el Laberinto utilizando el  
 * algoritmo de Prim. Utlizando una Matriz de Ayacencia
 *
 */
//Librerías
import Modelo.arrayList;
import Modelo.Celda;
import java.io.File; //Librería que permite que cada corrida tenga una imagen del laberinto ya generado.
import java.io.Serializable; //Librería para serializar el objeto y guardarlo en un archivo.
import java.util.Random; //Librería para generar números random.

public class GenerarLaberinto implements Serializable {

    //Atributos
    //Definición de Laberinto.
    private int filasLaberinto;
    private int columnasLaberinto;
    private int anchoCelda; //Datos de la corrida especificados por el usuario.
    private Celda[][] celdas; //La matriz de celdas que representa el laberinto y a partir de la cual se generará el mismo.
    private transient File laberinto2; //La imagen del laberinto.

    /**
     * Constructor con parámetros
     *
     * @param filas es la cantidad de filas del laberinto, especificadas por el
     * usuario.
     * @param columnas es la cantidad de columnas del laberinto, especificadas
     * por el usuario.
     * @param anchoCelda es el ancho, en píxeles, de cada celda de la matriz de
     * celdas.
     */
    public GenerarLaberinto(int filas, int columnas, int anchoCelda) {
        //Inicializamos los Atributos

        this.filasLaberinto = filas;
        this.columnasLaberinto = columnas;
        this.anchoCelda = anchoCelda;
    }
    //Getters y setters

    public int getFilasLaberinto() {
        return filasLaberinto;
    }

    public void setFilasLaberinto(int filasLaberinto) {
        this.filasLaberinto = filasLaberinto;
    }

    public int getColumnasLaberinto() {
        return columnasLaberinto;
    }

    public void setColumnasLaberinto(int columnasLaberinto) {
        this.columnasLaberinto = columnasLaberinto;
    }

    public Celda[][] getCeldas() {
        return celdas;
    }

    public void setCeldas(Celda[][] celdas) {
        this.celdas = celdas;
    }

    public int getAnchoCelda() {
        return anchoCelda;
    }

    public void setAnchoCelda(int anchoCelda) {
        this.anchoCelda = anchoCelda;
    }

    public File getLaberinto2() {
        return laberinto2;
    }

    public void setLaberinto2(File laberinto2) {
        this.laberinto2 = laberinto2;
    }

    /**
     * inicializarPanel/inicializarCeldas
     *
     * Este método se encarga de inicializar la matriz de Celdas que representa
     * el laberinto.
     */
    public void inicializarPanel() {
        this.inicializarCeldas();
    }

    public void inicializarCeldas() {
        celdas = new Celda[this.filasLaberinto][this.columnasLaberinto]; //Inicializo la matriz de celdas
        //Para cada fila y columna de la matriz creo una celda con la coordenada y el ancho en píxeles respectivo
        for (int i = 0; i < this.filasLaberinto; i++) {
            for (int j = 0; j < this.columnasLaberinto; j++) {
                celdas[i][j] = new Celda(j, i, this.anchoCelda);
            }
        }
        this.asignarVecinos(); //Reviso qué vecinos tiene cada celda.
    }

    /**
     * asignarVecinos
     *
     * Este método se encarga de asignar a cada celda de la matriz, las celdas
     * vecinas que le corresponden.
     */
    public void asignarVecinos() {
        //Para cada fila y columna de la matriz
        for (int i = 0; i < this.filasLaberinto; i++) {
            for (int j = 0; j < this.columnasLaberinto; j++) {
                if (i > 0) //Si la fila es mayor que 0 se puede asignars un vecino de arriba
                {
                    this.celdas[i][j].setVecinoArriba(this.celdas[i - 1][j]);
                }
                if (i < this.filasLaberinto - 1) //Si la fila es menor que el total de filas se puede asignar un vecino de abajo
                {
                    this.celdas[i][j].setVecinoAbajo(this.celdas[i + 1][j]);
                }
                if (j < this.columnasLaberinto - 1) //Si la columna es menor que el total de columnas se puede asignar un vecino derecho
                {
                    this.celdas[i][j].setVecinoDerecho(this.celdas[i][j + 1]);
                }
                if (j > 0) //Si la columna es mayor que cero se puede asignar un vecino izquierdo.
                {
                    this.celdas[i][j].setVecinoIzquierdo(this.celdas[i][j - 1]);
                }
            }
        }
    }

    /**
     * iniciarGeneracion
     *
     * Este método se encarga de generar el laberinto basado en el tipo de
     * algoritmo especificado por el usuario.
     */
    public void iniciarGeneracion(int filas, int columnas) {

        //Inicio de algoritmo
        this.algoritmoPrim(filas, columnas);

    }

    //=============================INICIO DEL BLOQUE DE CÓDIGO DEL ALGORITMO DE PRIM=============================
    /**
     * algoritmoPrim
     *
     * Este método se encarga de coordinar el algoritmo de Prim. Este algoritmo
     * consiste en: ANTES DE INICIAR: *- Se selecciona al azar una celda de la
     * matriz de celdas y se marca como visitada. *- Se agregan a una lista
     * los vecinos de esa celda que no han sido visitados. INICIO DEL ALGORITMO:
     * 1- Se selecciona al azar una celda de la lista de vecinos y se marca como
     * visitada. 2- Se agregan los vecinos de dicha celda que no estén visitados
     * a la lista de vecinos. 3- Repetir hasta que la lista de vecinos esté
     * vacía.
     */
    public void algoritmoPrim(int filas, int columnas) {
        arrayList listaVecinos = new arrayList(filas*columnas); //Se genera e inicializa la lista de vecinos.
        Celda celdaActual = this.seleccionarCelda(listaVecinos); //Previo al inicio del algoritmo se selecciona una celda al azar.
        Celda celdaObjetivo; //Generamos otra celda que será la celda a la cual nos vamos a mover dentro del laberinto.
        while (!listaVecinos.isEmpty()) //Mientras la lista de vecinos no esté vacía.
        {
            celdaObjetivo = this.seleccionarCelda(listaVecinos); //Seleccionamos la nueva celda de la lista de vecinos.
            this.crearCamino(celdaActual, celdaObjetivo); //Dibujamos el camino entre la celda objetivo y sus vecinos.
            celdaActual = celdaObjetivo; //La nueva celda actual será la celda objetivo creada anteriormente.
        }
    }

    /**
     * seleccionarCelda
     *
     * Este método se encarga de seleccionar una celda al azar de la lista de
     * vecinos para llamar al método que asigna sus vecinos, marcarla como
     * visitada y luego retornarla para poder dibujar el camino en el JPanel.
     *
     * @param listaVecinos es la lista de vecinos a partir de la cual se
     * seleccionará la nueva celda al azar.
     * @return la celda seleccionada.
     */
    public Celda seleccionarCelda(arrayList listaVecinos) {
        Celda celdaObjetivo; //Generamos la celda que será retornada.
        if (listaVecinos.isEmpty()) //Si la lista de vecinos está vacía (previo al algoritmo).
        {
            //Se selecciona una celda de la matriz de celdas al azar.
            celdaObjetivo = this.celdas[this.randomInt(0, this.filasLaberinto - 1)][this.randomInt(0, this.columnasLaberinto - 1)];
            this.asignarVecinos(listaVecinos, celdaObjetivo); //Se asignan los vecinos de la celda seleccionada.
            celdaObjetivo.setVisitada(true); //Se marca como visitada.
            return celdaObjetivo; //Retornamos la celda seleccionada.
        } else //Si hay al menos 1 celda en la lista de vecinos.
        {
            int randomVecino = this.randomInt(0, listaVecinos.getSize() - 1); //Se escoge un número al azar entre 0 y la longitud de la lista.
            celdaObjetivo = listaVecinos.getNode(randomVecino).getCelda(); //Se selecciona una celda de la lista de vecinos dado el número seleccionado.
            this.asignarVecinos(listaVecinos, celdaObjetivo); //Se asignan los vecinos de la celda seleccionada.
            celdaObjetivo.setVisitada(true); //Se marca como visitada.
            listaVecinos.replace(randomVecino); //La celda seleccionada se remueve de la lista de vecinos (ya que ya está visitada).
            return celdaObjetivo; //Retornamos la celda seleccionada.
        }
    }

    /**
     * asignarVecinos
     *
     * Este método se encarga de agregar a la lista de vecinos los vecinos de la
     * celda seleccionada previamente.
     *
     * @param listaVecinos es la lista de vecinos que se actualizará al ir
     * agregando los vecinos de la celda actual seleccionada.
     * @param celdaActual es la celda a partir de la cual se revisarán sus
     * vecinos y agregarán a la lista.
     */
    public void asignarVecinos(arrayList listaVecinos, Celda celdaActual) {
        //Si la fila de la celda actual es mayor que 0 y el vecino de arriba no está visitado, agregamos el vecino de arriba a la lista (siempre y cuando no esté en la misma).
        if (celdaActual.getPosY2() > 0 && !this.celdas[celdaActual.getPosY2() - 1][celdaActual.getPosX2()].isVisitada()) {
            if (!listaVecinos.contains(this.celdas[celdaActual.getPosY2() - 1][celdaActual.getPosX2()])) {
                listaVecinos.addC(this.celdas[celdaActual.getPosY2() - 1][celdaActual.getPosX2()]);
            }
        }
        //Si la fila de la celda actual es menor que el total de filas y el vecino de abajo no está visitado, agregamos el vecino de abajo a la lista (siempre y cuando no esté en la misma).
        if (celdaActual.getPosY2() < this.filasLaberinto - 1 && !this.celdas[celdaActual.getPosY2() + 1][celdaActual.getPosX2()].isVisitada()) {
            if (!listaVecinos.contains(this.celdas[celdaActual.getPosY2() + 1][celdaActual.getPosX2()])) {
                listaVecinos.addC(this.celdas[celdaActual.getPosY2() + 1][celdaActual.getPosX2()]);
            }
        }
        //Si la columna de la celda actual es menor que el total de columnas y el vecino derecho no está visitado, agregamos el vecino derecho a la lista (siempre y cuando no esté en la misma).
        if (celdaActual.getPosX2() < this.columnasLaberinto - 1 && !this.celdas[celdaActual.getPosY2()][celdaActual.getPosX2() + 1].isVisitada()) {
            if (!listaVecinos.contains(this.celdas[celdaActual.getPosY2()][celdaActual.getPosX2() + 1])) {
                listaVecinos.addC(this.celdas[celdaActual.getPosY2()][celdaActual.getPosX2() + 1]);
            }
        }
        //Si la columna de la celda actual es mayor que 0 y el vecino de izquierdo no está visitado, agregamos el vecino de izquierdo a la lista (siempre y cuando no esté en la misma).
        if (celdaActual.getPosX2() > 0 && !this.celdas[celdaActual.getPosY2()][celdaActual.getPosX2() - 1].isVisitada()) {
            if (!listaVecinos.contains(this.celdas[celdaActual.getPosY2()][celdaActual.getPosX2() - 1])) {
                listaVecinos.addC(this.celdas[celdaActual.getPosY2()][celdaActual.getPosX2() - 1]);
            }
        }
    }

    /**
     * crearCamino
     *
     * Este método se encarga de crear el camino entre la celda que fue
     * seleccionada y sus vecinos visitados, para que luego el JPanel lo dibuje.
     * Puede pasar que la celda seleccionada tenga más de 1 vecino visitado para
     * dibujar sus caminos por lo que se crea un nuevo método que gestiona ese
     * caso y seleccione al azar un vecino visitado para poder dibujar el
     * camino.
     *
     * @param celdaActual es la celda previa seleccionada.
     * @param celdaObjetivo es la celda seleccionada a partir de la cual se
     * dibujará el camino.
     */
    public void crearCamino(Celda celdaActual, Celda celdaObjetivo) {
        //System.out.println("CELDA ACT: (" + celdaActual.getPosY2() + "),(" + celdaActual.getPosX2() + ")");
        //System.out.println("CELDA OBJ: (" + celdaObjetivo.getPosY2() + "),(" + celdaObjetivo.getPosX2() + ")");
        arrayList vecinos = this.variosVecinos(celdaObjetivo); //Vemos si la celda seleccionada tiene varios vecinos visitados.
        if (vecinos.getSize() == 1) //Si tiene 1 solo vecino visitado vemos cuál es y dibujamos el camino.
        {
            if ("arriba".equals(vecinos.get(0))) //Si es el vecino de arriba quitamos las paredes entre el vecino de arriba y la celda seleccionada.
            {
                celdaObjetivo.getLados()[0] = false;
                celdaObjetivo.getVecinoArriba().getLados()[2] = false;
            }
            if ("abajo".equals(vecinos.get(0))) //Si es el vecino de abajo quitamos las paredes entre el vecino de abajo y la celda seleccionada.
            {
                celdaObjetivo.getLados()[2] = false;
                celdaObjetivo.getVecinoAbajo().getLados()[0] = false;
            }
            if ("derecho".equals(vecinos.get(0))) //Si es el vecino derecho quitamos las paredes entre el vecino derecho y la celda seleccionada.
            {
                celdaObjetivo.getLados()[1] = false;
                celdaObjetivo.getVecinoDerecho().getLados()[3] = false;
            }
            if ("izquierdo".equals(vecinos.get(0))) //Si es el vecino izquierdo quitamos las paredes entre el vecino izquierdo y la celda seleccionada.
            {
                celdaObjetivo.getLados()[3] = false;
                celdaObjetivo.getVecinoIzquierdo().getLados()[1] = false;
            }
        } else if (vecinos.getSize() > 1) //Si la celda seleccionada tiene más de 1 vecino visitado seleccionamos uno al azar y, dependiendo de cuál sea, dibujamos su camino.
        {
            int cualVecino = this.randomInt(0, vecinos.getSize() - 1);
            if ("arriba".equals(vecinos.get(cualVecino))) {
                celdaObjetivo.getLados()[0] = false;
                celdaObjetivo.getVecinoArriba().getLados()[2] = false;
            }
            if ("abajo".equals(vecinos.get(cualVecino))) {
                celdaObjetivo.getLados()[2] = false;
                celdaObjetivo.getVecinoAbajo().getLados()[0] = false;
            }
            if ("derecho".equals(vecinos.get(cualVecino))) {
                celdaObjetivo.getLados()[1] = false;
                celdaObjetivo.getVecinoDerecho().getLados()[3] = false;
            }
            if ("izquierdo".equals(vecinos.get(cualVecino))) {
                celdaObjetivo.getLados()[3] = false;
                celdaObjetivo.getVecinoIzquierdo().getLados()[1] = false;
            }
        }
    }

    /**
     * variosVecinos
     *
     * Este método se encarga de ver si la celda seleccionada tiene más de 1
     * vecino visitado a partir del cual se dibuja su camino
     *
     * @param celdaObjetivo es la celda seleccionada.
     * @return la lista con los vecinos visitados que tiene la celda
     * seleccionada.
     */
    public arrayList variosVecinos(Celda celdaObjetivo) {
        arrayList vecinos = new arrayList(4); //Generamos e inicializamos la lista de los vecinos visitados que tiene la celda.
        //Si el vecino de arriba existe y está visitado agrégalo a la lista.
        if (celdaObjetivo.getVecinoArriba() != null && celdaObjetivo.getVecinoArriba().isVisitada()) {
            vecinos.addS("arriba");
        }
        //Si el vecino de abajo existe y está visitado agrégalo a la lista.
        if (celdaObjetivo.getVecinoAbajo() != null && celdaObjetivo.getVecinoAbajo().isVisitada()) {
            vecinos.addS("abajo");
        }
        //Si el vecino derecho existe y está visitado agrégalo a la lista.
        if (celdaObjetivo.getVecinoDerecho() != null && celdaObjetivo.getVecinoDerecho().isVisitada()) {
            vecinos.addS("derecho");
        }
        //Si el vecino izquierdo existe y está visitado agrégalo a la lista.
        if (celdaObjetivo.getVecinoIzquierdo() != null && celdaObjetivo.getVecinoIzquierdo().isVisitada()) {
            vecinos.addS("izquierdo");
        }
        return vecinos; //Retornamos la lista de los vecinos visitados de la celda seleccionada.
    }

    //=============================FINAL DEL BLOQUE DE CÓDIGO DEL ALGORITMO DE PRIM=============================
    /**
     * randomInt
     *
     * Este método se encarga de seleccionar un número entero al azar entre un
     * mínimo y un máximo.
     *
     * @param min es el mínimo número a ser seleccionado.
     * @param max es el máximo número a ser seleccionado.
     * @return el número seleccionado al azar.
     */
    public int randomInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

}
