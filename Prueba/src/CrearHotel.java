
import java.awt.*;//importa los componentes de los botones
import java.awt.event.ActionEvent;//Habilita del clickeo de los botones
import java.awt.event.ActionListener;//Habilita el clickeo de los botones
import javax.swing.*;
import javax.swing.ImageIcon;

public class CrearHotel extends JFrame{

    //Atributos
    int ID_hotel, No_habitaciones;
    String nombreHotel, pais;

    
    public CrearHotel(String nombre) {
        this.nombreHotel = nombre;
    }

    //**********************

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nomhotel) {
        this.nombreHotel = nomhotel;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pa) {
        this.pais = pa;
    }

    public int getNoHabitaciones() {
        return No_habitaciones;
    }

    public void setNoHabitaciones(Integer nohabi) {
        this.No_habitaciones = nohabi;
    }

    public int getIDHotel() {
        return ID_hotel;
    }

    public void setIDHotel(Integer id) {
        this.ID_hotel = id;
    }
    //Frames

    JButton botonmenuañadir, botonir, bmostrar;
    JFrame framehotel;
    JComboBox comboboxhotel;
    JTextField txtNombreHotel, txtIDhotel, txtNo_habitaciones, txtPais;
    JTextField txtmostrar;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9;

    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {  
        fondo = new ImageIcon("hotel.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        framehotel.add(imagen);
    }

    public void init() {

        framehotel = new JFrame("Crear hotel");//Titulo del JFrame
        framehotel.setSize(400, 400);//Tamaño del JFrame
        //framehotel.getContentPane().setBackground(Color.ORANGE);
        framehotel.setVisible(true);//Se hace visible
        framehotel.setLocationRelativeTo(null);//Para que quede en medio
        framehotel.setLayout(null);//Para que no se muevan nuestros botones

        lb1 = new JLabel("ID del hotel");
        lb1.setBounds(20, 15, 200, 50);//tamaño del boton
        lb1.setVisible(true);

        lb2 = new JLabel("Nombre del Hotel");
        lb2.setBounds(20, 50, 200, 50);//tamaño del boton
        lb2.setVisible(true);

        lb3 = new JLabel("No. de habitaciones");
        lb3.setBounds(20, 80, 200, 50);//tamaño del boton
        lb3.setVisible(true);

        lb4 = new JLabel("Pais al que pertenece: ");
        lb4.setBounds(20, 110, 200, 50);//tamaño del boton
        lb4.setVisible(true);

        txtIDhotel = new JTextField();
        txtIDhotel.setBounds(new Rectangle(150, 30, 100, 21));
        txtIDhotel.setEditable(true);
        txtIDhotel.setHorizontalAlignment(JTextField.LEFT);

        txtNombreHotel = new JTextField();
        txtNombreHotel.setBounds(new Rectangle(150, 65, 200, 21));
        txtNombreHotel.setEditable(true);
        txtNombreHotel.setHorizontalAlignment(JTextField.LEFT);

        txtNo_habitaciones = new JTextField();
        txtNo_habitaciones.setBounds(new Rectangle(150, 95, 200, 21));
        txtNo_habitaciones.setEditable(true);
        txtNo_habitaciones.setHorizontalAlignment(JTextField.LEFT);

        txtPais = new JTextField();
        txtPais.setBounds(new Rectangle(150, 125, 200, 21));
        txtPais.setEditable(true);
        txtPais.setHorizontalAlignment(JTextField.LEFT);

        botonmenuañadir = new JButton("Guardar");
        botonmenuañadir.setBounds(50, 200, 100, 25);
        botonmenuañadir.setVisible(true);
        botonmenuañadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Menu.conthotel < 5) {

                    ID_hotel = Integer.parseInt(txtNo_habitaciones.getText());
                    nombreHotel = txtNombreHotel.getText();
                    No_habitaciones = Integer.parseInt(txtNo_habitaciones.getText());
                    pais = txtPais.getText();

                    CrearHotel temp = new CrearHotel(null);
                    temp.setIDHotel(ID_hotel);
                    temp.setNombreHotel(nombreHotel);
                    temp.setNoHabitaciones(No_habitaciones);
                    temp.setPais(pais);

                    Menu.hotel[Menu.conthotel] = temp;
                    Menu.conthotel++;

                    txtIDhotel.setText("");
                    txtNombreHotel.setText("");
                    txtNo_habitaciones.setText("");
                    txtPais.setText("");

                    JOptionPane.showMessageDialog(null, "Hotel Guardado");
                } else {
                    JOptionPane.showMessageDialog(null, "Ya no puede crear hoteles");
                }
                //System.out.println(nombreHotel);
                //System.out.println(Menu.hotel[Menu.conthotel-1].No_habitaciones);

            }
        });

        //Agregando 
        framehotel.add(lb1);
        framehotel.add(lb2);
        framehotel.add(lb3);
        framehotel.add(lb4);
        framehotel.add(txtIDhotel);
        framehotel.add(txtNombreHotel);
        framehotel.add(txtPais);
        framehotel.add(txtNo_habitaciones);
        framehotel.add(botonmenuañadir);
        Fondo();

    }

}
