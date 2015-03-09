/*
 * Copyright 2014 - 2015 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.aeron.driver.cmd;

import uk.co.real_logic.aeron.driver.DriverConnection;
import uk.co.real_logic.aeron.driver.Receiver;

public class RemoveConnectionCmd implements ReceiverCmd
{
    private final DriverConnection connection;

    public RemoveConnectionCmd(final DriverConnection connection)
    {
        this.connection = connection;
    }

    public void execute(final Receiver receiver)
    {
        receiver.onRemoveConnection(connection);
    }
}
