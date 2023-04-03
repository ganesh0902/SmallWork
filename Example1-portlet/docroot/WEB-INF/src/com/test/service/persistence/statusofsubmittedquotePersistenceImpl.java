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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.test.NoSuchstatusofsubmittedquoteException;

import com.test.model.impl.statusofsubmittedquoteImpl;
import com.test.model.impl.statusofsubmittedquoteModelImpl;
import com.test.model.statusofsubmittedquote;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the statusofsubmittedquote service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author dell
 * @see statusofsubmittedquotePersistence
 * @see statusofsubmittedquoteUtil
 * @generated
 */
public class statusofsubmittedquotePersistenceImpl extends BasePersistenceImpl<statusofsubmittedquote>
	implements statusofsubmittedquotePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link statusofsubmittedquoteUtil} to access the statusofsubmittedquote persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = statusofsubmittedquoteImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(statusofsubmittedquoteModelImpl.ENTITY_CACHE_ENABLED,
			statusofsubmittedquoteModelImpl.FINDER_CACHE_ENABLED,
			statusofsubmittedquoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(statusofsubmittedquoteModelImpl.ENTITY_CACHE_ENABLED,
			statusofsubmittedquoteModelImpl.FINDER_CACHE_ENABLED,
			statusofsubmittedquoteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(statusofsubmittedquoteModelImpl.ENTITY_CACHE_ENABLED,
			statusofsubmittedquoteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public statusofsubmittedquotePersistenceImpl() {
		setModelClass(statusofsubmittedquote.class);
	}

	/**
	 * Caches the statusofsubmittedquote in the entity cache if it is enabled.
	 *
	 * @param statusofsubmittedquote the statusofsubmittedquote
	 */
	@Override
	public void cacheResult(statusofsubmittedquote statusofsubmittedquote) {
		EntityCacheUtil.putResult(statusofsubmittedquoteModelImpl.ENTITY_CACHE_ENABLED,
			statusofsubmittedquoteImpl.class,
			statusofsubmittedquote.getPrimaryKey(), statusofsubmittedquote);

		statusofsubmittedquote.resetOriginalValues();
	}

	/**
	 * Caches the statusofsubmittedquotes in the entity cache if it is enabled.
	 *
	 * @param statusofsubmittedquotes the statusofsubmittedquotes
	 */
	@Override
	public void cacheResult(
		List<statusofsubmittedquote> statusofsubmittedquotes) {
		for (statusofsubmittedquote statusofsubmittedquote : statusofsubmittedquotes) {
			if (EntityCacheUtil.getResult(
						statusofsubmittedquoteModelImpl.ENTITY_CACHE_ENABLED,
						statusofsubmittedquoteImpl.class,
						statusofsubmittedquote.getPrimaryKey()) == null) {
				cacheResult(statusofsubmittedquote);
			}
			else {
				statusofsubmittedquote.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all statusofsubmittedquotes.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(statusofsubmittedquoteImpl.class.getName());
		}

		EntityCacheUtil.clearCache(statusofsubmittedquoteImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the statusofsubmittedquote.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(statusofsubmittedquote statusofsubmittedquote) {
		EntityCacheUtil.removeResult(statusofsubmittedquoteModelImpl.ENTITY_CACHE_ENABLED,
			statusofsubmittedquoteImpl.class,
			statusofsubmittedquote.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<statusofsubmittedquote> statusofsubmittedquotes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (statusofsubmittedquote statusofsubmittedquote : statusofsubmittedquotes) {
			EntityCacheUtil.removeResult(statusofsubmittedquoteModelImpl.ENTITY_CACHE_ENABLED,
				statusofsubmittedquoteImpl.class,
				statusofsubmittedquote.getPrimaryKey());
		}
	}

	/**
	 * Creates a new statusofsubmittedquote with the primary key. Does not add the statusofsubmittedquote to the database.
	 *
	 * @param sosqId the primary key for the new statusofsubmittedquote
	 * @return the new statusofsubmittedquote
	 */
	@Override
	public statusofsubmittedquote create(long sosqId) {
		statusofsubmittedquote statusofsubmittedquote = new statusofsubmittedquoteImpl();

		statusofsubmittedquote.setNew(true);
		statusofsubmittedquote.setPrimaryKey(sosqId);

		return statusofsubmittedquote;
	}

	/**
	 * Removes the statusofsubmittedquote with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sosqId the primary key of the statusofsubmittedquote
	 * @return the statusofsubmittedquote that was removed
	 * @throws com.test.NoSuchstatusofsubmittedquoteException if a statusofsubmittedquote with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public statusofsubmittedquote remove(long sosqId)
		throws NoSuchstatusofsubmittedquoteException, SystemException {
		return remove((Serializable)sosqId);
	}

	/**
	 * Removes the statusofsubmittedquote with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the statusofsubmittedquote
	 * @return the statusofsubmittedquote that was removed
	 * @throws com.test.NoSuchstatusofsubmittedquoteException if a statusofsubmittedquote with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public statusofsubmittedquote remove(Serializable primaryKey)
		throws NoSuchstatusofsubmittedquoteException, SystemException {
		Session session = null;

		try {
			session = openSession();

			statusofsubmittedquote statusofsubmittedquote = (statusofsubmittedquote)session.get(statusofsubmittedquoteImpl.class,
					primaryKey);

			if (statusofsubmittedquote == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchstatusofsubmittedquoteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(statusofsubmittedquote);
		}
		catch (NoSuchstatusofsubmittedquoteException nsee) {
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
	protected statusofsubmittedquote removeImpl(
		statusofsubmittedquote statusofsubmittedquote)
		throws SystemException {
		statusofsubmittedquote = toUnwrappedModel(statusofsubmittedquote);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(statusofsubmittedquote)) {
				statusofsubmittedquote = (statusofsubmittedquote)session.get(statusofsubmittedquoteImpl.class,
						statusofsubmittedquote.getPrimaryKeyObj());
			}

			if (statusofsubmittedquote != null) {
				session.delete(statusofsubmittedquote);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (statusofsubmittedquote != null) {
			clearCache(statusofsubmittedquote);
		}

		return statusofsubmittedquote;
	}

	@Override
	public statusofsubmittedquote updateImpl(
		com.test.model.statusofsubmittedquote statusofsubmittedquote)
		throws SystemException {
		statusofsubmittedquote = toUnwrappedModel(statusofsubmittedquote);

		boolean isNew = statusofsubmittedquote.isNew();

		Session session = null;

		try {
			session = openSession();

			if (statusofsubmittedquote.isNew()) {
				session.save(statusofsubmittedquote);

				statusofsubmittedquote.setNew(false);
			}
			else {
				session.merge(statusofsubmittedquote);
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

		EntityCacheUtil.putResult(statusofsubmittedquoteModelImpl.ENTITY_CACHE_ENABLED,
			statusofsubmittedquoteImpl.class,
			statusofsubmittedquote.getPrimaryKey(), statusofsubmittedquote);

		return statusofsubmittedquote;
	}

	protected statusofsubmittedquote toUnwrappedModel(
		statusofsubmittedquote statusofsubmittedquote) {
		if (statusofsubmittedquote instanceof statusofsubmittedquoteImpl) {
			return statusofsubmittedquote;
		}

		statusofsubmittedquoteImpl statusofsubmittedquoteImpl = new statusofsubmittedquoteImpl();

		statusofsubmittedquoteImpl.setNew(statusofsubmittedquote.isNew());
		statusofsubmittedquoteImpl.setPrimaryKey(statusofsubmittedquote.getPrimaryKey());

		statusofsubmittedquoteImpl.setSosqId(statusofsubmittedquote.getSosqId());
		statusofsubmittedquoteImpl.setSosq(statusofsubmittedquote.getSosq());
		statusofsubmittedquoteImpl.setWinprob(statusofsubmittedquote.getWinprob());
		statusofsubmittedquoteImpl.setAorderdate(statusofsubmittedquote.getAorderdate());
		statusofsubmittedquoteImpl.setPpstartdate(statusofsubmittedquote.getPpstartdate());
		statusofsubmittedquoteImpl.setPpenddate(statusofsubmittedquote.getPpenddate());
		statusofsubmittedquoteImpl.setCreateDate(statusofsubmittedquote.getCreateDate());
		statusofsubmittedquoteImpl.setCustomercomittype(statusofsubmittedquote.getCustomercomittype());
		statusofsubmittedquoteImpl.setUpload(statusofsubmittedquote.getUpload());
		statusofsubmittedquoteImpl.setPon(statusofsubmittedquote.getPon());
		statusofsubmittedquoteImpl.setValueofcommit(statusofsubmittedquote.getValueofcommit());
		statusofsubmittedquoteImpl.setRmethod(statusofsubmittedquote.getRmethod());
		statusofsubmittedquoteImpl.setRdate(statusofsubmittedquote.getRdate());
		statusofsubmittedquoteImpl.setPcdc(statusofsubmittedquote.getPcdc());
		statusofsubmittedquoteImpl.setOnwhatbasis(statusofsubmittedquote.getOnwhatbasis());
		statusofsubmittedquoteImpl.setRecordproposedcourse(statusofsubmittedquote.getRecordproposedcourse());
		statusofsubmittedquoteImpl.setComments(statusofsubmittedquote.getComments());
		statusofsubmittedquoteImpl.setCurrrentId(statusofsubmittedquote.getCurrrentId());

		return statusofsubmittedquoteImpl;
	}

	/**
	 * Returns the statusofsubmittedquote with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the statusofsubmittedquote
	 * @return the statusofsubmittedquote
	 * @throws com.test.NoSuchstatusofsubmittedquoteException if a statusofsubmittedquote with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public statusofsubmittedquote findByPrimaryKey(Serializable primaryKey)
		throws NoSuchstatusofsubmittedquoteException, SystemException {
		statusofsubmittedquote statusofsubmittedquote = fetchByPrimaryKey(primaryKey);

		if (statusofsubmittedquote == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchstatusofsubmittedquoteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return statusofsubmittedquote;
	}

	/**
	 * Returns the statusofsubmittedquote with the primary key or throws a {@link com.test.NoSuchstatusofsubmittedquoteException} if it could not be found.
	 *
	 * @param sosqId the primary key of the statusofsubmittedquote
	 * @return the statusofsubmittedquote
	 * @throws com.test.NoSuchstatusofsubmittedquoteException if a statusofsubmittedquote with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public statusofsubmittedquote findByPrimaryKey(long sosqId)
		throws NoSuchstatusofsubmittedquoteException, SystemException {
		return findByPrimaryKey((Serializable)sosqId);
	}

	/**
	 * Returns the statusofsubmittedquote with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the statusofsubmittedquote
	 * @return the statusofsubmittedquote, or <code>null</code> if a statusofsubmittedquote with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public statusofsubmittedquote fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		statusofsubmittedquote statusofsubmittedquote = (statusofsubmittedquote)EntityCacheUtil.getResult(statusofsubmittedquoteModelImpl.ENTITY_CACHE_ENABLED,
				statusofsubmittedquoteImpl.class, primaryKey);

		if (statusofsubmittedquote == _nullstatusofsubmittedquote) {
			return null;
		}

		if (statusofsubmittedquote == null) {
			Session session = null;

			try {
				session = openSession();

				statusofsubmittedquote = (statusofsubmittedquote)session.get(statusofsubmittedquoteImpl.class,
						primaryKey);

				if (statusofsubmittedquote != null) {
					cacheResult(statusofsubmittedquote);
				}
				else {
					EntityCacheUtil.putResult(statusofsubmittedquoteModelImpl.ENTITY_CACHE_ENABLED,
						statusofsubmittedquoteImpl.class, primaryKey,
						_nullstatusofsubmittedquote);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(statusofsubmittedquoteModelImpl.ENTITY_CACHE_ENABLED,
					statusofsubmittedquoteImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return statusofsubmittedquote;
	}

	/**
	 * Returns the statusofsubmittedquote with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sosqId the primary key of the statusofsubmittedquote
	 * @return the statusofsubmittedquote, or <code>null</code> if a statusofsubmittedquote with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public statusofsubmittedquote fetchByPrimaryKey(long sosqId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)sosqId);
	}

	/**
	 * Returns all the statusofsubmittedquotes.
	 *
	 * @return the statusofsubmittedquotes
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<statusofsubmittedquote> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<statusofsubmittedquote> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<statusofsubmittedquote> findAll(int start, int end,
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

		List<statusofsubmittedquote> list = (List<statusofsubmittedquote>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STATUSOFSUBMITTEDQUOTE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STATUSOFSUBMITTEDQUOTE;

				if (pagination) {
					sql = sql.concat(statusofsubmittedquoteModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<statusofsubmittedquote>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<statusofsubmittedquote>(list);
				}
				else {
					list = (List<statusofsubmittedquote>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the statusofsubmittedquotes from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (statusofsubmittedquote statusofsubmittedquote : findAll()) {
			remove(statusofsubmittedquote);
		}
	}

	/**
	 * Returns the number of statusofsubmittedquotes.
	 *
	 * @return the number of statusofsubmittedquotes
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

				Query q = session.createQuery(_SQL_COUNT_STATUSOFSUBMITTEDQUOTE);

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

	/**
	 * Initializes the statusofsubmittedquote persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.test.model.statusofsubmittedquote")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<statusofsubmittedquote>> listenersList = new ArrayList<ModelListener<statusofsubmittedquote>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<statusofsubmittedquote>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(statusofsubmittedquoteImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_STATUSOFSUBMITTEDQUOTE = "SELECT statusofsubmittedquote FROM statusofsubmittedquote statusofsubmittedquote";
	private static final String _SQL_COUNT_STATUSOFSUBMITTEDQUOTE = "SELECT COUNT(statusofsubmittedquote) FROM statusofsubmittedquote statusofsubmittedquote";
	private static final String _ORDER_BY_ENTITY_ALIAS = "statusofsubmittedquote.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No statusofsubmittedquote exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(statusofsubmittedquotePersistenceImpl.class);
	private static statusofsubmittedquote _nullstatusofsubmittedquote = new statusofsubmittedquoteImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<statusofsubmittedquote> toCacheModel() {
				return _nullstatusofsubmittedquoteCacheModel;
			}
		};

	private static CacheModel<statusofsubmittedquote> _nullstatusofsubmittedquoteCacheModel =
		new CacheModel<statusofsubmittedquote>() {
			@Override
			public statusofsubmittedquote toEntityModel() {
				return _nullstatusofsubmittedquote;
			}
		};
}