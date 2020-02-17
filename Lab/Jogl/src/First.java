
import com.jogamp.nativewindow.Capabilities;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.awt.GLJPanel;
import javax.swing.JFrame;

public class First implements GLEventListener {
	
	public void display(GLAutoDrawable arg0)
	{
		
	}
	public void Dispose(GLAutoDrawable arg0)
	{
		
	}
	public void init(GLAutoDrawable arg0)
	{
		
	}
	public void reshape(GLAutoDrawable arg0,int arg1,int arg2,int arg3,int arg4)
	{
		
	}
	

	public static void main(String[] args) 
	{
		final GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities capabilities = new GLCapabilities(profile);
		final GLCanvas glcanvas = new GLCanvas(capabilities);
		First b = new First();
		glcanvas.addGLEventListener(b);
		glcanvas.setSize(400,400);
		final JFrame jframe = new JFrame("Basic Frame");
		
	}

}
