
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EscogerHotel {
public static int posicion = 0;

    //Cargar Nombres

    public void ComboboxEscogerHotel() {
        for (int i = 0; i <Menu.conthotel; i++) {
            if (Menu.hotel[i].getNombreHotel() != null) {
                comboboxescoger.addItem(Menu.hotel[i].getNombreHotel());
            }
        }
    }

     JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("promo.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        frameEscogerHotel.add(imagen);
    }
    

    JFrame frameEscogerHotel;
    JComboBox comboboxescoger;
    JLabel lbltitulo;
    JButton botonir;

    public void init() {
        frameEscogerHotel = new JFrame("Escoger Hotel hotel");
        frameEscogerHotel.setSize(300, 300);
        frameEscogerHotel.getContentPane().setBackground(Color.ORANGE);
        frameEscogerHotel.setVisible(true);
        frameEscogerHotel.setLocationRelativeTo(null);
        frameEscogerHotel.setLayout(null);

        comboboxescoger = new JComboBox();
        comboboxescoger.setBounds(40, 50, 120, 25);

        lbltitulo = new JLabel("Escoger hotel");
        lbltitulo.setFont(new Font("ALGERIAN", Font.BOLD, 14));
        lbltitulo.setForeground(Color.BLACK);
        lbltitulo.setBounds(70, 2, 200, 50);
        lbltitulo.setVisible(true);

        botonir = new JButton("Acceder");
        botonir.setBounds(170, 45, 100, 30);
        botonir.setVisible(true);
        botonir.setFocusable(true);
        botonir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                
                Reservacion pri = new Reservacion();
                pri.init();
                frameEscogerHotel.setVisible(false);
                
                String nom = comboboxescoger.getSelectedItem().toString();
                //posicion
                for (int i = 0; i < Menu.conthotel; i++) {
                    if (Menu.hotel[i].nombreHotel.equals(nom)) {
                        posicion = i;
                        System.out.println(posicion);
                        
                        
                    }
                }

            }
        });

        //Agregar
        frameEscogerHotel.add(comboboxescoger);
        frameEscogerHotel.add(lbltitulo);
        frameEscogerHotel.add(botonir);
        ComboboxEscogerHotel();
        Fondo();

    }

}
