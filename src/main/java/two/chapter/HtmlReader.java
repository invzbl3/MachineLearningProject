/*package two.chapter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HtmlReader {

    InputStreamReader isr = new
   InputStreamReader((InputStream)
            connection.getContent());
    BufferedReader br = new
            BufferedReader(isr);
    StringBuilder buffer = new
            StringBuilder();
            String line;
            do {
              line = br.readLine();
              buffer.append(line + "\n");

            } while (line != null);
            out.println(buffer.toString());
    )
}*/

/**
 * The abbreviated output is shown here:
 *
 * Response Code: 200
 * Content Type: text/html;
 * charset=UTF-8
 * Content Length: -1
 * <!DOCTYPE html>
 * <html lang ="en" dir="ltr"
 * <class="client-nojs">
 * <head>
 * <meta charset="UTF-8"/>
 * <title>Data science - Wikipedia, the
 * free encyclopedia</title>
 * <script>document.documentElement.cla
 * ssName =
 * ...
 * "wgHostname":"mw1251"});});</script>
 * </body>
 * </html>
 */