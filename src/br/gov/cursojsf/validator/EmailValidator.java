package br.gov.cursojsf.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validator.EmailValidator")
public class EmailValidator implements Validator {

	@Override
	public void validate(FacesContext contexto, UIComponent paraValidar, Object valor) throws ValidatorException {
		if (valor.equals("999")) {
			
			((UIInput)paraValidar).setValid(false);
			FacesMessage msg = new FacesMessage("Email inválido");
			contexto.addMessage(paraValidar.getClientId(contexto), msg);
			
			
		} else {
			
			((UIInput)paraValidar).setValid(true);
			
		}

	}

}
