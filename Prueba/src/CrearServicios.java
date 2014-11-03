

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class CrearServicios {

    //**************************************************************************
    //Atributos que tendra la clase de CREAR HOTEL
    int costo1, costo2, costo3, costo4, costo5, costo6, costo7, costo8;
    String nombrerestaurante, platillo1, platillo2, platillo3, especialidad1, especialidad2;
    String entretenimiento1, entretenimiento2, entretenimiento3;

    //**************************************************************************
    //Metodos que reciben y muestran los atrubutos
    public String getNombreRestaurante() {
        return nombrerestaurante;
    }

    public void setNombreRestaurante(String nomre) {
        this.nombrerestaurante = nomre;
    }
/////////

    public String getNomPlatillo1() {
        return platillo1;
    }

    public void setNomPlatillo1(String p1) {
        this.platillo1 = p1;
    }
//////////

    public String getNomPlatillo2() {
        return platillo2;
    }

    public void setNomPlatillo2(String p2) {
        this.platillo2 = p2;
    }
////////////

    public String getNomPlatillo3() {
        return platillo3;
    }

    public void setNomPlatillo3(String p3) {
        this.platillo3 = p3;
    }
////////////

    public String getNomEspecialidad1() {
        return especialidad1;
    }

    public void setNomEspecialidad1(String e1) {
        this.especialidad1 = e1;
    }
////////////

    public String getNomEspecialidad2() {
        return especialidad2;
    }

    public void setNomEspecialidad2(String e2) {
        this.especialidad2 = e2;
    }
////////////

    public String getNomEntretenimiento1() {
        return entretenimiento1;
    }

    public void setNomEntretenimiento1(String ent1) {
        this.entretenimiento1 = ent1;
    }
////////////

    public String getNomEntretenimiento2() {
        return entretenimiento2;
    }

    public void setNomEntretenimiento2(String ent2) {
        this.entretenimiento2 = ent2;
    }
////////////

    public String getNomEntretenimiento3() {
        return entretenimiento3;
    }

    public void setNomEntretenimiento3(String ent3) {
        this.entretenimiento3 = ent3;
    }
////////////

    public int getCosto1() {
        return costo1;
    }

    public void setCosto1(Integer c1) {
        this.costo1 = c1;
    }
/////////////

    public int getCosto2() {
        return costo2;
    }

    public void setCosto2(Integer c2) {
        this.costo2 = c2;
    }
/////////////

    public int getCosto3() {
        return costo3;
    }

    public void setCosto3(Integer c3) {
        this.costo3 = c3;
    }
/////////////

    public int getCosto4() {
        return costo4;
    }

    public void setCosto4(Integer c4) {
        this.costo4 = c4;
    }
/////////////

    public int getCosto5() {
        return costo5;
    }

    public void setCosto5(Integer c5) {
        this.costo5 = c5;
    }
/////////////

    public int getCosto6() {
        return costo6;
    }

    public void setCosto6(Integer c6) {
        this.costo6 = c6;
    }
/////////////

    public int getCosto7() {
        return costo7;
    }

    public void setCosto7(Integer c7) {
        this.costo7 = c7;
    }
/////////////

    public int getCosto8() {
        return costo8;
    }

    public void setCosto8(Integer c8) {
        this.costo8 = c8;
    }
/////////////
    JLabel imagen;
    ImageIcon fondo;

    public void Fondo() {  
        fondo = new ImageIcon("servicios.jpg");
        imagen = new JLabel(fondo);
        imagen.setBounds(0, 0, fondo.getIconWidth(), fondo.getIconHeight());
        imagen.setVisible(true);

        frameservicios.add(imagen);
    }
    /*
     ****************************************************************************
     FRAME
     ****************************************************************************
     */
    
    JButton botonregresarhotel, b2, b3, b4, botonmenuañadir, bmostrar;
    JFrame frameservicios;
    JTextField txtnombrerestaurante, txtplatillo1, txtplatillo2, txtplatillo3, txtespecialidad1, txtespecialidad2;
    JTextField txtent1, txtent2, txtent3;
    JTextField txtcosto1, txtcosto2, txtcosto3, txtcosto4, txtcosto5, txtcosto6, txtcosto7, txtcosto8;
    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lbltitulo1, lbltitulo2, lblcosto1, lblcosto2;

    public void init() {
        frameservicios = new JFrame("Servicios");//Titulo del JFrame
        frameservicios.setSize(800, 500);//Tamaño del JFrame
        frameservicios.getContentPane().setBackground(Color.ORANGE);
        frameservicios.setVisible(true);//Se hace visible
        frameservicios.setLocationRelativeTo(null);//Para que quede en medio
        frameservicios.setLayout(null);//Para que no se muevan nuestros botones

        /*
         ------------------------------------------------------------------------
         Primera columna
         ------------------------------------------------------------------------
         */
        lbltitulo1 = new JLabel("Restaurante");
        lbltitulo1.setFont(new Font("Castellar", Font.BOLD, 16));
        lbltitulo1.setForeground(Color.BLUE);
        lbltitulo1.setBounds(60, 5, 200, 50);
        lbltitulo1.setVisible(true);

        lb1 = new JLabel("Nom. Restaurante");
        lb1.setBounds(20, 35, 200, 50);
        lb1.setVisible(true);

        lb2 = new JLabel("Platillos");
        lb2.setFont(new Font("ALGERIAN", Font.BOLD, 16));
        lb2.setForeground(Color.GREEN);
        lb2.setBounds(90, 65, 200, 50);
        lb2.setVisible(true);

        lblcosto1 = new JLabel("Costo");
        lblcosto1.setFont(new Font("ALGERIAN", Font.BOLD, 14));
        lblcosto1.setForeground(Color.BLACK);
        lblcosto1.setBounds(300, 65, 200, 50);
        lblcosto1.setVisible(true);

        lb3 = new JLabel("Platillo 1");
        lb3.setBounds(20, 95, 200, 50);
        lb3.setVisible(true);

        lb4 = new JLabel("Platillo 2");
        lb4.setBounds(20, 125, 200, 50);
        lb4.setVisible(true);

        lb5 = new JLabel("Platillo 3");
        lb5.setBounds(20, 155, 200, 50);
        lb5.setVisible(true);

        lb6 = new JLabel("Especialidades");
        lb6.setFont(new Font("ALGERIAN", Font.BOLD, 16));
        lb6.setForeground(Color.GREEN);
        lb6.setBounds(90, 185, 200, 50);
        lb6.setVisible(true);

        lb7 = new JLabel("Especialidad 1");
        lb7.setBounds(20, 215, 200, 50);
        lb7.setVisible(true);
        lb7.setForeground(Color.WHITE);

        lb8 = new JLabel("Especialidad 2");
        lb8.setBounds(20, 245, 200, 50);
        lb8.setVisible(true);
        lb8.setForeground(Color.WHITE);

        txtnombrerestaurante = new JTextField();
        txtnombrerestaurante.setBounds(new Rectangle(135, 50, 150, 21));
        txtnombrerestaurante.setEditable(true);
        txtnombrerestaurante.setHorizontalAlignment(JTextField.LEFT);

        txtplatillo1 = new JTextField();
        txtplatillo1.setBounds(new Rectangle(135, 110, 150, 21));
        txtplatillo1.setEditable(true);
        txtplatillo1.setHorizontalAlignment(JTextField.LEFT);

        txtplatillo2 = new JTextField();
        txtplatillo2.setBounds(new Rectangle(135, 140, 150, 21));
        txtplatillo2.setEditable(true);
        txtplatillo2.setHorizontalAlignment(JTextField.LEFT);

        txtplatillo3 = new JTextField();
        txtplatillo3.setBounds(new Rectangle(135, 170, 150, 21));
        txtplatillo3.setEditable(true);
        txtplatillo3.setHorizontalAlignment(JTextField.LEFT);

        txtespecialidad1 = new JTextField();
        txtespecialidad1.setBounds(new Rectangle(135, 230, 150, 21));
        txtespecialidad1.setEditable(true);
        txtespecialidad1.setHorizontalAlignment(JTextField.LEFT);

        txtespecialidad2 = new JTextField();
        txtespecialidad2.setBounds(new Rectangle(135, 260, 150, 21));
        txtespecialidad2.setEditable(true);
        txtespecialidad2.setHorizontalAlignment(JTextField.LEFT);

        txtcosto1 = new JTextField();
        txtcosto1.setBounds(new Rectangle(300, 110, 50, 21));
        txtcosto1.setEditable(true);
        txtcosto1.setHorizontalAlignment(JTextField.LEFT);

        txtcosto2 = new JTextField();
        txtcosto2.setBounds(new Rectangle(300, 140, 50, 21));
        txtcosto2.setEditable(true);
        txtcosto2.setHorizontalAlignment(JTextField.LEFT);

        txtcosto3 = new JTextField();
        txtcosto3.setBounds(new Rectangle(300, 170, 50, 21));
        txtcosto3.setEditable(true);
        txtcosto3.setHorizontalAlignment(JTextField.LEFT);

        txtcosto4 = new JTextField();
        txtcosto4.setBounds(new Rectangle(300, 230, 50, 21));
        txtcosto4.setEditable(true);
        txtcosto4.setHorizontalAlignment(JTextField.LEFT);

        txtcosto5 = new JTextField();
        txtcosto5.setBounds(new Rectangle(300, 260, 50, 21));
        txtcosto5.setEditable(true);
        txtcosto5.setHorizontalAlignment(JTextField.LEFT);

        botonmenuañadir = new JButton("Guardar");
        botonmenuañadir.setBounds(150, 350, 150, 40);
        botonmenuañadir.setBackground(Color.blue);//Color del boton
       // botonmenuañadir.setFont(new Font("ALGERIAN", Font.BOLD, 20));
        botonmenuañadir.setForeground(Color.white);
        botonmenuañadir.setVisible(true);
        botonmenuañadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Menu.contservicio < 10) {

                    costo1 = Integer.parseInt(txtcosto1.getText());
                    costo2 = Integer.parseInt(txtcosto2.getText());
                    costo3 = Integer.parseInt(txtcosto3.getText());
                    costo4 = Integer.parseInt(txtcosto4.getText());
                    costo5 = Integer.parseInt(txtcosto5.getText());
                    costo6 = Integer.parseInt(txtcosto6.getText());
                    costo7 = Integer.parseInt(txtcosto7.getText());
                    costo8 = Integer.parseInt(txtcosto8.getText());
                    nombrerestaurante = txtnombrerestaurante.getText();
                    platillo1 = txtplatillo1.getText();
                    platillo2 = txtplatillo2.getText();
                    platillo3 = txtplatillo3.getText();
                    especialidad1 = txtespecialidad1.getText();
                    especialidad2 = txtespecialidad2.getText();
                    entretenimiento1 = txtent1.getText();
                    entretenimiento2 = txtent2.getText();
                    entretenimiento3 = txtent3.getText();

                    CrearServicios temp = new CrearServicios();
                    temp.setCosto1(costo1);
                    temp.setCosto2(costo2);
                    temp.setCosto3(costo3);
                    temp.setCosto4(costo4);
                    temp.setCosto5(costo5);
                    temp.setCosto6(costo6);
                    temp.setCosto7(costo7);
                    temp.setCosto8(costo8);
                    temp.setNombreRestaurante(nombrerestaurante);
                    temp.setNomPlatillo1(platillo1);
                    temp.setNomPlatillo2(platillo2);
                    temp.setNomPlatillo3(platillo3);
                    temp.setNomEspecialidad1(especialidad1);
                    temp.setNomEspecialidad2(especialidad2);
                    temp.setNomEntretenimiento1(entretenimiento1);
                    temp.setNomEntretenimiento2(entretenimiento2);
                    temp.setNomEntretenimiento3(entretenimiento3);

                    Menu.servicio[Menu.contservicio] = temp;
                    Menu.contservicio++;

                    txtnombrerestaurante.setText("");
                    txtplatillo1.setText("");
                    txtplatillo2.setText("");
                    txtplatillo3.setText("");
                    txtespecialidad1.setText("");
                    txtespecialidad2.setText("");
                    txtent1.setText("");
                    txtent2.setText("");
                    txtent3.setText("");
                    txtcosto1.setText("");
                    txtcosto2.setText("");
                    txtcosto3.setText("");
                    txtcosto4.setText("");
                    txtcosto5.setText("");
                    txtcosto6.setText("");
                    txtcosto7.setText("");
                    txtcosto8.setText("");

                    JOptionPane.showMessageDialog(null, "Servicio Creador");
                } else {
                    JOptionPane.showMessageDialog(null, "Ya no puede CREAR SERVICIOS");
                }
                System.out.println(nombrerestaurante);

            }
        });
        /*
         -----------------------------------------------------------------------
         Segunda columna
         -----------------------------------------------------------------------
         */
        lbltitulo2 = new JLabel("Entretenimiento");
        lbltitulo2.setFont(new Font("Castellar", Font.BOLD, 16));
        lbltitulo2.setForeground(Color.BLUE);
        lbltitulo2.setBounds(420, 5, 200, 50);
        lbltitulo2.setVisible(true);

        lb9 = new JLabel("Entretenimiento 1");
        lb9.setBounds(400, 35, 200, 50);
        lb9.setVisible(true);

        lb10 = new JLabel("Entretenimiento 2");
        lb10.setBounds(400, 65, 200, 50);
        lb10.setVisible(true);

        lb11 = new JLabel("Entretenimiento 3");
        lb11.setBounds(400, 95, 200, 50);
        lb11.setVisible(true);

        lblcosto2 = new JLabel("Costo");
        lblcosto2.setFont(new Font("ALGERIAN", Font.BOLD, 14));
        lblcosto2.setForeground(Color.BLACK);
        lblcosto2.setBounds(690, 5, 200, 50);
        lblcosto2.setVisible(true);

        txtent1 = new JTextField();
        txtent1.setBounds(new Rectangle(520, 50, 150, 21));
        txtent1.setEditable(true);
        txtent1.setHorizontalAlignment(JTextField.LEFT);

        txtent2 = new JTextField();
        txtent2.setBounds(new Rectangle(520, 80, 150, 21));
        txtent2.setEditable(true);
        txtent2.setHorizontalAlignment(JTextField.LEFT);

        txtent3 = new JTextField();
        txtent3.setBounds(new Rectangle(520, 110, 150, 21));
        txtent3.setEditable(true);
        txtent3.setHorizontalAlignment(JTextField.LEFT);

        txtcosto6 = new JTextField();
        txtcosto6.setBounds(new Rectangle(690, 50, 50, 21));
        txtcosto6.setEditable(true);
        txtcosto6.setHorizontalAlignment(JTextField.LEFT);

        txtcosto7 = new JTextField();
        txtcosto7.setBounds(new Rectangle(690, 80, 50, 21));
        txtcosto7.setEditable(true);
        txtcosto7.setHorizontalAlignment(JTextField.LEFT);

        txtcosto8 = new JTextField();
        txtcosto8.setBounds(new Rectangle(690, 110, 50, 21));
        txtcosto8.setEditable(true);
        txtcosto8.setHorizontalAlignment(JTextField.LEFT);

        /*
         ************************************************************************
         Agregando los objetos la JFrame
         ************************************************************************
         */
        frameservicios.add(lbltitulo1);
        frameservicios.add(lbltitulo2);
        frameservicios.add(lb1);
        frameservicios.add(lb2);
        frameservicios.add(lb3);
        frameservicios.add(lb4);
        frameservicios.add(lb5);
        frameservicios.add(lb6);
        frameservicios.add(lb7);
        frameservicios.add(lb8);
        frameservicios.add(lb9);
        frameservicios.add(lb10);
        frameservicios.add(lb11);
        frameservicios.add(lblcosto1);
        frameservicios.add(lblcosto2);
        frameservicios.add(txtnombrerestaurante);
        frameservicios.add(txtplatillo1);
        frameservicios.add(txtcosto1);
        frameservicios.add(txtplatillo2);
        frameservicios.add(txtplatillo3);
        frameservicios.add(txtespecialidad1);
        frameservicios.add(txtespecialidad2);
        frameservicios.add(txtent1);
        frameservicios.add(txtent2);
        frameservicios.add(txtent3);
        frameservicios.add(txtcosto1);
        frameservicios.add(txtcosto2);
        frameservicios.add(txtcosto3);
        frameservicios.add(txtcosto4);
        frameservicios.add(txtcosto5);
        frameservicios.add(txtcosto6);
        frameservicios.add(txtcosto7);
        frameservicios.add(txtcosto8);
        frameservicios.add(botonmenuañadir);
        Fondo();
    }
}
