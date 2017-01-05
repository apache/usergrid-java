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
package org.apache.usergrid.client;

import org.apache.usergrid.java.client.UsergridEnums.UsergridAuthMode;

public class SDKTestConfiguration {
    public static final String APP_CLIENT_ID = "YXA6-zvnTdLWEeaGGwrYgfQDvw";
    public static final String APP_CLIENT_SECRET = "YXA64tQ5qQAW_IZYUAOn_tDRKz0HrAU";

    public static final String APP_UserName = "javaSDK";
    public static final String APP_Password = "Apigee123";
    public static final String USERGRID_URL = "https://apibaas-trial.apigee.net/";
    public static final String ORG_NAME = "rjwalsh";
    public static final String APP_NAME = "sdk.demo";

    public static UsergridAuthMode authFallBack = UsergridAuthMode.APP;
}
