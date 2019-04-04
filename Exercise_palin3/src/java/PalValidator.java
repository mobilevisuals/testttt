
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
@FacesValidator("pValidate")
public class PalValidator implements Validator{
    
boolean isPalindrome(char[] sentence) {

		int end = sentence.length - 1;

		for (int start = 0; start < end; start++) {//++start b4
			final char s = sentence[start];

			/*only for extra assignment!!!!!!!!!!!!!!!
			 * if (!Character.isLetterOrDigit(s)) {
				++end; // <-- we only want to increment the start, not decrement
						// the end
				continue;
			}*/

			final char e = sentence[end];

			/*only for extra assignment!!!!!!!!!!!!!!!
			 * if (!Character.isLetterOrDigit(e)) {
				--start; // <-- we only want to decrement the end, not increment
							// the start
				continue;
			}
			*/

			if (Character.toLowerCase(s) != Character.toLowerCase(e))
				return false;

			end--;//--end b4
		}

		return true;
	}

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        
         String pass=(String)value;
       char[] chars=pass.toCharArray();
       boolean pal=isPalindrome(chars);
        String messageText = "Should be palindrome!!!!!!!!!";
       if(!pal)
        
     
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    messageText, messageText));
    
    }
    
}
