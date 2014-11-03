
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Promociones {

    //Atributos
    int No_persona, costo, IDpp;
    String nombrepp, epoca, descripcion;

    
    public String getNombrePP() {
        return nombrepp;
    }

    public void setNombrePP(String nompp) {
        this.nombrepp = nompp;
    }


    public String getTipodeEpoca() {
        return epoca;
    }

    public void setTipodeEpoca(String ep) {
        this.epoca = ep;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String des) {
        this.descripcion = des;
    }


    public int getNoPersonas() {
        return No_persona;
    }

    public void setNoPersonas(Integer noper) {
        this.No_persona = noper;
    }


    public int getIDpp() {
        return IDpp;
    }

    public void setIDpp(Integer idpp) {
        this.IDpp = idpp;
    }


    public int getCosto() {
        return costo;
    }

    public void setCosto(Integer cs) {
        this.costo = cs;
    }
    // FRAME

    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("promo.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        framepromociones.add(imagen);
    }
    
    
    JFrame framepromociones;
    JButton botonañadirpp;
    JComboBox comboboxepoca;
    JTextField txtnombrepp, txtIDpp, txtepoca, txtpersona, txtcostopp, txt8, txt9;
    JTextArea txtdescripcion;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9;

    public void init() {

        framepromociones = new JFrame("Promos y paquetes");
        framepromociones.setSize(600, 400);
        framepromociones.getContentPane().setBackground(Color.ORANGE);
        framepromociones.setVisible(true);
        framepromociones.setLocationRelativeTo(null);
        framepromociones.setLayout(null);

        lb1 = new JLabel("Codigo");
        lb1.setBounds(20, 15, 200, 50);
        lb1.setVisible(true);
        lb1.setForeground(Color.WHITE);

        lb2 = new JLabel("Paquete o Promo");
        lb2.setBounds(20, 50, 200, 50);
        lb2.setVisible(true);
        lb2.setForeground(Color.WHITE);

        lb3 = new JLabel("Epoca");
        lb3.setBounds(20, 80, 200, 50);
        lb3.setVisible(true);
        lb3.setForeground(Color.WHITE);

        lb4 = new JLabel("No. Personas");
        lb4.setBounds(20, 110, 200, 50);
        lb4.setVisible(true);
        lb4.setForeground(Color.WHITE);

        lb5 = new JLabel("Costo");
        lb5.setBounds(20, 140, 200, 50);
        lb5.setVisible(true);
        lb5.setForeground(Color.WHITE);

        lb6 = new JLabel("Descripcion");
        lb6.setBounds(20, 170, 200, 50);
        lb6.setVisible(true);
        lb6.setForeground(Color.WHITE);

        txtIDpp = new JTextField();
        txtIDpp.setBounds(new Rectangle(150, 30, 50, 21));
        txtIDpp.setEditable(true);
        txtIDpp.setHorizontalAlignment(JTextField.LEFT);

        txtnombrepp = new JTextField();
        txtnombrepp.setBounds(new Rectangle(150, 65, 120, 21));
        txtnombrepp.setEditable(true);
        txtnombrepp.setHorizontalAlignment(JTextField.LEFT);

        txtepoca = new JTextField();
        txtepoca.setBounds(new Rectangle(150, 95, 120, 21));
        txtepoca.setEditable(false);
        txtepoca.setHorizontalAlignment(JTextField.LEFT);

        txtpersona = new JTextField();
        txtpersona.setBounds(new Rectangle(150, 125, 120, 21));
        txtpersona.setEditable(true);
        txtpersona.setHorizontalAlignment(JTextField.LEFT);

        txtcostopp = new JTextField();
        txtcostopp.setBounds(new Rectangle(150, 155, 75, 21));
        txtcostopp.setEditable(true);
        txtcostopp.setHorizontalAlignment(JTextField.LEFT);

        txtdescripcion = new JTextArea();
        txtdescripcion.setBounds(new Rectangle(150, 185, 150, 100));
        txtdescripcion.setLineWrap(true);//Salto de linea
        txtdescripcion.setEditable(true);
        txtdescripcion.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue));//Borde al TextArea

        comboboxepoca = new JComboBox();
        comboboxepoca.setBounds(285, 95, 100, 25);
        comboboxepoca.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.RED));//Borde al Combobox
        comboboxepoca.addItem("Primavera");
        comboboxepoca.addItem("Verano");
        comboboxepoca.addItem("Otoño");
        comboboxepoca.addItem("Invierno");
        comboboxepoca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent myEvent) {
                txtepoca.setText("" + comboboxepoca.getSelectedItem());
                if (myEvent.getSource() instanceof JComboBox) {
                    if ((JComboBox) myEvent.getSource() == comboboxepoca) {
                        txtepoca.setText("" + comboboxepoca.getSelectedItem());
                    }
                }

            }
        });

        botonañadirpp = new JButton("Guardar");
        botonañadirpp.setBounds(100, 300, 100, 25);
        botonañadirpp.setVisible(true);
        botonañadirpp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Menu.contpromo < 10) {

                    No_persona = Integer.parseInt(txtpersona.getText());
                    IDpp = Integer.parseInt(txtIDpp.getText());
                    costo = Integer.parseInt(txtcostopp.getText());
                    nombrepp = txtnombrepp.getText();
                    epoca = txtepoca.getText();
                    descripcion = txtdescripcion.getText();

                    Promociones temp = new Promociones();
                    temp.setCosto(costo);
                    temp.setIDpp(IDpp);
                    temp.setNoPersonas(No_persona);
                    temp.setNombrePP(nombrepp);
                    temp.setTipodeEpoca(epoca);
                    temp.setDescripcion(descripcion);

                    Menu.promo[Menu.contpromo] = temp;
                    Menu.contpromo++;

                    txtIDpp.setText("");
                    txtnombrepp.setText("");
                    txtepoca.setText("");
                    txtpersona.setText("");
                    txtcostopp.setText("");

                    JOptionPane.showMessageDialog(null, "Habitacion Guardada");
                } else {
                    JOptionPane.showMessageDialog(null, "Ya no puede crear Habitaciones");
                }
                System.out.println(nombrepp);

            }
        });

        //Agregando
        framepromociones.add(lb1);
        framepromociones.add(lb2);
        framepromociones.add(lb3);
        framepromociones.add(lb4);
        framepromociones.add(lb5);
        framepromociones.add(lb6);
        framepromociones.add(txtIDpp);
        framepromociones.add(txtnombrepp);
        framepromociones.add(txtpersona);
        framepromociones.add(txtepoca);
        framepromociones.add(txtcostopp);
        framepromociones.add(txtdescripcion);
        framepromociones.add(comboboxepoca);
        framepromociones.add(botonañadirpp);
        Fondo();

    }

}
