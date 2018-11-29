package centipede;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.WindowConstants;

public class Window {
	JFrame frame = new JFrame();


    public static void main( String[] args )
    {
        JFrame myFrame = new JFrame();
        myFrame.setTitle( "Centipede Game" );
        myFrame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        myFrame.setSize( 340, 400 );
        myFrame.setResizable( true );
        myFrame.setBackground(Color.RED);

        //myFrame.add( new GamePlay() );
        //myFrame.add(new Board());

        myFrame.setLocationRelativeTo( null );
        myFrame.setVisible( true );
    }
    
    Runtime runtime = Runtime.getRuntime();
}
