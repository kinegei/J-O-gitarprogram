import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// Her opprettes vinduet
class Vindu extends JFrame{
	// Her opprettes det første panelet
	JPanel f1=new JPanel();
	// Her opprettes alle de små tekstrutene
	JTextField f1t=new JTextField();
	JTextField f2t=new JTextField();
	JTextField f3t=new JTextField();
	JTextField f4t=new JTextField();
	JTextField f5t=new JTextField();
	
	JTextField f6t=new JTextField();
	JTextField f7t=new JTextField();
	JTextField f8t=new JTextField();
	JTextField f9t=new JTextField();
	JTextField f10t=new JTextField();
	
	JTextField f11t=new JTextField();
	JTextField f12t=new JTextField();
	JTextField f13t=new JTextField();
	JTextField f14t=new JTextField();
	JTextField f15t=new JTextField();
	
	JTextField f16t=new JTextField();
	JTextField f17t=new JTextField();
	JTextField f18t=new JTextField();
	JTextField f19t=new JTextField();
	JTextField f20t=new JTextField();
	
	JTextField f21t=new JTextField();
	JTextField f22t=new JTextField();
	JTextField f23t=new JTextField();
	JTextField f24t=new JTextField();
	JTextField f25t=new JTextField();
	
	JTextField f26t=new JTextField();
	JTextField f27t=new JTextField();
	JTextField f28t=new JTextField();
	JTextField f29t=new JTextField();
	JTextField f30t=new JTextField();
	
	
	JPanel bildepanel=new JPanel();
	ImagePanel bilde1=new ImagePanel();
	ImagePanel bilde2=new ImagePanel();
	ImagePanel bilde3=new ImagePanel();
	ImagePanel bilde4=new ImagePanel();
	ImagePanel bilde5=new ImagePanel();
	
	ImagePanel bilde6=new ImagePanel();
	ImagePanel bilde7=new ImagePanel();
	ImagePanel bilde8=new ImagePanel();
	ImagePanel bilde9=new ImagePanel();
	ImagePanel bilde10=new ImagePanel();
	
	ImagePanel bilde11=new ImagePanel();
	ImagePanel bilde12=new ImagePanel();
	ImagePanel bilde13=new ImagePanel();
	ImagePanel bilde14=new ImagePanel();
	ImagePanel bilde15=new ImagePanel();
	
	ImagePanel bilde16=new ImagePanel();
	ImagePanel bilde17=new ImagePanel();
	ImagePanel bilde18=new ImagePanel();
	ImagePanel bilde19=new ImagePanel();
	ImagePanel bilde20=new ImagePanel();
	
	ImagePanel bilde21=new ImagePanel();
	ImagePanel bilde22=new ImagePanel();
	ImagePanel bilde23=new ImagePanel();
	ImagePanel bilde24=new ImagePanel();
	ImagePanel bilde25=new ImagePanel();
	
	ImagePanel bilde26=new ImagePanel();
	ImagePanel bilde27=new ImagePanel();
	ImagePanel bilde28=new ImagePanel();
	ImagePanel bilde29=new ImagePanel();
	ImagePanel bilde30=new ImagePanel();
	
	// Her har vi lagt til utsenet på de små rutene og brukt flowlayout. Denne fant vi på nett
	FlowLayout b= new FlowLayout();
	Vindu(){
		//Her har vi satt alle rutene til å være en kolonne brei.
		f1t.setColumns(1);
		f2t.setColumns(1);
		f3t.setColumns(1);
		f4t.setColumns(1);
		f5t.setColumns(1);
		
		f6t.setColumns(1);
		f7t.setColumns(1);
		f8t.setColumns(1);
		f9t.setColumns(1);
		f10t.setColumns(1);
		
		f11t.setColumns(1);
		f12t.setColumns(1);
		f13t.setColumns(1);
		f14t.setColumns(1);
		f15t.setColumns(1);
		
		f16t.setColumns(1);
		f17t.setColumns(1);
		f18t.setColumns(1);
		f19t.setColumns(1);
		f20t.setColumns(1);
		
		f21t.setColumns(1);
		f22t.setColumns(1);
		f23t.setColumns(1);
		f24t.setColumns(1);
		f25t.setColumns(1);
		
		f26t.setColumns(1);
		f27t.setColumns(1);
		f28t.setColumns(1);
		f29t.setColumns(1);
		f30t.setColumns(1);
		
		// Her bestemmer vi at det første panelet får riktig layout, altså b.
		f1.setLayout(b);
		
		//Her har vi lagt inn en lytter som følger med på kva som skjer i de små tekstrutene. 
		f1t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {

			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f1t.getText();
				bilde1.setBilde(s);
				// Her sei vi at når en knapp er blitt trykka på, så sjekker den om det er angitt bokstav og skriver ut riktig ord.

			}
			public void keyTyped(KeyEvent keyEvent) {

			}
			
		});
		f2t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
	
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f2t.getText();
				bilde2.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f3t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f3t.getText();
				bilde3.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f4t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f4t.getText();
				bilde4.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f5t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f5t.getText();
				bilde5.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f6t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f6t.getText();
				bilde6.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f7t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f7t.getText();
				bilde7.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		
		f8t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f8t.getText();
				bilde8.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f9t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f9t.getText();
				bilde9.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f10t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f10t.getText();
				bilde10.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f11t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f11t.getText();
				bilde11.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f12t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f12t.getText();
				bilde12.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f13t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f13t.getText();
				bilde13.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f14t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f14t.getText();
				bilde14.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
		});
		f15t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f15t.getText();
				bilde15.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f16t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f16t.getText();
				bilde16.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f17t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f17t.getText();
				bilde17.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f18t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f18t.getText();
				bilde18.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f19t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f19t.getText();
				bilde19.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f20t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f20t.getText();
				bilde20.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f21t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f21t.getText();
				bilde21.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f22t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f22t.getText();
				bilde22.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f23t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f23t.getText();
				bilde23.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f24t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f24t.getText();
				bilde24.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f25t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f25t.getText();
				bilde25.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f26t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f26t.getText();
				bilde26.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f27t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f27t.getText();
				bilde27.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f28t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f28t.getText();
				bilde28.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f29t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f29t.getText();
				bilde29.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		f30t.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				
			}
			public void keyReleased(KeyEvent keyEvent) {
				String s = f30t.getText();
				bilde30.setBilde(s);
			}
			public void keyTyped(KeyEvent keyEvent) {
				
			}
			
		});
		
		//Her er tekstrutene lagt til i det første panelet
		f1.add(f1t);
		f1.add(f2t);
		f1.add(f3t);
		f1.add(f4t);
		f1.add(f5t);
		
		f1.add(f6t);
		f1.add(f7t);
		f1.add(f8t);
		f1.add(f9t);
		f1.add(f10t);
		
		f1.add(f11t);
		f1.add(f12t);
		f1.add(f13t);
		f1.add(f14t);
		f1.add(f15t);
		
		f1.add(f16t);
		f1.add(f17t);
		f1.add(f18t);
		f1.add(f19t);
		f1.add(f20t);
		
		f1.add(f21t);
		f1.add(f22t);
		f1.add(f23t);
		f1.add(f24t);
		f1.add(f25t);
		
		f1.add(f26t);
		f1.add(f27t);
		f1.add(f28t);
		f1.add(f29t);
		f1.add(f30t);
		
		
		// Her begynner bildene på bunn av vinduet
		
		
		bildepanel.setLayout(b);
		
		
		// Her legger vi til bildene i panelet.
		bildepanel.add (bilde1);
		bildepanel.add (bilde2);
		bildepanel.add (bilde3);
		bildepanel.add (bilde4);
		bildepanel.add (bilde5);
		
		bildepanel.add (bilde6);
		bildepanel.add (bilde7);
		bildepanel.add (bilde8);
		bildepanel.add (bilde9);
		bildepanel.add (bilde10);
		
		bildepanel.add (bilde11);
		bildepanel.add (bilde12);
		bildepanel.add (bilde13);
		bildepanel.add (bilde14);
		bildepanel.add (bilde15);
		
		bildepanel.add (bilde16);
		bildepanel.add (bilde17);
		bildepanel.add (bilde18);
		bildepanel.add (bilde19);
		bildepanel.add (bilde20);
		
		bildepanel.add (bilde21);
		bildepanel.add (bilde22);
		bildepanel.add (bilde23);
		bildepanel.add (bilde24);
		bildepanel.add (bilde25);
		
		bildepanel.add (bilde26);
		bildepanel.add (bilde27);
		bildepanel.add (bilde28);
		bildepanel.add (bilde29);
		bildepanel.add (bilde30);
		
		
		// Her legger vi til størrelsen på bildeområdet
		bilde1.setPreferredSize (new Dimension(26,200));
		bilde2.setPreferredSize (new Dimension(26,200));
		bilde3.setPreferredSize (new Dimension(26,200));
		bilde4.setPreferredSize (new Dimension(26,200));
		bilde5.setPreferredSize (new Dimension(26,200));
		
		bilde6.setPreferredSize (new Dimension(26,200));
		bilde7.setPreferredSize (new Dimension(26,200));
		bilde8.setPreferredSize (new Dimension(26,200));
		bilde9.setPreferredSize (new Dimension(26,200));
		bilde10.setPreferredSize (new Dimension(26,200));
		
		bilde11.setPreferredSize (new Dimension(26,200));
		bilde12.setPreferredSize (new Dimension(26,200));
		bilde13.setPreferredSize (new Dimension(26,200));
		bilde14.setPreferredSize (new Dimension(26,200));
		bilde15.setPreferredSize (new Dimension(26,200));
		
		bilde16.setPreferredSize (new Dimension(26,200));
		bilde17.setPreferredSize (new Dimension(26,200));
		bilde18.setPreferredSize (new Dimension(26,200));
		bilde19.setPreferredSize (new Dimension(26,200));
		bilde20.setPreferredSize (new Dimension(26,200));
		
		bilde21.setPreferredSize (new Dimension(26,200));
		bilde22.setPreferredSize (new Dimension(26,200));
		bilde23.setPreferredSize (new Dimension(26,200));
		bilde24.setPreferredSize (new Dimension(26,200));
		bilde25.setPreferredSize (new Dimension(26,200));
		
		bilde26.setPreferredSize (new Dimension(26,200));
		bilde27.setPreferredSize (new Dimension(26,200));
		bilde28.setPreferredSize (new Dimension(26,200));
		bilde29.setPreferredSize (new Dimension(26,200));
		bilde30.setPreferredSize (new Dimension(26,200));
		
		
		
		BorderLayout stable=new BorderLayout();
		
		setLayout(stable);
			add(f1, BorderLayout.NORTH);
			add(bildepanel, BorderLayout.CENTER);
		
		
		setSize(1000,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}