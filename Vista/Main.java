package Vista;

/**
   La clase permite iniciar el programa para
 * solicitar los datos al usuario *- Tamaño en filas del laberinto. *- Tamaño en
 * columnas del laberinto. *- El ancho y alto (tamaño en píxeles) de cada celda
 * del laberinto.
 */
//Librerías
import java.awt.Color; //Librería para colocarle un color de fondo al actual JFrame.
import javax.swing.JOptionPane; //Librería para poder mostrar mensajes de error al usuario.
import Controlador.Laberinto;

public class Main extends javax.swing.JFrame {

    private Laberinto laberinto;

    //Constructor por defecto
    public Main() {
        initComponents(); //Inicia los componentes del JFrame
        this.setLocationRelativeTo(null); //Centra el JFrame o pantalla del usuario.
        this.getContentPane().setBackground(Color.DARK_GRAY); //Coloca el fondo de la Pantalla en color Azul.
        this.Etiqueta1.setForeground(Color.WHITE);
        this.Etiqueta2.setForeground(Color.WHITE);
        this.Etiqueta3.setForeground(Color.WHITE);
        this.Etiqueta4.setForeground(Color.WHITE);
        // Las Dimensiones se generan de forma Aleatoria pero el usuario puede realizar ajustes
        // En investigaciones realizadas recomiendan considerar un
        // Minimo de 11 Filas y 11 Columnas
        Filas.setText(String.valueOf((int) (Math.random() * 20 + 10)));
        Columnas.setText(String.valueOf((int) (Math.random() * 20 + 10)));
        AnchoCelda.setText(String.valueOf((int) (30)));
        laberinto = new Laberinto(); //Creamos el laberinto.

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Etiqueta1 = new javax.swing.JLabel();
        Etiqueta3 = new javax.swing.JLabel();
        Etiqueta2 = new javax.swing.JLabel();
        Columnas = new javax.swing.JTextField();
        Filas = new javax.swing.JTextField();
        AnchoCelda = new javax.swing.JTextField();
        Etiqueta4 = new javax.swing.JLabel();
        ButtonCrear = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jSlider3 = new javax.swing.JSlider();

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
                            .addComponent(Filas)
                            .addComponent(Columnas)
                            .addComponent(AnchoCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Etiqueta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Etiqueta3)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Columnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Etiqueta2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AnchoCelda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Etiqueta4))
                    .addComponent(jSlider3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(ButtonCrear)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCrearMouseClicked
        //Si los campos de texto están vacíos muestra un mensaje de error.
        if ("".equals(Filas.getText()) || Filas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error! Por favor, Ingrese Número de Filas");
            Filas.requestFocus();

        } else {
            if ("".equals(Columnas.getText()) || Columnas.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error! Por favor, Por favor, Ingrese Número de Columnas");
                Columnas.requestFocus();
            } else {
                if ("".equals(AnchoCelda.getText()) || AnchoCelda.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Error! Por favor, Por favor, Ingrese el Ancho de las Celdas");
                    AnchoCelda.requestFocus();
                } else //Si todos los campos están llenos 
                {
                    //Manejo de excepción en caso de que el usuario ingrese letras en vez de números.
                    try {
                        //Si los números ingresados por el usuario en los campos de texto son correctos crea el JDialog del laberinto y hazlo visible.
                        if ((Integer.parseInt(Filas.getText()) >= 11) && (Integer.parseInt(Columnas.getText()) >= 11) && (Integer.parseInt(AnchoCelda.getText()) >= 10 && Integer.parseInt(this.AnchoCelda.getText()) % 10 == 0)) {
                            ContenedorLaberinto Laberinto = new ContenedorLaberinto(new javax.swing.JFrame(), true, Integer.parseInt(Columnas.getText()), Integer.parseInt(Filas.getText()), laberinto, Integer.parseInt(this.AnchoCelda.getText()));
                            //  super(parent, modal); //Heredamos el constructor del padre de este JDialog.

                            Laberinto.setVisible(true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnchoCelda;
    private javax.swing.JButton ButtonCrear;
    private javax.swing.JTextField Columnas;
    private javax.swing.JLabel Etiqueta1;
    private javax.swing.JLabel Etiqueta2;
    private javax.swing.JLabel Etiqueta3;
    private javax.swing.JLabel Etiqueta4;
    private javax.swing.JTextField Filas;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    // End of variables declaration//GEN-END:variables
}
