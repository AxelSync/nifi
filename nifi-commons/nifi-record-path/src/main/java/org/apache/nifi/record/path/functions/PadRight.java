/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.record.path.functions;

import org.apache.nifi.record.path.paths.RecordPathSegment;
import org.apache.nifi.util.StringUtils;

public class PadRight extends Padding {

    public PadRight( final RecordPathSegment inputStringPath,
                     final RecordPathSegment desiredLengthPath,
                     final RecordPathSegment paddingStringPath,
                     final boolean absolute) {
        super("padRight", null, inputStringPath, desiredLengthPath, paddingStringPath, absolute);
    }

    public PadRight( final RecordPathSegment inputStringPath,
                     final RecordPathSegment desiredLengthPath,
                     final boolean absolute) {
        super("padRight", null, inputStringPath, desiredLengthPath, null, absolute);
    }

    @Override
    protected String doPad(String inputString, int desiredLength, String pad) {
        return StringUtils.padRight(inputString, desiredLength, pad.charAt(0));
    }
}
