/**
 * Copyright 2014 Nikita Koksharov, Nickolay Borbit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.client.protocol;

public class RedisCommand<R> {

    private final String name;
    private Decoder<R> reponseDecoder;

    public RedisCommand(String name) {
        this(name, null);
    }

    public RedisCommand(String name, Decoder<R> reponseDecoder) {
        super();
        this.name = name;
        this.reponseDecoder = reponseDecoder;
    }

    public String getName() {
        return name;
    }

    public Decoder<R> getReponseDecoder() {
        return reponseDecoder;
    }


}
