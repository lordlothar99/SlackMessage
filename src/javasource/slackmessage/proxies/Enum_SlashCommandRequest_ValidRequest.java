// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package slackmessage.proxies;

public enum Enum_SlashCommandRequest_ValidRequest
{
	ok(new java.lang.String[][] { new java.lang.String[] { "en_US", "Ok" }, new java.lang.String[] { "nl_NL", "Ok" } }),
	oksslcheck(new java.lang.String[][] { new java.lang.String[] { "en_US", "Ok SSL check" }, new java.lang.String[] { "nl_NL", "Ok SSL check" } }),
	invalid(new java.lang.String[][] { new java.lang.String[] { "en_US", "Invalid" } }),
	invalidsslcheck(new java.lang.String[][] { new java.lang.String[] { "en_US", "Invalid SSL check" } }),
	missingheaders(new java.lang.String[][] { new java.lang.String[] { "en_US", "Missing headers" } }),
	invalidtimestamp(new java.lang.String[][] { new java.lang.String[] { "en_US", "Invalid timestamp" } }),
	unknownsignature(new java.lang.String[][] { new java.lang.String[] { "en_US", "Unknown signature" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_SlashCommandRequest_ValidRequest(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
