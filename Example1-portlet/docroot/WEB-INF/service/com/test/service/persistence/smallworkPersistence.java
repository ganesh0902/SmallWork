/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.test.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.test.model.smallwork;

/**
 * The persistence interface for the smallwork service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dell
 * @see smallworkPersistenceImpl
 * @see smallworkUtil
 * @generated
 */
public interface smallworkPersistence extends BasePersistence<smallwork> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link smallworkUtil} to access the smallwork persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the smallwork in the entity cache if it is enabled.
	*
	* @param smallwork the smallwork
	*/
	public void cacheResult(com.test.model.smallwork smallwork);

	/**
	* Caches the smallworks in the entity cache if it is enabled.
	*
	* @param smallworks the smallworks
	*/
	public void cacheResult(java.util.List<com.test.model.smallwork> smallworks);

	/**
	* Creates a new smallwork with the primary key. Does not add the smallwork to the database.
	*
	* @param id the primary key for the new smallwork
	* @return the new smallwork
	*/
	public com.test.model.smallwork create(int id);

	/**
	* Removes the smallwork with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the smallwork
	* @return the smallwork that was removed
	* @throws com.test.NoSuchsmallworkException if a smallwork with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.smallwork remove(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchsmallworkException;

	public com.test.model.smallwork updateImpl(
		com.test.model.smallwork smallwork)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the smallwork with the primary key or throws a {@link com.test.NoSuchsmallworkException} if it could not be found.
	*
	* @param id the primary key of the smallwork
	* @return the smallwork
	* @throws com.test.NoSuchsmallworkException if a smallwork with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.smallwork findByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchsmallworkException;

	/**
	* Returns the smallwork with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the smallwork
	* @return the smallwork, or <code>null</code> if a smallwork with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.smallwork fetchByPrimaryKey(int id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the smallworks.
	*
	* @return the smallworks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.smallwork> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the smallworks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.smallworkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of smallworks
	* @param end the upper bound of the range of smallworks (not inclusive)
	* @return the range of smallworks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.smallwork> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the smallworks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.smallworkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of smallworks
	* @param end the upper bound of the range of smallworks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of smallworks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.smallwork> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the smallworks from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of smallworks.
	*
	* @return the number of smallworks
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}