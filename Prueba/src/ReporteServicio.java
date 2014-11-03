
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ReporteServicio {
//Cargar
    public void CargarTablaReservacion() {
        for (int i = 0; i < Menu.contservicioescogido; i++) {
            if (Menu.servicioescogido[i].getEntretenimientoserv() != null && Menu.servicioescogido[i].getNombreclienteserv() != null && Menu.servicioescogido[i].getPlatilloserv() != null && Menu.servicioescogido[i].getPromosserv() != null && Menu.servicioescogido[i].getRestauranteserv() != null) {
                modelo.addRow(new Object[]{i + 1, Menu.servicioescogido[i].getNombreclienteserv(), "Estrella"});
                modelo.addRow(new Object[]{i + 2, Menu.servicioescogido[i].getEntretenimientoserv(), " "});
                modelo.addRow(new Object[]{i + 3, Menu.servicioescogido[i].getPlatilloserv(), " "});
                modelo.addRow(new Object[]{i + 4, Menu.servicioescogido[i].getPromosserv(), " "});
                modelo.addRow(new Object[]{i + 5, Menu.servicioescogido[i].getRestauranteserv(), " "});

            }
        }
    }

    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("reservacion1.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        framereporte2.add(imagen);
    }

    JTable tabla;
    String data[][] = {};//Filas
    String encabezado[] = {"No.", "Servicio", "Costo"};//columnas
    DefaultTableModel modelo;
    JScrollPane panel;
    JFrame framereporte2;

    public void init() {
        framereporte2 = new JFrame("Reporte de servicios");
        framereporte2.setSize(500, 400);
        framereporte2.getContentPane().setBackground(Color.ORANGE);
        framereporte2.setVisible(true);
        framereporte2.setLocationRelativeTo(null);
        framereporte2.setLayout(null);

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
        framereporte2.add(panel);
        CargarTablaReservacion();
        Fondo();

    }

}
