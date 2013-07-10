/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package translateonwin;

/**
 *
 * @author Wise-SW
 */
public class StringReplace {
private String _txtFrom;
private String _txtResult;
private String _txtReplace;//ky tu bi thay doi
private String _txtCharReplace;//ky tu thay doi

    public String getTxtCharReplace() {
        return _txtCharReplace;
    }

    public void setTxtCharReplace(String _txtCharReplace) {
        this._txtCharReplace = _txtCharReplace;
    }

    public String getTxtReplace() {
        return _txtReplace;
    }

    public void setTxtReplace(String _txtReplace) {
        this._txtReplace = _txtReplace;
    }
    public StringReplace() {
    }

    public String getTxtFrom() {
        return _txtFrom;
    }

    public void setTxtFrom(String _txtFrom) {
        this._txtFrom = _txtFrom;
    }

    public String getTxtResult() {
        return _txtResult;
    }

    public void setTxtResult(String _txtResult) {
        this._txtResult = _txtResult;
    }

    public String doReplace(){
        setTxtResult(getTxtFrom().replaceAll(getTxtReplace(), getTxtCharReplace()));
        return _txtResult;
    }
}
