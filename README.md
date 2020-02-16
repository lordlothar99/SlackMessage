# SlackMessage

This module has a single purpose: send messages to Slack channels.

## Features

Its features are

* uses Slack Incoming Webhooks
* Incoming Webhook URLs are stored encrypted
* create messages with markdown markup or just plain text
* send messages to multiple channels in multiple workspaces
* message can be sent in the background not delaying your primary process
* no Java libraries that requires maintenance, just native Mendix
* Dutch and English languages are supported in the UI

## Installation

Download the module from the AppStore and add it to your project.

Add microflow `ASu_SlackMessage` to your app's AfterStartup microflow.

The module depends on AppStore module [CommunityCommons](https://appstore.home.mendix.com/link/app/170/).

## Constants

The module adds these constants to your app and adjust them when needed.

* `SlackMessage.AutoCreateIncomingWebhook` - Automatically create the requested webhook, marked invalid, to be completed later. Every used webhook should be defined and marked valid. But when an unknown webhook is used then it is added to be completed manually.
* `SlackMessage.SendEnabled` - By default messages are sent on test, acceptance and production systems. In case you want to disable sending messages on a specific system then set this constant to FALSE in the environment's configuration.
* `SlackMessage.SendEnabledInDev` - By default messages are not sent on development systems. This prevents messages being sent while developing an app. However when you want messages to be sent, change this constant value to TRUE in your project's profile.
* `SlackMessage.SlackRequestTimeout` - Slack web service request timeout in seconds.

This constant is added and you have to change it because the default value is unusable:

* `SlackMessage.EncryptionKey` - The encryption key used to encrypt sensitive data like the Incoming Webhook URL which does not need authentication. Its length should exactly be 16 characters (128 bit). By default this key is not set so you have to create your own secure key. It is advised to use a combination of uppercase and lowercase characters, digits and special characters.

This constant is added but you should not change it:

* `SlackMessage.EncryptionPrefix` - A string that indicates if a string is encrypted or not. Changing it might prevent you to upgrade in the future.

## Security

The module offers these two roles:

* `Administrator` - manage Webhooks
* `User` - the minimum needed for regular users

## Create Incoming Webhook(s) in Slack

First you have to create one or more Incoming Webhooks in Slack. You [can create an app](https://api.slack.com/messaging/webhooks) that adds the Webhook or add the [Incoming Webhook app](https://slack.com/apps/A0F7XDUAZ-incoming-webhooks) to your Slack workspace and configure it. Which method you prefer is up to you, however Slack seems to prefer the first. In the end you need a Webhook URL to use the module. Such URL looks like `https://hooks.slack.com/services/somestring/anotherstring/alongerstring`.

## Store Incoming Webhook(s) in your app

The module offers two methods of storing and using Incoming Webhook URLs:

1. create IncomingWebhook objects (provided by the module) where the URL is stored encrypted and in your microflows you refer to it using a unique key
2. store URLs using your own method and provide the clear text URL when sending messages

Which way is used to store the URLs in an app is not that important, pick what fits your app and requirements best. The convenience microflows described below support both.

### Store in entity IncomingWebhook

One way is to store URLs in entity `IncomingWebhook`. This allows the developer to store URLs **encrypted** and use multiple Incoming Webhooks in the app easily. The URLs are stored encrypted because they can be used without any means of authentication.

The entity has these attributes (all are required):

* `Label` - a descriptive human readable label
* `Key` - a sort unique key to be used in your microflows to find the right Webhook; only lowercase and uppercase characters, digits and underscores are allowed here
* `URL` - the Incoming Webhook URL

It is highly recommended to store the values for `Key` in an enumeration. This makes using them more consistent and prevents error by typos.

Add snippet `SN_Webhook` to a page to manage your Incoming Webhooks manually. Additionally you can use microflows `IncomingWebhook_Ensure` or `IncomingWebhook_Upsert` in for example the AfterStartup flow to add them to the database on app start automatically.

### Store using your own method

Another way is to store URLs using your own method and not use entity `IncomingWebhook` at all. For example the app uses just a single Incoming Webhook and its URL is stored in a constant. If encrypting the URL is less important then there is no need to create an `IncomingWebhook` object. The module provides microflows that can send messages to Slack based on a clear text URL.

## Create and send a single line message

The microflows `Message_CreateAndSendToWebhookKey` and `Message_CreateAndSendToWebhookURL` can be used to send a single line message to Slack and can be used as an example how to use all steps separately with multi line messages.

The first microflow expects an `IncomingWebhook` object with the specified `key` to be in the database. The second microflow accepts an Incoming Webhook URL as input.

The microflows have these parameters:

* `NotificationText` - the text to be shown in the OS notification, max 200 characters
* `NotificationTextType` - specify if the text markup is plain text or markdown
* `MessageText` - the text with the "real" message, max 3000 characters; when *empty* then it is skipped and the notification text is used
* `MessageTextType` - specify if the text markup is plain text or markdown
* `IncomingWebhookKey` or `IncomingWebhookURL` - the key or full URL of the Incoming Webhook to send the message to
* `SendAsync` - use TRUE (preferred) to send the message in a separate background thread or FALSE to send it in the same thread

More details about text markup are in the paragraphs below.

On failure check the log file for details.

## Create and send a multi-line message

You start a multi-line message by creating the basis of a message using microflow `Message_Initialize`. It requires a string that contains the text to be shown in the notification created by Slack. So this is not the message in the channel, but an OS notification telling that there is a message. [Markdown](https://api.slack.com/reference/surfaces/formatting) can be used in this message.

Next you add one or more lines to your message using microflow `Message_AddLine`. Also here [Markdown](https://api.slack.com/reference/surfaces/formatting) is supported.

An example of the text in such a line is below. The resulting message starts with `@here` which notifies all active users. Next it shows a large blue dot (emoji) and a text where the word `UP` is in **bold**.

```auto
<!here> :green_heart: all systems are *UP*
```

An easy way to find the name of an emoji is to create a message in Slack manually, add the desired emoji and use the presented string. The popup where you search for your emoji shows the string to use.

When you have created the message then you send it using microflow `Message_SendToWebhookKey` or `Message_SendToWebhookURL`, depending which method to store Incoming Webhook URLs you decided to use. They have these parameters:

* `Message` - the `Message` object you created
* `IncomingWebhookKey` or `IncomingWebhookURL` - the key or full URL of the Incoming Webhook to send the message to
* `SendAsync` - use TRUE (preferred) to send the message in a separate background thread or FALSE to send it in the same thread

On failure check the log file for details.

## Test creating and sending messages

[The GitHub repo](https://github.com/ppoetsma/SlackMessage) contains a Mendix model with features that can be used to test the module before adding it to your project. Snippet `SN_Webhook` has test features as well.

## Feedback

Please leave your feedback in [the GitHub repo](https://github.com/ppoetsma/SlackMessage/issues).
