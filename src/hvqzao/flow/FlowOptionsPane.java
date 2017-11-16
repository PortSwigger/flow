package hvqzao.flow;

import burp.IBurpExtenderCallbacks;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FlowOptionsPane extends javax.swing.JPanel {

    /**
     * Creates new form FlowFilterOptions
     */
    public FlowOptionsPane() {
        initComponents();
    }

    public FlowOptionsPane(IBurpExtenderCallbacks callbacks) {
        initComponents();
        callbacks.customizeUiComponent(Mode2);
        callbacks.customizeUiComponent(Mode1);
        callbacks.customizeUiComponent(autoPopulate);
        callbacks.customizeUiComponent(autoDelete);
        callbacks.customizeUiComponent(autoDeleteKeep);
    }
    
    public JButton getModeHelp() {
        return modeHelp;
    }

    public JRadioButton getMode1() {
        return Mode1;
    }

    public JRadioButton getMode2() {
        return Mode2;
    }

    public JButton getMiscHelp() {
        return miscHelp;
    }

    public JCheckBox getAutoPopulate() {
        return autoPopulate;
    }

    public JCheckBox getAutoDelete() {
        return autoDelete;
    }

    public JTextField getAutoDeleteKeep() {
        return autoDeleteKeep;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        modeHelp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Mode2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Mode1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        miscHelp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        autoDelete = new javax.swing.JCheckBox();
        autoDeleteKeep = new javax.swing.JTextField();
        autoPopulate = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        modeHelp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        modeHelp.setMaximumSize(new java.awt.Dimension(24, 24));
        modeHelp.setMinimumSize(new java.awt.Dimension(24, 24));
        modeHelp.setPreferredSize(new java.awt.Dimension(24, 24));

        jLabel1.setText("<html><b style='color:#ff6633;font-size:10px'>Operation mode</b></html>");

        buttonGroup1.add(Mode2);
        Mode2.setSelected(true);
        Mode2.setText("Include incomplete requests");

        jLabel2.setText("<html><b>Known issue</b>: If Burp \"Platform Authentication\" is in use, or \"Match and Replace\" in request is used, Flow is unable to match responses to related requests. This is caused by Burp API limitations (lack of unique identifiers in HttpRequestResponse). As a workaround I suggest to perform platform authentication / requests altering in upstream proxy.</html>");

        buttonGroup1.add(Mode1);
        Mode1.setText("Display only requests with responses");

        jLabel3.setText("<html>This mode can be useful when troubleshooting application locking during scans</html>");

        miscHelp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        miscHelp.setMaximumSize(new java.awt.Dimension(24, 24));
        miscHelp.setMinimumSize(new java.awt.Dimension(24, 24));
        miscHelp.setPreferredSize(new java.awt.Dimension(24, 24));

        jLabel4.setText("<html><b style='color:#ff6633;font-size:10px'>Miscellaneous</b></html>");
        jLabel4.setToolTipText("");

        autoDelete.setText("Automatically delete oldest requests. Keep:");

        autoDeleteKeep.setText("1000");

        autoPopulate.setSelected(true);
        autoPopulate.setText("Populate with requests from Proxy history");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modeHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mode1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mode2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(miscHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(autoDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(autoDeleteKeep, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(autoPopulate)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modeHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Mode1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mode2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(miscHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(autoPopulate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autoDelete)
                    .addComponent(autoDeleteKeep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Mode1;
    private javax.swing.JRadioButton Mode2;
    private javax.swing.JCheckBox autoDelete;
    private javax.swing.JTextField autoDeleteKeep;
    private javax.swing.JCheckBox autoPopulate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton miscHelp;
    private javax.swing.JButton modeHelp;
    // End of variables declaration//GEN-END:variables
}
