// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package slackmessage.proxies;

public class SendToSlackHelper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sendToSlackHelperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SlackMessage.SendToSlackHelper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		EncryptedURL("EncryptedURL"),
		MessageJSON("MessageJSON"),
		SendAsync("SendAsync"),
		Log("Log");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SendToSlackHelper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SlackMessage.SendToSlackHelper"));
	}

	protected SendToSlackHelper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sendToSlackHelperMendixObject)
	{
		if (sendToSlackHelperMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SlackMessage.SendToSlackHelper", sendToSlackHelperMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SlackMessage.SendToSlackHelper");

		this.sendToSlackHelperMendixObject = sendToSlackHelperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SendToSlackHelper.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static slackmessage.proxies.SendToSlackHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return slackmessage.proxies.SendToSlackHelper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static slackmessage.proxies.SendToSlackHelper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new slackmessage.proxies.SendToSlackHelper(context, mendixObject);
	}

	public static slackmessage.proxies.SendToSlackHelper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return slackmessage.proxies.SendToSlackHelper.initialize(context, mendixObject);
	}

	public static java.util.List<slackmessage.proxies.SendToSlackHelper> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<slackmessage.proxies.SendToSlackHelper> result = new java.util.ArrayList<slackmessage.proxies.SendToSlackHelper>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SlackMessage.SendToSlackHelper" + xpathConstraint))
			result.add(slackmessage.proxies.SendToSlackHelper.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of EncryptedURL
	 */
	public final java.lang.String getEncryptedURL()
	{
		return getEncryptedURL(getContext());
	}

	/**
	 * @param context
	 * @return value of EncryptedURL
	 */
	public final java.lang.String getEncryptedURL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EncryptedURL.toString());
	}

	/**
	 * Set value of EncryptedURL
	 * @param encryptedurl
	 */
	public final void setEncryptedURL(java.lang.String encryptedurl)
	{
		setEncryptedURL(getContext(), encryptedurl);
	}

	/**
	 * Set value of EncryptedURL
	 * @param context
	 * @param encryptedurl
	 */
	public final void setEncryptedURL(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String encryptedurl)
	{
		getMendixObject().setValue(context, MemberNames.EncryptedURL.toString(), encryptedurl);
	}

	/**
	 * @return value of MessageJSON
	 */
	public final java.lang.String getMessageJSON()
	{
		return getMessageJSON(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageJSON
	 */
	public final java.lang.String getMessageJSON(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MessageJSON.toString());
	}

	/**
	 * Set value of MessageJSON
	 * @param messagejson
	 */
	public final void setMessageJSON(java.lang.String messagejson)
	{
		setMessageJSON(getContext(), messagejson);
	}

	/**
	 * Set value of MessageJSON
	 * @param context
	 * @param messagejson
	 */
	public final void setMessageJSON(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String messagejson)
	{
		getMendixObject().setValue(context, MemberNames.MessageJSON.toString(), messagejson);
	}

	/**
	 * @return value of SendAsync
	 */
	public final java.lang.Boolean getSendAsync()
	{
		return getSendAsync(getContext());
	}

	/**
	 * @param context
	 * @return value of SendAsync
	 */
	public final java.lang.Boolean getSendAsync(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.SendAsync.toString());
	}

	/**
	 * Set value of SendAsync
	 * @param sendasync
	 */
	public final void setSendAsync(java.lang.Boolean sendasync)
	{
		setSendAsync(getContext(), sendasync);
	}

	/**
	 * Set value of SendAsync
	 * @param context
	 * @param sendasync
	 */
	public final void setSendAsync(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean sendasync)
	{
		getMendixObject().setValue(context, MemberNames.SendAsync.toString(), sendasync);
	}

	/**
	 * @return value of Log
	 */
	public final java.lang.String getLog()
	{
		return getLog(getContext());
	}

	/**
	 * @param context
	 * @return value of Log
	 */
	public final java.lang.String getLog(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Log.toString());
	}

	/**
	 * Set value of Log
	 * @param log
	 */
	public final void setLog(java.lang.String log)
	{
		setLog(getContext(), log);
	}

	/**
	 * Set value of Log
	 * @param context
	 * @param log
	 */
	public final void setLog(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String log)
	{
		getMendixObject().setValue(context, MemberNames.Log.toString(), log);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sendToSlackHelperMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final slackmessage.proxies.SendToSlackHelper that = (slackmessage.proxies.SendToSlackHelper) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "SlackMessage.SendToSlackHelper";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
