/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2015, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package ch.qos.logback.core;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CoreConstants {

    final public static String DISABLE_SERVLET_CONTAINER_INITIALIZER_KEY = "logbackDisableServletContainerInitializer";
    final public static String STATUS_LISTENER_CLASS_KEY = "logback.statusListenerClass";
    final public static String SYSOUT = "SYSOUT";

    final public static String STDOUT = "STDOUT";

    /**
     * Number of idle threads to retain in a context's executor service.
     */
    public static final int CORE_POOL_SIZE = 4;

    // In Java 21 and later the actual threads are assumed to be virtual
    public static final int SCHEDULED_EXECUTOR_POOL_SIZE = 4;

    /**
     * Maximum number of threads to allow in a context's executor service.
     * @deprecated no longer used
     *
     */
    public static final int MAX_POOL_SIZE = 32;

    // Note that the line.separator property can be looked up even by
    // applets.
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");
    public static final int LINE_SEPARATOR_LEN = LINE_SEPARATOR.length();

    public static final String CODES_URL = "https://logback.qos.ch/codes.html";
    public static final String MANUAL_URL_PREFIX = "https://logback.qos.ch/manual/";
    public static final String MORE_INFO_PREFIX = "For more information, please visit ";

    /**
     * The default context name.
     */
    public static final String DEFAULT_CONTEXT_NAME = "default";

    /**
     * Customized pattern conversion rules are stored under this key in the
     * {@link Context} object store.
     *
     * @since 1.5.14
     */
    public static final String PATTERN_RULE_REGISTRY_FOR_SUPPLIERS = "PATTERN_RULE_REGISTRY_FOR_SUPPLIERS";

    /**
     * Customized pattern conversion rules are stored under this key in the
     * {@link Context} object store.
     */
    public static final String PATTERN_RULE_REGISTRY = "PATTERN_RULE_REGISTRY";



    public static final String ISO8601_STR = "ISO8601";
    public static final String ISO8601_PATTERN = "yyyy-MM-dd HH:mm:ss,SSS";

    /**
     * Keyword for setting a strict ISO8601 pattern which includes 'T' between the date and the time
     *
     * @since 1.5.7
     */
    public static final String STRICT_STR = "STRICT";
    /**
     * Strict ISO8601 pattern which includes 'T' between the date and the time
     * @since 15.7
     */
    public static final String STRICT_ISO8601_PATTERN = "yyyy-MM-dd'T'HH:mm:ss,SSS";


    public static final String FILE_TIMESTAMP_PATTERN = "yyyy-MM-dd'T'HHmm";
    public static final String DAILY_DATE_PATTERN = "yyyy-MM-dd";

    /**
     * Time format used in Common Log Format
     */
    public static final String CLF_DATE_PATTERN = "dd/MMM/yyyy:HH:mm:ss Z";

    /**
     * The key used in locating the evaluator map in context's object map.
     */
    public static final String EVALUATOR_MAP = "EVALUATOR_MAP";

    /**
     * Key used to locate a map Files used by FileAppender instances in context's
     * object map.
     * 
     * Said map consists of entries of the type (appender name, File option)
     */
    public static final String FA_FILENAME_COLLISION_MAP = "FA_FILENAMES_MAP";

    /**
     * Key used to locate a collision map for RollingFileAppender instances in
     * context's object map.
     * 
     * The collision map consists of entities of the type (appender name,
     * FileNamePattern option)
     */
    public static final String RFA_FILENAME_PATTERN_COLLISION_MAP = "RFA_FILENAME_PATTERN_COLLISION_MAP";

    /**
     * By convention, we assume that the static method named "valueOf" taking a
     * string argument can restore a given object from its string representation.
     */
    public static final String VALUE_OF = "valueOf";

    /**
     * An empty string.
     */
    public static final String EMPTY_STRING = "";

    /**
     * String value returned in case data is not available.
     *
     * For example, when caller information is not available this constant is used for file name,
     * method name, etc.
     */
    public static final String NA = "?";

    /**
     * An empty string array.
     */
    public static final String[] EMPTY_STRING_ARRAY = new String[] {};

    public static final Charset UTF_8_CHARSET = StandardCharsets.UTF_8;

    /**
     * An empty Class array.
     */
    public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[] {};
    public static final String CAUSED_BY = "Caused by: ";
    public static final String SUPPRESSED = "Suppressed: ";
    public static final String WRAPPED_BY = "Wrapped by: ";

    public static final char PERCENT_CHAR = '%';
    public static final char LEFT_PARENTHESIS_CHAR = '(';
    public static final char RIGHT_PARENTHESIS_CHAR = ')';

    public static final char ESCAPE_CHAR = '\\';
    public static final char CURLY_LEFT = '{';
    public static final char CURLY_RIGHT = '}';
    public static final char COMMA_CHAR = ',';
    public static final char DOUBLE_QUOTE_CHAR = '"';
    public static final char SINGLE_QUOTE_CHAR = '\'';
    public static final char COLON_CHAR = ':';
    public static final char DASH_CHAR = '-';
    public static final char EQUALS_CHAR = '=';

    public static final String DEFAULT_VALUE_SEPARATOR = ":-";

    public static final String NULL_STR = "null";
    /**
     * Number of rows before in an HTML table before, we close the table and create
     * a new one
     */
    public static final int TABLE_ROW_LIMIT = 10000;

    // reset the ObjectOutputStream every OOS_RESET_FREQUENCY calls
    // this avoids serious memory leaks
    public static final int OOS_RESET_FREQUENCY = 70;

    // See https://jakarta.ee/specifications/platform/8/platform-spec-8.html#a616
    // there are the java:comp, java:module, java:app, java:global namespaces
    public static final String JNDI_JAVA_NAMESPACE = "java:";

    // the max number of times an error should be reported
    public static final int MAX_ERROR_COUNT = 4;

    public static final char DOT = '.';
    public static final char TAB = '\t';
    public static final char DOLLAR = '$';

    public static final String SEE_FNP_NOT_SET = "See also " + CODES_URL + "#tbr_fnp_not_set";
    public static final String SEE_MISSING_INTEGER_TOKEN = "See also " + CODES_URL + "#sat_missing_integer_token";

    public static final String CONFIGURATION_WATCH_LIST = "CONFIGURATION_WATCH_LIST";
    public static final String CONFIGURATION_WATCH_LIST_RESET_X = "CONFIGURATION_WATCH_LIST_RESET";

    public static final String SAFE_JORAN_CONFIGURATION = "SAFE_JORAN_CONFIGURATION";
    public static final String XML_PARSING = "XML_PARSING";

    // Context Object name for the shutdown hook
    public static final String SHUTDOWN_HOOK_THREAD = "SHUTDOWN_HOOK";

    /**
     * The key under which the local host name is registered in the logger context.
     */
    public static final String HOSTNAME_KEY = "HOSTNAME";

    public static final String UNKNOWN_LOCALHOST = "UNKNOWN_LOCALHOST";

    /**
     * The key under which the current context name is registered in the logger
     * context.
     */
    public static final String CONTEXT_NAME_KEY = "CONTEXT_NAME";

    public static final int BYTES_PER_INT = 4;
    public static final long MILLIS_IN_ONE_SECOND = 1000;
    public static final long MILLIS_IN_ONE_MINUTE = MILLIS_IN_ONE_SECOND * 60;
    public static final long MILLIS_IN_ONE_HOUR = MILLIS_IN_ONE_MINUTE * 60;
    public static final long MILLIS_IN_ONE_DAY = MILLIS_IN_ONE_HOUR * 24;
    public static final long MILLIS_IN_ONE_WEEK = MILLIS_IN_ONE_DAY * 7;

    /**
     * The number of seconds to wait for compression jobs to finish.
     */
    public static final int SECONDS_TO_WAIT_FOR_COMPRESSION_JOBS = 30;

    public static final String CONTEXT_SCOPE_VALUE = "context";

    public static final String RESET_MSG_PREFIX = "Will reset and reconfigure context ";

    public static final String JNDI_COMP_PREFIX = "java:comp/env";

    public static final String UNDEFINED_PROPERTY_SUFFIX = "_IS_UNDEFINED";

    public static final String LEFT_ACCOLADE = new String(new char[] { CURLY_LEFT });
    public static final String RIGHT_ACCOLADE = new String(new char[] { CURLY_RIGHT });
    public static final long UNBOUNDED_TOTAL_SIZE_CAP = 0;

    /**
     * If Rolling
     */
    public static final int UNBOUNDED_HISTORY = 0;
    
    /**
     * Replaced by {@link CoreConstants#UNBOUNDED_HISTORY} with the same identical value.

     * @deprecated
     * @see #UNBOUNDED_HISTORY
     */
    public static final int UNBOUND_HISTORY = UNBOUNDED_HISTORY;
    
    //public static final String RECONFIGURE_ON_CHANGE_TASK = "RECONFIGURE_ON_CHANGE_TASK";
    public static final String SIZE_AND_TIME_BASED_FNATP_IS_DEPRECATED = "SizeAndTimeBasedFileNamingAndTriggeringPolicy is deprecated. Use SizeAndTimeBasedRollingPolicy instead";

    public static final char JSON_LINE_SEPARATOR = '\n';
    final public static String MODEL_CONFIG_FILE_EXTENSION = ".scmo";
    /**
     * since 1.5.8
     */
    final public static String PROPERTIES_FILE_EXTENSION = ".properties";
    public static final String LOGBACK_CORE_VERSION_MESSAGE = "This is logback-core version ";
}
