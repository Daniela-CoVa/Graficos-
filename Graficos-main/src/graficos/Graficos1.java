/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;


/**
 *
 * @author soryl
 */
public class Graficos1 extends JFrame {
    // componentes suma
    private JLabel result;
    private JLabel label1;
    private JLabel label2;
    private JLabel labelresta;
    private JTextField dato1;
    private JTextField dato2;
    private JButton btncalcular;
    
    //componenentes Resta
    private JLabel resultResta;
    private JLabel label1Multiplicacion;
    private JLabel label2Division;


    public Graficos1() {
        setTitle("Operaciones Básicas"); //titulo de la ventana
             // ancho alto
        setSize(380, 300); //tamaño de ventana
        setLocationRelativeTo(null); //centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // funcion terminar la ejecución al cerrar la ventana
        //componenetes
        result = new JLabel("Resultado");
        label1 = new JLabel("Valor 1");
        label2 = new JLabel("Valor 2");
        labelresta = new JLabel("Valor 1");
        
        label1Multiplicacion = new JLabel("Multiplicación");
        labelresta = new JLabel("Resta");
        label2Division = new JLabel("División");
                
        dato1 = new JTextField(5);
        dato2 = new JTextField(5);
        btncalcular = new JButton("Calcular");
    }
    
    public void Componentes(Graficos1 ventana){
                 
        ventana.add(label1);
        ventana.add(dato1);
        ventana.add(label2);
        ventana.add(dato2);
        ventana.add(btncalcular);      
        ventana.add(result);
        
        ventana.add(labelresta);
        ventana.add(label1Multiplicacion);
        ventana.add(label2Division);

        btncalcular.addActionListener(new java.awt.event.ActionListener() { //tipo de evento, al dar click en el componente 
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) { // metodo del evento
                btncalcularActionPerformed(evt);
                btncalcularResta(evt);
                btncalcularActionPerformed2div(evt);
                btncalcularActionPerformed2mul(evt);
            }
        });   
        
        btncalcular.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { // tipo de evento, al posicionar el maouse sobre el componente
            @Override
            public void mouseMoved(java.awt.event.MouseEvent evt) { // metodo del evento
                btncalcularActionPerformed(evt);
                btncalcularResta(evt);
                btncalcularActionPerformed2div(evt);
                btncalcularActionPerformed2mul(evt);
            }
        });
         
    }
    
    private void btncalcularActionPerformed(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1+v2;
        result.setText("Resultado: " + re);
    }
    
     private void btncalcularResta(ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1-v2;
        labelresta.setText("Resultado: " + re);
    }
    
     private void btncalcularActionPerformed2mul (ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1*v2;
        label1Multiplicacion.setText("Resultado: " + re);
    }
    
    private void btncalcularActionPerformed2div (ActionEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1/v2;
        label2Division.setText("Resultado: " + re);
    } 
     
    private void btncalcularActionPerformed(MouseEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1+v2;
        result.setText("Resultado: " + re);
    }
    
     private void btncalcularResta(MouseEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1-v2;
        labelresta.setText("Resultado: " + re);
    }
    
    private void btncalcularActionPerformed2mul (MouseEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1*v2;
        label1Multiplicacion.setText("Resultado: " + re);
    }
    
    private void btncalcularActionPerformed2div (MouseEvent evt) {
        int v1 = Integer.parseInt(dato1.getText()); 
        int v2 = Integer.parseInt(dato2.getText());
        int re = v1/v2;
        label2Division.setText("Resultado: " + re);
    }
    
    public static void main(String[] args) {
        Graficos1 ventana = new Graficos1();
        ventana.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        ventana.setBackground(Color.yellow);
        ventana.Componentes(ventana); 
          
        ventana.setVisible(true); //activar la ventana 
            
       
    }
    
    
}



