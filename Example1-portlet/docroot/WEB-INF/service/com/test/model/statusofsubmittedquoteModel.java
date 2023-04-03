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

package com.test.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the statusofsubmittedquote service. Represents a row in the &quot;statusofsubmittedquote&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.test.model.impl.statusofsubmittedquoteModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.test.model.impl.statusofsubmittedquoteImpl}.
 * </p>
 *
 * @author dell
 * @see statusofsubmittedquote
 * @see com.test.model.impl.statusofsubmittedquoteImpl
 * @see com.test.model.impl.statusofsubmittedquoteModelImpl
 * @generated
 */
public interface statusofsubmittedquoteModel extends BaseModel<statusofsubmittedquote> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a statusofsubmittedquote model instance should use the {@link statusofsubmittedquote} interface instead.
	 */

	/**
	 * Returns the primary key of this statusofsubmittedquote.
	 *
	 * @return the primary key of this statusofsubmittedquote
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this statusofsubmittedquote.
	 *
	 * @param primaryKey the primary key of this statusofsubmittedquote
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sosq ID of this statusofsubmittedquote.
	 *
	 * @return the sosq ID of this statusofsubmittedquote
	 */
	public long getSosqId();

	/**
	 * Sets the sosq ID of this statusofsubmittedquote.
	 *
	 * @param sosqId the sosq ID of this statusofsubmittedquote
	 */
	public void setSosqId(long sosqId);

	/**
	 * Returns the sosq of this statusofsubmittedquote.
	 *
	 * @return the sosq of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getSosq();

	/**
	 * Sets the sosq of this statusofsubmittedquote.
	 *
	 * @param sosq the sosq of this statusofsubmittedquote
	 */
	public void setSosq(String sosq);

	/**
	 * Returns the winprob of this statusofsubmittedquote.
	 *
	 * @return the winprob of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getWinprob();

	/**
	 * Sets the winprob of this statusofsubmittedquote.
	 *
	 * @param winprob the winprob of this statusofsubmittedquote
	 */
	public void setWinprob(String winprob);

	/**
	 * Returns the aorderdate of this statusofsubmittedquote.
	 *
	 * @return the aorderdate of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getAorderdate();

	/**
	 * Sets the aorderdate of this statusofsubmittedquote.
	 *
	 * @param aorderdate the aorderdate of this statusofsubmittedquote
	 */
	public void setAorderdate(String aorderdate);

	/**
	 * Returns the ppstartdate of this statusofsubmittedquote.
	 *
	 * @return the ppstartdate of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getPpstartdate();

	/**
	 * Sets the ppstartdate of this statusofsubmittedquote.
	 *
	 * @param ppstartdate the ppstartdate of this statusofsubmittedquote
	 */
	public void setPpstartdate(String ppstartdate);

	/**
	 * Returns the ppenddate of this statusofsubmittedquote.
	 *
	 * @return the ppenddate of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getPpenddate();

	/**
	 * Sets the ppenddate of this statusofsubmittedquote.
	 *
	 * @param ppenddate the ppenddate of this statusofsubmittedquote
	 */
	public void setPpenddate(String ppenddate);

	/**
	 * Returns the create date of this statusofsubmittedquote.
	 *
	 * @return the create date of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getCreateDate();

	/**
	 * Sets the create date of this statusofsubmittedquote.
	 *
	 * @param createDate the create date of this statusofsubmittedquote
	 */
	public void setCreateDate(String createDate);

	/**
	 * Returns the customercomittype of this statusofsubmittedquote.
	 *
	 * @return the customercomittype of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getCustomercomittype();

	/**
	 * Sets the customercomittype of this statusofsubmittedquote.
	 *
	 * @param customercomittype the customercomittype of this statusofsubmittedquote
	 */
	public void setCustomercomittype(String customercomittype);

	/**
	 * Returns the upload of this statusofsubmittedquote.
	 *
	 * @return the upload of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getUpload();

	/**
	 * Sets the upload of this statusofsubmittedquote.
	 *
	 * @param upload the upload of this statusofsubmittedquote
	 */
	public void setUpload(String upload);

	/**
	 * Returns the pon of this statusofsubmittedquote.
	 *
	 * @return the pon of this statusofsubmittedquote
	 */
	public long getPon();

	/**
	 * Sets the pon of this statusofsubmittedquote.
	 *
	 * @param pon the pon of this statusofsubmittedquote
	 */
	public void setPon(long pon);

	/**
	 * Returns the valueofcommit of this statusofsubmittedquote.
	 *
	 * @return the valueofcommit of this statusofsubmittedquote
	 */
	public long getValueofcommit();

	/**
	 * Sets the valueofcommit of this statusofsubmittedquote.
	 *
	 * @param valueofcommit the valueofcommit of this statusofsubmittedquote
	 */
	public void setValueofcommit(long valueofcommit);

	/**
	 * Returns the rmethod of this statusofsubmittedquote.
	 *
	 * @return the rmethod of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getRmethod();

	/**
	 * Sets the rmethod of this statusofsubmittedquote.
	 *
	 * @param rmethod the rmethod of this statusofsubmittedquote
	 */
	public void setRmethod(String rmethod);

	/**
	 * Returns the rdate of this statusofsubmittedquote.
	 *
	 * @return the rdate of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getRdate();

	/**
	 * Sets the rdate of this statusofsubmittedquote.
	 *
	 * @param rdate the rdate of this statusofsubmittedquote
	 */
	public void setRdate(String rdate);

	/**
	 * Returns the pcdc of this statusofsubmittedquote.
	 *
	 * @return the pcdc of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getPcdc();

	/**
	 * Sets the pcdc of this statusofsubmittedquote.
	 *
	 * @param pcdc the pcdc of this statusofsubmittedquote
	 */
	public void setPcdc(String pcdc);

	/**
	 * Returns the onwhatbasis of this statusofsubmittedquote.
	 *
	 * @return the onwhatbasis of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getOnwhatbasis();

	/**
	 * Sets the onwhatbasis of this statusofsubmittedquote.
	 *
	 * @param onwhatbasis the onwhatbasis of this statusofsubmittedquote
	 */
	public void setOnwhatbasis(String onwhatbasis);

	/**
	 * Returns the recordproposedcourse of this statusofsubmittedquote.
	 *
	 * @return the recordproposedcourse of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getRecordproposedcourse();

	/**
	 * Sets the recordproposedcourse of this statusofsubmittedquote.
	 *
	 * @param recordproposedcourse the recordproposedcourse of this statusofsubmittedquote
	 */
	public void setRecordproposedcourse(String recordproposedcourse);

	/**
	 * Returns the comments of this statusofsubmittedquote.
	 *
	 * @return the comments of this statusofsubmittedquote
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this statusofsubmittedquote.
	 *
	 * @param comments the comments of this statusofsubmittedquote
	 */
	public void setComments(String comments);

	/**
	 * Returns the currrent ID of this statusofsubmittedquote.
	 *
	 * @return the currrent ID of this statusofsubmittedquote
	 */
	public Integer getCurrrentId();

	/**
	 * Sets the currrent ID of this statusofsubmittedquote.
	 *
	 * @param currrentId the currrent ID of this statusofsubmittedquote
	 */
	public void setCurrrentId(Integer currrentId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.test.model.statusofsubmittedquote statusofsubmittedquote);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.test.model.statusofsubmittedquote> toCacheModel();

	@Override
	public com.test.model.statusofsubmittedquote toEscapedModel();

	@Override
	public com.test.model.statusofsubmittedquote toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}