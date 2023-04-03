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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link statusofsubmittedquote}.
 * </p>
 *
 * @author dell
 * @see statusofsubmittedquote
 * @generated
 */
public class statusofsubmittedquoteWrapper implements statusofsubmittedquote,
	ModelWrapper<statusofsubmittedquote> {
	public statusofsubmittedquoteWrapper(
		statusofsubmittedquote statusofsubmittedquote) {
		_statusofsubmittedquote = statusofsubmittedquote;
	}

	@Override
	public Class<?> getModelClass() {
		return statusofsubmittedquote.class;
	}

	@Override
	public String getModelClassName() {
		return statusofsubmittedquote.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sosqId", getSosqId());
		attributes.put("sosq", getSosq());
		attributes.put("winprob", getWinprob());
		attributes.put("aorderdate", getAorderdate());
		attributes.put("ppstartdate", getPpstartdate());
		attributes.put("ppenddate", getPpenddate());
		attributes.put("createDate", getCreateDate());
		attributes.put("customercomittype", getCustomercomittype());
		attributes.put("upload", getUpload());
		attributes.put("pon", getPon());
		attributes.put("valueofcommit", getValueofcommit());
		attributes.put("rmethod", getRmethod());
		attributes.put("rdate", getRdate());
		attributes.put("pcdc", getPcdc());
		attributes.put("onwhatbasis", getOnwhatbasis());
		attributes.put("recordproposedcourse", getRecordproposedcourse());
		attributes.put("comments", getComments());
		attributes.put("currrentId", getCurrrentId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sosqId = (Long)attributes.get("sosqId");

		if (sosqId != null) {
			setSosqId(sosqId);
		}

		String sosq = (String)attributes.get("sosq");

		if (sosq != null) {
			setSosq(sosq);
		}

		String winprob = (String)attributes.get("winprob");

		if (winprob != null) {
			setWinprob(winprob);
		}

		String aorderdate = (String)attributes.get("aorderdate");

		if (aorderdate != null) {
			setAorderdate(aorderdate);
		}

		String ppstartdate = (String)attributes.get("ppstartdate");

		if (ppstartdate != null) {
			setPpstartdate(ppstartdate);
		}

		String ppenddate = (String)attributes.get("ppenddate");

		if (ppenddate != null) {
			setPpenddate(ppenddate);
		}

		String createDate = (String)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String customercomittype = (String)attributes.get("customercomittype");

		if (customercomittype != null) {
			setCustomercomittype(customercomittype);
		}

		String upload = (String)attributes.get("upload");

		if (upload != null) {
			setUpload(upload);
		}

		Long pon = (Long)attributes.get("pon");

		if (pon != null) {
			setPon(pon);
		}

		Long valueofcommit = (Long)attributes.get("valueofcommit");

		if (valueofcommit != null) {
			setValueofcommit(valueofcommit);
		}

		String rmethod = (String)attributes.get("rmethod");

		if (rmethod != null) {
			setRmethod(rmethod);
		}

		String rdate = (String)attributes.get("rdate");

		if (rdate != null) {
			setRdate(rdate);
		}

		String pcdc = (String)attributes.get("pcdc");

		if (pcdc != null) {
			setPcdc(pcdc);
		}

		String onwhatbasis = (String)attributes.get("onwhatbasis");

		if (onwhatbasis != null) {
			setOnwhatbasis(onwhatbasis);
		}

		String recordproposedcourse = (String)attributes.get(
				"recordproposedcourse");

		if (recordproposedcourse != null) {
			setRecordproposedcourse(recordproposedcourse);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}

		Integer currrentId = (Integer)attributes.get("currrentId");

		if (currrentId != null) {
			setCurrrentId(currrentId);
		}
	}

	/**
	* Returns the primary key of this statusofsubmittedquote.
	*
	* @return the primary key of this statusofsubmittedquote
	*/
	@Override
	public long getPrimaryKey() {
		return _statusofsubmittedquote.getPrimaryKey();
	}

	/**
	* Sets the primary key of this statusofsubmittedquote.
	*
	* @param primaryKey the primary key of this statusofsubmittedquote
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_statusofsubmittedquote.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the sosq ID of this statusofsubmittedquote.
	*
	* @return the sosq ID of this statusofsubmittedquote
	*/
	@Override
	public long getSosqId() {
		return _statusofsubmittedquote.getSosqId();
	}

	/**
	* Sets the sosq ID of this statusofsubmittedquote.
	*
	* @param sosqId the sosq ID of this statusofsubmittedquote
	*/
	@Override
	public void setSosqId(long sosqId) {
		_statusofsubmittedquote.setSosqId(sosqId);
	}

	/**
	* Returns the sosq of this statusofsubmittedquote.
	*
	* @return the sosq of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getSosq() {
		return _statusofsubmittedquote.getSosq();
	}

	/**
	* Sets the sosq of this statusofsubmittedquote.
	*
	* @param sosq the sosq of this statusofsubmittedquote
	*/
	@Override
	public void setSosq(java.lang.String sosq) {
		_statusofsubmittedquote.setSosq(sosq);
	}

	/**
	* Returns the winprob of this statusofsubmittedquote.
	*
	* @return the winprob of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getWinprob() {
		return _statusofsubmittedquote.getWinprob();
	}

	/**
	* Sets the winprob of this statusofsubmittedquote.
	*
	* @param winprob the winprob of this statusofsubmittedquote
	*/
	@Override
	public void setWinprob(java.lang.String winprob) {
		_statusofsubmittedquote.setWinprob(winprob);
	}

	/**
	* Returns the aorderdate of this statusofsubmittedquote.
	*
	* @return the aorderdate of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getAorderdate() {
		return _statusofsubmittedquote.getAorderdate();
	}

	/**
	* Sets the aorderdate of this statusofsubmittedquote.
	*
	* @param aorderdate the aorderdate of this statusofsubmittedquote
	*/
	@Override
	public void setAorderdate(java.lang.String aorderdate) {
		_statusofsubmittedquote.setAorderdate(aorderdate);
	}

	/**
	* Returns the ppstartdate of this statusofsubmittedquote.
	*
	* @return the ppstartdate of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getPpstartdate() {
		return _statusofsubmittedquote.getPpstartdate();
	}

	/**
	* Sets the ppstartdate of this statusofsubmittedquote.
	*
	* @param ppstartdate the ppstartdate of this statusofsubmittedquote
	*/
	@Override
	public void setPpstartdate(java.lang.String ppstartdate) {
		_statusofsubmittedquote.setPpstartdate(ppstartdate);
	}

	/**
	* Returns the ppenddate of this statusofsubmittedquote.
	*
	* @return the ppenddate of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getPpenddate() {
		return _statusofsubmittedquote.getPpenddate();
	}

	/**
	* Sets the ppenddate of this statusofsubmittedquote.
	*
	* @param ppenddate the ppenddate of this statusofsubmittedquote
	*/
	@Override
	public void setPpenddate(java.lang.String ppenddate) {
		_statusofsubmittedquote.setPpenddate(ppenddate);
	}

	/**
	* Returns the create date of this statusofsubmittedquote.
	*
	* @return the create date of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getCreateDate() {
		return _statusofsubmittedquote.getCreateDate();
	}

	/**
	* Sets the create date of this statusofsubmittedquote.
	*
	* @param createDate the create date of this statusofsubmittedquote
	*/
	@Override
	public void setCreateDate(java.lang.String createDate) {
		_statusofsubmittedquote.setCreateDate(createDate);
	}

	/**
	* Returns the customercomittype of this statusofsubmittedquote.
	*
	* @return the customercomittype of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getCustomercomittype() {
		return _statusofsubmittedquote.getCustomercomittype();
	}

	/**
	* Sets the customercomittype of this statusofsubmittedquote.
	*
	* @param customercomittype the customercomittype of this statusofsubmittedquote
	*/
	@Override
	public void setCustomercomittype(java.lang.String customercomittype) {
		_statusofsubmittedquote.setCustomercomittype(customercomittype);
	}

	/**
	* Returns the upload of this statusofsubmittedquote.
	*
	* @return the upload of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getUpload() {
		return _statusofsubmittedquote.getUpload();
	}

	/**
	* Sets the upload of this statusofsubmittedquote.
	*
	* @param upload the upload of this statusofsubmittedquote
	*/
	@Override
	public void setUpload(java.lang.String upload) {
		_statusofsubmittedquote.setUpload(upload);
	}

	/**
	* Returns the pon of this statusofsubmittedquote.
	*
	* @return the pon of this statusofsubmittedquote
	*/
	@Override
	public long getPon() {
		return _statusofsubmittedquote.getPon();
	}

	/**
	* Sets the pon of this statusofsubmittedquote.
	*
	* @param pon the pon of this statusofsubmittedquote
	*/
	@Override
	public void setPon(long pon) {
		_statusofsubmittedquote.setPon(pon);
	}

	/**
	* Returns the valueofcommit of this statusofsubmittedquote.
	*
	* @return the valueofcommit of this statusofsubmittedquote
	*/
	@Override
	public long getValueofcommit() {
		return _statusofsubmittedquote.getValueofcommit();
	}

	/**
	* Sets the valueofcommit of this statusofsubmittedquote.
	*
	* @param valueofcommit the valueofcommit of this statusofsubmittedquote
	*/
	@Override
	public void setValueofcommit(long valueofcommit) {
		_statusofsubmittedquote.setValueofcommit(valueofcommit);
	}

	/**
	* Returns the rmethod of this statusofsubmittedquote.
	*
	* @return the rmethod of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getRmethod() {
		return _statusofsubmittedquote.getRmethod();
	}

	/**
	* Sets the rmethod of this statusofsubmittedquote.
	*
	* @param rmethod the rmethod of this statusofsubmittedquote
	*/
	@Override
	public void setRmethod(java.lang.String rmethod) {
		_statusofsubmittedquote.setRmethod(rmethod);
	}

	/**
	* Returns the rdate of this statusofsubmittedquote.
	*
	* @return the rdate of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getRdate() {
		return _statusofsubmittedquote.getRdate();
	}

	/**
	* Sets the rdate of this statusofsubmittedquote.
	*
	* @param rdate the rdate of this statusofsubmittedquote
	*/
	@Override
	public void setRdate(java.lang.String rdate) {
		_statusofsubmittedquote.setRdate(rdate);
	}

	/**
	* Returns the pcdc of this statusofsubmittedquote.
	*
	* @return the pcdc of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getPcdc() {
		return _statusofsubmittedquote.getPcdc();
	}

	/**
	* Sets the pcdc of this statusofsubmittedquote.
	*
	* @param pcdc the pcdc of this statusofsubmittedquote
	*/
	@Override
	public void setPcdc(java.lang.String pcdc) {
		_statusofsubmittedquote.setPcdc(pcdc);
	}

	/**
	* Returns the onwhatbasis of this statusofsubmittedquote.
	*
	* @return the onwhatbasis of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getOnwhatbasis() {
		return _statusofsubmittedquote.getOnwhatbasis();
	}

	/**
	* Sets the onwhatbasis of this statusofsubmittedquote.
	*
	* @param onwhatbasis the onwhatbasis of this statusofsubmittedquote
	*/
	@Override
	public void setOnwhatbasis(java.lang.String onwhatbasis) {
		_statusofsubmittedquote.setOnwhatbasis(onwhatbasis);
	}

	/**
	* Returns the recordproposedcourse of this statusofsubmittedquote.
	*
	* @return the recordproposedcourse of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getRecordproposedcourse() {
		return _statusofsubmittedquote.getRecordproposedcourse();
	}

	/**
	* Sets the recordproposedcourse of this statusofsubmittedquote.
	*
	* @param recordproposedcourse the recordproposedcourse of this statusofsubmittedquote
	*/
	@Override
	public void setRecordproposedcourse(java.lang.String recordproposedcourse) {
		_statusofsubmittedquote.setRecordproposedcourse(recordproposedcourse);
	}

	/**
	* Returns the comments of this statusofsubmittedquote.
	*
	* @return the comments of this statusofsubmittedquote
	*/
	@Override
	public java.lang.String getComments() {
		return _statusofsubmittedquote.getComments();
	}

	/**
	* Sets the comments of this statusofsubmittedquote.
	*
	* @param comments the comments of this statusofsubmittedquote
	*/
	@Override
	public void setComments(java.lang.String comments) {
		_statusofsubmittedquote.setComments(comments);
	}

	/**
	* Returns the currrent ID of this statusofsubmittedquote.
	*
	* @return the currrent ID of this statusofsubmittedquote
	*/
	@Override
	public java.lang.Integer getCurrrentId() {
		return _statusofsubmittedquote.getCurrrentId();
	}

	/**
	* Sets the currrent ID of this statusofsubmittedquote.
	*
	* @param currrentId the currrent ID of this statusofsubmittedquote
	*/
	@Override
	public void setCurrrentId(java.lang.Integer currrentId) {
		_statusofsubmittedquote.setCurrrentId(currrentId);
	}

	@Override
	public boolean isNew() {
		return _statusofsubmittedquote.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_statusofsubmittedquote.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _statusofsubmittedquote.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_statusofsubmittedquote.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _statusofsubmittedquote.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _statusofsubmittedquote.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_statusofsubmittedquote.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _statusofsubmittedquote.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_statusofsubmittedquote.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_statusofsubmittedquote.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_statusofsubmittedquote.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new statusofsubmittedquoteWrapper((statusofsubmittedquote)_statusofsubmittedquote.clone());
	}

	@Override
	public int compareTo(
		com.test.model.statusofsubmittedquote statusofsubmittedquote) {
		return _statusofsubmittedquote.compareTo(statusofsubmittedquote);
	}

	@Override
	public int hashCode() {
		return _statusofsubmittedquote.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.test.model.statusofsubmittedquote> toCacheModel() {
		return _statusofsubmittedquote.toCacheModel();
	}

	@Override
	public com.test.model.statusofsubmittedquote toEscapedModel() {
		return new statusofsubmittedquoteWrapper(_statusofsubmittedquote.toEscapedModel());
	}

	@Override
	public com.test.model.statusofsubmittedquote toUnescapedModel() {
		return new statusofsubmittedquoteWrapper(_statusofsubmittedquote.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _statusofsubmittedquote.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _statusofsubmittedquote.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_statusofsubmittedquote.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof statusofsubmittedquoteWrapper)) {
			return false;
		}

		statusofsubmittedquoteWrapper statusofsubmittedquoteWrapper = (statusofsubmittedquoteWrapper)obj;

		if (Validator.equals(_statusofsubmittedquote,
					statusofsubmittedquoteWrapper._statusofsubmittedquote)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public statusofsubmittedquote getWrappedstatusofsubmittedquote() {
		return _statusofsubmittedquote;
	}

	@Override
	public statusofsubmittedquote getWrappedModel() {
		return _statusofsubmittedquote;
	}

	@Override
	public void resetOriginalValues() {
		_statusofsubmittedquote.resetOriginalValues();
	}

	private statusofsubmittedquote _statusofsubmittedquote;
}