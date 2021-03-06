package vanilla.java.collections.api;

/*
 * Copyright 2011 Peter Lawrey
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

import java.util.ListIterator;

public interface HugeIterator<T> extends ListIterator<T>, Recycleable {
    public HugeIterator<T> toStart();

    public HugeIterator<T> toEnd();

    public long previousLongIndex();

    public long nextLongIndex();

    public void recycle();

    public vanilla.java.collections.api.impl.HugeElement nextElement();

    public void index(long index);

    public long index();

}
