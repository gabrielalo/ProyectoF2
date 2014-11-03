import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ReportedeHabitacion {

    //Cargar
    public void CargarTablaReservacion() {
        for (int i = 0; i < Menu.conthabitacion; i++) {
            if (Menu.habitacion[i].getNombreHabitacion() != null) {
                if(Menu.habitacion[i].getReservacion()==1){
                modelo.addRow(new Object[]{i+1,Menu.habitacion[i].getNombreHabitacion(),"Reservada"});    
                }
                else{
                    modelo.addRow(new Object[]{i+1,Menu.habitacion[i].getNombreHabitacion(),"No Reservada"});    
                } 
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

        framereporte1.add(imagen);
    }
    

    JTable tabla;
    String data[][] = {};//Filas
    String encabezado[] = {"No.", "Nom. Habitacion", "Estado"};//columnas
    DefaultTableModel modelo;
    JScrollPane panel;
    JFrame framereporte1;

    public void init() {
        framereporte1 = new JFrame("Reporte de Habitaciones");
        framereporte1.setSize(500, 400);
        framereporte1.getContentPane().setBackground(Color.ORANGE);
        framereporte1.setVisible(true);
        framereporte1.setLocationRelativeTo(null);
        framereporte1.setLayout(null);

        tabla = new JTable();
        modelo = new DefaultTableModel(data, encabezado);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 80));
        tabla.setModel(modelo);
        tabla.setEnabled(false);
        panel = new JScrollPane(tabla);
        panel.setEnabled(false);
        panel.setBounds(40, 70, 400, 200);
        modelo = (DefaultTableModel) this.tabla.getModel();



        /*
         ************************************************************************
         Agregando los objetos al Frame
         ************************************************************************
         */
        framereporte1.add(panel);
        CargarTablaReservacion();
        Fondo();

    }

}
