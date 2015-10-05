package splunk;
//package Splunk;
//
//import java.util.*;
//import mme.foundation.PropertyManagerProps;
//import mme.foundation.jmsappender.*;
//import mme.foundation.properties.PropertyKey;
//import org.apache.log4j.MDC;
//import org.apache.log4j.spi.LoggingEvent;
//
//// Referenced classes of package mme.foundation.util: // StringUtil 
//
//public final class SplunkMessage implements SplunkLogRendering { /*
//																 * member class
//																 * not found
//																 */
//	class Wrapper {
//	} /* member class not found */
//
//	class SplunkErrorTypes {
//	} /* member class not found */
//
//	class SplunkKeys {
//	}
//
//	public transient SplunkMessage(string staticMessage, object keysAndValues[]) {
//		this.staticMessage = staticMessage;
//		this.keysAndValues = keysAndValues != null ? keysAndValues
//				: EmptyObjectArray;
//	}
//
//	private list getAdditionalKeysAndValues() {
//		list list;
//		if (additionalKeysAndValues == null) {
//			list = new arraylist(8);
//			if (keysAndValues.length > 0)
//				list.addAll(arrays.asList(keysAndValues));
//			additionalKeysAndValues = list;
//		} else {
//			list = additionalKeysAndValues;
//		}
//		return list;
//	}
//
//	public SplunkMessage addKeyAndValue(object key, object value) {
//		list list = getAdditionalKeysAndValues();
//		list.add(key);
//		list.add(value);
//		return this;
//	}
//
//	public void addKeysAndValues(map map) {
//		list list = getAdditionalKeysAndValues();
//		java.util.map.entry mapEntry;
//		for (iterator i$ = map.entrySet().iterator(); i$.hasNext(); list
//				.add(mapEntry.getValue())) {
//			mapEntry = (java.util.map.entry) i$.next();
//			list.add(mapEntry.getKey());
//		}
//	}
//
//	public void addKeysAndValues(list keyValues) {
//		list list = getAdditionalKeysAndValues();
//		collections.addAll(list, keyValues.toArray());
//	}
//
//	public long getTimeStamp() {
//		return timestamp;
//	}
//
//	public string getStaticMessage() {
//		return staticMessage;
//	}
//
//	public void setStaticMessage(string staticMessage) {
//		this.staticMessage = staticMessage;
//	}
//
//	public object[] getKeysAndValues() {
//		object objects[];
//		if (additionalKeysAndValues != null)
//			objects = additionalKeysAndValues.toArray();
//		else
//			objects = keysAndValues;
//		return objects;
//	}
//
//	public string toString() {
//		StringBuilder stringBuilder = new StringBuilder(1024);
//		string delimiter = " ";
//		formatBasicMessage(stringBuilder, " ");
//		splunkMessage_addMDCValues(stringBuilder, " ");
//		return stringBuilder.toString();
//	}
//
//	/** * @deprecated Method splunkMessage_addMDCValues is deprecated */
//	public static void splunkMessage_addMDCValues(StringBuilder stringBuilder,
//			string delimiter) {
//		map mdcContext = MDC.getContext();
//		if (mdcContext != null) {
//			iterator i$ = mdcContext.entrySet().iterator();
//			do {
//				if (!i$.hasNext())
//					break;
//				java.util.map.entry mdcEntry = (java.util.map.entry) i$.next();
//				string key = (string) mdcEntry.getKey();
//				boolean isExcluded = key
//						.equals(mme.foundation.jmsappender.KeyValueLoggingUtil.BaseSplunkKeys.hwType
//								.toString())
//						|| key.equals(mme.foundation.jmsappender.KeyValueLoggingUtil.BaseSplunkKeys.userId
//								.toString())
//						|| key.equals(mme.foundation.jmsappender.KeyValueLoggingUtil.BaseSplunkKeys.actionKpi
//								.toString())
//						|| key.equals("REQUEST_UUID")
//						|| key.equals("uuid");
//				if (!isExcluded) {
//					object value = mdcEntry.getValue();
//					KeyValueLoggingUtil.appendAttributeString(stringBuilder,
//							delimiter, key, StringUtil.valueOf(value), true);
//				}
//			} while (true);
//		}
//	}
//
//	public string toStringBasic() {
//		return toStringBasic(" ");
//	}
//
//	public string toStringBasic(string delimiter) {
//		StringBuilder stringBuilder = new StringBuilder(1024);
//		formatBasicMessage(stringBuilder, delimiter);
//		return stringBuilder.toString();
//	}
//
//	private void formatBasicMessage(StringBuilder stringBuilder,
//			string delimiter) {
//		stringBuilder.append(staticMessage);
//		object keysAndValuesArray[] = getKeysAndValues();
//		if (keysAndValuesArray.length > 0)
//			KeyValueLoggingUtil.appendKeysAndValues(stringBuilder, delimiter,
//					keysAndValuesArray);
//	}
//
//	public void appendKeysAndValues(StringBuilder stringBuilder,
//			string delimiter) {
//		object keysAndValuesArray[] = getKeysAndValues();
//		KeyValueLoggingUtil.appendKeysAndValues(stringBuilder, delimiter,
//				keysAndValuesArray);
//	}
//
//	public string renderSplunkLog(LoggingEvent loggingEvent) {
//		string delimiter = (string) PropertyManagerProps.VerticalLoggingDelimiter
//				.getValue();
//		StringBuilder stringBuilder = new StringBuilder(4096);
//		KeyValueVerticalLayout.appendLogSeparator(stringBuilder, delimiter);
//		string message = getStaticMessage();
//		KeyValueLoggingUtil
//				.appendAttribute(
//						stringBuilder,
//						delimiter,
//						mme.foundation.jmsappender.KeyValueLoggingUtil.BaseSplunkKeys.title,
//						message, false);
//		appendKeysAndValues(stringBuilder, delimiter);
//		KeyValueVerticalLayout.appendAppLevelValues(stringBuilder, delimiter,
//				loggingEvent);
//		KeyValueLoggingUtil.appendThrowableInformation(stringBuilder,
//				delimiter, loggingEvent);
//		stringBuilder.append(delimiter);
//		stringBuilder.append("\n");
//		return stringBuilder.toString();
//	}
//
//	private final long timestamp = system.currentTimeMillis();
//	private string staticMessage;
//	private final object keysAndValues[];
//	private list additionalKeysAndValues;
//	private static final object EmptyObjectArray[] = new object[0];
//}
