package com.likya.tlos.utils;

import com.likya.tlos.TlosServer;

public class ExceptionUtils {

	public static void sendToLoj4j(Throwable t) {
		TlosServer.getLogger().error(t.toString());
		for (StackTraceElement stackTraceElement : t.getStackTrace()) {
			TlosServer.getLogger().error(stackTraceElement);
		}
	}

}
