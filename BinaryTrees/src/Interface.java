
import analizador.AFD;
import analizador.Evaluacion;
import analizador.lexico;
import analizador.sintaxis;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pbara
 */
public class Interface extends javax.swing.JFrame {
    private File archivoSeleccionado;

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        crearCarpetas();
    }
    public void crearCarpetas() {
    // Nombres de las carpetas a crear
    String[] carpetas = {"ARBOLES_202109715", "AFND_202109715", "SIGUIENTES_202109715", 
                         "TRANSICIONES_202109715", "AFD_202109715", "SALIDAS_202109715", 
                         "ERRORES_202109715"};

    // Obtenemos la ruta absoluta de la carpeta donde se está ejecutando la aplicación
    String currentPath = System.getProperty("user.dir");

    // Creamos los objetos File para las carpetas
    for (String carpeta : carpetas) {
        File folder = new File(currentPath, carpeta);

        // Si la carpeta existe, la borramos junto con todo su contenido para volver a crearla
        if (folder.exists()) {
            deleteDirectory(folder);
        }

        // Creamos la carpeta
        folder.mkdirs();
    }
}

public static void deleteDirectory(File directory) {
    if (directory.exists()) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        directory.delete();
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarchivo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtconsola = new javax.swing.JTextArea();
        btnguardar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnarboles = new javax.swing.JButton();
        btnsig = new javax.swing.JButton();
        btnafd = new javax.swing.JButton();
        btntrans = new javax.swing.JButton();
        btnafnd = new javax.swing.JButton();
        btnerrores = new javax.swing.JButton();
        btnabrir = new javax.swing.JButton();
        btnanalizar = new javax.swing.JButton();
        btngenerar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnguardarcomo1 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jFrame3.setAlwaysOnTop(true);
        jFrame3.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(30, 36, 37));
        jPanel2.setLayout(null);

        txtarchivo.setBackground(new java.awt.Color(185, 195, 196));
        txtarchivo.setColumns(20);
        txtarchivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtarchivo.setForeground(new java.awt.Color(0, 0, 0));
        txtarchivo.setRows(5);
        jScrollPane1.setViewportView(txtarchivo);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 910, 370);

        txtconsola.setEditable(false);
        txtconsola.setBackground(new java.awt.Color(185, 195, 196));
        txtconsola.setColumns(20);
        txtconsola.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtconsola.setForeground(new java.awt.Color(0, 0, 0));
        txtconsola.setRows(5);
        jScrollPane2.setViewportView(txtconsola);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 600, 1160, 160);

        btnguardar.setBackground(new java.awt.Color(204, 102, 0));
        btnguardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setBorder(null);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnguardar);
        btnguardar.setBounds(290, 80, 130, 40);

        jPanel5.setBackground(new java.awt.Color(185, 195, 196));
        jPanel5.setLayout(null);

        btnarboles.setBackground(new java.awt.Color(204, 102, 0));
        btnarboles.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnarboles.setText("Árboles");
        btnarboles.setBorder(null);
        btnarboles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnarbolesActionPerformed(evt);
            }
        });
        jPanel5.add(btnarboles);
        btnarboles.setBounds(20, 20, 184, 50);

        btnsig.setBackground(new java.awt.Color(204, 102, 0));
        btnsig.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnsig.setText("Tabla de Siguientes");
        btnsig.setBorder(null);
        btnsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsigActionPerformed(evt);
            }
        });
        jPanel5.add(btnsig);
        btnsig.setBounds(20, 100, 184, 50);

        btnafd.setBackground(new java.awt.Color(204, 102, 0));
        btnafd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnafd.setText("AFD");
        btnafd.setBorder(null);
        btnafd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnafdActionPerformed(evt);
            }
        });
        jPanel5.add(btnafd);
        btnafd.setBounds(20, 260, 184, 50);

        btntrans.setBackground(new java.awt.Color(204, 102, 0));
        btntrans.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btntrans.setText("Tabla de transiciones");
        btntrans.setBorder(null);
        btntrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransActionPerformed(evt);
            }
        });
        jPanel5.add(btntrans);
        btntrans.setBounds(20, 180, 184, 50);

        btnafnd.setBackground(new java.awt.Color(204, 102, 0));
        btnafnd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnafnd.setText("AFND");
        btnafnd.setBorder(null);
        btnafnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnafndActionPerformed(evt);
            }
        });
        jPanel5.add(btnafnd);
        btnafnd.setBounds(20, 340, 184, 50);

        btnerrores.setBackground(new java.awt.Color(204, 102, 0));
        btnerrores.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnerrores.setText("Errores");
        btnerrores.setBorder(null);
        btnerrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnerroresActionPerformed(evt);
            }
        });
        jPanel5.add(btnerrores);
        btnerrores.setBounds(20, 420, 184, 50);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(950, 80, 220, 500);

        btnabrir.setBackground(new java.awt.Color(204, 102, 0));
        btnabrir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnabrir.setText("Abrir");
        btnabrir.setBorder(null);
        btnabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabrirActionPerformed(evt);
            }
        });
        jPanel2.add(btnabrir);
        btnabrir.setBounds(70, 80, 130, 40);

        btnanalizar.setBackground(new java.awt.Color(204, 102, 0));
        btnanalizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnanalizar.setText("Analizar gramática");
        btnanalizar.setBorder(null);
        btnanalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanalizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnanalizar);
        btnanalizar.setBounds(480, 540, 200, 40);

        btngenerar.setBackground(new java.awt.Color(204, 102, 0));
        btngenerar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btngenerar.setText("Generar autómata");
        btngenerar.setBorder(null);
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });
        jPanel2.add(btngenerar);
        btngenerar.setBounds(230, 540, 210, 40);

        btnnuevo.setBackground(new java.awt.Color(204, 102, 0));
        btnnuevo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.setBorder(null);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnnuevo);
        btnnuevo.setBounds(740, 80, 130, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 102, 0));
        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("     E x  R e g a n  U S A C");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(0, 0, 1210, 60);

        btnguardarcomo1.setBackground(new java.awt.Color(204, 102, 0));
        btnguardarcomo1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnguardarcomo1.setText("Guardar \ncomo");
        btnguardarcomo1.setBorder(null);
        btnguardarcomo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarcomo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnguardarcomo1);
        btnguardarcomo1.setBounds(520, 80, 130, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnarbolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarbolesActionPerformed
       JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("ARBOLES_202109715")); // Ruta específica que quieres abrir
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PNG", "png"));

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                ImageIcon imageIcon = new ImageIcon(ImageIO.read(selectedFile));
                JLabel label = new JLabel(imageIcon);
                JScrollPane scrollPane = new JScrollPane(label);
                scrollPane.setPreferredSize(new Dimension(1000, 800));
                JOptionPane.showMessageDialog(null, scrollPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }//GEN-LAST:event_btnarbolesActionPerformed
    lexico scanner;
    sintaxis analizador;
    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        String entrada = txtarchivo.getText();
        String salida ="";
        StringBuilder htmlTable = new StringBuilder();
        try {
            scanner = new lexico(new StringReader(entrada));
            analizador = new sintaxis(scanner);
            analizador.parse();
            salida += "Análisis de archivos finalizado\n";
            

            // generar reporte de errores lexicos
            if (!scanner.erroresLexicos.isEmpty() || !analizador.erroresSintacticos.isEmpty()) {
            htmlTable.append("<html>\n");
            htmlTable.append("<head>\n");
            htmlTable.append("<title>Errores</title>\n");
            htmlTable.append("<style>\n");
            htmlTable.append("table {\n");
            htmlTable.append("  font-family: Arial, sans-serif;\n");
            htmlTable.append("  border-collapse: collapse;\n");
            htmlTable.append("  width: 100%;\n");
            htmlTable.append("}\n");
            htmlTable.append("th {\n");
            htmlTable.append("  font-weight: bold;\n");
            htmlTable.append("  background-color: #c5e1a5;\n");
            htmlTable.append("}\n");
            htmlTable.append("td, th {\n");
            htmlTable.append("  border: 1px solid #ddd;\n");
            htmlTable.append("  text-align: left;\n");
            htmlTable.append("  padding: 8px;\n");
            htmlTable.append("  font-size: 12px;\n");
            htmlTable.append("}\n");
            htmlTable.append("</style>\n");
            htmlTable.append("</head>\n");
            htmlTable.append("<body>\n");
            htmlTable.append("<h1 style=\"font-family: Arial; font-size: 20px;\">Errores</h1>\n");

            if (!scanner.erroresLexicos.isEmpty()) {
                htmlTable.append("<h2 style=\"font-family: Arial; font-size: 16px;\">Errores léxicos</h2>\n");
                htmlTable.append("<table>\n");
                htmlTable.append("<tr><th>Tipo</th><th>Descripción</th><th>Línea</th><th>Columna</th></tr>\n");
                scanner.erroresLexicos.forEach((error) -> {
                    htmlTable.append("<tr>");
                    htmlTable.append("<td>").append(error.getTipo()).append("</td>");
                    htmlTable.append("<td>").append(error.getDescripcion()).append("</td>");
                    htmlTable.append("<td>").append(error.getLinea()).append("</td>");
                    htmlTable.append("<td>").append(error.getColumna()).append("</td>");
                    htmlTable.append("</tr>\n");
                });
                htmlTable.append("</table>\n");
            }

            if (!analizador.erroresSintacticos.isEmpty()) {
                htmlTable.append("<h2 style=\"font-family: Arial; font-size: 16px;\">Errores sintácticos</h2>\n");
                htmlTable.append("<table>\n");
                htmlTable.append("<tr><th>Tipo</th><th>Descripción</th><th>Línea</th><th>Columna</th></tr>\n");
                analizador.erroresSintacticos.forEach((error) -> {
                    htmlTable.append("<tr>");
                    htmlTable.append("<td>").append(error.getTipo()).append("</td>");
                    htmlTable.append("<td>").append(error.getDescripcion()).append("</td>");
                    htmlTable.append("<td>").append(error.getLinea()).append("</td>");
                    htmlTable.append("<td>").append(error.getColumna()).append("</td>");
                    htmlTable.append("</tr>\n");
                });
                htmlTable.append("</table>\n");
            }

            htmlTable.append("</body>\n");
            htmlTable.append("</html>");
            }

            if (htmlTable.length() > 0) {
            String reporteErrores = htmlTable.toString();
            try {
                FileWriter writer = new FileWriter("ERRORES_202109715/reporteErrores.html");
                writer.write(reporteErrores);
                writer.close();
                salida+=("Se encontraron errores");
            } catch (IOException e) {
                salida+=("Ocurrió un error al guardar el archivo HTML: " + e.getMessage());
            }
            } else {
                salida+=("No se encontraron errores léxicos ni sintácticos");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        for (AFD afd : analizador.arboles) {
            try {
                afd.Ejecutar();
            } catch (IOException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
                txtconsola.setText(salida);
            }
        
    }//GEN-LAST:event_btngenerarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    public void errores(){
        
    }
    private void btnabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabrirActionPerformed
    JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo OLC (*.olc)", "olc");
    chooser.setFileFilter(filter);
    int resultado = chooser.showOpenDialog(null);
    if (resultado == JFileChooser.APPROVE_OPTION) {
        archivoSeleccionado = chooser.getSelectedFile();
        try {
            FileReader fr = new FileReader(archivoSeleccionado);
            BufferedReader br = new BufferedReader(fr);
            String contenidoDelArchivo = "";
            String linea;
            while ((linea = br.readLine()) != null) {
                contenidoDelArchivo += linea + "\n";
            }
            br.close();
            txtarchivo.setText(""); // Limpiar la text area
            txtarchivo.append(contenidoDelArchivo);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_btnabrirActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
      String contenido = txtarchivo.getText();
      String nombreArchivo = archivoSeleccionado.getName();
      File archivoAGuardar = new File(archivoSeleccionado.getAbsolutePath());
      try {
        FileWriter fw = new FileWriter(archivoAGuardar, false); // El segundo parámetro indica si se permite la sobrescritura
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(contenido);
        bw.close();
        JOptionPane.showMessageDialog(null, "Archivo guardado exitosamente.");
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
    String contenido = txtarchivo.getText();
      String nombreArchivo = archivoSeleccionado.getName();
      File archivoAGuardar = new File(archivoSeleccionado.getAbsolutePath());
      try {
        FileWriter fw = new FileWriter(archivoAGuardar, false); // El segundo parámetro indica si se permite la sobrescritura
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(contenido);
        bw.close();
        JOptionPane.showMessageDialog(null, "Archivo guardado exitosamente.");
        txtarchivo.setText("");
      } catch (IOException ex) {
        ex.printStackTrace();
      }
            
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarcomo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarcomo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarcomo1ActionPerformed

    private void btnsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsigActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("SIGUIENTES_202109715")); // Ruta específica que quieres abrir
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PNG", "png"));

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                ImageIcon imageIcon = new ImageIcon(ImageIO.read(selectedFile));
                JLabel label = new JLabel(imageIcon);
                JScrollPane scrollPane = new JScrollPane(label);
                scrollPane.setPreferredSize(new Dimension(1000, 800));
                JOptionPane.showMessageDialog(null, scrollPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnsigActionPerformed

    private void btntransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("TRANSICIONES_202109715")); // Ruta específica que quieres abrir
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PNG", "png"));

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                ImageIcon imageIcon = new ImageIcon(ImageIO.read(selectedFile));
                JLabel label = new JLabel(imageIcon);
                JScrollPane scrollPane = new JScrollPane(label);
                scrollPane.setPreferredSize(new Dimension(1000, 800));
                JOptionPane.showMessageDialog(null, scrollPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btntransActionPerformed

    private void btnafdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnafdActionPerformed
       JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("AFD_202109715")); // Ruta específica que quieres abrir
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PNG", "png"));

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                ImageIcon imageIcon = new ImageIcon(ImageIO.read(selectedFile));
                JLabel label = new JLabel(imageIcon);
                JScrollPane scrollPane = new JScrollPane(label);
                scrollPane.setPreferredSize(new Dimension(1000, 800));
                JOptionPane.showMessageDialog(null, scrollPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnafdActionPerformed

    private void btnafndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnafndActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("AFND_202109715")); // Ruta específica que quieres abrir
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos PNG", "png"));

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                ImageIcon imageIcon = new ImageIcon(ImageIO.read(selectedFile));
                JLabel label = new JLabel(imageIcon);
                JScrollPane scrollPane = new JScrollPane(label);
                scrollPane.setPreferredSize(new Dimension(1000, 800));
                JOptionPane.showMessageDialog(null, scrollPane);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnafndActionPerformed
        
    
    public void generador(String dir, String nombre, String texto) throws IOException {
        Path filePath = Paths.get(dir, nombre + ".json");
        File file = filePath.toFile();

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(texto);
        }
    }
   
    public static String eliminarBarraInversa(String cadena) {
    return cadena.replace("\\'", "'");
    }
    private void btnanalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanalizarActionPerformed
        String salida="";
        String resultados = "[\n";
        int count = 0; // Contador de objetos JSON
        for (Evaluacion p : analizador.pruebas) {
            for (AFD afd : analizador.arboles) {
                if (afd.getNombre().equals(p.getAfd())) {
                    boolean res = afd.analisis(analizador.conjuntos, p.getCadena());
                    String cadenaSinBarra = eliminarBarraInversa(p.getCadena());
                    resultados += "{\n"
                            + "\"Valor\": "+cadenaSinBarra+",\n"
                            + "\"Expresion_regular\": \""+p.getAfd()+"\",\n"
                            + "\"Cadena Valida\": \""+res+"\"\n"
                            + "}";
                    // Verificar si es el último objeto JSON en la lista
                    if (++count < analizador.pruebas.size()) {
                        resultados += ","; // Agregar coma solo si no es el último
                    }
                    if(res){
                        salida += "La expresión: "+ p.getCadena()+" es válida con la expresión regular "+ p.getAfd()+"\n";
                    } else{
                        salida += "La expresión: "+ p.getCadena()+" no es válida con la expresión regular "+ p.getAfd()+"\n";
                    }
                    break;
                }
            }
        }
        resultados+="]\n"; // Agregar corchete de cierre
        txtconsola.setText( salida+"Analisis de gramática finalizado");
        try {
            generador("SALIDAS_202109715/", "Reporte", resultados);
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnanalizarActionPerformed

    private void btnerroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnerroresActionPerformed
        try {
            File file = new File("ERRORES_202109715/reporteErrores.html");
            JEditorPane editorPane = new JEditorPane();
            editorPane.setPage(file.toURI().toURL());
            JScrollPane scrollPane = new JScrollPane(editorPane);
            scrollPane.setPreferredSize(new Dimension(1100, 400));
            JFrame frame = new JFrame("Errores");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.add(scrollPane);
            frame.pack();
            frame.setVisible(true);
        } catch (IOException ex) {
            System.err.println("Error abriendo archivo: " + ex.getMessage());
            txtconsola.setText("No hay errores en el árbol");
    }
    }//GEN-LAST:event_btnerroresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnabrir;
    private javax.swing.JButton btnafd;
    private javax.swing.JButton btnafnd;
    private javax.swing.JButton btnanalizar;
    private javax.swing.JButton btnarboles;
    private javax.swing.JButton btnerrores;
    private javax.swing.JButton btngenerar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardarcomo1;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsig;
    private javax.swing.JButton btntrans;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea txtarchivo;
    private javax.swing.JTextArea txtconsola;
    // End of variables declaration//GEN-END:variables



}

