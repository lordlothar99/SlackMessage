// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package slackmessage.proxies;

public enum Enum_SlackApp_IsValid
{
	isvalid(new java.lang.String[][] { new java.lang.String[] { "en_US", "Is valid" }, new java.lang.String[] { "nl_NL", "Is correct" } }),
	isnotvalid(new java.lang.String[][] { new java.lang.String[] { "en_US", "Is not valid" }, new java.lang.String[] { "nl_NL", "Niet correct" } }),
	autocreated(new java.lang.String[][] { new java.lang.String[] { "en_US", "Is not valid (auto created)" }, new java.lang.String[] { "nl_NL", "Niet correct (automatisch toegevoegd)" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Enum_SlackApp_IsValid(java.lang.String[][] captionStrings)
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
