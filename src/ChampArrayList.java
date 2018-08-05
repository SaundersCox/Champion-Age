import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class ChampArrayList {
	private ArrayList<Champion> champList = new ArrayList<>();
	private int size;

	public void update() throws Exception {

    	/* Look for <td style="text-align:l
    	 * data-sort-value="
    	 */
        URL url = new URL("http://leagueoflegends.wikia.com/wiki/List_of_champions");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(url.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            if (inputLine.length() > 23 && inputLine.substring(0, 23).equals("<td style=\"text-align:l")) {
            	System.out.println(inputLine);
			}

		in.close();
	}
}
