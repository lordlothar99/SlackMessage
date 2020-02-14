// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package home.proxies;

public enum EnumTestMessage_SendBy
{
	Key(new java.lang.String[][] { new java.lang.String[] { "en_US", "Key" }, new java.lang.String[] { "nl_NL", "Sleutel" } }),
	URL(new java.lang.String[][] { new java.lang.String[] { "en_US", "URL" }, new java.lang.String[] { "nl_NL", "URL" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private EnumTestMessage_SendBy(java.lang.String[][] captionStrings)
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
