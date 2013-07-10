/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package translateonwin;

import java.net.Socket;
import javax.swing.JTextArea;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;

/**
 *
 * @author Wise-SW
 */
public class Translator implements Runnable {
    private String from, to;
    private String address;
    private String text;
    private String outputText = "";
    private JTextArea txtTranslated;
    public static final String TARGET_HTTPS_SERVER = "translate.google.com.vn";
    public static final int TARGET_HTTPS_PORT = 443;
    JSONArray array;
    
    public Translator(String text, String fromLang, String toLang, JTextArea jTextArea) {
        this.txtTranslated = jTextArea;
        this.text = text;
        this.from = fromLang;
        this.to = toLang;
    }

    @Override
    public void run() {
        try {
            String[] count = text.split("\n");
            URI uri = new URI(null, null, text, null);
            address = String.format("/translate_a/t?client=t&hl=%s&sl=%s&tl=%s&ie=UTF-8&oe=UTF-8&multires=1&oc=1&otf=1&ssel=0&tsel=0&sc=1&q=%s", to, from, to, uri.toString());
            Socket socket = SSLSocketFactory.getDefault().
                    createSocket(TARGET_HTTPS_SERVER, TARGET_HTTPS_PORT);
            Writer writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write("GET " + address + " HTTP/1.1\r\n");
            writer.write("Host: " + TARGET_HTTPS_SERVER + ":"
                    + TARGET_HTTPS_PORT + "\r\n");
            writer.write("Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n");
            writer.write("Accept-Language: vi-vn,vi;q=0.8,en-us;q=0.5,en;q=0.3\r\n");
            writer.write("User-Agent: Mozilla/5.0 (Windows NT 6.1; rv:20.0) Gecko/20100101 Firefox/20.0\r\n");
            writer.write("\r\n");
            writer.flush();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = null;
            while ((line = buffer.readLine()) != null) {
                if (line.startsWith("[") && line.endsWith("]")) {
                    array = new JSONArray(line);
                    break;
                }
            }
            for (int i = 0; i < count.length; i++) {
                outputText+=((JSONArray)((JSONArray) array.get(0)).get(i)).get(0).toString() ;
            }
            txtTranslated.setText(outputText);
        } catch (IOException ex) {
            Logger.getLogger(Translator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Translator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
