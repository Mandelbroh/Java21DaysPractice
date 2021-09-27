package com.java21days;

import javax.swing.*;

public class SimpleFrame extends JFrame {
	public SimpleFrame() {
		super("My First Frame!");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
					"javax.swing.plaf.nimbus.NimbusLookAndFeel"
					);
		} catch (Exception exc) {
			// ignore error
		}
	}
	
	public static void main(String[] arguments) {
		setLookAndFeel();
		SimpleFrame sf = new SimpleFrame();
	}

}
