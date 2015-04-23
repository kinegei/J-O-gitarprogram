import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.io.*;

public class ImagePanel extends JPanel{
	
    private BufferedImage image = null;
	
    public ImagePanel() {
    }
	
    @Override
    public void paintComponent(Graphics g) {
		if (image!=null) {
			g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters
		}
       
    }
	public void setBilde(String s){
		
		String bilde = null;
		
		//Svarte tangenter på pianoet
		// Her begynner de mørke notene
		// Lav #C og bD
		if (s.length()>1 && s.charAt(0)=='k' && s.charAt(1)=='C') {
			bilde = "j/kcbdlav-01.png";
		}
		else if (s.length()>1 && s.charAt(0)=='b' && s.charAt(1)=='D'){
			bilde = "j/kcbdlav-01.png";
		}
		
		// Lav #D og bE
		else if (s.length()>1 && s.charAt(0)=='k' && s.charAt(1)=='D') {
			bilde = "j/kdbelav-01.png";
		}
		else if (s.length()>1 && s.charAt(0)=='b' && s.charAt(1)=='E'){
			bilde = "j/kdbelav-01.png";
		}
		
		// Lav #F og bG
		else if (s.length()>1 && s.charAt(0)=='k' && s.charAt(1)=='F') {
			bilde = "j/kfbglav-01.png";
		}
		else if (s.length()>1 && s.charAt(0)=='b' && s.charAt(1)=='G'){
			bilde = "j/kfbglav-01.png";
		}
		
		// Lav #G og bA
		else if (s.length()>1 && s.charAt(0)=='k' && s.charAt(1)=='G') {
			bilde = "j/kgbalav-01.png";
		}
		else if (s.length()>1 && s.charAt(0)=='b' && s.charAt(1)=='A'){
			bilde = "j/kgbalav-01.png";
		}
		
		// Lav #A og bH
		else if (s.length()>1 && s.charAt(0)=='k' && s.charAt(1)=='A') {
			bilde = "j/kabhlav-01.png";
		}
		else if (s.length()>1 && s.charAt(0)=='b' && s.charAt(1)=='H'){
			bilde = "j/kabhlav-01.png";
		}
		
		// Her begynner de lyse tonene
		// Hog #C og bD
		if (s.length()>1 && s.charAt(0)=='k' && s.charAt(1)=='c') {
			bilde = "j/kcbdhog-01.png";
		}
		else if (s.length()>1 && s.charAt(0)=='b' && s.charAt(1)=='d'){
			bilde = "j/kcbdhog-01.png";
		}
		
		// Hog #D og bE
		else if (s.length()>1 && s.charAt(0)=='k' && s.charAt(1)=='d') {
			bilde = "j/kdbehog-01.png";
		}
		else if (s.length()>1 && s.charAt(0)=='b' && s.charAt(1)=='e'){
			bilde = "j/kdbehog-01.png";
		}
		
		// Hog #F og bG
		else if (s.length()>1 && s.charAt(0)=='k' && s.charAt(1)=='f') {
			bilde = "j/kfbghog-01.png";
		}
		else if (s.length()>1 && s.charAt(0)=='b' && s.charAt(1)=='g'){
			bilde = "j/kfbghog-01.png";
		}
		
		// Hog #G og bA
		else if (s.length()>1 && s.charAt(0)=='k' && s.charAt(1)=='g') {
			bilde = "j/kgbalav-01.png";
		}
		else if (s.length()>1 && s.charAt(0)=='b' && s.charAt(1)=='a'){
			bilde = "j/kgbalav-01.png";
		}
		
		// Hog #A og bH
		else if (s.length()>1 && s.charAt(0)=='k' && s.charAt(1)=='a') {
			bilde = "j/kabhlav-01.png";
		}
		else if (s.length()>1 && s.charAt(0)=='b' && s.charAt(1)=='h'){
			bilde = "j/kabhlav-01.png";
		}
		
		// Vanlige 'kvite tangenter'
		// Møkre tangenter
		else if (s.charAt(0)=='C') {
			bilde = "j/clav-01.png";
		}
		else if (s.charAt(0)=='D') {
			bilde = "j/dlav-01.png";
		}
		else if (s.charAt(0)=='E') {
			bilde = "j/elav-01.png";
		}
		else if (s.charAt(0)=='F') {
			bilde = "j/flav-01.png";
		}
		else if (s.charAt(0)=='G') {
			bilde = "j/glav-01.png";
		}
		else if (s.charAt(0)=='A') {
			bilde = "j/alav-01.png";
		}
		else if (s.charAt(0)=='H') {
			bilde = "j/hlav-01.png";
		}
		
		// Her begynner de lyse notene
		else if (s.charAt(0)=='c') {
			bilde = "j/chog-01.png";
		}
		else if (s.charAt(0)=='d') {
			bilde = "j/dhog-01.png";
		}
		else if (s.charAt(0)=='e') {
			bilde = "j/ehog-01.png";
		}
		else if (s.charAt(0)=='f') {
			bilde = "j/fhog-01.png";
		}
		else if (s.charAt(0)=='g') {
			bilde = "j/ghog-01.png";
		}
		else if (s.charAt(0)=='a') {
			bilde = "j/ahog-01.png";
		}
		else if (s.charAt(0)=='h') {
			bilde = "j/hhog-01.png";
		}

		// Den ekstra lyse noten
		else if (s.charAt(0)=='s') {
			bilde = "j/cehog-01.png";
		}
			
			
			
		try {                
			
			image = ImageIO.read(new File(bilde));
			updateUI();
			
		} catch (IOException ex) {
			System.err.println();
			ex.printStackTrace();
		}
	
	}	
}
