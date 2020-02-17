import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.Animator;
import com.jogamp.opengl.util.gl2.GLUT;
import javax.swing.JFrame;

public class t implements GLEventListener {
private float rquad = 0.0f, squad = 0.0f;

public static void main(String[] args) {
final GLProfile profile = GLProfile.get(GLProfile.GL2);
GLCapabilities capabilities = new GLCapabilities(profile);
final GLCanvas canvas = new GLCanvas(capabilities);
t cube = new t();
canvas.addGLEventListener(cube);
canvas.setSize(400, 400);

JFrame frame = new JFrame();
frame.add(canvas);
frame.setSize(640, 480);
frame.setVisible(true);
final Animator animator = new Animator(canvas);
animator.start();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

@Override
public void init(GLAutoDrawable glad) {
GL2 gl = glad.getGL().getGL2();
GLU glu = new GLU();
gl.glClearColor(0.8f, 0.8f, 0.8f, 1.0f);
gl.glViewport(-250, -250, 250, 250);
gl.glEnable(GL.GL_DEPTH_TEST);
gl.glEnable(GL2.GL_LIGHTING);
gl.glEnable(GL2.GL_LIGHT0);
gl.glEnable(GL2.GL_COLOR_MATERIAL);
gl.glEnable(GL2.GL_NORMALIZE);
}

@Override
public void dispose(GLAutoDrawable glad) {

}

@Override
public void reshape(GLAutoDrawable glad, int i, int i1, int i2, int i3) {

}

@Override
public void display(GLAutoDrawable glad) {
GL2 gl = glad.getGL().getGL2();
GLUT glut = new GLUT();
gl.glClearColor(0, 0, 0, 0);
gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
gl.glMatrixMode(GL2.GL_PROJECTION);
gl.glLoadIdentity();
gl.glOrtho(-1, 1, -1, 1, -2, 2);
gl.glMatrixMode(GL2.GL_MODELVIEW);
gl.glLoadIdentity();

gl.glPushMatrix();
gl.glRotatef(rquad, 0.0f, 1.0f, 0.0f);
gl.glRotatef(rquad, 1.0f, 0.0f, 0.0f);
gl.glColor3f(1.0f, 0.0f, 0.0f);
glut.glutWireSphere(1, 16, 16);
gl.glPopMatrix();

gl.glPushMatrix();
gl.glRotatef(squad, 1.0f, 0.0f, 0.0f);
gl.glRotatef(squad, 0.0f, 1.0f, 0.0f);

gl.glColor3f(0.0f, 0.0f, 1.0f);
glut.glutSolidOctahedron();
gl.glPopMatrix();
rquad -= 0.15f;
squad += 0.15f;
}

public void drawIFS(GL2 gl, float[][] vertexList, int[][] faceList, double[][] faceColors) {
for (int i = 0; i < faceList.length; i++) {
gl.glColor3dv(faceColors[i], 0);
gl.glBegin(GL2.GL_POLYGON);
int[] faceData = faceList[i]; // List of vertices for this face
for (int j = 0; j < faceData.length; j++) {
int vertexIndex = faceData[j]; // Location of j-th vertex in list
float[] vertex = vertexList[vertexIndex];
gl.glVertex3fv(vertex, 0);
}
gl.glEnd();
}
}
}