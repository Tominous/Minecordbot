/*
 * Copyright (c) 2004, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package shade.sun.jvmstat.perfdata.monitor;

import shade.sun.jvmstat.monitor.MonitorException;

/**
 * Exception indicating that an unexpected type was encountered for the type field of a PerfData entry in a HotSpot PerfData buffer.
 *
 * @author Brian Doherty
 * @since 1.5
 */
@SuppressWarnings("serial")
public class MonitorTypeException extends MonitorException {

	/**
	 * Constructs a <code>MonitorTypeException</code> with <code>
	 * null </code> as its error detail message.
	 */
	public MonitorTypeException() {
		super();
	}

	/**
	 * Constructs an <code>MonitorTypeException</code> with the specified detail message. The error message string <code>s</code> can later be retrieved by the <code>{@link Throwable#getMessage}</code> method of class <code>java.lang.Throwable</code>.
	 *
	 * @param s
	 *            the detail message.
	 */
	public MonitorTypeException(String s) {
		super(s);
	}
}