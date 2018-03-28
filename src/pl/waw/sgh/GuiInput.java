package pl.waw.sgh;
import javax.swing.*;
public class GuiInput {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog( null,"Hello!");
        String myText = JOptionPane.showInputDialog("Whats your name");
        JOptionPane.showMessageDialog(null,"hello " +myText+"!!!");


        Double height = null;

        while (height == null) {
            try {
                String sheight = JOptionPane.showInputDialog(null, "What yor height in cm?");
                height = Double.parseDouble(sheight);

            } catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog(null, ne.getMessage());
            }
        }
        //Integer.parseInt(sHeight)
        JOptionPane.showMessageDialog(null, "Then your height in m is: "  + height/100);



        int res =-1;
        while (res!=0) {

            res = JOptionPane.showConfirmDialog(null,"Are you sure?");
            JOptionPane.showMessageDialog(null, "Result; " + res);}

            //if (res = 1) {
            //JOptionPane.showMessageDialog(null, "Why?");}


        }

    }

