package simulator;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;
import com.jogamp.opengl.util.texture.Texture;

public class Jupit {
	 GL2 gl;
	GLU glu;
	Texture JupiterTexture;
	float angle = 0;

	public Jupit(GL2 gl, GLU glu, Texture JupiterTexture) {
		this.gl = gl;
		this.glu = glu;
		this.JupiterTexture = JupiterTexture;
	}

	public void display() {
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
		JupiterTexture.enable(gl);
		JupiterTexture.bind(gl);
		gl.glPushMatrix();
		gl.glRotatef(angle, 0.8f, 0.1f, 0);
		GLUquadric ju = glu.gluNewQuadric();
		glu.gluQuadricTexture(ju, true);
		glu.gluSphere(ju, 10f, 16, 16);
		gl.glPopMatrix();
	}
}
