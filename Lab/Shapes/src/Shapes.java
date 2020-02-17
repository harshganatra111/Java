 import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.awt.GLJPanel;
import javax.swing.JFrame;
public class Shapes implements GLEventListener
{
public void display(GLAutoDrawable arg0)
{
final GL2 gl= arg0.getGL().getGL2();
//gl.glBegin(GL2.GL_LINES);
//gl.glVertex3f(-0.50f, -0.50f, 0);
//gl.glVertex3f(0.50f, -0.50f, 0);
//gl.glEnd();
//gl.glBegin(GL2.GL_LINES);
//gl.glVertex3f(0f, 0.50f, 0);
//gl.glVertex3f(-0.50f,-0.50f,0);
//gl.glEnd();
//gl.glBegin(GL2.GL_LINES);
//gl.glVertex3f(0f, 0.50f, 0);
//gl.glVertex3f(0.50f,-0.50f,0);
//gl.glEnd();

//gl.glBegin(GL2.GL_LINE_STRIP);
//gl.glVertex3f(-0.50f,-0.75f,0);
//gl.glVertex3f(0.7f,0.5f,0);
//gl.glVertex3f(0.70f,-0.70f,0);
//gl.glVertex3f(0f,0.5f,0);
//gl.glEnd();
gl.glColor3f(0f, 0f, 1f);
gl.glBegin(GL2.GL_LINE_LOOP);
gl.glVertex3f(-0.15f,-0.20f,0);
gl.glVertex3f(0.20f,0.3f,0);
gl.glVertex3f(0.70f,-0.70f,0);
gl.glEnd();

}
public void dispose(GLAutoDrawable arg0)
{
}
public void init(GLAutoDrawable arg0)
{
}
public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4)
{
}
public static void main(String[] args) {
// TODO Auto-generated method stub
final GLProfile profile=GLProfile.get(GLProfile.GL2);
GLCapabilities capabalities= new GLCapabilities(profile);
final GLCanvas glcanvas= new GLCanvas(capabalities);
Shapes b=new Shapes();
glcanvas.addGLEventListener(b);
glcanvas.setSize(400,400);
final JFrame Frame=new JFrame("basic frame");
Frame.add(glcanvas);
Frame.setSize(800,800);
Frame.setVisible(true);

}

}