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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.test.NoSuchsmallworkException;

import com.test.model.impl.smallworkImpl;
import com.test.model.impl.smallworkModelImpl;
import com.test.model.smallwork;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the smallwork service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dell
 * @see smallworkPersistence
 * @see smallworkUtil
 * @generated
 */
public class smallworkPersistenceImpl extends BasePersistenceImpl<smallwork>
	implements smallworkPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link smallworkUtil} to access the smallwork persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = smallworkImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(smallworkModelImpl.ENTITY_CACHE_ENABLED,
			smallworkModelImpl.FINDER_CACHE_ENABLED, smallworkImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(smallworkModelImpl.ENTITY_CACHE_ENABLED,
			smallworkModelImpl.FINDER_CACHE_ENABLED, smallworkImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(smallworkModelImpl.ENTITY_CACHE_ENABLED,
			smallworkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public smallworkPersistenceImpl() {
		setModelClass(smallwork.class);
	}

	/**
	 * Caches the smallwork in the entity cache if it is enabled.
	 *
	 * @param smallwork the smallwork
	 */
	@Override
	public void cacheResult(smallwork smallwork) {
		EntityCacheUtil.putResult(smallworkModelImpl.ENTITY_CACHE_ENABLED,
			smallworkImpl.class, smallwork.getPrimaryKey(), smallwork);

		smallwork.resetOriginalValues();
	}

	/**
	 * Caches the smallworks in the entity cache if it is enabled.
	 *
	 * @param smallworks the smallworks
	 */
	@Override
	public void cacheResult(List<smallwork> smallworks) {
		for (smallwork smallwork : smallworks) {
			if (EntityCacheUtil.getResult(
						smallworkModelImpl.ENTITY_CACHE_ENABLED,
						smallworkImpl.class, smallwork.getPrimaryKey()) == null) {
				cacheResult(smallwork);
			}
			else {
				smallwork.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all smallworks.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(smallworkImpl.class.getName());
		}

		EntityCacheUtil.clearCache(smallworkImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the smallwork.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(smallwork smallwork) {
		EntityCacheUtil.removeResult(smallworkModelImpl.ENTITY_CACHE_ENABLED,
			smallworkImpl.class, smallwork.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<smallwork> smallworks) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (smallwork smallwork : smallworks) {
			EntityCacheUtil.removeResult(smallworkModelImpl.ENTITY_CACHE_ENABLED,
				smallworkImpl.class, smallwork.getPrimaryKey());
		}
	}

	/**
	 * Creates a new smallwork with the primary key. Does not add the smallwork to the database.
	 *
	 * @param id the primary key for the new smallwork
	 * @return the new smallwork
	 */
	@Override
	public smallwork create(int id) {
		smallwork smallwork = new smallworkImpl();

		smallwork.setNew(true);
		smallwork.setPrimaryKey(id);

		return smallwork;
	}

	/**
	 * Removes the smallwork with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the smallwork
	 * @return the smallwork that was removed
	 * @throws com.test.NoSuchsmallworkException if a smallwork with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public smallwork remove(int id)
		throws NoSuchsmallworkException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the smallwork with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the smallwork
	 * @return the smallwork that was removed
	 * @throws com.test.NoSuchsmallworkException if a smallwork with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public smallwork remove(Serializable primaryKey)
		throws NoSuchsmallworkException, SystemException {
		Session session = null;

		try {
			session = openSession();

			smallwork smallwork = (smallwork)session.get(smallworkImpl.class,
					primaryKey);

			if (smallwork == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsmallworkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(smallwork);
		}
		catch (NoSuchsmallworkException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected smallwork removeImpl(smallwork smallwork)
		throws SystemException {
		smallwork = toUnwrappedModel(smallwork);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(smallwork)) {
				smallwork = (smallwork)session.get(smallworkImpl.class,
						smallwork.getPrimaryKeyObj());
			}

			if (smallwork != null) {
				session.delete(smallwork);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (smallwork != null) {
			clearCache(smallwork);
		}

		return smallwork;
	}

	@Override
	public smallwork updateImpl(com.test.model.smallwork smallwork)
		throws SystemException {
		smallwork = toUnwrappedModel(smallwork);

		boolean isNew = smallwork.isNew();

		Session session = null;

		try {
			session = openSession();

			if (smallwork.isNew()) {
				session.save(smallwork);

				smallwork.setNew(false);
			}
			else {
				session.merge(smallwork);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(smallworkModelImpl.ENTITY_CACHE_ENABLED,
			smallworkImpl.class, smallwork.getPrimaryKey(), smallwork);

		return smallwork;
	}

	protected smallwork toUnwrappedModel(smallwork smallwork) {
		if (smallwork instanceof smallworkImpl) {
			return smallwork;
		}

		smallworkImpl smallworkImpl = new smallworkImpl();

		smallworkImpl.setNew(smallwork.isNew());
		smallworkImpl.setPrimaryKey(smallwork.getPrimaryKey());

		smallworkImpl.setId(smallwork.getId());
		smallworkImpl.setQuoteReference(smallwork.getQuoteReference());
		smallworkImpl.setProjectName(smallwork.getProjectName());
		smallworkImpl.setCustomerAddress(smallwork.getCustomerAddress());
		smallworkImpl.setWorkType(smallwork.getWorkType());
		smallworkImpl.setLeadSource(smallwork.getLeadSource());
		smallworkImpl.setProductSpecific(smallwork.getProductSpecific());
		smallworkImpl.setDescription(smallwork.getDescription());
		smallworkImpl.setCustomerName(smallwork.getCustomerName());
		smallworkImpl.setPostcode(smallwork.getPostcode());
		smallworkImpl.setSitename(smallwork.getSitename());
		smallworkImpl.setLead(smallwork.getLead());
		smallworkImpl.setLocation(smallwork.getLocation());
		smallworkImpl.setEnduser(smallwork.getEnduser());
		smallworkImpl.setContactName(smallwork.getContactName());
		smallworkImpl.setPhone(smallwork.getPhone());
		smallworkImpl.setEmail(smallwork.getEmail());
		smallworkImpl.setProjectDate(smallwork.getProjectDate());
		smallworkImpl.setAnticipatedDate(smallwork.getAnticipatedDate());
		smallworkImpl.setEndDate(smallwork.getEndDate());
		smallworkImpl.setEndDate2(smallwork.getEndDate2());
		smallworkImpl.setBidInfor(smallwork.getBidInfor());
		smallworkImpl.setQuotationName(smallwork.getQuotationName());
		smallworkImpl.setProjectCost(smallwork.getProjectCost());
		smallworkImpl.setDateShowOnQuote(smallwork.getDateShowOnQuote());
		smallworkImpl.setProjectSell(smallwork.getProjectSell());
		smallworkImpl.setQuoteSubmitDate(smallwork.getQuoteSubmitDate());
		smallworkImpl.setWinProbability(smallwork.getWinProbability());
		smallworkImpl.setStage(smallwork.getStage());

		return smallworkImpl;
	}

	/**
	 * Returns the smallwork with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the smallwork
	 * @return the smallwork
	 * @throws com.test.NoSuchsmallworkException if a smallwork with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public smallwork findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsmallworkException, SystemException {
		smallwork smallwork = fetchByPrimaryKey(primaryKey);

		if (smallwork == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsmallworkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return smallwork;
	}

	/**
	 * Returns the smallwork with the primary key or throws a {@link com.test.NoSuchsmallworkException} if it could not be found.
	 *
	 * @param id the primary key of the smallwork
	 * @return the smallwork
	 * @throws com.test.NoSuchsmallworkException if a smallwork with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public smallwork findByPrimaryKey(int id)
		throws NoSuchsmallworkException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the smallwork with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the smallwork
	 * @return the smallwork, or <code>null</code> if a smallwork with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public smallwork fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		smallwork smallwork = (smallwork)EntityCacheUtil.getResult(smallworkModelImpl.ENTITY_CACHE_ENABLED,
				smallworkImpl.class, primaryKey);

		if (smallwork == _nullsmallwork) {
			return null;
		}

		if (smallwork == null) {
			Session session = null;

			try {
				session = openSession();

				smallwork = (smallwork)session.get(smallworkImpl.class,
						primaryKey);

				if (smallwork != null) {
					cacheResult(smallwork);
				}
				else {
					EntityCacheUtil.putResult(smallworkModelImpl.ENTITY_CACHE_ENABLED,
						smallworkImpl.class, primaryKey, _nullsmallwork);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(smallworkModelImpl.ENTITY_CACHE_ENABLED,
					smallworkImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return smallwork;
	}

	/**
	 * Returns the smallwork with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the smallwork
	 * @return the smallwork, or <code>null</code> if a smallwork with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public smallwork fetchByPrimaryKey(int id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the smallworks.
	 *
	 * @return the smallworks
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<smallwork> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<smallwork> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<smallwork> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<smallwork> list = (List<smallwork>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SMALLWORK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SMALLWORK;

				if (pagination) {
					sql = sql.concat(smallworkModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<smallwork>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<smallwork>(list);
				}
				else {
					list = (List<smallwork>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the smallworks from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (smallwork smallwork : findAll()) {
			remove(smallwork);
		}
	}

	/**
	 * Returns the number of smallworks.
	 *
	 * @return the number of smallworks
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SMALLWORK);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the smallwork persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.smallwork")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<smallwork>> listenersList = new ArrayList<ModelListener<smallwork>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<smallwork>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(smallworkImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SMALLWORK = "SELECT smallwork FROM smallwork smallwork";
	private static final String _SQL_COUNT_SMALLWORK = "SELECT COUNT(smallwork) FROM smallwork smallwork";
	private static final String _ORDER_BY_ENTITY_ALIAS = "smallwork.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No smallwork exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(smallworkPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static smallwork _nullsmallwork = new smallworkImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<smallwork> toCacheModel() {
				return _nullsmallworkCacheModel;
			}
		};

	private static CacheModel<smallwork> _nullsmallworkCacheModel = new CacheModel<smallwork>() {
			@Override
			public smallwork toEntityModel() {
				return _nullsmallwork;
			}
		};
}