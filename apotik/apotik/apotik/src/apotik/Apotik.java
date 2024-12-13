/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apotik;

/**
 *
 * @author MyBook Hype AMD
 */
public class Apotik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new login().setVisible(true);
            }
        }
        );
    }
    
}
