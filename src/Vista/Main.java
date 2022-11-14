package Vista;

/**
 * La clase permite iniciar el programa para solicitar los datos al usuario *-
 * Tamaño en filas del laberinto. *- Tamaño en columnas del laberinto. *- El
 * ancho y alto (tamaño en píxeles) de cada celda del laberinto.
 */
//Librerías
import java.awt.Color; //Librería para colocarle un color de fondo al actual JFrame.
import javax.swing.JOptionPane; //Librería para poder mostrar mensajes de error al usuario.
import Controlador.Laberinto;
import Modelo.Celda;
import Modelo.ListasSimples;
import Modelo.Vertice;
import java.util.Random;

public class Main extends javax.swing.JFrame {

    private Laberinto laberinto;
    ListasSimples listaAdy = new ListasSimples(null);

    //Constructor por defecto
    public Main() {
        initComponents(); //Inicia los componentes del JFrame
        this.setLocationRelativeTo(null); //Centra el JFrame o pantalla del usuario.
        this.getContentPane().setBackground(Color.DARK_GRAY); //Coloca el fondo de la Pantalla en color gris.
        this.Etiqueta1.setForeground(Color.WHITE);
        this.Etiqueta2.setForeground(Color.WHITE);
        this.Etiqueta3.setForeground(Color.WHITE);
        this.Etiqueta4.setForeground(Color.WHITE);
        // Las Dimensiones se generan de forma Aleatoria pero el usuario puede realizar ajustes
        // En investigaciones realizadas recomiendan considerar un
        // Minimo de 11 Filas y 11 Columnas
        filas.setText(String.valueOf((int) (Math.random() * 20 + 10)));
        columnas.setText(String.valueOf((int) (Math.random() * 20 + 10)));

        sliderFilas.setValue(Integer.parseInt(filas.getText()));

        sliderColumnas.setValue(Integer.parseInt(columnas.getText()));

        anchoCeldas.setText(String.valueOf((int) (30)));

        laberinto = new Laberinto(); //Creamos el laberinto.

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Etiqueta1 = new javax.swing.JLabel();
        Etiqueta3 = new javax.swing.JLabel();
        Etiqueta2 = new javax.swing.JLabel();
        columnas = new javax.swing.JTextField();
        filas = new javax.swing.JTextField();
        anchoCeldas = new javax.swing.JTextField();
        Etiqueta4 = new javax.swing.JLabel();
        ButtonCrear = new javax.swing.JButton();
        sliderFilas = new javax.swing.JSlider();
        sliderColumnas = new javax.swing.JSlider();
        sliderAnchoCelda = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Etiqueta1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Etiqueta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Etiqueta1.setText("Tamaño del laberinto:");
        Etiqueta1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Etiqueta1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Etiqueta3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Etiqueta3.setText("Filas (Altura)");

        Etiqueta2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Etiqueta2.setText("Columnas (Ancho)");

        columnas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                columnasFocusLost(evt);
            }
        });

        filas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                filasFocusLost(evt);
            }
        });

        Etiqueta4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Etiqueta4.setText("Ancho de celda (Píxeles)");

        ButtonCrear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ButtonCrear.setText("Crear Laberinto");
        ButtonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCrearMouseClicked(evt);
            }
        });
        ButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCrearActionPerformed(evt);
            }
        });

        sliderFilas.setMinimum(11);
        sliderFilas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderFilasStateChanged(evt);
            }
        });

        sliderColumnas.setMinimum(11);
        sliderColumnas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderColumnasStateChanged(evt);
            }
        });

        sliderAnchoCelda.setMinimum(10);
        sliderAnchoCelda.setMinorTickSpacing(9);
        sliderAnchoCelda.setToolTipText("");
        sliderAnchoCelda.setValue(30);
        sliderAnchoCelda.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAnchoCeldaStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Etiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCrear)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Etiqueta3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Etiqueta2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Etiqueta4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filas)
                            .addComponent(columnas)
                            .addComponent(anchoCeldas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderAnchoCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Etiqueta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Etiqueta3)
                    .addComponent(sliderFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sliderColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Etiqueta2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(anchoCeldas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Etiqueta4))
                    .addComponent(sliderAnchoCelda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(ButtonCrear)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCrearMouseClicked
        //Si los campos de texto están vacíos muestra un mensaje de error.
        if ("".equals(filas.getText()) || filas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error! Por favor, Ingrese Número de Filas");
            filas.requestFocus();

        } else {
            if ("".equals(columnas.getText()) || columnas.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error! Por favor, Por favor, Ingrese Número de Columnas");
                columnas.requestFocus();
            } else {
                if ("".equals(anchoCeldas.getText()) || anchoCeldas.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Error! Por favor, Por favor, Ingrese el Ancho de las Celdas");
                    anchoCeldas.requestFocus();
                } else //Si todos los campos están llenos 
                {
                    //Manejo de excepción en caso de que el usuario ingrese letras en vez de números.
                    try {
                        //Si los números ingresados por el usuario en los campos de texto son correctos crea el JDialog del laberinto y hazlo visible.
                        if ((Integer.parseInt(filas.getText()) >= 11) && (Integer.parseInt(columnas.getText()) >= 11) && (Integer.parseInt(anchoCeldas.getText()) >= 10 && Integer.parseInt(this.anchoCeldas.getText()) % 10 == 0)) {
                            
                            // Creamos el GrafoLA
                            inicializarVertices(Integer.parseInt(filas.getText()), Integer.parseInt(columnas.getText()), Integer.parseInt(anchoCeldas.getText()));
                            
                        } //Si los números ingresados por el usuario en los campos de texto no son correctos muestra un mensaje de error.
                        else {
                            JOptionPane.showMessageDialog(null, "Error! Por favor, todos los campos Fila y Columna deben ser mayores o iguales que 11 y el campo del ancho de la celda debe ser múltiplo de 10");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error! Por favor, usa solo números enteros para llenar los campos de texto");
                    }
                }
            }
        }
    }//GEN-LAST:event_ButtonCrearMouseClicked

    private void ButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCrearActionPerformed

    private void sliderFilasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderFilasStateChanged

        filas.setText(String.valueOf(sliderFilas.getValue()));
        //columnas.setText(String.valueOf(sliderFilas.getValue()));
        //sliderColumnas.setValue(Integer.parseInt(columnas.getText()));

    }//GEN-LAST:event_sliderFilasStateChanged

    private void sliderColumnasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderColumnasStateChanged

        columnas.setText(String.valueOf(sliderColumnas.getValue()));


    }//GEN-LAST:event_sliderColumnasStateChanged

    private void sliderAnchoCeldaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAnchoCeldaStateChanged

        int p = sliderAnchoCelda.getValue() / 10;

        anchoCeldas.setText(String.valueOf(p * 10));
        //anchoCelda.setText(String.valueOf(sliderAnchoCelda.getValue()));

    }//GEN-LAST:event_sliderAnchoCeldaStateChanged

    private void filasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filasFocusLost
        sliderFilas.setValue(Integer.parseInt(filas.getText()));

    }//GEN-LAST:event_filasFocusLost

    private void columnasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_columnasFocusLost
        sliderColumnas.setValue(Integer.parseInt(columnas.getText()));

    }//GEN-LAST:event_columnasFocusLost

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public void inicializarVertices(int filasLaberinto, int columnasLaberinto, int anchoCeldas) {

        //Para cada fila y columna del  Laberinto creamos una celda con la coordenada y el ancho en píxeles respectivo
        int vertice = 0;
        int numVertices = filasLaberinto * columnasLaberinto;
        int GrafoLA[] = new int[numVertices];
        for (int i = 0; i < numVertices; i++) {
            vertice = i;
            asignarAristas(vertice, filasLaberinto, columnasLaberinto, anchoCeldas); //Reviso qué vecinos o Arista tiene cada vertice o celda.
        }
        /*
        *Rutina para veifica Aristas o Vecinos
         */
        String detalleListAdy = "-1=NULL -- A R I S T A S  (VECINOS) --" + "\n";
        detalleListAdy = detalleListAdy + "Vertice Arriba Abajo Derecha Izquierda" + "\n";

        String Espacio = " ";
        String Arriba, Abajo, Derecha, Izquierda = "";
        
        int ver, ari1, ari2, ari3, ari4 = 0;
        for (int i = 0; i < listaAdy.getLenght(); i++) {
            ver = Integer.valueOf(String.valueOf(i).length());
            ari1 = Integer.valueOf(String.valueOf(listaAdy.obtenerVertice(i).getAristas()[0]).length());
            ari2 = Integer.valueOf(String.valueOf(listaAdy.obtenerVertice(i).getAristas()[1]).length());
            ari3 = Integer.valueOf(String.valueOf(listaAdy.obtenerVertice(i).getAristas()[2]).length());
            ari4 = Integer.valueOf(String.valueOf(listaAdy.obtenerVertice(i).getAristas()[3]).length());
            detalleListAdy = detalleListAdy + Espacio.repeat(7 - ver) + i + Espacio.repeat(7 - ari1) + listaAdy.obtenerVertice(i).getAristas()[0] + Espacio.repeat(6 - ari2) + listaAdy.obtenerVertice(i).getAristas()[1] + Espacio.repeat(8 - ari3) + listaAdy.obtenerVertice(i).getAristas()[2] + Espacio.repeat(10 - ari4) + listaAdy.obtenerVertice(i).getAristas()[3] + "\n";
            //System.out.println(i + " ListaAdy: " + listaAdy.obtenerVertice(i).getAristas()[0] + " " + listaAdy.obtenerVertice(i).getAristas()[1] + " " + listaAdy.obtenerVertice(i).getAristas()[2] + " " + listaAdy.obtenerVertice(i).getAristas()[3]);
        }
        System.out.println(detalleListAdy);
        /*
        *******************************
        * INICIAR PROCESO DE GENERACION
        * Inicio de algoritmo Prim
        *******************************
         */
        algoritmoPrim(numVertices);
         ContenedorLaberinto Laberinto = new ContenedorLaberinto(new javax.swing.JFrame(), true, Integer.parseInt(columnas.getText()), Integer.parseInt(filas.getText()), laberinto, Integer.parseInt(this.anchoCeldas.getText()));
        //super(parent, modal); //Heredamos el constructor del padre de este JDialog.

        Laberinto.setVisible(true);
    }

    /**
     * asignarVecinos(Aristas)
     *
     * Este método se encarga de asignar a cada Vertice, las celdas vecinas que
     * le corresponden(Aristas).
     * @param vertice vertice
     * @param filasLaberinto filas del Laberinto
     * @param columnasLaberinto columnas del Laberinto
     * @param anchoCeldas ancho de la celdas a mostrar en el Laberinto
     */
    public void asignarAristas(int vertice, int filasLaberinto, int columnasLaberinto, int anchoCeldas) {
        //Para cada fila y columna equivalente de la Lista de Adyacencia
        Vertice aristas = new Vertice();
        int i, j;
        // Determina i=Fila y j=Columna
        i = vertice / filasLaberinto;
        j = vertice % columnasLaberinto;
        aristas.setPosX(i * anchoCeldas);
        aristas.setPosX(j * anchoCeldas);
        aristas.setAnchoCelda(anchoCeldas);

        if (i > 0) //Si la fila es mayor que 0 se puede asignars un vecino de arriba
        {

            aristas.getAristas()[0] = vertice - columnasLaberinto;

        }
        if (i < filasLaberinto - 1) //Si la fila es menor que el total de filas se puede asignar un vecino de abajo
        {

            aristas.getAristas()[1] = vertice + columnasLaberinto;

        }
        if (j < columnasLaberinto - 1) //Si la columna es menor que el total de columnas se puede asignar un vecino derecho
        {

            aristas.getAristas()[2] = vertice + 1;

        }
        if (j > 0) //Si la columna es mayor que cero se puede asignar un vecino izquierdo.
        {

            aristas.getAristas()[3] = vertice - 1;

        }
        listaAdy.insertarFinal(aristas);

    }

    //=============================INICIO DEL BLOQUE DE CÓDIGO DEL ALGORITMO DE PRIM=============================
    /**
     * algoritmoPrim
     *
     * Este método se encarga de coordinar el algoritmo de Prim.Este algoritmo
 consiste en: ANTES DE INICIAR: *- Se selecciona al azar un vetice de la
 lista de celdas del laberintos y se marca como visitada. *- Se agregan a
 una lista los vecinos de esa celda que no han sido visitados. INICIO DEL
 ALGORITMO: 1- Se selecciona al azar una celda de la lista de vecinos y se
 marca como visitada. 2- Se agregan los vecinos de dicha celda que no
 estén visitados a la lista de vecinos. 3- Repetir hasta que la lista de
 vecinos esté vacía.
     * @param numVertices Número de vetices del Grafo 
     */
    public void algoritmoPrim(int numVertices) {
        ListasSimples listaVecinos = new ListasSimples(null);//Se genera e inicializa la lista de vecinos.
        Vertice verticeActual = this.seleccionarVertice(listaVecinos, numVertices); //Previo al inicio del algoritmo se selecciona una celda al azar.
        while (listaVecinos.getLenght() != 0) //Mientras la lista de vecinos no esté vacía.
        {   //Generamos otra celda que será la celda a la cual nos vamos a mover dentro del laberinto.
            Vertice verticeObjetivo = this.seleccionarVertice(listaVecinos, numVertices); //Seleccionamos la nueva celda de la lista de vecinos.
            this.crearCamino(verticeActual, verticeObjetivo); //Dibujamos el camino entre la celda objetivo y sus vecinos.
            verticeActual = verticeObjetivo; //La nueva celda actual será la celda objetivo creada anteriormente.
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
     * @param numVertices Es el número de vertices del Grafo
     
     * @return la celda seleccionada.
     */
    public Vertice seleccionarVertice(ListasSimples listaVecinos, int numVertices) {
        Vertice verticeObjetivo = new Vertice(); //Generamos la celda que será retornada.
        if (listaVecinos.getLenght() == 0) //Si la lista de vecinos está vacía (previo al algoritmo).
        {
            //Se selecciona un vertice de la lista o celda al azar de Lista de Adyacencia.
            verticeObjetivo = listaAdy.obtenerVertice(randomInt(0, numVertices - 1));
            //this.asignarVecinos(listaVecinos, verticeObjetivo); //Se asignan los vecinos de la celda seleccionada.
            verticeObjetivo.setVisitada(true); //Se marca como visitada.
            return verticeObjetivo; //Retornamos la celda seleccionada.
        } else //Si hay al menos 1 celda en la lista de vecinos.
        {
            int randomVecino = randomInt(0, listaVecinos.getLenght() - 1); //Se escoge un número al azar entre 0 y la longitud de la lista.
            verticeObjetivo = listaVecinos.obtenerVertice(randomVecino); //Se selecciona una celda de la lista de vecinos dado el número seleccionado.
            //this.asignarVecinos(listaVecinos, verticeObjetivo); //Se asignan los vecinos de la celda seleccionada.
            verticeObjetivo.setVisitada(true); //Se marca como visitada.
            listaVecinos.eliminarEnIndice(randomVecino); //La celda seleccionada se remueve de la lista de vecinos (ya que ya está visitada).
            return verticeObjetivo; //Retornamos la celda seleccionada.
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
     * @param verticeActual es la celda previa seleccionada.
     * @param verticeObjetivo es la celda seleccionada a partir de la cual se
     * dibujará el camino.
     */
    public void crearCamino(Vertice verticeActual, Vertice verticeObjetivo) {
        System.out.println("VERTICE ACT: (" + verticeActual.getPosY2() + "),(" + verticeActual.getPosX2() + ")");
        System.out.println("Vetice OBJ: (" + verticeObjetivo.getPosY2() + "),(" + verticeObjetivo.getPosX2() + ")");
        ListasSimples vecinos = this.variosVecinos(verticeObjetivo); //Vemos si la celda seleccionada tiene varios vecinos visitados.
        if (vecinos.getLenght() == 1) //Si tiene 1 solo vecino visitado vemos cuál es y dibujamos el camino.
        {
            if ("arriba".equals(vecinos.obtenerVertice(0))) //Si es el vecino de arriba quitamos las paredes entre el vecino de arriba y la celda seleccionada.
            {
                verticeObjetivo.getLados()[0] = false;
                verticeObjetivo.getLados()[2] = false;
            }
            if ("abajo".equals(vecinos.obtenerVertice(0))) //Si es el vecino de abajo quitamos las paredes entre el vecino de abajo y la celda seleccionada.
            {
                verticeObjetivo.getLados()[2] = false;
                verticeObjetivo.getLados()[0] = false;
            }
            if ("derecho".equals(vecinos.obtenerVertice(0))) //Si es el vecino derecho quitamos las paredes entre el vecino derecho y la celda seleccionada.
            {
                verticeObjetivo.getLados()[1] = false;
                verticeObjetivo.getLados()[3] = false;
            }
            if ("izquierdo".equals(vecinos.obtenerVertice(0))) //Si es el vecino izquierdo quitamos las paredes entre el vecino izquierdo y la celda seleccionada.
            {
                verticeObjetivo.getLados()[3] = false;
                verticeObjetivo.getLados()[1] = false;
            }
        } else if (vecinos.getLenght() > 1) //Si la celda seleccionada tiene más de 1 vecino visitado seleccionamos uno al azar y, dependiendo de cuál sea, dibujamos su camino.
        {
            int cualVecino = this.randomInt(0, vecinos.getLenght() - 1);
            if ("arriba".equals(vecinos.obtenerVertice(cualVecino))) {
                verticeObjetivo.getLados()[0] = false;
                verticeObjetivo.getLados()[2] = false;
            }
            if ("abajo".equals(vecinos.obtenerVertice(cualVecino))) {
                verticeObjetivo.getLados()[2] = false;
                verticeObjetivo.getLados()[0] = false;
            }
            if ("derecho".equals(vecinos.obtenerVertice(cualVecino))) {
                verticeObjetivo.getLados()[1] = false;
                verticeObjetivo.getLados()[3] = false;
            }
            if ("izquierdo".equals(vecinos.obtenerVertice(cualVecino))) {
                verticeObjetivo.getLados()[3] = false;
                //      verticeObjetivo.getVecinoIzquierdo().getLados()[1] = false;
            }
        }
    }

    /**
     * variosVecinos
     *
     * Este método se encarga de ver si la celda seleccionada tiene más de 1
     * vecino visitado a partir del cual se dibuja su camino
     *
     * @param verticeObjetivo es la celda seleccionada.
     * @return la lista con los vecinos visitados que tiene la celda
     * seleccionada.
     */
    public ListasSimples variosVecinos(Vertice verticeObjetivo) {
        ListasSimples vecinos = new ListasSimples(null); //Generamos e inicializamos la lista de los vecinos visitados que tiene la celda.
        //Si el vecino de arriba existe y está visitado agrégalo a la lista.
        if (verticeObjetivo.getAristas()[0] != -1 && verticeObjetivo.isVisitada()) {
            ///SS vecinos.add("arriba");
        }
        //Si el vecino de abajo existe y está visitado agrégalo a la lista.
        if (verticeObjetivo.getAristas()[1] != -1 && verticeObjetivo.isVisitada()) {
            ///SS vecinos.add("abajo");
        }
        //Si el vecino derecho existe y está visitado agrégalo a la lista.
        if (verticeObjetivo.getAristas()[2] != -1 && verticeObjetivo.isVisitada()) {
            ///SS   vecinos.add("derecho");
        }
        //Si el vecino izquierdo existe y está visitado agrégalo a la lista.
        if (verticeObjetivo.getAristas()[3] != -1 && verticeObjetivo.isVisitada()) {
            ///SS   vecinos.add("izquierdo");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCrear;
    private javax.swing.JLabel Etiqueta1;
    private javax.swing.JLabel Etiqueta2;
    private javax.swing.JLabel Etiqueta3;
    private javax.swing.JLabel Etiqueta4;
    private javax.swing.JTextField anchoCeldas;
    private javax.swing.JTextField columnas;
    private javax.swing.JTextField filas;
    private javax.swing.JSlider sliderAnchoCelda;
    private javax.swing.JSlider sliderColumnas;
    private javax.swing.JSlider sliderFilas;
    // End of variables declaration//GEN-END:variables
}
