package com.mod.niklas.test;

import java.applet.Applet;
import java.awt.Image;
import java.net.URL;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MediaTracker;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;

import com.mod.niklas.engine.MODUpdateable;
import com.mod.niklas.engine.MODDrawable;
import com.mod.niklas.engine.MODRenderer;
import com.mod.niklas.engine.MODImageUtil;
import com.mod.niklas.engine.MODSimpleImage;
import com.mod.niklas.engine.MODFPoint;
import com.mod.niklas.engine.MODEngine;

public class PowerShop implements MODDrawable, MODUpdateable{
	private Image bkg, powerOne, powerTwo, powerThree;
	private Applet applet;
	private float x, y;
	private boolean showShop;
	private int playerCoins;

	public PowerShop(Applet applet){
		this.applet = applet;
		URL codeBase = applet.getCodeBase();
		MediaTracker mt = new MediaTracker(applet);
		bkg = applet.getImage(codeBase, "images/powerShop/background.png");
		powerOne = applet.getImage(codeBase, "images/powerShop/powerOne.png");
		powerTwo = applet.getImage(codeBase, "images/powerShop/powerTwo.png");
		powerThree = applet.getImage(codeBase, "images/powerShop/powerThree.png");
		mt.addImage(bkg, 0);
		mt.addImage(powerOne, 0);
		mt.addImage(powerTwo, 0);
		mt.addImage(powerThree, 0);
		x = y = 125;
		showShop = false;
		playerCoins = 10551;
		
		applet.addKeyListener(new keyLyss());
		
	/*	image = new MODSimpleImage(bkg, new MODFPoint(50,50));
	//	util = new MODImageUtil(applet);
		
	//	util.getImageFromDir("images/bild.png");
		
	//	System.out.println(util.isImagesLoaded());
		
	//	d = new Dimension(100, 100);	
	//	render = new MODRenderer(d);
		
	//	engine = new MODEngine(render); */
	}
	
	public void draw(Graphics g){
		//if(showShop)
			g.drawImage(bkg, (int)x, (int)y, null);
			g.drawImage(powerOne, (int)x+70, (int)y+60,null);
			g.drawImage(powerTwo, (int)x+170, (int)y+60,null);
			g.drawImage(powerThree, (int)x+270, (int)y+60,null);
			g.setColor(Color.BLACK);
			g.setFont(new Font(Font.DIALOG, Font.BOLD, 16));
			g.drawString("Coins: "+playerCoins, (int)x+15, (int)y+180);
			
	}
	
	public void update(long dt){
		//y = y + dt ; 
		//y++;
		
	}
	
	class keyLyss extends KeyAdapter{
		public void keyPressed(KeyEvent ke){
			System.out.println(ke.getKeyCode());
			if(ke.getKeyCode() == KeyEvent.VK_CONTROL){
				System.out.println("PowerShop");
				showShop = true;
				ke.consume();
			}
			
		}
		
	}
	
}
