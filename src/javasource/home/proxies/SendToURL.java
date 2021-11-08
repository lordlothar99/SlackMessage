// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package home.proxies;

public class SendToURL
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sendToURLMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Home.SendToURL";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NotificationText("NotificationText"),
		MessageText("MessageText"),
		URL("URL");

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

	public SendToURL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Home.SendToURL"));
	}

	protected SendToURL(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sendToURLMendixObject)
	{
		if (sendToURLMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Home.SendToURL", sendToURLMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Home.SendToURL");

		this.sendToURLMendixObject = sendToURLMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SendToURL.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static home.proxies.SendToURL initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return home.proxies.SendToURL.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static home.proxies.SendToURL initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new home.proxies.SendToURL(context, mendixObject);
	}

	public static home.proxies.SendToURL load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return home.proxies.SendToURL.initialize(context, mendixObject);
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
	 * @return value of NotificationText
	 */
	public final java.lang.String getNotificationText()
	{
		return getNotificationText(getContext());
	}

	/**
	 * @param context
	 * @return value of NotificationText
	 */
	public final java.lang.String getNotificationText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NotificationText.toString());
	}

	/**
	 * Set value of NotificationText
	 * @param notificationtext
	 */
	public final void setNotificationText(java.lang.String notificationtext)
	{
		setNotificationText(getContext(), notificationtext);
	}

	/**
	 * Set value of NotificationText
	 * @param context
	 * @param notificationtext
	 */
	public final void setNotificationText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String notificationtext)
	{
		getMendixObject().setValue(context, MemberNames.NotificationText.toString(), notificationtext);
	}

	/**
	 * @return value of MessageText
	 */
	public final java.lang.String getMessageText()
	{
		return getMessageText(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageText
	 */
	public final java.lang.String getMessageText(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MessageText.toString());
	}

	/**
	 * Set value of MessageText
	 * @param messagetext
	 */
	public final void setMessageText(java.lang.String messagetext)
	{
		setMessageText(getContext(), messagetext);
	}

	/**
	 * Set value of MessageText
	 * @param context
	 * @param messagetext
	 */
	public final void setMessageText(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String messagetext)
	{
		getMendixObject().setValue(context, MemberNames.MessageText.toString(), messagetext);
	}

	/**
	 * @return value of URL
	 */
	public final java.lang.String getURL()
	{
		return getURL(getContext());
	}

	/**
	 * @param context
	 * @return value of URL
	 */
	public final java.lang.String getURL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.URL.toString());
	}

	/**
	 * Set value of URL
	 * @param url
	 */
	public final void setURL(java.lang.String url)
	{
		setURL(getContext(), url);
	}

	/**
	 * Set value of URL
	 * @param context
	 * @param url
	 */
	public final void setURL(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url)
	{
		getMendixObject().setValue(context, MemberNames.URL.toString(), url);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sendToURLMendixObject;
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
			final home.proxies.SendToURL that = (home.proxies.SendToURL) obj;
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
		return "Home.SendToURL";
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
