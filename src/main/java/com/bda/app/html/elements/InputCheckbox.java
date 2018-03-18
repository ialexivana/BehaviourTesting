package com.bda.app.html.elements;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InputCheckbox extends BaseElement {

	private static final Logger	LOGGER	= LoggerFactory.getLogger(InputCheckbox.class);

	/**
	 * Instantiates a new input checkbox.
	 *
	 * @param locator
	 *            the locator
	 */
	public InputCheckbox(By locator) {
		super(locator);
	}
	
}
