/*
 *   Copyright 2016 ITM, S.A.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * `*   `[`http://www.apache.org/licenses/LICENSE-2.0`](http://www.apache.org/licenses/LICENSE-2.0)
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package drp.objects;

/**
 * Created by jandrad on 23/01/16.
 */
public interface OperationListener {

    public enum MessageType {
        INFO,
        SUCCESS,
        ERROR
    }

    void onMessage(Exception e, String message, MessageType type);
    void onFinished(String message, boolean success);
    void onRefreshHosts();
    void onRefreshDatacenters();
}
