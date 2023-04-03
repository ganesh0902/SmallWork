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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for statusofsubmittedquote. This utility wraps
 * {@link com.test.service.impl.statusofsubmittedquoteLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author dell
 * @see statusofsubmittedquoteLocalService
 * @see com.test.service.base.statusofsubmittedquoteLocalServiceBaseImpl
 * @see com.test.service.impl.statusofsubmittedquoteLocalServiceImpl
 * @generated
 */
public class statusofsubmittedquoteLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.test.service.impl.statusofsubmittedquoteLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the statusofsubmittedquote to the database. Also notifies the appropriate model listeners.
	*
	* @param statusofsubmittedquote the statusofsubmittedquote
	* @return the statusofsubmittedquote that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.statusofsubmittedquote addstatusofsubmittedquote(
		com.test.model.statusofsubmittedquote statusofsubmittedquote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addstatusofsubmittedquote(statusofsubmittedquote);
	}

	/**
	* Creates a new statusofsubmittedquote with the primary key. Does not add the statusofsubmittedquote to the database.
	*
	* @param sosqId the primary key for the new statusofsubmittedquote
	* @return the new statusofsubmittedquote
	*/
	public static com.test.model.statusofsubmittedquote createstatusofsubmittedquote(
		long sosqId) {
		return getService().createstatusofsubmittedquote(sosqId);
	}

	/**
	* Deletes the statusofsubmittedquote with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sosqId the primary key of the statusofsubmittedquote
	* @return the statusofsubmittedquote that was removed
	* @throws PortalException if a statusofsubmittedquote with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.statusofsubmittedquote deletestatusofsubmittedquote(
		long sosqId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletestatusofsubmittedquote(sosqId);
	}

	/**
	* Deletes the statusofsubmittedquote from the database. Also notifies the appropriate model listeners.
	*
	* @param statusofsubmittedquote the statusofsubmittedquote
	* @return the statusofsubmittedquote that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.statusofsubmittedquote deletestatusofsubmittedquote(
		com.test.model.statusofsubmittedquote statusofsubmittedquote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletestatusofsubmittedquote(statusofsubmittedquote);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.statusofsubmittedquoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.test.model.impl.statusofsubmittedquoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.test.model.statusofsubmittedquote fetchstatusofsubmittedquote(
		long sosqId) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchstatusofsubmittedquote(sosqId);
	}

	/**
	* Returns the statusofsubmittedquote with the primary key.
	*
	* @param sosqId the primary key of the statusofsubmittedquote
	* @return the statusofsubmittedquote
	* @throws PortalException if a statusofsubmittedquote with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.statusofsubmittedquote getstatusofsubmittedquote(
		long sosqId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getstatusofsubmittedquote(sosqId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<com.test.model.statusofsubmittedquote> getstatusofsubmittedquotes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getstatusofsubmittedquotes(start, end);
	}

	/**
	* Returns the number of statusofsubmittedquotes.
	*
	* @return the number of statusofsubmittedquotes
	* @throws SystemException if a system exception occurred
	*/
	public static int getstatusofsubmittedquotesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getstatusofsubmittedquotesCount();
	}

	/**
	* Updates the statusofsubmittedquote in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param statusofsubmittedquote the statusofsubmittedquote
	* @return the statusofsubmittedquote that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.test.model.statusofsubmittedquote updatestatusofsubmittedquote(
		com.test.model.statusofsubmittedquote statusofsubmittedquote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatestatusofsubmittedquote(statusofsubmittedquote);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static statusofsubmittedquoteLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					statusofsubmittedquoteLocalService.class.getName());

			if (invokableLocalService instanceof statusofsubmittedquoteLocalService) {
				_service = (statusofsubmittedquoteLocalService)invokableLocalService;
			}
			else {
				_service = new statusofsubmittedquoteLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(statusofsubmittedquoteLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(statusofsubmittedquoteLocalService service) {
	}

	private static statusofsubmittedquoteLocalService _service;
}