
/*

 * License Info?

 */



/**

 * A stubbed out maintenance GUI for Admin.

 */
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Maintenance extends javax.swing.JFrame {

    /**

     * Creates new form Maintenance

     */
    private final JFileChooser openFileChooser;
    private BufferedImage originalBI;

    public Maintenance() {
    //Opens the file explorer to the example.txt file I
    //allowed the program to open to only .txt files
        initComponents();
        openFileChooser= new JFileChooser();
        openFileChooser.setCurrentDirectory(new File("c:\\temp"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("Example","txt"));

    }



    /**

     * This method is called from within the constructor to initialize the form.

     * WARNING: The content of this method was regenerated by the Form Editor.

     * Modification from code may cause problems.

     */

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">

    private void initComponents() {



        lblMaintenanceTitle = new javax.swing.JLabel();

        btnViewFiles = new javax.swing.JButton();

        lblViewFiles = new javax.swing.JLabel();

        lblAddFiles = new javax.swing.JLabel();

        btnAddFiles = new javax.swing.JButton();

        lblRemoveFiles = new javax.swing.JLabel();

        btnRemoveFiles = new javax.swing.JButton();

        lblUpdateFiles = new javax.swing.JLabel();

        btnUpdateFiles = new javax.swing.JButton();

        jMenuBar1 = new javax.swing.JMenuBar();

        menuFile = new javax.swing.JMenu();

        menuHelp = new javax.swing.JMenu();



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);



        lblMaintenanceTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblMaintenanceTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblMaintenanceTitle.setText("Maintenance");



        btnViewFiles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnViewFiles.setText("View");

        btnViewFiles.setToolTipText("View searchable files");

        btnViewFiles.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                btnViewFilesActionPerformed(evt);

            }

        });



        lblViewFiles.setBackground(new java.awt.Color(204, 204, 204));

        lblViewFiles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblViewFiles.setText("View Indexed Files:");



        lblAddFiles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblAddFiles.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblAddFiles.setText("Add Files:");



        btnAddFiles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnAddFiles.setText("Add");

        btnAddFiles.setToolTipText("Add more files to search");



        lblRemoveFiles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblRemoveFiles.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblRemoveFiles.setText("Remove Files:");



        btnRemoveFiles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnRemoveFiles.setText("Remove");

        btnRemoveFiles.setToolTipText("Remove searchable files");



        lblUpdateFiles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblUpdateFiles.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblUpdateFiles.setText("Update Existing Files:");



        btnUpdateFiles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnUpdateFiles.setText("Update");

        btnUpdateFiles.setToolTipText("Update existing files");



        menuFile.setText("File");

        jMenuBar1.add(menuFile);



        menuHelp.setText("Help");

        jMenuBar1.add(menuHelp);



        setJMenuBar(jMenuBar1);



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(

                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()

                                .addContainerGap(87, Short.MAX_VALUE)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                        .addComponent(lblViewFiles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(lblAddFiles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(lblRemoveFiles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(lblUpdateFiles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(18, 18, 18)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)

                                        .addComponent(btnViewFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                        .addComponent(btnAddFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                        .addComponent(btnRemoveFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                        .addComponent(btnUpdateFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                                .addGap(87, 87, 87))

                        .addGroup(layout.createSequentialGroup()

                                .addGap(139, 139, 139)

                                .addComponent(lblMaintenanceTitle)

                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

        );

        layout.setVerticalGroup(

                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGroup(layout.createSequentialGroup()

                                .addGap(21, 21, 21)

                                .addComponent(lblMaintenanceTitle)

                                .addGap(28, 28, 28)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                        .addComponent(btnViewFiles)

                                        .addComponent(lblViewFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                        .addComponent(btnAddFiles)

                                        .addGroup(layout.createSequentialGroup()

                                                .addGap(4, 4, 4)

                                                .addComponent(lblAddFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                        .addComponent(btnRemoveFiles)

                                        .addComponent(lblRemoveFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                        .addComponent(lblUpdateFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                        .addComponent(btnUpdateFiles))

                                .addGap(111, 111, 111))

        );



        pack();

    }// </editor-fold>

    //private message label tells the user that no file was choosen
    private JLabel messageLabel;
    private JLabel openFileButton;
    private void btnViewFilesActionPerformed(java.awt.event.ActionEvent evt) {
        //button does a tries to open the file chooser and catches
        //the error by telling the user the file wasnt choosen
        // TODO add your handling code here:
        int returnValue= openFileChooser.showOpenDialog(this);
        if(returnValue == JFileChooser.APPROVE_OPTION){
            try{
                originalBI= ImageIO.read(openFileChooser.getSelectedFile());
            }catch(IOException ioe){
                messageLabel.setText("No file choosen");
            }
        }
        else
        {
            messageLabel.setText("No file choosen");
        }

    }



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

            java.util.logging.Logger.getLogger(Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {

            java.util.logging.Logger.getLogger(Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {

            java.util.logging.Logger.getLogger(Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        //</editor-fold>



        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {


                new Maintenance().setVisible(true);
            }

        });

    }



    // Variables declaration - do not modify

    private javax.swing.JButton btnAddFiles;

    private javax.swing.JButton btnRemoveFiles;

    private javax.swing.JButton btnUpdateFiles;

    private javax.swing.JButton btnViewFiles;

    private javax.swing.JMenuBar jMenuBar1;

    private javax.swing.JLabel lblAddFiles;

    private javax.swing.JLabel lblMaintenanceTitle;

    private javax.swing.JLabel lblRemoveFiles;

    private javax.swing.JLabel lblUpdateFiles;

    private javax.swing.JLabel lblViewFiles;

    private javax.swing.JMenu menuFile;

    private javax.swing.JMenu menuHelp;

    // End of variables declaration

}

