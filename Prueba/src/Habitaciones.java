

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class Habitaciones {

    //Atributos
    int No_huesped, Costo_habitacion, reservacion=0;
    String nombreHabitacion, tipo, television, internet;

    public Habitaciones(String hab) {
        this.nombreHabitacion = hab;
    }


    public int getReservacion() {
        return reservacion;
    }

    public void setReservacion(Integer reserv) {
        this.reservacion = reserv;
    }
    
    public String getNombreHabitacion() {
        return nombreHabitacion;
    }

    public void setNombreHabitacion(String nomhab) {
        this.nombreHabitacion = nomhab;
    }

    public String getTipodeTelevision() {
        return television;
    }

    public void setTipodeTelevision(String tv) {
        this.television = tv;
    }

    public String getTipodeInternet() {
        return internet;
    }

    public void setTipodeInternet(String inter) {
        this.internet = inter;
    }

    public String getTipodeHab() {
        return tipo;
    }

    public void setTipodeHab(String pa) {
        this.tipo = pa;
    }

    public int getNoHuesped() {
        return No_huesped;
    }

    public void setNoHuesped(Integer nohues) {
        this.No_huesped = nohues;
    }
    
    public int getCostoHabitacion() {
        return Costo_habitacion;
    }

    public void setCostoHabitacion(Integer cost) {
        this.Costo_habitacion = cost;
    }

    //Frame
    JLabel imagen;
    ImageIcon fondo;
    public void Fondo() {  
        fondo = new ImageIcon("habitacion.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        framehabitaciones.add(imagen);
    }
    JButton botonhabañadir;
    JFrame framehabitaciones;
    JComboBox comboboxtipo, comboboxtv, comboboxinternet;
    JTextField txtnombrehabitacion, txttipo, txtNo_huesped, txttv, txtinternet, txtcostohab;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lbltitulo;

    public void init() {
        framehabitaciones = new JFrame("Habitacion");//Titulo del JFrame
        framehabitaciones.setSize(500, 400);//Tamaño del JFrame
        framehabitaciones.getContentPane().setBackground(Color.ORANGE);
        framehabitaciones.setVisible(true);//Se hace visible
        framehabitaciones.setLocationRelativeTo(null);//Para que quede en medio
        framehabitaciones.setLayout(null);//Para que no se muevan nuestros botones

        lb1 = new JLabel("Habitacion");
        lb1.setBounds(20, 15, 200, 50);
        lb1.setVisible(true);

        lb2 = new JLabel("Tipo de habitacion");
        lb2.setBounds(20, 50, 200, 50);
        lb2.setVisible(true);

        lb3 = new JLabel("No. de huespedes");
        lb3.setBounds(20, 80, 200, 50);
        lb3.setVisible(true);
        
        lb6 = new JLabel("Costo de hab");
        lb6.setBounds(20, 110, 200, 50);
        lb6.setVisible(true);

        lbltitulo = new JLabel("Servicios");
        lbltitulo.setFont(new Font("ALGERIAN", Font.BOLD, 20));
        lbltitulo.setForeground(Color.blue);
        lbltitulo.setBounds(115, 140, 200, 50);
        lbltitulo.setVisible(true);

        lb4 = new JLabel("Television");
        lb4.setBounds(20, 170, 200, 50);
        lb4.setVisible(true);

        lb5 = new JLabel("Internet");
        lb5.setBounds(20, 200, 200, 50);
        lb5.setVisible(true);

        txtnombrehabitacion = new JTextField();
        txtnombrehabitacion.setBounds(new Rectangle(150, 30, 150, 21));
        txtnombrehabitacion.setEditable(true);
        txtnombrehabitacion.setHorizontalAlignment(JTextField.LEFT);

        txttipo = new JTextField();
        txttipo.setBounds(new Rectangle(150, 65, 150, 21));
        txttipo.setEditable(false);
        txttipo.setHorizontalAlignment(JTextField.LEFT);

        txtNo_huesped = new JTextField();
        txtNo_huesped.setBounds(new Rectangle(150, 95, 150, 21));
        txtNo_huesped.setEditable(true);
        txtNo_huesped.setHorizontalAlignment(JTextField.LEFT);
        
        txtcostohab = new JTextField();
        txtcostohab.setBounds(new Rectangle(150, 125, 150, 21));
        txtcostohab.setEditable(true);
        txtcostohab.setHorizontalAlignment(JTextField.LEFT);

        txttv = new JTextField();
        txttv.setBounds(new Rectangle(150, 185, 150, 21));
        txttv.setEditable(false);
        txttv.setHorizontalAlignment(JTextField.LEFT);

        txtinternet = new JTextField();
        txtinternet.setBounds(new Rectangle(150, 215, 150, 21));
        txtinternet.setEditable(false);
        txtinternet.setHorizontalAlignment(JTextField.LEFT);

        comboboxtipo = new JComboBox();
        comboboxtipo.setBounds(320, 65, 100, 20);
        comboboxtipo.addItem("Matrimonial");
        comboboxtipo.addItem("Individual");
        comboboxtipo.addItem("suit");
        comboboxtipo.addItem("2 personas");
        comboboxtipo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent myEvent) {

                txttipo.setText("" + comboboxtipo.getSelectedItem());
                if (myEvent.getSource() instanceof JComboBox) {
                    if ((JComboBox) myEvent.getSource() == comboboxtipo) {
                        txttipo.setText("" + comboboxtipo.getSelectedItem());
                    }
                }
            }

        });

        comboboxtv = new JComboBox();
        comboboxtv.setBounds(320, 185, 100, 20);
        comboboxtv.addItem("Plasma");
        comboboxtv.addItem("LCD");
        comboboxtv.addItem("LED (HD)");
        comboboxtv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent myEvent) {
                txttv.setText("" + comboboxtv.getSelectedItem());
                if (myEvent.getSource() instanceof JComboBox) {
                    if ((JComboBox) myEvent.getSource() == comboboxtv) {
                        txttv.setText("" + comboboxtv.getSelectedItem());
                    }
                }

            }
        });

        comboboxinternet = new JComboBox();
        comboboxinternet.setBounds(320, 215, 100, 20);
        comboboxinternet.addItem("512Kb");
        comboboxinternet.addItem("1Mb");
        comboboxinternet.addItem("2Mb");
        comboboxinternet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent myEvent) {
                txtinternet.setText("" + comboboxinternet.getSelectedItem());
                if (myEvent.getSource() instanceof JComboBox) {
                    if ((JComboBox) myEvent.getSource() == comboboxinternet) {
                        txtinternet.setText("" + comboboxinternet.getSelectedItem());
                    }
                }

            }
        });

        botonhabañadir = new JButton("Guardar");
        botonhabañadir.setBounds(50, 300, 100, 25);
        botonhabañadir.setVisible(true);
        botonhabañadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Menu.conthabitacion < 10) {

                    No_huesped = Integer.parseInt(txtNo_huesped.getText());
                    Costo_habitacion = Integer.parseInt(txtcostohab.getText());
                    nombreHabitacion = txtnombrehabitacion.getText();
                    tipo = txttipo.getText();
                    television = txttv.getText();
                    internet = txtinternet.getText();

                    Habitaciones temp = new Habitaciones(null);
                    temp.setNoHuesped(No_huesped);
                    temp.setNombreHabitacion(nombreHabitacion);
                    temp.setTipodeHab(tipo);
                    temp.setCostoHabitacion(Costo_habitacion);
                    temp.setTipodeTelevision(television);
                    temp.setTipodeInternet(internet);

                    Menu.habitacion[Menu.conthabitacion] = temp;
                    Menu.conthabitacion++;

                    txtnombrehabitacion.setText("");
                    txttipo.setText("");
                    txtNo_huesped.setText("");
                    txttv.setText("");
                    txtinternet.setText("");
                    txtcostohab.setText("");

                    JOptionPane.showMessageDialog(null, "Habitacion Guardada");

                } else {
                    JOptionPane.showMessageDialog(null, "Ya no puede crear Habitaciones");
                }
                System.out.println(nombreHabitacion);
            }
        });

        //Agregando         
        framehabitaciones.add(lb1);
        framehabitaciones.add(lb2);
        framehabitaciones.add(lb3);
        framehabitaciones.add(lb4);
        framehabitaciones.add(lb5);
        framehabitaciones.add(lb6);
        framehabitaciones.add(lbltitulo);
        framehabitaciones.add(txtnombrehabitacion);
        framehabitaciones.add(txtcostohab);
        framehabitaciones.add(txttipo);
        framehabitaciones.add(txtNo_huesped);
        framehabitaciones.add(txttv);
        framehabitaciones.add(txtinternet);
        framehabitaciones.add(comboboxtipo);
        framehabitaciones.add(comboboxtv);
        framehabitaciones.add(comboboxinternet);
        framehabitaciones.add(botonhabañadir);
        Fondo();
    }

}
