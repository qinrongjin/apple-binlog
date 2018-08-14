package com.appleframework.binlog.config;

public class BinaryLogConfig {

	private static String host;
	private static Integer port;
	private static String username;
	private static String password;
	private static Long serverId = 2L;
	private static boolean init = false;
	private static boolean run = false;

	public static String getHost() {
		return host;
	}

	public static void setHost(String host) {
		BinaryLogConfig.host = host;
	}

	public static Integer getPort() {
		return port;
	}

	public static void setPort(Integer port) {
		BinaryLogConfig.port = port;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		BinaryLogConfig.username = username;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		BinaryLogConfig.password = password;
	}

	public static Long getServerId() {
		return serverId;
	}

	public static void setServerId(Long serverId) {
		BinaryLogConfig.serverId = serverId;
	}

	public static boolean isInit() {
		return init;
	}

	public static void setInit(boolean init) {
		BinaryLogConfig.init = init;
	}

	public static boolean isRun() {
		return run;
	}

	public static void setRun(boolean run) {
		BinaryLogConfig.run = run;
	}
	
}