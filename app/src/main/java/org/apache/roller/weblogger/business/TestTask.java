/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  The ASF licenses this file to You
 * under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.  For additional information regarding
 * copyright in this work, please see the NOTICE file in the top level
 * directory of this distribution.
 */
package org.apache.roller.weblogger.business;

import java.util.Date;
import org.apache.roller.weblogger.WebloggerException;
import org.apache.roller.weblogger.business.runnable.RollerTaskWithLeasing;

public class TestTask extends RollerTaskWithLeasing {
    public static final String NAME = "TestTask";

    public TestTask() {}

    public void init() throws WebloggerException {
        this.init(TestTask.NAME);
    }

    public String getClientId() {
        return "TestTaskClientId";
    }

    public Date getStartTime(Date current) {
        return current;
    }

    public String getStartTimeDesc() {
        return "immediate";
    }

    public int getLeaseTime() {
        return 300;
    }

    public int getInterval() {
        return 1800;
    }

    public void runTask() {
    }

}
