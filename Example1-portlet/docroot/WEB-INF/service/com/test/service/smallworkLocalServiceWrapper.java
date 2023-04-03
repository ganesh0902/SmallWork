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

package com.test.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link smallworkLocalService}.
 *
 * @author dell
 * @see smallworkLocalService
 * @generated
 */
public class smallworkLocalServiceWrapper implements smallworkLocalService,
	ServiceWrapper<smallworkLocalService> {
	public smallworkLocalServiceWrapper(
		smallworkLocalService smallworkLocalService) {
		_smallworkLocalService = smallworkLocalService;
	}

	/**
	* Adds the smallwork to the database. Also notifies the appropriate model listeners.
	*
	* @param smallwork the smallwork
	* @return the smallwork that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.smallwork addsmallwork(
		com.test.model.smallwork smallwork)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.addsmallwork(smallwork);
	}

	/**
	* Creates a new smallwork with the primary key. Does not add the smallwork to the database.
	*
	* @param id the primary key for the new smallwork
	* @return the new smallwork
	*/
	@Override
	public com.test.model.smallwork createsmallwork(int id) {
		return _smallworkLocalService.createsmallwork(id);
	}

	/**
	* Deletes the smallwork with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the smallwork
	* @return the smallwork that was removed
	* @throws PortalException if a smallwork with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.smallwork deletesmallwork(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.deletesmallwork(id);
	}

	/**
	* Deletes the smallwork from the database. Also notifies the appropriate model listeners.
	*
	* @param smallwork the smallwork
	* @return the smallwork that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.smallwork deletesmallwork(
		com.test.model.smallwork smallwork)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.deletesmallwork(smallwork);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _smallworkLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.smallworkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.smallworkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.test.model.smallwork fetchsmallwork(int id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.fetchsmallwork(id);
	}

	/**
	* Returns the smallwork with the primary key.
	*
	* @param id the primary key of the smallwork
	* @return the smallwork
	* @throws PortalException if a smallwork with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.smallwork getsmallwork(int id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.getsmallwork(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.test.model.smallwork> getsmallworks(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.getsmallworks(start, end);
	}

	/**
	* Returns the number of smallworks.
	*
	* @return the number of smallworks
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getsmallworksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.getsmallworksCount();
	}

	/**
	* Updates the smallwork in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param smallwork the smallwork
	* @return the smallwork that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.test.model.smallwork updatesmallwork(
		com.test.model.smallwork smallwork)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _smallworkLocalService.updatesmallwork(smallwork);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _smallworkLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_smallworkLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _smallworkLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public smallworkLocalService getWrappedsmallworkLocalService() {
		return _smallworkLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedsmallworkLocalService(
		smallworkLocalService smallworkLocalService) {
		_smallworkLocalService = smallworkLocalService;
	}

	@Override
	public smallworkLocalService getWrappedService() {
		return _smallworkLocalService;
	}

	@Override
	public void setWrappedService(smallworkLocalService smallworkLocalService) {
		_smallworkLocalService = smallworkLocalService;
	}

	private smallworkLocalService _smallworkLocalService;
}