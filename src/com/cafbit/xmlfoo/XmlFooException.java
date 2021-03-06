/*
 * Copyright 2011 David Simmons
 * http://cafbit.com/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cafbit.xmlfoo;

public class XmlFooException extends Exception {
    private static final long serialVersionUID = -3123355580007791630L;
    private static final String DEFAULT_MESSAGE =
        "A problem occured while storing or retreiving XML data.";
    
    public XmlFooException() {
        super(DEFAULT_MESSAGE);
    }
    public XmlFooException(Throwable e) {
        super(DEFAULT_MESSAGE, e);
    }
    public XmlFooException(String message) {
        super(message);
    }
    public XmlFooException(String message, Throwable e) {
        super(message, e);
    }

}
