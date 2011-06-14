package org.springframework.data.document.mongodb.mapping;

import org.springframework.data.mapping.PersistentEntity;

/**
 * 
 * @author Oliver Gierke
 */
public interface MongoPersistentEntity<T> extends PersistentEntity<T, MongoPersistentProperty> {

	String getCollection();
}
