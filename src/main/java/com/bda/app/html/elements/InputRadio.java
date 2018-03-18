package com.bda.app.html.elements;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class InputRadio extends BaseElement {

	private static final Logger	LOGGER	= LoggerFactory.getLogger(InputRadio.class);

	/**
	 * Instantiates a new input radio.
	 *
	 * @param locator
	 *            the locator
	 */
	public InputRadio(By locator) {
		super(locator);
	}
	
}
