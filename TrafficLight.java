import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class TrafficLight extends JFrame implements ActionListener {
    JButton buttonRed, buttonYellow, buttonGreen;

      Signal green = new Signal(Color.green);
      Signal yellow = new Signal(Color.yellow);
      Signal red = new Signal(Color.red);

    public TrafficLight(){
        super("Java Traffic Light Program");
        getContentPane().setLayout(new GridLayout(2, 1));
        buttonRed = new JButton("Red");
        buttonYellow = new JButton("Yellow");
        buttonGreen = new JButton("Green");
        buttonRed.addActionListener(this);
        buttonYellow.addActionListener(this);
        buttonGreen.addActionListener(this);      

        green.turnOn(false);
        yellow.turnOn(false);
        red.turnOn(true);

        JPanel trafficPanel = new JPanel(new GridLayout(3,1));
        trafficPanel.add(red);
        trafficPanel.add(yellow);
        trafficPanel.add(green);
        JPanel lightPanel = new JPanel(new FlowLayout());
        lightPanel.add(buttonRed);
        lightPanel.add(buttonYellow);
        lightPanel.add(buttonGreen);

        getContentPane().add(trafficPanel);
        getContentPane().add(lightPanel);
        pack();
        }


    public static void main(String[] args){
        TrafficLight trafficLight = new TrafficLight();      
        trafficLight.setVisible(true);
    }  
    public void actionPerformed(ActionEvent e){      
        if (e.getSource() == buttonRed){
            green.turnOn(false);          
            yellow.turnOn(false);
            red.turnOn(true);
        } else if (e.getSource() == buttonYellow){
            yellow.turnOn(true);          
            green.turnOn(false);
            red.turnOn(false);
        } else if (e.getSource() == buttonGreen){
            red.turnOn(false);          
            yellow.turnOn(false);
            green.turnOn(true);
        }
    }
}  
class Signal extends JPanel{

    Color on;
    int radius = 40;
    int border = 10;
    boolean change;

    Signal(Color color){
        on = color;
        change = true;
    }

    public void turnOn(boolean a){
        change = a;
        repaint();      
    }

    public Dimension getPreferredSize(){
        int size = (radius+border)*2;
        return new Dimension( size, size );
    }

    public void paintComponent(Graphics graphics){
        graphics.setColor( Color.black );
        graphics.fillRect(0,0,getWidth(),getHeight());

        if (change){
            graphics.setColor( on );
        } else {
            graphics.setColor( on.darker().darker().darker() );
        }
        graphics.fillOval( border,border,2*radius,2*radius );
    }
}