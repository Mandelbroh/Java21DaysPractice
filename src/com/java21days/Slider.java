package com.java21days;

import javax.swing.*;

public class Slider extends JFrame {
	
	public Slider() {
		super("My Anger");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		JPanel panel = new JPanel();
		panel.setSize(500, 250);
		JLabel label = new JLabel("How angry am I today? : ", SwingConstants.RIGHT);
		JSlider pick = new JSlider(JSlider.HORIZONTAL, 0, 10, 1);
		pick.setMajorTickSpacing(10);
		pick.setMinorTickSpacing(1);
		pick.setPaintTicks(true);
		pick.setPaintLabels(true);
		panel.add(label);
		panel.add(pick);
		add(panel);
		pack();
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
					);
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.err.println("Couldn't use the system "
					+ "look and feel: " + e);
		}
	}
	
	public static void main(String[] arguments) {
		Slider frame = new Slider();
	}

}
