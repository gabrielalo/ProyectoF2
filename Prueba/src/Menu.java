
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu extends JFrame {

    //VECTORES 
    public static CrearHotel[] hotel = new CrearHotel[5];
    public static int conthotel = 0;
    public static Habitaciones[] habitacion = new Habitaciones[100];
    public static int conthabitacion = 0;
    public static Promociones[] promo = new Promociones[100];
    public static int contpromo = 0;
    public static CrearServicios[] servicio = new CrearServicios[100];
    public static int contservicio = 0;
    public static Reservacion[] reservacion = new Reservacion[100];
    public static int contReservacion = 0;
    public static Servicios[] servicioescogido = new Servicios[100];
    public static int contservicioescogido = 0;
    //**************************************************************************
    //                   FIN DE VECTORES PARA EL SISTEMA
    //**************************************************************************

    JFrame framemenu;
    JButton botonmenu1, botonmenu2, botonmenu3, botonmenu4, botonmenu5, botonmenu6, botonmenu7, botonmenu8, botonmenu9,botonmenu10;
    JLabel pantalla, imagen;
    ImageIcon fondo;

    public void Fondo() {

        fondo = new ImageIcon("control1.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        //getLayeredPane().add(imagen, JLayeredPane.FRAME_CONTENT_LAYER);
        imagen.setVisible(true);

        framemenu.add(imagen);
//        
//        ((JPanel) getContentPane()).setOpaque(false);
//        fondo = new ImageIcon(this.getClass().getResource("/Imagenes/hotel.jpg"));
//        pantalla = new JLabel(fondo);
//        pantalla.setIcon(fondo);
//        pantalla.setVisible(true);
//        getLayeredPane().add(pantalla, JLayeredPane.FRAME_CONTENT_LAYER);
//        pantalla.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());

    }

    public void init() {
        framemenu = new JFrame("Bienvenidos a Gestor de Hoteles     :)");
        framemenu.setSize(550, 400);
        framemenu.setVisible(true);
        //framemenu.getContentPane().setBackground(Color.ORANGE);//Color al JFrame
        framemenu.setLocationRelativeTo(null);
        framemenu.setDefaultCloseOperation(framemenu.EXIT_ON_CLOSE);
        framemenu.setLayout(null);

        botonmenu1 = new JButton("Crear Hotel");
        botonmenu1.setBounds(50, 50, 200, 40);
        botonmenu1.setVisible(true);
        botonmenu1.setFocusable(true);
        botonmenu1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CrearHotel pri = new CrearHotel(null);
                pri.init();

            }
        });

        botonmenu2 = new JButton("Crear habitaciones");
        botonmenu2.setBounds(270, 50, 200, 40);
        botonmenu2.setVisible(true);
        botonmenu2.setFocusable(true);
        botonmenu2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Habitaciones pri = new Habitaciones(null);
                pri.init();

            }
        });

        botonmenu3 = new JButton("Crear servicios");
        botonmenu3.setBounds(50, 110, 200, 40);
        botonmenu3.setVisible(true);
        botonmenu3.setFocusable(true);
        botonmenu3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CrearServicios pri = new CrearServicios();
                pri.init();

            }
        });

        botonmenu4 = new JButton("Crear Promociones.");
        botonmenu4.setBounds(270, 110, 200, 40);
        botonmenu4.setVisible(true);
        botonmenu4.setFocusable(true);
        botonmenu4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Promociones pri = new Promociones();
                pri.init();
            }
        });

        botonmenu5 = new JButton("Escoger Hotel");
        botonmenu5.setBounds(50, 160, 200, 40);
        botonmenu5.setVisible(true);
        botonmenu5.setFocusable(true);
        botonmenu5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EscogerHotel pri = new EscogerHotel();
                pri.init();
            }
        });

        botonmenu6 = new JButton("Reporte de Hab");
        botonmenu6.setBounds(270, 160, 200, 40);
        botonmenu6.setVisible(true);
        botonmenu6.setFocusable(true);
        botonmenu6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ReportedeHabitacion pri = new ReportedeHabitacion();
                pri.init();

            }
        });

        botonmenu7 = new JButton("Eliminar Reservacion");
        botonmenu7.setBounds(270, 220, 200, 40);
        botonmenu7.setVisible(true);
        botonmenu7.setFocusable(true);
        botonmenu7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EliminarReservacion pri = new EliminarReservacion();
                pri.init();

            }
        });

        botonmenu8 = new JButton("Control de huespedes");
        botonmenu8.setBounds(50, 220, 200, 40);
        botonmenu8.setVisible(true);
        botonmenu8.setFocusable(true);
        botonmenu8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Control pri = new Control();
                pri.init();

            }
        });

        botonmenu9 = new JButton("Report sevicios");
        botonmenu9.setBounds(50, 280, 200, 40);
        botonmenu9.setVisible(true);
        botonmenu9.setFocusable(true);
        botonmenu9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ReporteServicio pri = new ReporteServicio();
                pri.init();

            }
        });
        
        botonmenu10 = new JButton("Huespdes registrados");
        botonmenu10.setBounds(270, 280, 200, 40);
        botonmenu10.setVisible(true);
        botonmenu10.setFocusable(true);
        botonmenu10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ControldeHuespedes pri = new ControldeHuespedes();
                pri.init();

            }
        });

        /*
         ************************************************************************
         Agregando los objetos la JFrame
         ************************************************************************
         */
        framemenu.add(botonmenu1);
        framemenu.add(botonmenu2);
        framemenu.add(botonmenu3);
        framemenu.add(botonmenu4);
        framemenu.add(botonmenu5);
        framemenu.add(botonmenu6);
        framemenu.add(botonmenu7);
        framemenu.add(botonmenu8);
        framemenu.add(botonmenu9);
        framemenu.add(botonmenu10);
        Fondo();
    }

}
