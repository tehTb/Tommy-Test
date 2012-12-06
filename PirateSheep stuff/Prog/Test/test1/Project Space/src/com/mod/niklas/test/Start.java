package com.mod.niklas.test;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Paint;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.mod.niklas.engine.*;


public class Start extends Applet{

	MODEngine engine;
	MODRenderer rend;
	MinString s;
	PowerShop shop;
	
	public void init()
	{	
	/*	s = new MinString("detta fungerar!?");
		s.printString();
		s.setString("och detta?");
		s.getMinString();
		s.printString();*/
		
		
		
		Dimension d = new Dimension();
		d.height = 600;
		d.width = 800;
		rend = new MODRenderer(d);
		rend.setSize(800, 600); 
		engine = new MODEngine(rend);
		
		
		/* 
		//MODFillImage s1 = new MODFillImage(new MODFPoint(20,20), new MODIPoint(30,30), Color.GREEN);
		MODFillSquare s2 = new MODFillSquare(new MODFPoint(0,0), new MODIPoint(400,400), Color.WHITE);
		//rend.addImageToLayer(s1, 1);
		rend.addImageToLayer(s2, 0);
		for(int i= 0; i < 200; i++)
		{
		Bouncy ball = new Bouncy();
		ball.draw = new MODFillSquare(new MODFPoint(3*i,20), new MODIPoint(30,30), Color.BLUE);
		
		ball.vel = new MODFPoint(
				(float)(Math.random()*0.5),
				(float)(Math.random()*0.25));
		ball.fieldBounds = new MODFSquare(0,0,400,400);
		
		if(i%2==0){
			ball.draw.color = Color.RED;
			rend.addImageToLayer(ball.draw, 1);
		}else{
			rend.addImageToLayer(ball.draw, 2);
		}
			
		
			engine.registerUpdateable(ball);
		}
		//Image img1 = getImage(getDocumentBase(), getParameter("image1.png"));
		
		//UGLY
		UglyFace face = new UglyFace();
		MediaTracker tr = new MediaTracker(this);
		Image imgFace = getImage(getCodeBase(), "images/smiley.png");
		tr.addImage(imgFace,0);
		
		face.img = new MODSimpleImage(imgFace, new MODFPoint(30,30));
		rend.addImageToLayer(face.img, 2);
		engine.registerUpdateable(face);
		
		//END UGLY
		
		*/
		
		//Anim
		AnimTest anim = new AnimTest(this);
		rend.addImageToLayer(anim.draw, 2);
		engine.registerUpdateable(anim.draw);
		//END ANIM
		
		//SHOP
		shop = new PowerShop(this);
		rend.addImageToLayer(shop, 0);
		engine.registerUpdateable(shop);
		//END SHOP
		
		this.setLayout(new BorderLayout());
		add(rend, BorderLayout.CENTER);
		
		
	
		//Last thing to do.
		
		Thread t = new Thread(engine);
		t.start();
	}
	
}
