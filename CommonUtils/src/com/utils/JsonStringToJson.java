package com.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonStringToJson {

	public static void main(String[] args) throws IOException {
//		String jsonString = "{\"version\":\"1.0\",\"skillId\":\"amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6\",\"skillTypes\":[\"CUSTOM\"],\"multinationalPublishingInfo\":{\"publishingInfoByLocale\":{\"en_GB\":{\"locale\":\"en_GB\",\"name\":\"Alexa Diff Loca\",\"summary\":\"Full\",\"description\":\"Full\",\"examplePhrases\":[\"Alexa what is my favorite coloe\"]},\"en_US\":{\"locale\":\"en_US\",\"name\":\"AlexaDiffLocaleTest\",\"summary\":\"full\",\"description\":\"full\",\"examplePhrases\":[\"Alexa what is my favorite color\"]}}},\"customInteractionModelInfo\":{\"invocationNames\":{\"localizedInvocationName\":{\"en_GB\":\"favoritecolorfour\",\"en_US\":\"favoritecolorthree\"}},\"endpoints\":{\"regionalizedEndpoint\":{\"NA\":{\"region\":\"NA\",\"type\":\"LAMBDA\",\"url\":\"arn:aws:lambda:us-east-1:476424756474:function:colour_check\",\"isDefaultRegion\":true}}},\"sampleUtterances\":{\"localizedSampleUtterances\":{\"en_GB\":{\"locale\":\"en_GB\",\"s3Artifact\":{\"s3Key\":\"assets/amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6/0/slu/en_GB-ce00916b-6237-4082-a16b-9d8f0d785b46-sluSampleUtterances.plain\",\"s3Bucket\":\"alexa-content-ingestion-prod\",\"s3Url\":\"http://s3.amazonaws.com/alexa-content-ingestion-prod/assets/amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6/0/slu/en_GB-ce00916b-6237-4082-a16b-9d8f0d785b46-sluSampleUtterances.plain\"}},\"en_US\":{\"locale\":\"en_US\",\"s3Artifact\":{\"s3Key\":\"assets/amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6/0/slu/en_US-aacbdafa-8774-43aa-97fd-9655c82b1899-sluSampleUtterances.plain\",\"s3Bucket\":\"alexa-content-ingestion-prod\",\"s3Url\":\"http://s3.amazonaws.com/alexa-content-ingestion-prod/assets/amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6/0/slu/en_US-aacbdafa-8774-43aa-97fd-9655c82b1899-sluSampleUtterances.plain\"}}}},\"intentSchema\":{\"localizedIntentSchema\":{\"en_GB\":{\"locale\":\"en_GB\",\"s3Artifact\":{\"s3Key\":\"assets/amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6/0/slu/en_GB-1cf0f8f9-72ad-4233-816f-cbdd39e8aff7-sluIntentSchema.json\",\"s3Bucket\":\"alexa-content-ingestion-prod\",\"s3Url\":\"http://s3.amazonaws.com/alexa-content-ingestion-prod/assets/amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6/0/slu/en_GB-1cf0f8f9-72ad-4233-816f-cbdd39e8aff7-sluIntentSchema.json\"}},\"en_US\":{\"locale\":\"en_US\",\"s3Artifact\":{\"s3Key\":\"assets/amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6/0/slu/en_US-f4375b9d-3f38-45f7-9cfa-1ede60170923-sluIntentSchema.json\",\"s3Bucket\":\"alexa-content-ingestion-prod\",\"s3Url\":\"http://s3.amazonaws.com/alexa-content-ingestion-prod/assets/amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6/0/slu/en_US-f4375b9d-3f38-45f7-9cfa-1ede60170923-sluIntentSchema.json\"}}}},\"customSlotTypes\":{\"localizedCustomSlotTypes\":{\"en_GB\":{\"locale\":\"en_GB\",\"customSlotList\":[{\"customSlotName\":\"sluSlotTypes_2016_08_30_08_1613743622.json\",\"customSlotS3Artifact\":{\"s3Key\":\"assets/amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6/0/slu/en_GB-e0152fbe-78fd-435c-96d4-fb9d1c33085b-sluSlotTypes.json\",\"s3Bucket\":\"alexa-content-ingestion-prod\",\"s3Url\":\"http://s3.amazonaws.com/alexa-content-ingestion-prod/assets/amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6/0/slu/en_GB-e0152fbe-78fd-435c-96d4-fb9d1c33085b-sluSlotTypes.json\"}}]},\"en_US\":{\"locale\":\"en_US\",\"customSlotList\":[{\"customSlotName\":\"sluSlotTypes_2016_08_30_08_556571393.json\",\"customSlotS3Artifact\":{\"s3Key\":\"assets/amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6/0/slu/en_US-e5e1ab16-cdc5-4b1c-8b30-0c98895633e8-sluSlotTypes.json\",\"s3Bucket\":\"alexa-content-ingestion-prod\",\"s3Url\":\"http://s3.amazonaws.com/alexa-content-ingestion-prod/assets/amzn1.ask.skill.21c54dff-2a19-4634-baa3-8e669e5997f6/0/slu/en_US-e5e1ab16-cdc5-4b1c-8b30-0c98895633e8-sluSlotTypes.json\"}}]}}}},\"accountLinkingInfo\":{\"type\":\"IMPLICIT\",\"partnerId\":\"gIlpCjzQMniCNZ4hQP2K779eU\",\"domains\":[],\"supportsLinking\":true}}";

		File inputFile = new File("Skill_Input_Doc.txt");
		FileReader reader = new FileReader(inputFile);
		BufferedReader bufferReader = new BufferedReader(reader);
		StringBuilder sb = new StringBuilder();
		String s = null;
		while ((s = bufferReader.readLine()) != null) {
			sb.append(s);
		}
		bufferReader.close();
		String jsonString = sb.toString();
		// Converting from  \" => " in the original string as JSONObject constructor can't understand \". 
		jsonString = jsonString.replaceAll("\\\\\"", "\"");

		//created json Object
		JSONObject json = new JSONObject(jsonString);
		// JSONArray json = new JSONArray(jsonString);

		FileWriter file = null;
		try {
			file = new FileWriter(new File("SKILL_Json_Output.json"));
			// JsonObject pretty print and write to a file
			file.write(json.toString(4));
		} catch (JSONException ex) {
			ex.printStackTrace();
		} finally {
			if (file != null) {
				file.close();
			}
		}
	}
}
