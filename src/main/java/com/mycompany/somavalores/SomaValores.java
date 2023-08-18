/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somavalores;

import javax.swing.JOptionPane;

/**
 *
 * @author Murilo
 */
public class SomaValores {

    public static void main(String[] args) {
        
        int num1;
        int num2;
        int result;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
        
        result = (num1 + num2);
        
        JOptionPane.showMessageDialog(null, "O Valor da Soma é de: " + result);
        
        
        
    }
}
