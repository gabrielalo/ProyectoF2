
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ControldeHuespedes {

    //Cargar 
    public void CargarTablaReservacion() {
        for (int i = 0; i < Menu.contReservacion; i++) {
            if (Menu.reservacion[i].getEntradadelCliente()!=null && Menu.reservacion[i].getNombredelCliente() != null && Menu.reservacion[i].getApellidodelCleinte() != null) {
                modelo.addRow(new Object[]{(i+1), Menu.reservacion[i].getNombredelCliente(), Menu.reservacion[i].getApellidodelCleinte()});

            }
        }
    }

    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("verreservacion.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        framecontrolhuesped.add(imagen);
    }

    JTable tabla;
    String data[][] = {};//Filas
    String encabezado[] = {"Codigo", "Nombre","Apellido"};//Titulos de columnas
    DefaultTableModel modelo;
    JScrollPane panel;
    JFrame framecontrolhuesped;

    public void init() {
        framecontrolhuesped = new JFrame("huespedes");
        framecontrolhuesped.setSize(500, 400);
        framecontrolhuesped.getContentPane().setBackground(Color.ORANGE);
        framecontrolhuesped.setVisible(true);
        framecontrolhuesped.setLocationRelativeTo(null);
        framecontrolhuesped.setLayout(null);

        tabla = new JTable();
        modelo = new DefaultTableModel(data, encabezado);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 80));
        tabla.setModel(modelo);
        tabla.setEnabled(false);
        panel = new JScrollPane(tabla);
        panel.setEnabled(false);
        panel.setBounds(40, 70, 400, 200);
        modelo = (DefaultTableModel) this.tabla.getModel();

        //Agregando
         
        framecontrolhuesped.add(panel);
        CargarTablaReservacion();
        Fondo();

    }
    
}
