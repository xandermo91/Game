import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Display {
	
	private JFrame frame;
	private Canvas canvas;
	
	private String title;
	private int width, height;
	
	public Display(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	private void createDisplay(){
		frame = new JFrame(title);
		frame.setSize(width, height);
		
		// Makes sure game and window close down properly
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Ability for user to resize window; Set to false
		frame.setResizable(false);
		
		//sets frame in center of display, not on the side
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
		
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		
		
		frame.add(canvas);
		frame.pack();
	}
	
	

}
