package com.java21days;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CursorMayhem extends JFrame {
	JButton harry, wade, hansel;
	
	public CursorMayhem() {
		super("Choose a Cursor");
		setSize(400, 80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		harry = new JButton("Crosshair");
		add(harry);
		wade = new JButton("Wait");
		add(wade);
		hansel = new JButton("Hand");
		add(hansel);
		// begin closure
		ActionListener act = (event) -> {
				if (event.getSource() == harry) {
					setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
				}
				if (event.getSource() == wade) {
					setCursor(new Cursor(Cursor.WAIT_CURSOR));
				}
				if (event.getSource() == hansel) {
					setCursor( new Cursor(Cursor.HAND_CURSOR));
				}
			
		};
		// end closure
		harry.addActionListener(act);
		wade.addActionListener(act);
		hansel.addActionListener(act);
		setVisible(true);
	}
	
	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
					"javax.swing.plaf.nimbus.NimbusLookAndFeel"
					);
		} catch (Exception exc) {
			System.err.println("Look and feel error: " + exc);
		}
	}
	
	public static void main(String[] arguments) {
		CursorMayhem.setLookAndFeel();
		CursorMayhem app = new CursorMayhem();
	}

}
