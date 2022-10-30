package Vista;



/**
* Vista.ContenedorLaberinto
* 
* La clase ContenedorLaberinto es la encargada de contener y mostrar el JPanel en el cual se dibujará el laberinto
*/

//Librerías
import Controlador.Laberinto; //Importar el código de la clase Laberinto del paquete Codigo.
import java.awt.Color; //Librería para colocarle un color de fondo al actual JDialog.

public class ContenedorLaberinto extends javax.swing.JDialog
{
    /**
    * Constructor con parámetros
    * 
    * @param ancho es el ancho del laberinto especificado por el usuario en el JFrame Seleccion.
    * @param alto es el alto del laberinto especificado por usuario en el JFrame Seleccion.
    * @param anchoCelda es el ancho de la celda del laberinto especificado por el usuario en el JFrame Seleccion.
    */
    public ContenedorLaberinto(java.awt.Frame parent, boolean modal, int ancho, int alto, Laberinto laberinto, int anchoCelda) 
    {
        super(parent, modal); //Heredamos el constructor del padre de este JDialog.
        initComponents(); //Inicializamos todos los componentes del actual JDialog.
        this.setLocationRelativeTo(null); //Coloca el JDialog en el centro de la pantalla del usuario.
        
        String name= "DiagramaLaberinto";
        laberinto.iniciar(alto, ancho, anchoCelda); //Iniciamos la generación del laberinto con las especificaciones del usuario.
        ShowLaberinto panelMaze = new ShowLaberinto(laberinto, anchoCelda, name); //Creamos el JPanel ShowLaberinto con las especificaciones del usuario.
        panelMaze.setBackground(Color.cyan); //Coloreamos el fondo del JPanel de color amarillo.
        //Especificamos el tamaño en píxeles del JPanel ShowLaberinto que creamos (ancho y alto especificados por el tamaño de la celda).
        panelMaze.setSize(ancho*anchoCelda, alto*anchoCelda);
        this.setSize(panelMaze.getWidth()+20, panelMaze.getHeight()+50); //Especificamos el tamaño del JDIalog actual.
        this.add(panelMaze); //Agregamos el JPanel ShowLaberinto creado al JDialog actual.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
