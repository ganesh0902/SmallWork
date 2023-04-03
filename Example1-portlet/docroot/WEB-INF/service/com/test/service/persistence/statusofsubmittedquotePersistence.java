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

import com.test.model.statusofsubmittedquote;

/**
 * The persistence interface for the statusofsubmittedquote service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dell
 * @see statusofsubmittedquotePersistenceImpl
 * @see statusofsubmittedquoteUtil
 * @generated
 */
public interface statusofsubmittedquotePersistence extends BasePersistence<statusofsubmittedquote> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link statusofsubmittedquoteUtil} to access the statusofsubmittedquote persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the statusofsubmittedquote in the entity cache if it is enabled.
	*
	* @param statusofsubmittedquote the statusofsubmittedquote
	*/
	public void cacheResult(
		com.test.model.statusofsubmittedquote statusofsubmittedquote);

	/**
	* Caches the statusofsubmittedquotes in the entity cache if it is enabled.
	*
	* @param statusofsubmittedquotes the statusofsubmittedquotes
	*/
	public void cacheResult(
		java.util.List<com.test.model.statusofsubmittedquote> statusofsubmittedquotes);

	/**
	* Creates a new statusofsubmittedquote with the primary key. Does not add the statusofsubmittedquote to the database.
	*
	* @param sosqId the primary key for the new statusofsubmittedquote
	* @return the new statusofsubmittedquote
	*/
	public com.test.model.statusofsubmittedquote create(long sosqId);

	/**
	* Removes the statusofsubmittedquote with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sosqId the primary key of the statusofsubmittedquote
	* @return the statusofsubmittedquote that was removed
	* @throws com.test.NoSuchstatusofsubmittedquoteException if a statusofsubmittedquote with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.statusofsubmittedquote remove(long sosqId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchstatusofsubmittedquoteException;

	public com.test.model.statusofsubmittedquote updateImpl(
		com.test.model.statusofsubmittedquote statusofsubmittedquote)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the statusofsubmittedquote with the primary key or throws a {@link com.test.NoSuchstatusofsubmittedquoteException} if it could not be found.
	*
	* @param sosqId the primary key of the statusofsubmittedquote
	* @return the statusofsubmittedquote
	* @throws com.test.NoSuchstatusofsubmittedquoteException if a statusofsubmittedquote with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.statusofsubmittedquote findByPrimaryKey(long sosqId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.test.NoSuchstatusofsubmittedquoteException;

	/**
	* Returns the statusofsubmittedquote with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sosqId the primary key of the statusofsubmittedquote
	* @return the statusofsubmittedquote, or <code>null</code> if a statusofsubmittedquote with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.test.model.statusofsubmittedquote fetchByPrimaryKey(long sosqId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the statusofsubmittedquotes.
	*
	* @return the statusofsubmittedquotes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.statusofsubmittedquote> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the statusofsubmittedquotes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.statusofsubmittedquoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statusofsubmittedquotes
	* @param end the upper bound of the range of statusofsubmittedquotes (not inclusive)
	* @return the range of statusofsubmittedquotes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.statusofsubmittedquote> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the statusofsubmittedquotes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.statusofsubmittedquoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of statusofsubmittedquotes
	* @param end the upper bound of the range of statusofsubmittedquotes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of statusofsubmittedquotes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.test.model.statusofsubmittedquote> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the statusofsubmittedquotes from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of statusofsubmittedquotes.
	*
	* @return the number of statusofsubmittedquotes
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}