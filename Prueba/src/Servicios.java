
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Servicios {

    String nombreclienteserv, restauranteserv, platilloserv, entretenimientoserv, promosserv;

    public String getNombreclienteserv() {
        return nombreclienteserv;
    }

    public void setNombreclienteserv(String nombreclienteserv) {
        this.nombreclienteserv = nombreclienteserv;
    }


    public String getRestauranteserv() {
        return restauranteserv;
    }

    public void setRestauranteserv(String restauranteserv) {
        this.restauranteserv = restauranteserv;
    }


    public String getPlatilloserv() {
        return platilloserv;
    }

    public void setPlatilloserv(String platilloserv) {
        this.platilloserv = platilloserv;
    }


    public String getEntretenimientoserv() {
        return entretenimientoserv;
    }

    public void setEntretenimientoserv(String entretenimientoserv) {
        this.entretenimientoserv = entretenimientoserv;
    }


    public String getPromosserv() {
        return promosserv;
    }

    public void setPromosserv(String promosserv) {
        this.promosserv = promosserv;
    }

    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {
        fondo = new ImageIcon("escoger servicio.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        frameEscogerServicios.add(imagen);
    }

    JFrame frameEscogerServicios;
    JLabel lbln, lbl1, lbl2, lbl3, lbl4;
    JComboBox comboboxnombrerestaurante, comboboxescogerentretenimiento, comboboxescogerpromos, comboboxnombrecliente, comboboxplatos;
    JButton botonescogernombre, botonescogerrestaurante, botonguardar;

    public void init() {

        frameEscogerServicios = new JFrame("Servicios");
        frameEscogerServicios.setSize(550, 500);
        frameEscogerServicios.setVisible(true);
        frameEscogerServicios.getContentPane().setBackground(Color.ORANGE);
        frameEscogerServicios.setLocationRelativeTo(null);
        frameEscogerServicios.setLayout(null);

        lbln = new JLabel("Nombre de cliente");
        lbln.setBounds(50, 15, 200, 50);
        lbln.setVisible(true);
        lbln.setForeground(Color.BLACK);

        lbl1 = new JLabel("Nombre restaurante");
        lbl1.setBounds(50, 110, 200, 50);
        lbl1.setVisible(true);
        lbl1.setForeground(Color.WHITE);

        lbl2 = new JLabel("Platillos");
        lbl2.setBounds(50, 200, 200, 50);
        lbl2.setVisible(true);
        lbl2.setForeground(Color.WHITE);

        lbl3 = new JLabel("Entretenimiento");
        lbl3.setBounds(180, 110, 200, 50);
        lbl3.setVisible(true);
        lbl3.setForeground(Color.WHITE);

        lbl4 = new JLabel("Promos");
        lbl4.setBounds(300, 110, 200, 50);
        lbl4.setVisible(true);
        lbl4.setForeground(Color.WHITE);

        comboboxnombrecliente = new JComboBox();
        comboboxnombrecliente.setBounds(50, 50, 120, 25);

        comboboxnombrerestaurante = new JComboBox();
        comboboxnombrerestaurante.setBounds(50, 150, 100, 25);
        comboboxnombrerestaurante.setEnabled(false);

        comboboxplatos = new JComboBox();
        comboboxplatos.setBounds(50, 250, 100, 25);
        comboboxplatos.setEnabled(false);

        comboboxescogerentretenimiento = new JComboBox();
        comboboxescogerentretenimiento.setBounds(180, 150, 100, 25);
        comboboxescogerentretenimiento.setEnabled(false);

        comboboxescogerpromos = new JComboBox();
        comboboxescogerpromos.setBounds(300, 150, 100, 25);
        comboboxescogerpromos.setEnabled(false);

        botonescogernombre = new JButton("Escoger cliente");
        botonescogernombre.setBounds(180, 50, 150, 25);
        botonescogernombre.setVisible(true);
        botonescogernombre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comboboxnombrerestaurante.setEnabled(true);
                comboboxescogerentretenimiento.setEnabled(true);
                comboboxescogerpromos.setEnabled(true);
                botonescogerrestaurante.setEnabled(true);
                comboboxplatos.setEnabled(true);

            }
        });

        botonescogerrestaurante = new JButton("Mostrar");
        botonescogerrestaurante.setBounds(50, 180, 100, 25);
        botonescogerrestaurante.setVisible(true);
        botonescogerrestaurante.setEnabled(false);
        botonescogerrestaurante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String mostrar = comboboxnombrerestaurante.getSelectedItem().toString();
                String usuario = "";
                for (int i = 0; i < Menu.contservicio; i++) {
                    if (Menu.servicio[i].nombrerestaurante.equals(mostrar)) {
                        usuario = Menu.servicio[i].getNomPlatillo1()
                                + Menu.servicio[i].getNomPlatillo2()
                                + Menu.servicio[i].getNomPlatillo3();
                    }

                }

                comboboxplatos.addItem(usuario);

            }
        });

        botonguardar = new JButton("guardar");
        botonguardar.setBounds(50, 300, 100, 25);
        botonguardar.setVisible(true);
        botonguardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Menu.contservicioescogido < 100) {

                    nombreclienteserv = (String) comboboxnombrecliente.getSelectedItem();
                    restauranteserv = (String) comboboxnombrerestaurante.getSelectedItem();
                    platilloserv = (String) comboboxplatos.getSelectedItem();
                    entretenimientoserv = (String) comboboxescogerentretenimiento.getSelectedItem();
                    promosserv = (String) comboboxescogerentretenimiento.getSelectedItem();
                    
                    Servicios mem = new Servicios();
                    mem.setEntretenimientoserv(entretenimientoserv);
                    mem.setNombreclienteserv(nombreclienteserv);
                    mem.setPlatilloserv(platilloserv);
                    mem.setPromosserv(promosserv);
                    mem.setRestauranteserv(restauranteserv);
                    
                    Menu.servicioescogido[Menu.contservicioescogido]= mem;
                    
                    Menu.contservicioescogido++;
                    
                    System.out.println(nombreclienteserv);
                    
                    JOptionPane.showMessageDialog(null, "Servicios escojidos");
                    
                    
                    
                }

            }
        });


        //Agregando
        frameEscogerServicios.add(comboboxnombrerestaurante);
        frameEscogerServicios.add(comboboxnombrecliente);
        frameEscogerServicios.add(lbln);
        frameEscogerServicios.add(botonescogernombre);
        frameEscogerServicios.add(botonescogerrestaurante);
        frameEscogerServicios.add(comboboxescogerentretenimiento);
        frameEscogerServicios.add(comboboxescogerpromos);
        frameEscogerServicios.add(comboboxplatos);
        frameEscogerServicios.add(lbl1);
        frameEscogerServicios.add(lbl2);
        frameEscogerServicios.add(lbl3);
        frameEscogerServicios.add(lbl4);
        frameEscogerServicios.add(botonguardar);
        CargarNombreRestaurante();
        CargarNombreCliente();
        CargarNombrePlatos();
        CargarEntretenimiento();
        CargarPromos();
        Fondo();
    }

    public void CargarNombreRestaurante() {
        for (int i = 0; i < Menu.contservicio; i++) {
            if (Menu.servicio[i].getNombreRestaurante() != null) {
                comboboxnombrerestaurante.addItem(Menu.servicio[i].getNombreRestaurante());
            }
        }
    }

    public void CargarNombrePlatos() {
        for (int i = 0; i < Menu.contservicio; i++) {
            if (Menu.servicio[i].getNomPlatillo1() != null && Menu.servicio[i].getNomPlatillo2() != null && Menu.servicio[i].getNomPlatillo3() != null) {
                comboboxplatos.addItem(Menu.servicio[i].getNomPlatillo1());
                comboboxplatos.addItem(Menu.servicio[i].getNomPlatillo2());
                comboboxplatos.addItem(Menu.servicio[i].getNomPlatillo3());
            }
        }
    }

    public void CargarNombreCliente() {
        for (int i = 0; i < Menu.contReservacion; i++) {
            if (Menu.reservacion[i].getNombredelCliente() != null) {
                comboboxnombrecliente.addItem(Menu.reservacion[i].getNombredelCliente());
            }
        }
    }

    public void CargarEntretenimiento() {
        for (int i = 0; i < Menu.contservicio; i++) {
            if (Menu.servicio[i].getNomEntretenimiento1() != null && Menu.servicio[i].getNomEntretenimiento2() != null && Menu.servicio[i].getNomEntretenimiento3() != null) {
                comboboxescogerentretenimiento.addItem(Menu.servicio[i].getNomPlatillo1());
                comboboxescogerentretenimiento.addItem(Menu.servicio[i].getNomPlatillo2());
                comboboxescogerentretenimiento.addItem(Menu.servicio[i].getNomPlatillo3());
            }
        }
    }

    public void CargarPromos() {
        for (int i = 0; i < Menu.contpromo; i++) {
            if (Menu.promo[i].getNombrePP() != null) {
                comboboxescogerpromos.addItem(Menu.promo[i].getNombrePP());
            }
        }
    }

}
