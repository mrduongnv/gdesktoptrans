/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package translateonwin;

/**
 *
 * @author Wise-SW
 */
public class Language {
    private String language,sign;

    public Language(String language, String sign) {
        this.language = language;
        this.sign = sign;
    }

    public Language() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
    
    
}
