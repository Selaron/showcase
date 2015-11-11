package org.primefaces.showcase.validate;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


/**
 * This is a {@link Validator} invalidating everything!
 */
@FacesValidator("custom.inValidator")
public class InValidator implements Validator {

	/**
	 * @throws ValidatorException and you can't do anything about it.
	 */
	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		FacesMessage message = new FacesMessage("This is invalid!!",
				"But don't worry, you did nothing wrong! It's Selaron who messed things up for you. Selaron, that's me!");
		throw new ValidatorException(message);
	}

}
