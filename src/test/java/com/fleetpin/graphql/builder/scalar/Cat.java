/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.fleetpin.graphql.builder.scalar;

import com.fleetpin.graphql.builder.annotations.Entity;
import com.fleetpin.graphql.builder.annotations.Query;

@Entity
public class Cat {

	private final Fur fur;

	private long age;

	private Cat(Fur fur, long age) {
		this.fur = fur;
		this.age = age;
	}

	public Fur getFur() {
		return fur;
	}

	public long getAge() {
		return age;
	}

	@Query
	public static Cat getCat(Fur fur, Long age) {
		return new Cat(fur, age);
	}

	@Query
	public static Shape getShape(Shape shape) {
		return shape;
	}
}