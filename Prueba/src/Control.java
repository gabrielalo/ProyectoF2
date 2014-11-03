
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Control {
    
    public void CargarCombobxNombreHotel(){
        for(int i=0; i<Menu.conthotel;i++){
            if(Menu.hotel[i].getNombreHotel()!=null){
                comboboxcontrol.addItem(Menu.hotel[i].getNombreHotel());
            }
        
        }
        
    
    }
    
    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {  
        fondo = new ImageIcon("control.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        framecontrol.add(imagen);
    }

    JButton botonbuscar, botonseleccionar;
    JFrame framecontrol;
    JTextField txtcodigo;
    JTextArea txtmostrardatos;
    JComboBox comboboxcontrol;
    

    public void init() {

        framecontrol = new JFrame("Control de entrada y salida");
        framecontrol.setSize(500, 500);
        framecontrol.getContentPane().setBackground(Color.ORANGE);
        framecontrol.setVisible(true);
        framecontrol.setLocationRelativeTo(null);
        framecontrol.setLayout(null);

        txtcodigo = new JTextField();
        txtcodigo.setBounds(new Rectangle(30, 90, 30, 30));
        txtcodigo.setEditable(true);
        txtcodigo.setVisible(false);
        txtcodigo.setHorizontalAlignment(JTextField.LEFT);

        txtmostrardatos = new JTextArea();
        txtmostrardatos.setBounds(new Rectangle(30, 140, 250, 200));
        txtmostrardatos.setEditable(false);
        txtmostrardatos.setVisible(false);
       
        comboboxcontrol = new JComboBox();
        comboboxcontrol.setBounds(20, 30, 120, 25);
        comboboxcontrol.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent myEvent) {


            }
        });

        botonbuscar = new JButton("Buscar Cliente");
        botonbuscar.setBounds(70, 90, 150, 30);
        botonbuscar.setVisible(false);
        botonbuscar.setFocusable(false);
        botonbuscar.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e) {
                
               int temporal= 0;
               for (int i = 0; i < Menu.conthotel; i++) {
                   if(comboboxcontrol.getSelectedItem().toString().equals(Menu.hotel[i].nombreHotel)){
                   temporal = i;
                   }
                   
               }
                
                //busqueda
                int codigo = Integer.parseInt(txtcodigo.getText());
                String usuario = "";
                if (Menu.conthotel != 0) {
                    for (int i = 0; i < Menu.contReservacion; i++) {
                        if (Menu.reservacion[i].getCodigo() == codigo) {
                        if (Menu.reservacion[i].getposi() == temporal) {
                          
                            usuario = (i + 1)+"\n" + "Nombre: " + Menu.reservacion[i].getNombredelCliente() + "\n" 
                                    + " Apellido: " + Menu.reservacion[i].getApellidodelCleinte() + "\n"
                                    + "Fecha de entrada: " + Menu.reservacion[i].getEntradadelCliente() + "\n" 
                                    + "Fecha de salida: "
                                    + Menu.reservacion[i].getSalidadelCleinte() + "\n \n";

                        }} else {
                            txtmostrardatos.setText("No se encontro el usuario");
                        }
                    }
                    txtmostrardatos.setText(usuario);
                }

            }

        });
        
        botonseleccionar = new JButton("Seleccionar");
        botonseleccionar.setBounds(150, 25, 150, 30);
        botonseleccionar.setVisible(true);
        botonseleccionar.setFocusable(false);
        botonseleccionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int posicion = 0;
                if(comboboxcontrol.getSelectedItem()!=null){
                txtcodigo.setVisible(true);
                botonbuscar.setVisible(true);
                txtmostrardatos.setVisible(true);
                }
                else{
                JOptionPane.showMessageDialog(null, "Seleccione hotel");
                }
                //Seleccionando el Item del ComboBox
                String nom = comboboxcontrol.getSelectedItem().toString();
                for (int i =0; i<Menu.conthabitacion;i++){
                    if(Menu.hotel[i].nombreHotel.equals(nom)){
                        posicion = i;
                        System.out.println(posicion);
                    }
                }
                
                


            }

        });
        
      //Agregando

        framecontrol.add(txtcodigo);
        framecontrol.add(txtmostrardatos);
        framecontrol.add(botonbuscar);
        framecontrol.add(comboboxcontrol);
        framecontrol.add(botonseleccionar);
        CargarCombobxNombreHotel();
        Fondo();

    }
}