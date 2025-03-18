/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author emanueltoro
 */
public class Agenda extends Frame {

    // Componentes de la interfaz
    private TextField tfEvento;
    private Button btnAgregar;
    private java.awt.List listaEventos;
    private ArrayList<String> eventos;
    
    public Agenda() {
        // Título de la ventana
        setTitle("Agenda Básica");
        
        // Configuración de la ventana
        setSize(400, 300);
        setLayout(new FlowLayout());
        
        // Inicializar la lista de eventos
        eventos = new ArrayList<>();
        
        // Crear componentes
        tfEvento = new TextField(20);
        btnAgregar = new Button("Agregar evento");
        listaEventos = new java.awt.List();
        
        // Agregar componentes al Frame
        add(new Label("Introduce el evento:"));
        add(tfEvento);
        add(btnAgregar);
        add(new Label("Eventos:"));
        add(listaEventos);
        
        // Acción para el botón "Agregar evento"
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String evento = tfEvento.getText();
                if (!evento.isEmpty()) {
                    eventos.add(evento);  // Agregar evento a la lista
                    listaEventos.add(evento);  // Mostrar el evento en la lista
                    tfEvento.setText("");  // Limpiar el campo de texto
                }
            }
        });
        
        // Cerrar la ventana al hacer clic en el botón de cerrar
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una instancia de la agenda
        new Agenda();
    }
    
}
