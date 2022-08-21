// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package slackmessage.actions;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.thirdparty.org.json.JSONObject;
import com.mendix.webui.CustomJavaAction;

/**
 * The request body is a kist of key value pairs. This Java action converts it into a JSON string. Comvert the JSON string using IM_SlashCommandRequest to a SlashCommandRequest object.
 */
public class JA_SlashCommandRequest_Parse extends CustomJavaAction<java.lang.String>
{
	private java.lang.String RequestBody;

	public JA_SlashCommandRequest_Parse(IContext context, java.lang.String RequestBody)
	{
		super(context);
		this.RequestBody = RequestBody;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		
		// The incoming RequestBody is a string with key=value pairs concatenated by & (ampersand):
		//   token=WiFq4UsDPGsVy3MNB3fhiFlO&team_id=TTG0UAP1C&team_domain=myslackdomain&channel_id=CTFL19BHV&
		//   channel_name=slackmessagedemo&user_id=UX40VF9AN&user_name=mytestuser&command=%2Fhealth&
		//   text=toall&response_url=https%3A%2F%2Fhooks.slack.com%2Fcommands%2FTTG0UAA1C%2F942538100899%2FrUhmXsl2tEDplSAC1xqyNyTa&
		//   trigger_id=956225663638.934048363046.2869fb4203d321d352cbd4a4ad5082c4
		//
		// Approach
		// 1. convert the string to an array of key=value strings
		// 2. loop over the array and put the key=value strings into a map
		// 3. convert the map to a JSON string
		// 4. return the JSON string
		
		JSONObject json = new JSONObject();
		
		String[] requestParts = this.RequestBody.split("&");
		for (String requestPart : requestParts) {
			String[] keyValue = requestPart.split("=");

			// Cases:
			//   key=value -> correct and expected
			//   key=      -> correct and expected, a key with a null value
			//   value=    -> incorrect but hard to detect without hard coding all keys here so accepted case
			//   =         -> just skip it, totally useless
			if(keyValue.length == 2)
				json.put(keyValue[0], URLDecoder.decode(keyValue[1], StandardCharsets.UTF_8.toString()));
			else if(keyValue.length == 1)
				json.put(keyValue[0], JSONObject.NULL);
		}

		return json.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "JA_SlashCommandRequest_Parse";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}