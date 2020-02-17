import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.glu.GLU;

import javax.swing.JFrame;
public class Transformation implements GLEventListener
{
	 private GLU glu;
    public void display(GLAutoDrawable gld)
    {
    	GL2 gl=gld.getGL().getGL2();
    	gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
    	gl.glColor3f(0.5f,0.5f,0.5f);
    	drawpolygon(gl);
    	gl.glPushMatrix();
    	gl.glColor3f(1,0,0);
    	gl.glTranslatef(-50,-50,1);
    	drawpolygon(gl);
    	gl.glPopMatrix();
    	gl.glPushMatrix();
    	gl.glColor3f(0,1,0);
    	gl.glTranslatef(-50,-50,1);
    	gl.glRotatef(60,0,0,1);
    	drawpolygon(gl);
    	gl.glPopMatrix();
    	gl.glPushMatrix();
    	gl.glColor3f(0,0,1);
    	gl.glTranslatef(-75,-75,1);
    	gl.glScaled(0.5,0.5,1);
    	drawpolygon(gl);
    	gl.glPopMatrix();
    }
    public void drawpolygon(GL2 gl)
    {
    	gl.glBegin(GL2.GL_POLYGON);
    	gl.glVertex3f(50,50,0);
    	gl.glVertex3f(100,50,0);
    	gl.glVertex3f(100,100,0);
    	gl.glVertex3f(50,100,0);
    	gl.glEnd();
    }
    public void dispose(GLAutoDrawable arg0)
    {
    	
    }
    public void init(GLAutoDrawable gld)
    {
    	   GL2 gl=gld.getGL().getGL2();
    	   glu = new GLU();
    	   gl.glClearColor(0.0f,0.0f,0.0f,1.0f);
    	   gl.glViewport(-250,-150,250,150); 
    	   gl.glMatrixMode(GL2.GL_PROJECTION);
    	   gl.glLoadIdentity();
    	   glu.gluOrtho2D(-250.0,250.0,-150.0,150.0);
    }
    public void reshape(GLAutoDrawable arg0,int arg1,int arg2,int arg3,int arg4)
    {
    	
    }
	public static void main(String[] args) 
	{
		final GLProfile profile=GLProfile.get(GLProfile.GL2);
		GLCapabilities capabilities=new GLCapabilities(profile);
		final GLCanvas glcanvas=new GLCanvas(capabilities);
		Transformation b=new Transformation();
		glcanvas.addGLEventListener(b);
		glcanvas.setSize(400,400);
		
		final JFrame frame=new JFrame("Basic Frame");
		frame.add(glcanvas);
		frame.setSize(640,480);
		frame.setVisible(true);
    }

}