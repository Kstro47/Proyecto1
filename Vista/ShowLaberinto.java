package Vista;

import java.awt.Graphics; //Librería que permite poder dibujar sobre un JPanel.
import Controlador.Laberinto; //Importar el código de la clase Laberinto del paquete Codigo.
import java.awt.AWTException; //Librería para manejar las excepciones relacionadas con las instrucciones que involucran componentes AWT.
import java.awt.Color; //Librería para colocarle un color de fondo al actual JPanel.
import java.awt.Dimension; //Librería para especificar dimensiones a componentes AWT.
import java.awt.Rectangle; //Librería para generar rectángulos en componentes AWT.
import java.awt.Robot; //Librería para poder utilizar la clase Robot y hacer una captura de pantalla.
import java.awt.image.BufferedImage; //Librería para poder convertir el JPanel en una imagen.
import java.io.File; //Librería para poder crear archivos en la carpeta del laberinto.
import java.io.IOException; //Librería para manejar las excepciones relacionadas con la lectura y escritura de archivos.
import java.util.logging.Level; //Librería para manejar la respuesta a excepciones.
import java.util.logging.Logger; //Librería para manejar la respuesta a excepciones.
import javax.imageio.ImageIO; //Librería para manejar la lectura y escritura de imágenes.

public class ShowLaberinto extends javax.swing.JPanel
{
    //Atributos
    private Laberinto laberinto; //El laberinto que fue creado en el JFrame Seleccion y será utilizado para obtener los datos necesarios para dibujar el laberinto.
    //Puntos relacionados con el trazo de las líneas que conforman el laberinto.
    private int ptoXInicial;
    private int ptoYInicial;
    private int ptoXFinal;
    private int ptoYFinal;
    private int anchoCelda; 
    private String name; //El String random que fue creado en el JDialog ContenedorLaberinto y que se usará para colocarle nombre al archivo que se genere para guardar la imagen del laberinto.
    
    //Constructor por defecto
    public ShowLaberinto()
    {
        
    }
    
    /**
     * Constructor con parámetros
     * 
     * @param laberinto es el laberinto que se genera en el JFrame Seleccion y que será utilizado para obtener los datos necesarios para dibujar el laberinto.
     * @param anchoCelda es el ancho de la celda en píxeles especificado por el usuario en el JFrame Seleccion.
     * @param name es el nombre que tendrá el archivo que almacena la imagen del laberinto generado.
     */
    public ShowLaberinto(Laberinto laberinto, int anchoCelda, String name) 
    {
        initComponents(); //Inicia todos los componentes del JPanel.
        //Inicializa todos los atributos.
        this.laberinto = laberinto;
        this.anchoCelda = anchoCelda;
        this.name = name;
    }
    
    /**
    * paintComponent (sobreescrito)
    *
    * Este método es el encargado de dibujar el laberinto.
    * Para cada algoritmo:
    *  - Recorre la matriz de celdas que conforma el laberinto.
    *  - Comprueba cuáles son las paredes que están activadas en la celda.
    *  - Dibuja cada pared activada para cada celda.
    */
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g); //Herencia del método padre.
        g.setColor(Color.BLUE); //Coloreamos todo lo que dibujaremos en el JPanel de color azul.
        g.drawRect(0, 0, laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getFilasLaberinto()*this.anchoCelda, laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getColumnasLaberinto()*this.anchoCelda);

            
            for(int i=0;i<laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getFilasLaberinto()*this.anchoCelda;i++)
            {
                for(int j=0;j<laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getColumnasLaberinto()*this.anchoCelda;j++)
                {
                    //LINEA DE ARRIBA (TOP)
                    if(laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getLados()[0])
                    {
                        int ptoXInicial = laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosX();
                        int ptoYInicial = laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosY();
                        int ptoXFinal = (laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosX())+this.anchoCelda;
                        int ptoYFinal = laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosY();
                        g.drawLine(ptoXInicial, ptoYInicial, ptoXFinal, ptoYFinal);
                    }
                    //LINEA DE LA DERECHA (RIGHT)
                    if(laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getLados()[1])
                    {
                        int ptoXInicial = (laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosX())+this.anchoCelda;
                        int ptoYInicial = laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosY();
                        int ptoXFinal = (laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosX())+this.anchoCelda;
                        int ptoYFinal = (laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosY())+this.anchoCelda;
                        g.drawLine(ptoXInicial, ptoYInicial, ptoXFinal, ptoYFinal);
                    }
                    //LINEA DE ABAJO (BOTTOM)
                    if(laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getLados()[2])
                    {
                        int ptoXInicial = (laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosX())+this.anchoCelda;
                        int ptoYInicial = (laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosY())+this.anchoCelda;
                        int ptoXFinal = laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosX();
                        int ptoYFinal = (laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosY())+this.anchoCelda;
                        g.drawLine(ptoXInicial, ptoYInicial, ptoXFinal, ptoYFinal);
                    }
                    //LINEA DE LA IZQUIERDA (LEFT)
                    if(laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getLados()[3])
                    {
                        int ptoXInicial = laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosX();
                        int ptoYInicial = (laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosY())+this.anchoCelda;
                        int ptoXFinal = laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosX();
                        int ptoYFinal = laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).getCeldas()[i/this.anchoCelda][j/this.anchoCelda].getPosY();
                        g.drawLine(ptoXInicial, ptoYInicial, ptoXFinal, ptoYFinal);
                    }
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ShowLaberinto.class.getName()).log(Level.SEVERE, null, ex);
            }
            try 
            {
                Rectangle rect = new Rectangle(this.getLocationOnScreen(),new Dimension(this.getWidth(),this.getHeight()));
                BufferedImage imagebuf = new Robot().createScreenCapture(rect);
                String directoryName = System.getProperty("user.dir");
                File path = new File(directoryName + "\\src\\Vista");
                File image = new File(path,this.name+".jpeg");
                System.out.println("Dirección: " + path);
                ImageIO.write(imagebuf,"jpeg", image);
                laberinto.getListaCorridas().get(laberinto.getListaCorridas().size()-1).setLaberinto2(image);
            } 
            catch (AWTException e1) 
            {
                e1.printStackTrace();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(ShowLaberinto.class.getName()).log(Level.SEVERE, null, ex);
            }
            
   

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    
}
