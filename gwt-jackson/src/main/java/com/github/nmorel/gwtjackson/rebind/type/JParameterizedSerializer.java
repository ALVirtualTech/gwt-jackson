/*
 * Copyright 2016 Nicolas Morel
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

package com.github.nmorel.gwtjackson.rebind.type;

import com.github.nmorel.gwtjackson.client.JsonSerializer;
import com.github.nmorel.gwtjackson.client.Serializer;
import com.github.nmorel.gwtjackson.client.ser.map.key.KeySerializer;

/**
 * Class used to handle the generation of {@link Serializer}
 *
 * @author nicolasmorel
 * @version $Id: $
 */
public class JParameterizedSerializer extends JParameterizedMapper<JSerializerType> {

    /**
     * <p>Constructor for JParameterizedSerializer.</p>
     *
     * @param key a {@link com.github.nmorel.gwtjackson.rebind.type.JSerializerType} object.
     * @param json a {@link com.github.nmorel.gwtjackson.rebind.type.JSerializerType} object.
     */
    public JParameterizedSerializer( JSerializerType key, JSerializerType json ) {
        super( key, json );
    }

    /** {@inheritDoc} */
    @Override
    protected Class getMainClass() {
        return Serializer.class;
    }

    /** {@inheritDoc} */
    @Override
    protected Class getKeyClass() {
        return KeySerializer.class;
    }

    /** {@inheritDoc} */
    @Override
    protected Class getJsonClass() {
        return JsonSerializer.class;
    }

}
