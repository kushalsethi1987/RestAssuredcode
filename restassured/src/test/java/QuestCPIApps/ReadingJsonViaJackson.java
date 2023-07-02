package QuestCPIApps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadingJsonViaJackson {

	public static void main(String... a) throws IOException, NullPointerException

	{
		byte[] jsondata = Files
				.readAllBytes(Paths.get("G:\\RestAssured\\restassuredproject\\target\\QuestCPIApps.Json"));
		ObjectMapper mapper = new ObjectMapper();
		QuestCPIApps[] value = mapper.readValue(jsondata, QuestCPIApps[].class);
		// Bsx_version_min_max_range_list[]
		// value1=mapper.readValue(jsondata,Bsx_version_min_max_range_list[].class);

		for (int i = 0; i < value.length; i++) {
			System.out.println("Value of Action is : " + value[i].getAction());

			try {
				for (int j = 0; j < value[i].getBsx_version_min_max_range_list().length; j++) {
					// System.out.println("Value of Action is :
					// "+value[i].getAction() );
					// System.out.println(value[i].getBsx_version_min_max_range_list().length);
					System.out.println("Value of Max Version is : "
							+ value[i].getBsx_version_min_max_range_list()[j].getMax_version());
				}
			} catch (NullPointerException E) {
				// System.out.println("Something went wrong");
			}
		}
	}

}
