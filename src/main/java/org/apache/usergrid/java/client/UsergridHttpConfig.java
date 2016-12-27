/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.usergrid.java.client;

/**
 * Configuration for OK HTTP Client, which is initialized in UsergridRequestManager
 * 
 * @author Eren Yilmaz <evliya@gmail.com>
 *
 */
public class UsergridHttpConfig {

	/**
	 * Specify whether the HttpClient should retry the connection on failure.
	 * 
	 * Caution! If usergrid timeout occurs, some data may have already been written, so 
	 * retry can multiply data in an uncontrolled way. 
	 */
	boolean retryOnConnectionFailure = false;
	
	/**
	 * OK HttpClient connection timeout, in seconds.
	 */
	int connectTimeout = 30;
	
	/**
	 * OK HttpClient read timeout, in seconds.
	 */
	int readTimeout = 30;
	
	/**
	 * OK HttpClient connection timeout, in seconds.
	 */
	int writeTimeout = 30;

	public UsergridHttpConfig() {
		// default configuration
	}
	
	public UsergridHttpConfig(int connectTimeout, int readTimeout, int writeTimeout) {
		super();
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
		this.writeTimeout = writeTimeout;
	}


	public boolean getRetryOnConnectionFailure() {
		return retryOnConnectionFailure;
	}


	public void setRetryOnConnectionFailure(boolean retryOnConnectionFailure) {
		this.retryOnConnectionFailure = retryOnConnectionFailure;
	}


	public int getConnectTimeout() {
		return connectTimeout;
	}


	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}


	public int getReadTimeout() {
		return readTimeout;
	}


	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}


	public int getWriteTimeout() {
		return writeTimeout;
	}


	public void setWriteTimeout(int writeTimeout) {
		this.writeTimeout = writeTimeout;
	}

}
