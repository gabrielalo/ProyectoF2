
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Reservacion {   
	//Atributos
    int codigo, no_ident, cell, posicionhotel;
    String nombrecliente, apellidocliente, entrada, salida;
 
    public void CargarComboboxReservacion() {
        for (int i = 0; i < Menu.conthabitacion; i++) {
            if (Menu.habitacion[i].getNombreHabitacion() != null) {
                comboboxreservacion.addItem(Menu.habitacion[i].getNombreHabitacion());
            }

        }

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer cod) {
        this.codigo = cod;
    }

    public String getNombredelCliente() {
        return nombrecliente;
    }

    public void setNombredelCliente(String nom) {
        this.nombrecliente = nom;
    }

    public String getApellidodelCleinte() {
        return apellidocliente;
    }

    public void setApellidodelCleinte(String ape) {
        this.apellidocliente = ape;
    }

    public int NoIdentificacion() {
        return no_ident;
    }

    public void setNoIdentificacion(Integer ident) {
        this.no_ident = ident;
    }

    public int getTelefono() {
        return cell;
    }

    public void setTelefono(Integer c) {
        this.cell = c;
    }

    public String getEntradadelCliente() {
        return entrada;
    }

    public void setEntradadelCliente(String ent) {
        this.entrada = ent;
    }

    public String getSalidadelCleinte() {
        return salida;
    }

    public void setSalidadelCleinte(String sal) {
        this.salida = sal;
    }
    
    
    public void setposi(int sal) {
        this.posicionhotel = sal;
    }

    public int getposi() {
        return posicionhotel;
    }
    
    
     JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("hotel.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        framereservacion.add(imagen);
    }
    
    
    JButton botonguardar, botonverhabitacion, botonirservicios;
    JFrame framereservacion;
    JTextField txtcodigor, txtnombrer, txtapellidor, txtidentificacionr, txtcelularr, txtentradar, txtsalidar, txthabitacion, txt19;
    JLabel lb11, lb12, lb13, lb14, lb15, lb16, lb17, lb18, lb19;
    JComboBox comboboxreservacion;
    JTextArea txtcontenido;

    public void init() {
        framereservacion = new JFrame("Reservaciones");//Titulo del JFrame
        framereservacion.setSize(700, 500);//Tamaño del JFrame
        framereservacion.getContentPane().setBackground(Color.ORANGE);
        framereservacion.setVisible(true);//Se hace visible
        framereservacion.setLocationRelativeTo(null);//Para que quede en medio
        //framereservacion.setDefaultCloseOperation(framereservacion.EXIT_ON_CLOSE);//Termina el proceso del JFrame
        framereservacion.setLayout(null);//Para que no se muevan nuestros botones

        lb11 = new JLabel("Asignar ID");
        lb11.setBounds(20, 15, 200, 50);//tamaño del boton
        lb11.setVisible(true);
        lb11.setForeground(Color.WHITE);

        lb12 = new JLabel("Nombre");
        lb12.setBounds(20, 50, 200, 50);
        lb12.setVisible(true);
        lb12.setForeground(Color.WHITE);

        lb13 = new JLabel("Apellido");
        lb13.setBounds(20, 80, 200, 50);
        lb13.setVisible(true);
        lb13.setForeground(Color.WHITE);

        lb14 = new JLabel("No. de identificacion");
        lb14.setBounds(20, 110, 200, 50);
        lb14.setVisible(true);
        lb14.setForeground(Color.WHITE);

        lb15 = new JLabel("Telefono");
        lb15.setBounds(20, 140, 200, 50);
        lb15.setVisible(true);
        lb15.setForeground(Color.WHITE);

        lb16 = new JLabel("Fecha de entrada");
        lb16.setBounds(20, 175, 200, 50);
        lb16.setVisible(true);
        lb16.setForeground(Color.WHITE);

        lb17 = new JLabel("Fecha de salida");
        lb17.setBounds(20, 210, 200, 50);
        lb17.setVisible(true);
        lb17.setForeground(Color.WHITE);

        lb18 = new JLabel("Tipo de habitacion");
        lb18.setBounds(20, 250, 200, 50);
        lb18.setVisible(true);
        lb18.setForeground(Color.WHITE);

        lb19 = new JLabel("Datos de la habitacion");
        lb19.setBounds(450, 15, 250, 50);
        lb19.setVisible(true);
        lb19.setForeground(Color.WHITE);

        txtcodigor = new JTextField();
        txtcodigor.setBounds(new Rectangle(150, 30, 50, 21));
        txtcodigor.setEditable(true);
        txtcodigor.setHorizontalAlignment(JTextField.LEFT);

        txtnombrer = new JTextField();
        txtnombrer.setBounds(new Rectangle(150, 65, 125, 21));
        txtnombrer.setEditable(true);
        txtnombrer.setHorizontalAlignment(JTextField.LEFT);

        txtapellidor = new JTextField();
        txtapellidor.setBounds(new Rectangle(150, 95, 125, 21));
        txtapellidor.setEditable(true);
        txtapellidor.setHorizontalAlignment(JTextField.LEFT);

        txtidentificacionr = new JTextField();
        txtidentificacionr.setBounds(new Rectangle(150, 125, 125, 21));
        txtidentificacionr.setEditable(true);
        txtidentificacionr.setHorizontalAlignment(JTextField.LEFT);

        txtcelularr = new JTextField();
        txtcelularr.setBounds(new Rectangle(150, 160, 125, 21));
        txtcelularr.setEditable(true);
        txtcelularr.setHorizontalAlignment(JTextField.LEFT);

        txtentradar = new JTextField();
        txtentradar.setBounds(new Rectangle(150, 190, 125, 21));
        txtentradar.setEditable(true);
        txtentradar.setHorizontalAlignment(JTextField.LEFT);

        txtsalidar = new JTextField();
        txtsalidar.setBounds(new Rectangle(150, 220, 125, 21));
        txtsalidar.setEditable(true);
        txtsalidar.setHorizontalAlignment(JTextField.LEFT);

        txtcontenido = new JTextArea();
        txtcontenido.setBounds(450, 50, 200, 200);
        txtcontenido.setEditable(false);

        comboboxreservacion = new JComboBox();
        comboboxreservacion.setBounds(150, 260, 100, 25);

        botonguardar = new JButton("Guardar reservacion");
        botonguardar.setBounds(220, 330, 150, 25);
        botonguardar.setVisible(true);
        botonguardar.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {

                if (Menu.contReservacion < 10) {

                    //Aqui lo que estoy haciendo es obteniendo lo que meto en los textfield
                    codigo = Integer.parseInt(txtcodigor.getText());
                    nombrecliente = txtnombrer.getText();
                    apellidocliente = txtapellidor.getText();
                    no_ident = Integer.parseInt(txtidentificacionr.getText());
                    cell = Integer.parseInt(txtcelularr.getText());
                    entrada = txtentradar.getText();
                    salida = txtsalidar.getText();

                    //Dandole memoria para que pueda guardar
                    Reservacion memoria = new Reservacion();

                    memoria.setCodigo(codigo);
                    memoria.setNombredelCliente(nombrecliente);
                    memoria.setApellidodelCleinte(apellidocliente);
                    memoria.setNoIdentificacion(no_ident);
                    memoria.setTelefono(cell);
                    memoria.setEntradadelCliente(entrada);
                    memoria.setSalidadelCleinte(salida);
                    memoria.setposi(EscogerHotel.posicion);
                    
//guardo las reservacion
                    Menu.reservacion[Menu.contReservacion] = memoria;

                    // contador de reservaciones
                    Menu.contReservacion++;

                    //Empeza en blanco los textField
                    txtcodigor.setText("");
                    txtnombrer.setText("");
                    txtapellidor.setText("");
                    txtidentificacionr.setText("");
                    txtcelularr.setText("");
                    txtentradar.setText("");
                    txtsalidar.setText("");
                    

                    //Messaje de salida
                    JOptionPane.showMessageDialog(null, "Reservacion exitosa");

                    //********************************************
                    //Esta ocupada o no
                    //********************************************
                    
                    
                    String nom = comboboxreservacion.getSelectedItem().toString();
                    for (int i = 0; i < Menu.conthabitacion; i++) {
                        if (Menu.habitacion[i].nombreHabitacion.equals(nom)) {
                            JOptionPane.showMessageDialog(null, "Habitacion escojida");
                            Menu.habitacion[i].setReservacion(1);
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Ya no hay cupo para reservacion" + "\n" + "Desea ir a cola");
                }
                
                

            }

        });

        botonverhabitacion = new JButton("Ver habitacion");
        botonverhabitacion.setBounds(270, 260, 130, 25);
        botonverhabitacion.setVisible(true);
        botonverhabitacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mostrar = comboboxreservacion.getSelectedItem().toString();
                String usuario = "";
                for (int i = 0; i < Menu.conthabitacion; i++) {
                    if (Menu.habitacion[i].nombreHabitacion.equals(mostrar)) {
                        usuario = (i + 1) + ")" + "\n" + "Nombre de hab: " + Menu.habitacion[i].getNombreHabitacion()
                                + "\n" + "Tipo de Hab: " + Menu.habitacion[i].getTipodeHab()
                                + "\n" + "Numero de huesped: " + Menu.habitacion[i].getNoHuesped()
                                + "\n" + "Costo de Hab: " + Menu.habitacion[i].getCostoHabitacion()
                                + "\n" + "SERVICIOS"
                                + "\n" + "Television: " + Menu.habitacion[i].getTipodeTelevision()
                                + "\n" + "Internet de: " + Menu.habitacion[i].getTipodeInternet();

                    }

                }

                txtcontenido.setText(usuario);

            }
        });
        
        botonirservicios = new JButton("Ir Servicios");
        botonirservicios.setBounds(50, 380, 130, 25);
        botonirservicios.setVisible(true);
        botonirservicios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Servicios pri = new Servicios();
                pri.init();

            }
        });

        /*
         ************************************************************************
         Agregando los objetos al Frame
         ************************************************************************
         */
        framereservacion.add(lb11);
        framereservacion.add(lb12);
        framereservacion.add(lb13);
        framereservacion.add(lb14);
        framereservacion.add(lb15);
        framereservacion.add(lb16);
        framereservacion.add(lb17);
        framereservacion.add(lb18);
        framereservacion.add(lb19);
        framereservacion.add(txtcodigor);
        framereservacion.add(txtnombrer);
        framereservacion.add(txtapellidor);
        framereservacion.add(txtidentificacionr);
        framereservacion.add(txtcelularr);
        framereservacion.add(txtentradar);
        framereservacion.add(txtsalidar);
        framereservacion.add(botonguardar);
        framereservacion.add(botonverhabitacion);
        framereservacion.add(comboboxreservacion);
        framereservacion.add(txtcontenido);
        framereservacion.add(botonirservicios);
        CargarComboboxReservacion();
        Fondo();

    }

}
