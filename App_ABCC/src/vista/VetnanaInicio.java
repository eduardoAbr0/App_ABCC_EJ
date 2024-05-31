package vista;

import controlador.AlumnoDAO;
import modelo.Alumno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VetnanaInicio extends JFrame {
    BorderLayout bl = new BorderLayout();
    CardLayout cl = new CardLayout();
    JPanel barraArriba, general, opciones;
    JButton btnInicio, btnClientes, btnAutos, btnEmpleados, btnFacturas, btnVentas;

    public VetnanaInicio{
        //CONFIGURACIONES INICIALES DEL JFRAME
        getContentPane().setLayout(bl);
        setTitle("AutosAmistosos");
        setMinimumSize(new Dimension(1000, 700));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //CREACION PANELES GENERALES PARA LA PARTE SUPERIOR, CENTRO E IZQUIERDA
        barraArriba = new JPanel();
        //USO DE CARD LAYOUT PARA ACCEDER LOS DIFERENTES SUBPANELES EN EL MISMO AREA(CENTER)
        general = new JPanel(cl);
        opciones = new JPanel();
        //CREACION DE SUBPANELES PARA LA PARTE CENTRAL DEL PANEL GENERAL
        panelAlumnos pnlInicio = new panelAlumnos();

        general.add(pnlInicio, "INICIO");
        general.add(pnlAuto,"AUTOS");
        general.add(pnlClientes,"CLIENTES");
        general.add(pnlEmpleados,"EMPLEADOS");
        general.add(pnlVentas,"VENTAS");
        general.add(pnlFacturas,"FACTURAS");

        //PERSONALIZACION BASICA DE COLORES PARA IDENTIFICAR
        barraArriba.setBackground(Color.CYAN);
        general.setBackground(Color.BLACK);
        opciones.setBackground(Color.GREEN);

        //CONFIGURACION TAMANOS Y ESPECIFICACIONES PARA LAYOUT EN EL PANEL
        barraArriba.setPreferredSize(new Dimension(0, 200));
        opciones.setPreferredSize(new Dimension(200, 0));
        opciones.setLayout(new GridLayout(6, 0));

        //CREACION Y CONFIGURACION DE BOTONES DE LA PARTE IZQUIERDA, QUE SERAN
        //DE USO PARA ACCEDER A LOS DIFERENTES SUBPANELES
        btnInicio = new JButton("Inicio");
        btnInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(general, "INICIO");
            }
        });
        opciones.add(btnInicio);
        btnAutos = new JButton("Autos");
        btnAutos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(general, "AUTOS");
            }
        });
        opciones.add(btnAutos);
        btnClientes = new JButton("Clientes");
        btnClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(general, "CLIENTES");
            }
        });
        opciones.add(btnClientes);
        btnEmpleados = new JButton("Empleados");
        btnEmpleados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(general, "EMPLEADOS");
            }
        });
        opciones.add(btnEmpleados);
        btnFacturas = new JButton("Facturas");
        btnFacturas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(general, "FACTURAS");
            }
        });
        opciones.add(btnFacturas);
        btnVentas = new JButton("Ventas");
        btnVentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(general, "VENTAS");
            }
        });
        opciones.add(btnVentas);

        //SE AGREGAN LOS PANELES PARA LA PARTE SUPERIOR , CENTRAL E IZQUIERDA DEL BORDER LAYOUT
        add(barraArriba, BorderLayout.NORTH);
        add(general, BorderLayout.CENTER);
        add(opciones, BorderLayout.WEST);

        //DEMAS CONFIGURACIONES DEL JFRAME
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public static void main(String[] args) {

    }
}